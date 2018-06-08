package com.xbd;

import com.xbd.demoapi.entity.RetMessage;
import com.xbd.demoapi.entity.Student;
import com.xbd.demoapi.service.DemoApi;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Consumer {
    public static void main(String [] args){
        System.setProperty("java.net.preferIPv4Stack", "true");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"META-INF/spring/dubbo-consumer.xml"});
        context.start();
        DemoApi demoService = (DemoApi) context.getBean("demoService"); // get remote service proxy
        Student student = new Student();
        student.setStuId("111");
        student.setName("xxx");
        RetMessage retMessage = demoService.insertInfo(student);
        System.out.println(retMessage.getMessage());
    }
}
