package com.xbd.provider;


import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.io.IOException;

public class Provider {
    public static void main(String [] args) throws IOException {
        System.setProperty("java.net.preferIPv4Stack", "true");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"META-INF/spring/dubbo-provider.xml"});
        context.start();
        System.out.println("the server start");
        System.in.read(); // press any key to exit
    }
}
