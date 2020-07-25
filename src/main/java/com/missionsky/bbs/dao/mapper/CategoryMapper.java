package com.missionsky.bbs.dao.mapper;

import java.util.List;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.missionsky.bbs.dao.entity.Category;
import org.apache.ibatis.annotations.Mapper;


/**
 * @author Administrator
 */
@Mapper
public interface CategoryMapper extends BaseMapper<Category> {
	

	/**
	 * @return 获取板块内容
	 */
	 List<Category> getCategory();
	
	
	

}
