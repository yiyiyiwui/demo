package com.example.demo.service;

import com.example.demo.domain.po.Test;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 员工表 服务类
 * </p>
 *
 * @author ei
 * @since 2023-07-10
 */
public interface ITestService extends IService<Test> {


    void saveTest(String save);
}
