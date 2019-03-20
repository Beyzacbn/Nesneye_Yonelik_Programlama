import java.util.Scanner;

public class quiz {

	public static void main(String[] args) 
	{
		int sayi;
		Scanner input= new Scanner(System.in);
		System.out.println("bir sayı girin");
		sayi=input.nextInt();
        
        
	}
	
	public static void gün(int sayi) 
	{
       switch(sayi)
       {
       case 1 :
    	   System.out.println("gün: pazartesi");
    	   break;
       case 2 :
           System.out.println("gün: salı");
	       break;
       case 3 :
    	   System.out.println("gün: çarşamba");
    	   break;
       case 4 : 
    	   System.out.println("gün: perşembe");
    	   break;
       case 5 :
    	   System.out.println("gün: cuma");
    	   break;
       case 6 :
    	   System.out.println("gün: cumartesi");
    	   break;
       case 7 :
    	   System.out.println("gün: pazar");
    	   break;
       default:
    	   System.out.println("öyle bir gün yok");
