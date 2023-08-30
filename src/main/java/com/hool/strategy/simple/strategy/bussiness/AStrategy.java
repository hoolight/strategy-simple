package com.hool.strategy.simple.strategy.bussiness;

import com.hool.strategy.simple.strategy.AbstractStrategy;
import org.springframework.stereotype.Service;

@Service
public class AStrategy extends AbstractStrategy {
    @Override
    protected Integer getKey() {
        return 1;
    }

    @Override
    public String doSomething() {
        return "hulian";
    }
}
