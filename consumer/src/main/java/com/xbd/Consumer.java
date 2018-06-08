package com.xbd;

import com.xbd.demoapi.DemoApi;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Consumer {
    public static void main(String [] args){
        System.setProperty("java.net.preferIPv4Stack", "true");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"META-INF/spring/dubbo-consumer.xml"});
        context.start();
        DemoApi demoService = (DemoApi) context.getBean("demoService"); // get remote service proxy

        while (true) {
            try {
                Thread.sleep(1000);
                demoService.printHello(); // call remote method
            } catch (Throwable throwable) {
                throwable.printStackTrace();
            }
        }
    }
}
