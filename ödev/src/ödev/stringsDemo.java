package ödev;

public class stringsDemo {
	public static void main(String[] args) {
		String mesaj = "    Bugun hava cok sicak.    ";
		System.out.println(mesaj);
		
		/*System.out.println("Eleman sayisi : "+mesaj.length());
		System.out.println("5. eleman : "+mesaj.charAt(4));
		System.out.println(mesaj.concat(" kotu gun!"));
		System.out.println(mesaj.startsWith("A"));
		System.out.println(mesaj.endsWith("."));
		char[] karakterler = new char[5];
		mesaj.getChars(0, 5, karakterler, 0);
		System.out.println(karakterler);
		System.out.println(mesaj.indexOf("av"));
	    System.out.println(mesaj.lastIndexOf("a"));*/
		
		String yeniMesaj = mesaj.replace(' ', '-');
		System.out.println(yeniMesaj);
		System.out.println(mesaj.substring(2,5));  //index i ayırmak için kullanırız
		
		for (String kelime : mesaj.split(" ")) {  //alt alta yazar. Boşluğa göre ayarlar.
		System.out.println(kelime);
		}
		
		System.out.println(mesaj.toLowerCase()); //Tüm harfleri küçültüyor.
		System.out.println(mesaj.toUpperCase()); //Tüm harfleri büyültüyor.
		System.out.println(mesaj.trim()); //Başındaki ve sonundaki bütün boşlukları yok sayar.
	}

}
		
		