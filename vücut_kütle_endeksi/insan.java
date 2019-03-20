public class insan {
      private String ad;
      private String soyad;
      private int yas;
      private float kilo;
      private float boy;
    
      public insan() 
      {
    	  
      }
      
      public insan(String n,String sn,int y) 
      {
    	  ad=n;
    	  soyad=sn;
    	  yas=y;
      }
      
      
      public void setall(float uzunluk,float kg) 
      {
    	  boy=uzunluk;
    	  kilo=kg;
    	  
      }
      
      public float getboy()
      {
    	  return boy;
      }
      
      public float getkilo() 
      {
          return kilo;
      }
      
      public float endeks(float kilo,float boy)
      {
    	  return(kilo/(boy*boy));
      }
      
}

