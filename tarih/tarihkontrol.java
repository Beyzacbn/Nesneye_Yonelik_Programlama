public class Zaman 
{
	private int gun;
	private int ay;
	private int yil;
	
	public Zaman(int Gun, int Ay,int yil)
	{
		gun=gunKontrol(Gun);
		ay=ayKontrol(Ay);
		this.yil=yil;
		
		System.out.printf("zaman constructor: %s \n",this );
	} 
	
	
	public int gunKontrol(int testGun) 
	{
		if(testGun>0 && testGun<=31)
		   return testGun;
		   
		else {
			throw new IllegalArgumentException("Ay 1-31 arasında olmalı");
		}
			
		
			   
	}
	
	public int ayKontrol(int testAy) 
	{
		if(testAy>0 && testAy<=12)
		   return testAy;
		   
		else
			throw new IllegalArgumentException("Ay 1-12 arasında olmalı");
		
    }
	
	public String toString()
	{
		return String.format("%d / %d / %d" ,gun ,ay,yil);
		
	}
		
}

