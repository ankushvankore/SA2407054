package com.Assignments;

import java.util.Random;

public class RandomDemo {
	public static void main(String[] args) {
		Random rnd = new Random();
		int n = rnd.nextInt(10);		//Generate any value in the range of 0 to 9
		System.out.println(n);
	}
}
