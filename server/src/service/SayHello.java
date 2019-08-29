package service;

public class SayHello implements Hello {
    @Override
    public String sayHello() {
        return "hello,world";
    }
}
