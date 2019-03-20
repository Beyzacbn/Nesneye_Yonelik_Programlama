public class MaasliCalisan extends Calisan 
{
	private double haftalikMaas;
	
	public MaasliCalisan(String ad ,String soyad, String tc ,double maas)
	{
		super(ad,soyad,tc);
		setHaftalikMaas(maas);
		
	}
	
	public void setHaftalikMaas(double maas)
	{
		haftalikMaas=maas<0.0? 0.0 : maas;
		
	}
	
	public double getHaftalikMaas() {
		return haftalikMaas;
	}
	
	public double kazanc() {
		return getHaftalikMaas();
		
	}
	
	public String toString () {
		return String.format("Maasli calisan : %s\n Haftalik maasi: %2f",super.toString(),getHaftalikMaas());
	}
}

