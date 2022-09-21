import java.util.Scanner;

public class RecapDemo1 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			int number1, number2, number3;

			System.out.print("1.sayıyı giriniz : ");
			number1 = scan.nextInt();

			System.out.print("2.sayıyı giriniz : ");
			number2 = scan.nextInt();

			System.out.print("3.sayıyı giriniz : ");
			number3 = scan.nextInt();

			int bigNumber = number1;

			if (bigNumber < number2) {
				bigNumber = number2;
			} else if (bigNumber < number3) {
				bigNumber = number3;
			}

			System.out.print("En büyük sayı : " + bigNumber);
		}

	}

}
