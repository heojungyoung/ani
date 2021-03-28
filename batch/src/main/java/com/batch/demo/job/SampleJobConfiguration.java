package com.batch.demo.job;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.JobScope;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.batch.demo.dao.SampleDao;
import com.mysql.cj.log.Log;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
@Configuration
public class SampleJobConfiguration {

	@Autowired 
	private JobBuilderFactory jobBuilderFactory; 
	
	@Autowired
	private StepBuilderFactory stepBuilderFactory;
	
	@Autowired
	SampleDao sampleDao;
	
	@Bean
	public Job simpleJob(){
		return jobBuilderFactory.get("simpleJob")
				.start(simpleStep1()).build();
	}
	
	@Bean
	public Step simpleStep1() {
		return stepBuilderFactory.get("simpleStep1").tasklet((contribution,chunkContext) ->{
			System.out.println(">>>>>>>>>>>>>>>>>>. this is sparta");
			sampleDao.selectSampleList();
			return RepeatStatus.FINISHED;
		})
		.build();
	}
	
}
