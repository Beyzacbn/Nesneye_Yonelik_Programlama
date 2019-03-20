public class SaatliCalisan extends Calisan 
{
	private double ucret;
	private double saat;
	
	public SaatliCalisan(String ad ,String soyad ,String TC,double saatlikUcret,double calismaSaat) 
	{
		super(ad,soyad,TC);
		setUcret(saatlikUcret);
		setSaat(calismaSaat);
		
	}
	
	
	public void setUcret(double saatlikUcret) 
	{
		if(saatlikUcret>=0.0)
			ucret=saatlikUcret;
		else
			throw new IllegalArgumentException("saatlik ücret 0dan buyuk olmalı");
		
		
	}
	
	public double getUcret() {
		return ucret;
	}
	
	public void setSaat(double calismaSaati) {
		if(calismaSaati >=0.0 && calismaSaati <=168)
			saat=calismaSaati;
		else
			throw new IllegalArgumentException("çalişma saati 0-168 aralığında olmalı");
		
	}
	
	public double getSaat() {
		return saat;
	}
	
	public double kazanc() 
	{
		if(saat<=40)
			return getSaat()*getUcret();
		else 
			return 40*getUcret()+(getSaat()-40)*getUcret()*1.5;
	}
	
	public String toString()
	{
		return String.format ("Saatli Calisan: %s \n Saatlik Ucret: %.2f \n Calisma Saati : %.2f ",super.toString(),getUcret(),getSaat());
	}
	

}

