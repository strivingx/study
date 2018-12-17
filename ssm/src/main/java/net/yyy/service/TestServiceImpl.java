package net.yyy.service;

import org.springframework.stereotype.Service;

@Service("testService")
public class TestServiceImpl implements TestService {

    @Override
    public String test() {
        System.out.println("test");
        return "SUCCESS";
    }

    @Override
    public String test(String str) {
        System.out.println("test: "+ str);
        return "SUCCESS";

    }
}