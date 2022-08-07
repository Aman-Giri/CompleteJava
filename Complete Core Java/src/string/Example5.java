package string;

import java.util.Scanner;

//User input using the next() -- it will only take single word

public class Example5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name : ");
		String name = sc.next();
		System.out.println("you entered : " + name);
		
	}
}

