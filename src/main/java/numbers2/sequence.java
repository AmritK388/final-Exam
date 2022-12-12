package numbers2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class sequence {

	public static void main(String[] args) {
		
		
		Random random = new Random();
		int number;
		int [] num = new int [500];
		
		for (int i = 0; i<500; i++) {
			number = random.nextInt(500);
			num[i] = number;
		}
		Arrays.sort(num);
		for (int j=0;j<500;j++) {
			System.out.println(num[j] +"");
		}
		System.out.println();
		Scanner ui = new Scanner (System.in);
		System.out.println("Please enter the nth smallest number");
		int n  = ui.nextInt();
		System.out.println(num[n-1]);

	}

	}
