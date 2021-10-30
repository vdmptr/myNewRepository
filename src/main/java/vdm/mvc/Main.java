package vdm.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.stereotype.Component;
import org.springframework.context.ApplicationContext;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

@Component(value = "main")
public class Main {

    @Autowired private MyBean2 myBean2;
    @Autowired private MyBean3 myBean3;
    @Autowired private MyBean1 myBean1;

    public static void main(String[] args) throws FileNotFoundException {



       // FileInputStream fis = new FileInputStream("./../enverontment.properties");
        System.out.println("start main method");
        ApplicationContext applicationContext = SpringApplication.run(MvcConfig.class);
        System.out.println("stop springApplication.run()");
        Main main = (Main) applicationContext.getBean("main");
        main.getResult();
    }

    private void getResult() {
        System.out.println("myBean2 a: " + myBean2.getA());
        System.out.println("myBean3 a: " + myBean3.getA());
      //  myBean1.setA(7);
        System.out.println("myBean2 a: " + myBean2.getA());
        System.out.println("myBean3 a: " + myBean3.getA());
    }
}
