package com.andrespedes.java8;

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import static java.util.stream.Collectors.toList;

/**
 * Created by Andres on 09/09/2016.
 */
public class Excercise2 {
    public static boolean isPrime(int number) {
        return number > 1 &&
                IntStream.range(2, number)
                        .noneMatch(index -> number % index == 0);
    }

    public static void main(String[] args) {
        List<Double> sqrtOfFirst100Primes =
                Stream.iterate(1, e -> e + 1)
                        .filter(Excercise2::isPrime)
                        .map(Math::sqrt)
                        .limit(100)
                        .collect(toList());

        System.out.println(
                String.format("Computer %d values, first is %g, last is %g",
                        sqrtOfFirst100Primes.size(),
                        sqrtOfFirst100Primes.get(0),
                        sqrtOfFirst100Primes.get(sqrtOfFirst100Primes.size() - 1)));
    }
}
