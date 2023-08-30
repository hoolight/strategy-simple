package com.hool.strategy.simple.controller;

import com.hool.strategy.simple.handler.StrategyHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StrategyController {
    private StrategyHandler handler;

    @Autowired
    public void setHandler(StrategyHandler handler) {
        this.handler = handler;
    }

    @GetMapping("strategy/{key}")
    public String strategySwitch(@PathVariable Integer key){
        return handler.getStrategy(key).doSomething();
    }
}
