// Written by Nubia Levon
// Date: 8-28-14
// Course number: CIS163AA 
// Section number: 12557
// MEID: NUB2054987

import java.util.Comparator;


public class Service
{
   private String description;
   private double price;
   private int elapsedTime;
   
   public void SetDescription( String s )
   {
      description = s;
   }
   public void SetPrice( double p )
   {
      price = p;
   }
   public void SetElapsedTime( int t )
   {
      elapsedTime = t;
   }
   
   public String GetDescription()
   {
      return description;
   }
   public double GetPrice()
   {
      return price;
   }
   public int GetElapsedTime()
   {
      return elapsedTime;
   }
   
   
   public Service()
   {
   }
   
   public Service( String d, double p, int t)
   {
      description = d;
      price = p;
      elapsedTime = t;
   }

   // Comparators to override the Compare to method of the Arrays class
   public static Comparator<Service> DescriptionComparator = new Comparator<Service>()
   {
      public int compare(Service s1, Service s2)
      {
         String serviceDesc1 = s1.GetDescription().toUpperCase();
         String serviceDesc2 = s2.GetDescription().toUpperCase();
         
         // ascending order
         return serviceDesc1.compareTo(serviceDesc2);
      }
   };

    public static Comparator<Service> PriceComparator = new Comparator<Service>()
    {
      public int compare(Service s1, Service s2)
      {
         double price1 = s1.GetPrice();
         double price2 = s2.GetPrice();
         
         // ascending order
         return (int)(price1 - price2);
         
      }
    };
    
    public static Comparator<Service> TimeComparator = new Comparator<Service>()
    {
      public int compare(Service s1, Service s2)
      {
         int time1 = s1.GetElapsedTime();
         int time2 = s2.GetElapsedTime();
         
         // ascending order
         return time1 - time2;
      }
    };


}