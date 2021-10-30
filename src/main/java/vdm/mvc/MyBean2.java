package vdm.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyBean2 {
    @Autowired
    private MyBean1 myBean1;

    MyBean2() {
        System.out.println("create my bean 2");
    }

    public int getA() {
        return 2;//myBean1.getA();
    }
}
