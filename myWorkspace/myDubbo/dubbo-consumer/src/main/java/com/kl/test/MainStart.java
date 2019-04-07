package com.kl.test;

import com.alibaba.dubbo.config.annotation.Reference;
import com.kl.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-dubbo-consumer.xml")
public class MainStart {

    //@Autowired
    @Reference//1、生成接口本地代理类 2、纳入Spring管理 3、将服务注入当前类
    private UserService userService;

    @Test
    public void test() {
        System.out.println(userService.getUserById(1L));
    }
}
