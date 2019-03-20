public abstract class Calisan 
{
	private String isim;
	private String soyisim;
	private String tcNumarasi;
	
	public Calisan(String ad, String soyad , String TcNumarası)
	{
		isim=ad;
		soyisim=soyad;
		tcNumarasi=TcNumarası;
		
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public String getSoyisim() {
		return soyisim;
	}

	public void setSoyisim(String soyisim) {
		this.soyisim = soyisim;
	}

	public String getTcNumarasi() {
		return tcNumarasi;
	}

	public void setTcNumarasi(String tcNumarasi) {
		this.tcNumarasi = tcNumarasi;
	}
	

	public abstract double kazanc();
	
	public String toString() 
	{
		return String.format("%s %s \n %s", getIsim(), getSoyisim(),getTcNumarasi() );
	}
	
	
}
