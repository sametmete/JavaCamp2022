
public class MiniProjeAsalSayi {

	public static void main(String[] args) {
		int number = 13;
		boolean isPrimeNumber = true;

		if (number == 1) {
			System.out.println(number + " Sayisi asal degildir.");
			return;
		}

		if (number < 1) {
			System.out.println("Geçersiz bir sayı girdiniz!");
			return;
		}

		for (int i = 2; i <= number; i++) {
			if (number % i == 0) {
				isPrimeNumber = false;
			} else {
				isPrimeNumber = true;
			}
		}

		if (isPrimeNumber) {
			System.out.println(number + " Sayisi asaldir.");
		} else {
			System.out.println(number + " Sayisi asal degildir.");
		}

	}

}
