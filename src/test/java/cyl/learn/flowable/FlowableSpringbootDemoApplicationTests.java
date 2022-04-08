package cyl.learn.flowable;

import org.flowable.engine.RepositoryService;
import org.flowable.engine.repository.Deployment;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FlowableSpringbootDemoApplicationTests {

    @Autowired
    public RepositoryService repositoryService;

    /**
     * Springboot 集成 flowable 后：
     * processes目录下的任何BPMN 2.0流程定义都会被自动部署，
     * cases目录下的任何CMMN 1.1事例都会被自动部署，
     * forms目录下的任何Form定义都会被自动部署。
     * 当前方法演示手动部署 BPMN 2.0 流程定义
     */
    @Test
    void testManualDeploy() {
        Deployment deployment = repositoryService.createDeployment()
                .addClasspathResource("holiday-request.bpmn20.xml")
                .name("holiday-request")
                .deploy();
        System.out.println("deployment.getId() = " + deployment.getId());
        System.out.println("deployment.getName() = " + deployment.getName());
    }
}
