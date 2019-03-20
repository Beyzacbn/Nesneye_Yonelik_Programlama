import java.util.Scanner;
public class test {

	public static void main(String[] args) {
		String isim;
		String soyisim;
		float kg;
		float uzunluk;
		int yas;
		
		Scanner input= new Scanner(System.in);
		System.out.println("boyunuz:");
		uzunluk=input.nextFloat();
		System.out.println("kilonuz:");
		
		kg=input.nextFloat();
		
		insan i1= new insan("Ali","Tek",15);
		
		i1.setall(uzunluk, kg);
		
		System.out.println("endeks:"+(i1.endeks(i1.getkilo(),i1.getboy())));
		
		
		

	}

}

