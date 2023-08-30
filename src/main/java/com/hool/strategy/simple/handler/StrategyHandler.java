package com.hool.strategy.simple.handler;

import com.hool.strategy.simple.strategy.AbstractStrategy;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

@Component
public class StrategyHandler {
    private Map<Integer, AbstractStrategy> register = new ConcurrentHashMap<>();

    public void registry(Integer key,AbstractStrategy strategy){
        register.put(key,strategy);
    }

    public AbstractStrategy getStrategy(Integer key){
        AbstractStrategy strategy = register.get(key);
        return Optional.ofNullable(strategy).orElseThrow();
    }

}
