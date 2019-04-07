package com.kl.serviceImpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.kl.bean.User;
import com.kl.service.UserService;

@Service//dubbo专属注解 1、此类生成bean,纳入Spring管理 2、以特点接口注册入服务注册中心
public class UserServiceImpl implements UserService {

    public User getUserById(Long id) {
        //此处应该调用 Mapper 获取 User
        return new User(id, "王翔是个傻逼");
    }
}
