package com.missionsky.bbs.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.missionsky.bbs.dao.entity.Categorysecond;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author Administrator
 */
@Mapper
public interface CategorySecondMapper extends BaseMapper<Categorysecond> {

    List<Categorysecond> getCategorySecond(Integer csid);

}
