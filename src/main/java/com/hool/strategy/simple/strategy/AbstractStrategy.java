package com.hool.strategy.simple.strategy;

import com.hool.strategy.simple.handler.StrategyHandler;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

public abstract class AbstractStrategy {

    @Resource
    private StrategyHandler strategyHandler;


    @PostConstruct
    public void init(){
        strategyHandler.registry(this.getKey(),this);
    }

    protected abstract Integer getKey();

    public abstract String doSomething();
}
