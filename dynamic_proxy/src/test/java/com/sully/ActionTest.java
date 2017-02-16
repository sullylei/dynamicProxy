package com.sully;

import com.sully.biz.IUserServ;
import com.sully.entity.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by lei.s on 2017/2/16.
 */
public class ActionTest {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        IUserServ iuserServ = (IUserServ)ac.getBean("userServProxy");
        iuserServ.deleteUserById(new User());
        iuserServ.findAllUser();
    }
}
