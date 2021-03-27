package com.batch.demo.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import com.batch.demo.model.SampleModel;

@Repository
@Mapper
public interface SampleDao {
	List<SampleModel> selectSampleList(String plcyId);
}
