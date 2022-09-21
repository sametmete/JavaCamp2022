
public class MükemmelSayi {

	public static void main(String[] args) {
		
		
		int number = 28;
		int total = 0;
		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				total += i;
			}
		}
		
		if(number==total) {
			System.out.println("Girilen sayi mükemmel sayidir.");
		}else {
			System.out.println("Girilen sayi mükemmel sayi degildir.");
		}

	}

}
