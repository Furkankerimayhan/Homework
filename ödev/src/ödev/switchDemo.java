package ödev;

public class switchDemo {
	public static void main(String[] args) {
		char grade = 'M';
		
		switch(grade) {
		case 'A':
			System.out.println("Mukemmel : Gectiniz");
			break;
		case 'B':
			System.out.print("Cok guzel : Gectiniz.");
			break;
		case 'C':
			System.out.print("Guzel : Gectiniz.");
			break;
		case 'D':
			System.out.print("Fena degil : Gectiniz.");
			break;
		case 'F':
			System.out.print("Maalesef : Kaldınız.");
			break;
			default:
				System.out.println("Gecersiz not girdiniz.");
		}
		
	}

}
