package week2;

public class MainMethods2 {

	public static void main(String[] args) {

		int toplam = topla(5,7);
		String mesaj = sehirVer();
		System.out.println(mesaj);
		System.out.println(toplam);
		güncelle();
		int toplam2 = topla2(4,5,7,12,43);
		System.out.println(toplam2);
	}

	public static void ekle() {
		System.out.println("Eklendi.");
	}

	public static void güncelle() {
		System.out.println("Güncellendi.");
	}

	public static void sil() {
		System.out.println("Silindi.");
	}

	public static int topla(int sayi1, int sayi2) {
		return sayi1 + sayi2;
	}
	public static String sehirVer() {
		return "Ankara";
	}
	
	//Variable Argument kullanımı
	public static int topla2(int... sayilar) {
		int toplam = 0;
		for (int sayi : sayilar) {
			toplam+=sayi;
		}
		return toplam;
	}

}
