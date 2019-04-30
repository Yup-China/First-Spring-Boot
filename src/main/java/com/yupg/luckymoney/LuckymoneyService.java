package com.yupg.luckymoney;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

@Service
public class LuckymoneyService {

    @Autowired
    private LuckmoneyRepository repository;

    /**
     * 事务 指数据库事务
     */
    @Transactional
    public void createTwo() {
        Luckymoney luckymoney1 = new Luckymoney();
        luckymoney1.setProducer("YUPG");
        luckymoney1.setMoney(new BigDecimal("5.2"));
        repository.save(luckymoney1);

        Luckymoney luckymoney2 = new Luckymoney();
        luckymoney2.setProducer("YUPG");
        luckymoney2.setMoney(new BigDecimal("13.14"));
        repository.save(luckymoney2);
    }
}
