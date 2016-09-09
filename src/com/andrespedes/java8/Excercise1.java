package com.andrespedes.java8;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

/**
 * Created by Andres on 09/08/2016.
 */
public class Excercise1 {

    public static void main(String[] args) throws Exception {
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        IntStream.range(0, 10)
                .forEach(index ->
                        executorService.submit(() -> System.out.println("Running task " + index)));

        System.out.println("Tasks started...");
        executorService.shutdown();
    }
}
