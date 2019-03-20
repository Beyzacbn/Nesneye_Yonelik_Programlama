public class Tarih
{
     private int saat;
     private int dakika;
     private int saniye;


public Tarih()
{
	this(0,0,0);
}

public Tarih(int st)
{
	this(st,0,0);
}

public Tarih(int st,int d) 
{
	this(st,d,0);
}

public Tarih(int st,int d,int se) 
{ 
	//this(st,d,se);
	setTarih(st,d,se);
}

public Tarih (Tarih tarih)
{
	this(tarih.getSaat(),tarih.getDakika(),tarih.getSaniye());
}

public void setTarih(int st,int d,int se) 
{
	setSaat(st);
	setDakika(d);
	setSaniye(se);
	
}

public void setSaat(int st)
{
	saat=((st >=0 && st<24)?st:0);
}

public void setDakika(int d)
{
	dakika=((d>=0 && d<60)? d:0);
}

public void setSaniye(int se)
{
	saniye=((se>=0 && se<60)? se:0);
}

public int getSaat() 
{
	return saat;
	
}

public int getDakika() 
{
	return dakika;
	
}

public int getSaniye() 
{
	return saniye;

}


public String evrenselSaat () {
	return String.format("%d:%d:%d",getSaat(),getDakika(),getSaniye());
	
}

}
