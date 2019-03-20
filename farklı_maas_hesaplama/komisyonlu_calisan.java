public class KomisyonluCalisan extends Calisan 
{
	private double haftalikSatis;
	private double komisyon;
	
	public KomisyonluCalisan(String ad, String soyad,String tc,double satis ,double komisyon) 
	{
		super(ad,soyad,tc);
		setHaftalikSatis(satis);
		setKomisyon(komisyon);
		
	}

	public void setHaftalikSatis(double satis) 
	{
		if (satis>=0.0)
			haftalikSatis=satis;
		else
			throw new IllegalArgumentException("hsatıs 0 da büyük olmalı");
	}
	
	public double getHaftalikSatis()
	{
		return haftalikSatis;
	}
	
	public void setKomisyon(double komisyon) 
	{
		if(komisyon>0.0 && komisyon<1.0)
			this.komisyon=komisyon;
		else
			throw new IllegalArgumentException("komisyon 0-1 aralığında olmalı");
		
	}
	
	public double getKomisyon() 
	{
		return komisyon;
		
	}
	
	public double kazanc()
	{
		return getKomisyon()*getHaftalikSatis();
		
	}
	
	public String toString() {
		return String.format("komisyonlu calisan : %s \n haftalik satır : %.2f \n komisyon oranı");
	}
	

}
