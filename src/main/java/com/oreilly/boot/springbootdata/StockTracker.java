package com.oreilly.boot.springbootdata;

import org.springframework.stereotype.Component;

import javax.cache.annotation.CacheResult;
import java.util.Random;

@Component
public class StockTracker {

    @CacheResult(cacheName = "price")
    public double getPrice(String symbo) {
        System.out.println("Generating the price...");
        return 20 + (200 - 20) * new Random().nextDouble();
    }
}
