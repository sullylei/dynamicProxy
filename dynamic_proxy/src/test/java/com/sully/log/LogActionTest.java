package com.sully.log;

import com.sully.log.biz.IUserServ;
import com.sully.log.entity.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by lei.s on 2017/2/16.
 */
public class LogActionTest {
    public static void main(String[] args) {
                ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext-log.xml");
                IUserServ iuserServ = (IUserServ)ac.getBean("userServImpl");
                iuserServ.deleteUserById(new User());
                iuserServ.findAllUser();
                iuserServ.saveUser(new User());
        }
    }