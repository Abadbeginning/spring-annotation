package com.lifeCycle.config;


import com.lifeCycle.dao.UserDao;
import com.lifeCycle.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyMainConfigAutoWiredTest {

    @Test
    public void test(){

        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MyMainConfigAutoWired.class);

        //首先判断一下 @Autowired的是否与在bean容器中获取的值是一致的
        // 就用service拿userdao与容器中的是否一致进行实验
        UserService userService = annotationConfigApplicationContext.getBean(UserService.class);
//        userService.show();
        System.out.println(userService);

        UserDao userDao1 = (UserDao) annotationConfigApplicationContext.getBean("userDao");
        System.out.println(userDao1);

        /*UserDao userDao = annotationConfigApplicationContext.getBean(UserDao.class);
        System.out.println(userDao);*/



        annotationConfigApplicationContext.close();

    }

}
