package week2;

public class Main {

	public static void main(String[] args) {

		sayiBulmaca();

	}

	public static void sayiBulmaca() {
		int[] numbers = new int[] { 12, 3, 8, 21, 18, 7, 24, 15 };

		int searchNumber = 11;

		boolean isSearchNumber = false;

		for (int number : numbers) {
			if (number == searchNumber) {
				isSearchNumber = true;
				break;
			}
		}

		if (isSearchNumber) {
			mesajVer("Aradiginiz sayi dizide mevcut." + searchNumber);
		} else {
			mesajVer("Aradiginiz sayi dizide mevcut degil." + searchNumber);
		}
	}

	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
	}

}
