package com.huawei.appops.observe.qls.dao;

import com.huawei.appops.observe.qls.pojo.Goods;
import org.springframework.data.jpa.repository.JpaRepository;

//Goods：实体类，Integer：主键的类型
public interface GoodsRepository extends JpaRepository<Goods, Integer> {

//  无需写sql语句，只需要写接口继承extends JpaRepository<Goods, Integer>
}
