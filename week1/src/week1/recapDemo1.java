package week1;

import java.util.Scanner;

public class recapDemo1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int number1, number2, number3;

		System.out.print("1.say�y� giriniz : ");
		number1 = scan.nextInt();

		System.out.print("2.say�y� giriniz : ");
		number2 = scan.nextInt();

		System.out.print("3.say�y� giriniz : ");
		number3 = scan.nextInt();

		int bigNumber = number1;

		if (bigNumber < number2) {
			bigNumber = number2;
		} else if (bigNumber < number3) {
			bigNumber = number3;
		}

		System.out.print("En b�y�k say� : " + bigNumber);

	}

}
