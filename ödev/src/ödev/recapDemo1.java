package ödev;

public class recapDemo1 {
	public static void main(String[] args) {
		int sayi1 = 18;
		int sayi2 = 28;
		int sayi3 = 5;
		int enBuyuk = sayi1;
		
		if (enBuyuk<sayi2) {
			enBuyuk = sayi2;
		}
		
		if(enBuyuk<sayi3) {
			enBuyuk = sayi3;
		}
		
		System.out.println("En Buyuk = "+enBuyuk);
	}

}
