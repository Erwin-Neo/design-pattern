package com.kyle.design.proxy.staticproxy;

/**
 * @author : Kyle
 * @version : 1.0
 * @email : edelweissvx@gmail.com
 * @description :
 */
public class ConcreteSubjectA implements Subject {

    @Override
    public void sendRequest() {
        System.out.println("Handle request...");
    }
}
