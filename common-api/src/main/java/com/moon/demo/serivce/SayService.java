package com.moon.demo.serivce;

public interface SayService {

    /**
     * 根据名字say hello
     * @param name 名字
     * @return name + ,hello!
     */
    String sayHelloByName(String name);
}
