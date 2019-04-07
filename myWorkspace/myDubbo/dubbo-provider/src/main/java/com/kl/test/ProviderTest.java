package com.kl.test;

import com.kl.util.StringUtil;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProviderTest {

    public static void main(String[] args) {
//        String tar = StringUtil.klTrim("   Hello World !  ");
//        System.out.println(tar);
        //启动 Spring, 发布服务
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-dubbo-provide.xml");

        //获取spring中的bean
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        for(String beanName : beanDefinitionNames) {
            System.out.println(beanName);
        }
        System.out.println("服务已经注册！");
        try {
            //阻塞进程,一直启动Spring
            System.in.read();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
