package com.andrespedes.java8;

import java.io.File;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;

/**
 * Created by Andres on 09/09/2016.
 */
public class Excercise3 {
    public static void main(String[] args) {
        File aDirectory = new File("./src/com/andrespedes/java8");

        System.out.println(
                Stream.of(aDirectory.listFiles())
                        .map(File::getName)
                        .collect(joining(", ")));
    }
}
