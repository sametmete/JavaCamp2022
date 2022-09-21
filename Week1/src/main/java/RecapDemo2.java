
public class RecapDemo2 {

	public static void main(String[] args) {
		
		
		double[] arrays = { 3.4, 5.5, 12.2, 10.7, 4.8 };
		double total = 0, max = arrays[0];

		for (double number : arrays) {
			total += number;
			if (max < number) {
				max = number;
			}
			System.out.println(number);
		}

		System.out.println("Sayilarin toplami : " + total);

		System.out.println("En buyuk sayi : " + max);

	}

}
