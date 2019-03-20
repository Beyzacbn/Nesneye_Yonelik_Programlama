public class AsgariArtıKomisyonluCalisan extends KomisyonluCalisan 
{
	private double asgariUcret;
	
	public AsgariArtıKomisyonluCalisan(String ad , String soyad , String tc, double satis, double komisyon,double ucret)
	{
		super(ad,soyad,tc,satis,komisyon);
		setAsgariUcret(ucret);
	}
	
	public void setAsgariUcret(double ucret) 
	{
		if(ucret>=0.0)
			asgariUcret=ucret;
		else
			throw new IllegalArgumentException("ucret o dan büyük olmalı");
	}
	
	public double getAsgariUcret() 
	{
		return asgariUcret;
	}
	
	public double kazanc()
	{
		return getAsgariUcret()+super.kazanc();
		
	}
	
	public String toString()
	{
		return String.format("Asgari Ucretli %s ; Asgari ucreti %.2f",super.toString(),getAsgariUcret());
	}
	
	
	
	
	
	
	
}

