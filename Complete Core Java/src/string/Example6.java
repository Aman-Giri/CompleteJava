package string;

import java.util.Scanner;

//User input using the next() -- it will whole line or sentence as a input

public class Example6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the second name: ");
		String secondname = sc.nextLine();
		System.out.println("you entered : "+secondname);
	}
}
