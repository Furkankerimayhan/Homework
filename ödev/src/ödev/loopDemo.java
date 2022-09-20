package ödev;

public class loopDemo {
	public static void main(String[] args) {
		//For
		for(int i=1;i<=10;i++) {
			System.out.println(i);
		}
	    System.out.println("For Dongusu bitti");
	    
	    int i=2;
	    //While
	    while(i<10) {
	    	System.out.println(i);
	    	i+=2; 
	    }
	 // While döngüsü ile yapılabilen hemen hemen herşeyi for döngüsü ile de yapabiliyoruz. Yada tam tersi.
   	    System.out.println("While Dongusu bitti");
	//Do-While
   	    int j=1;
   	    do {
   	    	System.out.println(j);
   	    	j+=2;	    	
   	    }while(j<10);
   	 System.out.println("Do-While Dongusu bitti");
	}//Do-While ın diğer döngülerden farkı şartlar sağlanmasa bile bir kere çalışacaktır.
}
