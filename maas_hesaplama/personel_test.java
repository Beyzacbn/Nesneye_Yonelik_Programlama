public class PersonelTest {

	public static void main(String[] args)
	{
		Personel p1=new Personel("jesse","pinkman","b-674576",100,0.3);
		System.out.println(p1);  // to string() override
		
		p1.setSatis(200);
		p1.setKomisyon(5); 

		System.out.println(p1);
		System.out.println(p1.toString());
		System.out.println("Maas="+p1.maasHesapla());
		
		System.out.println("------------------------------");
		
		TabanMaasliPersonel p2= new TabanMaasliPersonel("walter","white","y-6565",300,0.7,1000);
		
		System.out.println(p2.toString());
		System.out.println(p2);
		System.out.println("Maas="+p2.maasHesapla());
		

	}

}

