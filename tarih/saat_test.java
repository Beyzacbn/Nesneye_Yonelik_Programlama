package final1;

public class TarihTest {

	public static void main(String[] args)
	{
		Tarih t1=new Tarih();
		Tarih t2=new Tarih(2);	
		Tarih t3=new Tarih(21,34);
		Tarih t4=new Tarih(12,25,42);
		Tarih t5=new Tarih(27,74,99);
		Tarih t6=new Tarih(t4);
		
		System.out.printf("t1: %s \n ", t1.evrenselSaat());
		System.out.printf("t2: %s \n ", t2.evrenselSaat());
		System.out.printf("t3: %s \n ", t3.evrenselSaat());
		System.out.printf("t4: %s \n ", t4.evrenselSaat());
		System.out.printf("t5: %s \n ", t5.evrenselSaat());
		System.out.printf("t6: %s \n ", t6.evrenselSaat());
