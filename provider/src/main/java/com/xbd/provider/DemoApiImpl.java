package com.xbd.provider;

import com.xbd.demoapi.DemoApi;

public class DemoApiImpl implements DemoApi {
    @Override
    public void printHello() {
        System.out.println("hello , this is the first rpc impl");
    }
}
