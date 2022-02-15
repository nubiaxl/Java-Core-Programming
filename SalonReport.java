// Written by Nubia Levon
// Date: 8-28-14
// Course number: CIS163AA 
// Section number: 12557
// MEID: NUB2054987

import java.util.*;
import javax.swing.JOptionPane;

public class SalonReport
{
   public static void main (String args[] )
   {
       int sortOn;
       String sortStr;
   
      //instantiate the array with the service values
       Service [] salon = new Service [6];  
       salon[0] = new Service("Cut", 8.00, 15);
       salon[1] = new Service("Shampoo", 4.00, 10);
       salon[2] = new Service("Manicure", 18.00, 30);
       salon[3] = new Service("Style", 48.00, 55);
       salon[4] = new Service("Permanent", 18.00, 35);
       salon[5] = new Service("Trim", 6.00, 5);
   
       
   
       do
      {  // Print the menu on screen
         sortStr = JOptionPane.showInputDialog(null, "Which field would you like to sort the services menu: \n" +
                                           "Enter 1 for Sort by Service Description \n" +
                                           "Enter 2 for Sort by Price\n" +
                                           "Enter 3 for Sort by Time (minutes)\n" +
                                           "Enter 0 to Exit" );
         sortOn = Integer.parseInt( sortStr );    
        // Sort the array based on the key selected by the user
         switch ( sortOn )
         {
            case 1: Arrays.sort(salon, Service.DescriptionComparator );
                    display(salon);
                     break;
            case 2: Arrays.sort(salon, Service.PriceComparator );
                     display(salon);
                     break;
            case 3: Arrays.sort(salon, Service.TimeComparator );
                     display(salon);
                     break;
            case 0: break;         
            default:
                     JOptionPane.showMessageDialog(null, "Error on the sort value" );
                     break;
         }
         
         
      } while (sortOn != 0 );
   }
   
   // Displays the sorted data to the system output screen
   public static void display(Service [] a)
   {
            String displayStr = String.format("\n%-24s%-24s%-10s", "Description", "Price", "Time");
            // Display the sorted information
            for(int x = 0; x < a.length; x++ )
            {
            
              
               displayStr += String.format("\n%-24s%-24s%-10s", a[x].GetDescription(), a[x].GetPrice(), a[x].GetElapsedTime() );
            }
            
            System.out.println(displayStr);
   
   
   
   }

}