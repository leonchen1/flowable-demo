package cyl.learn.flowable;

import org.flowable.engine.ProcessEngine;
import org.flowable.engine.RepositoryService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 流程部署
 * @author chenyongliang
 * @date 2022/4/7 23:33
 */
public class DeployProcess {

    @Autowired
    private ProcessEngine processEngine;

    public void deployHolidayRequestProcess() {
        RepositoryService repositoryService = processEngine.getRepositoryService();
    }
}
