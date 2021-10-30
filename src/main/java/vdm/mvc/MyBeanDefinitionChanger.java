package vdm.mvc;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

import java.util.Iterator;

@Component
public class MyBeanDefinitionChanger implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        int count = beanFactory.getBeanDefinitionCount();
        Iterator iterator = beanFactory.getBeanNamesIterator();
        while (iterator.hasNext()){
            String name = (String) iterator.next();
            System.out.println("name: " + name);

        }
        String[] names = beanFactory.getBeanDefinitionNames();
        for (String name: names) {
            System.out.println("name:       " + name);
        }
        beanFactory.getBeanDefinition("myBean1");
        System.out.println("run postProcessBeanFactory --------------------");
    }
}
