package com.huawei.appops.observe.qls.service.impl;

import com.huawei.appops.observe.qls.dao.GoodsRepository;
import com.huawei.appops.observe.qls.pojo.Goods;
import com.huawei.appops.observe.qls.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    GoodsRepository goodsRepository;


    @Override
    public List<Goods> findAllGoods() {
        List<Goods> all = goodsRepository.findAll();
        return all;
    }
}
