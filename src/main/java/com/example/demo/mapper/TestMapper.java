package com.example.demo.mapper;

import com.example.demo.domain.po.Test;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 员工表 Mapper 接口
 * </p>
 *
 * @author ei
 * @since 2023-07-10
 */
@Mapper
public interface TestMapper extends BaseMapper<Test> {

}
