package com.andrespedes.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Andres on 01/09/2016.
 */
public class Excercise4 {

	static void findThePairs(int inputArray[], int inputNumber) {
		for (int i = 0; i < inputArray.length; i++) {
			for (int j = i + 1; j < inputArray.length; j++) {
				if (inputArray[i] + inputArray[j] == inputNumber) {
					System.out.println("1");
				}
			}
		}
		System.out.println("0");
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		int M = scan.nextInt();
		List<Integer> numbers = new ArrayList<Integer>();
		for (int i = 0; i < M; i++) {
			numbers.add(scan.nextInt());
		}
		int[] array = numbers.stream().mapToInt(i->i).toArray();
		findThePairs(array, M);
	}
	
}
