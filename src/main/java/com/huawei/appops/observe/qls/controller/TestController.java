package com.huawei.appops.observe.qls.controller;

import com.huawei.appops.observe.qls.pojo.Goods;
import com.huawei.appops.observe.qls.service.GoodsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api(tags = "rest api add、jpa测试")
@RestController
public class TestController {

    @Autowired
    GoodsService goodsService;

    @ApiOperation("jpa 查询所有商品")
    @GetMapping("/findAllGoods")
    public List<Goods> findAllGoods() {
        return goodsService.findAllGoods();
    }


    //    I：参数加了@RequestBody且参数类型是对象，在swagger里是必填项
    @ApiOperation("rest api add测试")
    @ApiImplicitParams(
            {
                    @ApiImplicitParam(name = "num1", value = "第一个加数"),
                    @ApiImplicitParam(name = "num2", value = "第二个加数")
            }
    )
    @GetMapping("/add/{num1}/{num2}")
    public Integer add(@PathVariable("num1") Integer num1,
                       @PathVariable("num2") Integer num2) {
        return num1 + num2;
    }
}
