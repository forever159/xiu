package cc.openkit.admin.service.scheduled.impl;


import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Configurable
@EnableScheduling
@Service
public class SchServiceImpl{

    @Scheduled(cron = "0 20 15 * * ?")
    public void fixTimeExecution() {
        System.out.print("定时任务执行");
    }
}
