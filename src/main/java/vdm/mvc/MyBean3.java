package vdm.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyBean3 {

    @Autowired
    private MyBean1 myBean1;

    MyBean3() {
        System.out.println("create my bean 3");
    }

    public int getA() {
        return 4;//myBean1.getA();
    }
}
