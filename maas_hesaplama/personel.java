public class Personel 
{
	protected String ad;
	protected String soyad;
	protected String sskNo;
	protected double satis;    // aylık satış sayısı
	protected double komisyon; // ürün başına komisyon
	
	public Personel(String ad, String soyad, String sskNo , double satis, double komisyon)
	{
		
	this.ad=ad;
	this.soyad=soyad;
	this.sskNo=sskNo;
	this.komisyon=komisyon;
	this.satis=satis;
	
	setSatis(satis);
	setKomisyon(komisyon);
	}
	
	public double maasHesapla()
	{
		return satis*komisyon;
		
	}
@Override	
	public String toString() // overrride
	{
		
		return "Personel\t:"+ad+"\t"+soyad+"\t"+komisyon ;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getSoyad() {
		return soyad;
	}

	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}

	public String getSskNo() {
		return sskNo;
	}

	public void setSskNo(String sskNo) {
		this.sskNo = sskNo;
	}

	public double getSatis() {
		return satis;
	}

	public void setSatis(double satis) {
		if (satis>=0)
			this.satis = satis;
		else
			System.out.println("satis>=0 olmalı");
	}

	public double getKomisyon() {
		return komisyon;
	}

	public void setKomisyon(double komisyon) {
		if(komisyon>=0.0 && komisyon<1.0)
			this.komisyon = komisyon;
		else
			System.out.println("0<komisyon<1 olmalı");
	}
