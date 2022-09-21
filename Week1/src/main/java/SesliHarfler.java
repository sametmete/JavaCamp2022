
public class SesliHarfler {

	public static void main(String[] args) {
		
		
		char[] thick = { 'a', 'ı', 'o', 'u' };
		char[] thin = { 'e', 'i', 'ö', 'ü' };
		char letter = 'i';


		for (char let : thick) {
			if (letter == let) {
				System.out.println("Girilen harf kalın ünlüdür");
			}
		}

		for (char let : thin) {
			if (letter == let) {
				System.out.println("Girilen harf ince ünlüdür");
			}
		}

	}

}
