public class CalisanTest {

	public static void main(String[] args) 
	{
		// Calisan a = new Calisan("ebru","yılmaz",1111) abstract olduğu için çalışmaz
		
		
		MaasliCalisan calisan1 = new MaasliCalisan("ebru","uslu","11111",800.00);
		System.out.printf("%s \n kazanc: %.2f \n-----------------------\n",calisan1,calisan1.kazanc());
		
		
		SaatliCalisan calisan2= new SaatliCalisan("kemal","durak","23456",20,40);
		System.out.printf("%s \n kazanc: %.2f \n-----------------------\n",calisan2,calisan2.kazanc());
		
		
		KomisyonluCalisan calisan3 = new KomisyonluCalisan("ayse","yılmaz","12345",10000,0.06);
		System.out.printf("%s \n kazanc: %.2f \n-----------------------\n",calisan3,calisan3.kazanc());
		
		AsgariArtıKomisyonluCalisan calisan4 = new AsgariArtıKomisyonluCalisan ("veli","ali","123454",200,0.9,500);
		System.out.printf("%s \n kazanc: %.2f \n-----------------------\n",calisan4,calisan4.kazanc());
		
		
		Calisan[] calisanlar=new Calisan[4];
		calisanlar[0]=calisan1;
		calisanlar[1]=calisan2;
		
		
		for(Calisan suankiCalisan: calisanlar)
		{
			System.out.println(suankiCalisan + "\n-----------\n");
			
			if(suankiCalisan instanceof AsgariArtıKomisyonluCalisan)
			{
				AsgariArtıKomisyonluCalisan calisan= (AsgariArtıKomisyonluCalisan) suankiCalisan;
				calisan.setAsgariUcret(1.10*calisan.getAsgariUcret());
				System.out.printf("%.2f\n",calisan.getAsgariUcret());
			}
		}
		
		
		
		
