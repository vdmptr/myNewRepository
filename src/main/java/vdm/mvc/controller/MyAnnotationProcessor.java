package vdm.mvc.controller;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;
import vdm.mvc.DefinitionString;

import java.lang.annotation.Annotation;

@Component
public class MyAnnotationProcessor implements BeanPostProcessor {
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        DefinitionString annotation = bean.getClass().getAnnotation(DefinitionString.class);
        if (annotation == null) {
            return bean;
        }
        String resource = annotation.value();
        System.out.println(resource);
        if (resource.equals("")) {
            System.out.println("");
        }
        return bean;
    }
}
