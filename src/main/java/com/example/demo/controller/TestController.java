package com.example.demo.controller;
import java.time.LocalDateTime;


import com.example.demo.domain.po.Test;
import com.example.demo.mapper.TestMapper;
import com.example.demo.result.Result;
import com.example.demo.service.ITestService;
import com.example.demo.service.impl.TestServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.web.bind.annotation.*;

import java.security.PublicKey;
import java.util.List;

/**
 * <p>
 * 员工表 前端控制器
 * </p>
 *
 * @author ei
 * @since 2023-07-10
 */
@RestController
@RequestMapping("/test")
@RequiredArgsConstructor
public class TestController {

    private final ITestService testService;

    /**
     * 增
     */
    @PostMapping
    public Result saveTest(String save) {
        testService.saveTest(save);
        return Result.success();
    }

    /**
     * 删
     */
    @DeleteMapping("/{id}")
    public Result deleteById(@PathVariable("id")Integer id) {
        deleteById(id);
        return Result.success();
    }

    /**
     * 改
     */
    @PutMapping
    public Result add(@RequestBody List<String> ok) {
        add(ok);
        return Result.success();
    }

    /**
     * 查
     */
    @GetMapping("/{id}")
    public Result getTestMapper(@PathVariable("id")Integer id) {
        Test TestId = testService.getById(id);
        return Result.success(TestId);
    }
}
