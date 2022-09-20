package ödev;

public class arraysDemo {
	public static void main(String[]argys) {
		String ogrenci1 = "Furkan";
		String ogrenci2 = "Sena";
		String ogrenci3 = "Pirtik";
		String ogrenci4 = "Ayhan";
		
		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		System.out.println(ogrenci4);
		
		System.out.println("--------------");
		//yukarıda yapılan işlemin aynısını aşağıda daha kolay yapıyoruz ekstradan kod yazmamıza gerek kalmıyor.
		String[] ogrenciler = new String[4];
		ogrenciler[0]="Furkan";
		ogrenciler[1]="Sena";
		ogrenciler[2]="Pirtik";
		ogrenciler[3]="Ayhan";
		            //öğrencilerin eleman sayısı           
		for(int i=0;i<ogrenciler.length;i++) {
			System.out.println(ogrenciler[i]);
		}
		System.out.println("--------------");
		//yukarıdaki for döngüsünün aynısı
		for(String ogrenci:ogrenciler) {
			System.out.println(ogrenci);
		}
	}

}
