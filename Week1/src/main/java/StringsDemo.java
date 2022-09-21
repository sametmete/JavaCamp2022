
public class StringsDemo {

	public static void main(String[] args) {
		String message = "Bugün hava çok güzel. Bugün günlerden salı.";
		/*
		 * System.out.println("Elemasn sayısı : " + message.length());
		 * System.out.println("5. eleman : " + message.charAt(6));
		 * 
		 * System.out.println(message.concat(" Yaşasın!")); //birleştirmek için
		 * kullanılır. System.out.println(message.startsWith("Bu")); //Aranan karakter
		 * ile başlayıp başlamadığını true ya da false deger döndürür.
		 * System.out.println(message.endsWith("ok")); //Aranan karakter ile bitip
		 * bitmediğini true ya da false deger döndürür char[] characters = new char[5];
		 * message.getChars(0, 5, characters, 0); //messagedaki cümledeki 0.karakterden
		 * başlayıp 5.karaktere kadar characters dizisine 0.karakterden başlayarak atar.
		 * System.out.println(characters); System.out.println(message.indexOf("a"));
		 * //Aranan ifadenin karakterler dizisi içinde kaçıncı indexte bulunduğunu
		 * döndürür. System.out.println(message.lastIndexOf("ü")); //Aranan ifadenin
		 * karakterle dizisi içinde kaçıncı indexte olduğunu soldan başlayarak döndürür.
		 */

		String newMessage = message.replace(" ", "-"); // elimizdeki ifadede değiştirmek istediğimiz ifadeler için
														// kullanılır.
		System.out.println(newMessage);

		System.out.println(message.substring(2, 5)); // cümledeki yazdığımız indexten sonrasını almak için kullanılır.

		for (String word : message.split("gün")) {	// yazdığımız ifadenin cümleden çıkarılmasını sağlar.
			System.out.print(word);
		}
		
		System.out.println("\n"+message.toLowerCase()); // ifadedeki harflerin tümünü küçük yapar.
		System.out.println(message.toUpperCase());   // ifadedeki harflerin tümünü büyük yapar.
		System.out.println(message.trim());			// ifadedenin başında ve sonundaki boşlukları atar.


	}

}
