package vdm.mvc;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import vdm.mvc.controller.IsDevEnvCondition;

@Component
@Scope(scopeName = "prototype")
@Conditional(IsDevEnvCondition.class)
@DefinitionString("it is my annotation")
public class MyBean1 {

    @Getter
    @Setter
    private int a = 5;

    MyBean1() {
        System.out.println("create my bean 1");
    }
}
