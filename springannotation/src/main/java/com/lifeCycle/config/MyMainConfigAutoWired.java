package com.lifeCycle.config;

import com.lifeCycle.dao.UserDao;
import org.springframework.context.annotation.*;

/*
*   @Autowired:
*       1)、 @Autowired先是按照类型查找xxx类.class(类如annotationConfigApplicationContext.getBean(UserService.class))
*       2)、 有多个bean的时候通过id去容器中查找(annotationConfigApplicationContext.getBean("userDao"))
*       3)、 @Qualifier("userdao3") 通过括号里的id到容器中查找 而不是通过属性名
*       4)、 @Autowired 有时候值为空时 会报错 默认是true 一定将属性赋值 将required = false即可
*       5)、 @Primary spring自动装配的时候 默认使用首选的bean(@Qualifier也使用的话 还是会以@Qualifier为首的)
*
*      @Resource:
*           自动装配注解 通过属性名查询 不支持@Primary 比较单一
*       @Inject
*           导包 和@Autowired功能差不多 不支持required = false
 *
* */


@Configuration
@ComponentScan(value = {"com.lifeCycle.controller", "com.lifeCycle.service" ,"com.lifeCycle.dao"})
public class MyMainConfigAutoWired {

    @Primary
    @Bean("userdao3")
//    @Bean
    public UserDao userDao(){
        UserDao userDao1 = new UserDao();
        userDao1.setName("莫荣");
        return userDao1;
    }

}
