package com.hool.strategy.simple.strategy.bussiness;

import com.hool.strategy.simple.strategy.AbstractStrategy;
import org.springframework.stereotype.Service;

@Service
public class CStrategy extends AbstractStrategy {
    @Override
    protected Integer getKey() {
        return 3;
    }

    @Override
    public String doSomething() {
        return "schwarzenegger";
    }
}
