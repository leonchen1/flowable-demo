package cyl.learn.flowable;

import org.flowable.engine.ProcessEngine;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FlowableSpringbootDemoApplicationTests {

    @Qualifier("processEngine")
    @Autowired
    public ProcessEngine processEngine;

    @Test
    void contextLoads() {
        System.out.println(processEngine);
    }

}
