package com.example.demo.service.impl;

import com.example.demo.domain.po.Test;
import com.example.demo.mapper.TestMapper;
import com.example.demo.service.ITestService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

/**
 * <p>
 * 员工表 服务实现类
 * </p>
 *
 * @author ei
 * @since 2023-07-10
 */
@Service
public class TestServiceImpl extends ServiceImpl<TestMapper, Test> implements ITestService {

    @Override
    public void saveTest(String save) {
        Test test = new Test();
        test.setId(0);
        test.setUsername("lisi");
        test.setPassword("123321");
        test.setName("李四");
        test.setGender("1");
        test.setEntrtdate(LocalDateTime.now());
        save(test);
    }

}
