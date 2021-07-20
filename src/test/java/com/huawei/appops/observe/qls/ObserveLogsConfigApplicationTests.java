package com.huawei.appops.observe.qls;

import com.huawei.appops.observe.qls.controller.TestController;
import com.huawei.appops.observe.qls.pojo.Goods;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)//测试启动器，并加载springboot测试注解
@SpringBootTest
class ObserveLogsConfigApplicationTests {

    @Autowired
    TestController testController;

    @Test
    void contextLoads() {
        Integer sum = testController.add(1, 2);
        System.out.println(sum);
    }

    @Test
    void contextLoads1() {
        List<Goods> allGoods = testController.findAllGoods();
        System.out.println(allGoods);
    }
}
