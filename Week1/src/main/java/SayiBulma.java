
public class SayiBulma {

	public static void main(String[] args) {
		
		
		int[] numbers = new int[] { 12, 3, 8, 21, 18, 7, 24, 15 };

		int searchNumber = 15;

		boolean isSearchNumber = false;

		for (int number : numbers) {
			if (number == searchNumber) {
				isSearchNumber = true;
				break;
			}
		}

		if (isSearchNumber) {
			System.out.println("Aradiginiz sayi dizide mevcut.");
		} else {
			System.out.println("Aradiginiz sayi dizide mevcut degil.");
		}


	}

}
