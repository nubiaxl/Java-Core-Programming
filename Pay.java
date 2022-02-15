// Written by Nubia Levon
// Date: 8-27-14
// Course number: CIS163AA 
// Section number: 12557
// MEID: NUB2054987

import java.util.*;
import javax.swing.JOptionPane;

public class Pay
{
   public static void main (String args[])
   {
      int skillLevel = 0;
      String userEntry = "";
      String outputStr = "";
      double hourlyPayRate = 0.0;
      double netPay = 0.0;
      double regularPay = 0.0;
      double overtimePay = 0.0;
      int hoursPerWeek  = 0;
      int option = 0;
      double itemizedDeductions = 0;
      final double OVERTIME_RATE = 1.5;
      double medicalIns = 0.0;
      final double MED_RATE = 32.50;  // per week         for skill level 2 or 3
      double dentalIns = 0.0;
      final double DENT_RATE = 20.00; // per week         for skill level 2 or 3
      double disabilityIns = 0.0;
      final double LTD_RATE = 10.00; // per week        for skill level 2 and 3
      double retirement = 0.0;
      final double RETIRE_RATE = .03; // 3% of gross pay for skill level 3
      //Get the skill level from the user
      do
      {  
         userEntry = JOptionPane.showInputDialog(null, "Enter your skill level (1,2,3): ", "Barnhill Fastener", JOptionPane.QUESTION_MESSAGE );
         skillLevel = Integer.parseInt( userEntry );
      }  while( skillLevel < 1 || skillLevel > 3 );
      // Assign a payrate for each skill level
      switch( skillLevel )
      {
         case 1:  hourlyPayRate = 17.00;
                  break;
         case 2:  hourlyPayRate = 20.00;
                  break;
         case 3:  hourlyPayRate = 22.00;
                  break;
         default: hourlyPayRate = -1.0;
                  break;
      }
      
      // Get the number of hours worked and calculate overtime
      userEntry = JOptionPane.showInputDialog(null, "Enter hours worked this week: ", "Barnhill Fastener", JOptionPane.QUESTION_MESSAGE );
      hoursPerWeek = Integer.parseInt( userEntry );
      if( hoursPerWeek > 40 ) // Calculate overtime pay
      {
         overtimePay = (hoursPerWeek - 40)* hourlyPayRate* OVERTIME_RATE; 
         regularPay = 40 * hourlyPayRate;
      }
      else
         regularPay = hoursPerWeek * hourlyPayRate;
         
       itemizedDeductions = 0;  
      // Insurance options for skill levels 2 and 3
      if( skillLevel == 2 || skillLevel == 3 )
      {  
         // Check if user wants medical insurance and calc itemized deductions
         option = JOptionPane.showConfirmDialog(null, "Do you want medical insurance at " + MED_RATE + " per week?", "Barnhill Fasteners", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE );
         if( option == JOptionPane.YES_OPTION)
         {
            medicalIns = MED_RATE;
            itemizedDeductions = itemizedDeductions + MED_RATE;
         }
         // Check if user wants dental insusrance and calc itemized deductions
         option = JOptionPane.showConfirmDialog(null, "Do you want dental insurance at " + DENT_RATE + " per week?", "Barnhill Fasteners", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE );
         if( option == JOptionPane.YES_OPTION)
         {
            dentalIns = DENT_RATE;
            itemizedDeductions = itemizedDeductions + DENT_RATE;
         }
         // Check if user wants disability and calc itemized deductions
         option = JOptionPane.showConfirmDialog(null, "Do you want long term disability insurance at " + LTD_RATE + " per week?", "Barnhill Fasteners", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE );
         if( option == JOptionPane.YES_OPTION)
         {
            disabilityIns = LTD_RATE;
            itemizedDeductions = itemizedDeductions + LTD_RATE;
         }
       }
       
       if( skillLevel == 3 )
       {  // The retirement plan option 
         option = JOptionPane.showConfirmDialog(null, "Do you want the retirement plan at " + (RETIRE_RATE*(regularPay + overtimePay)) + " per week?", "Barnhill Fasteners", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE );
         if( option == JOptionPane.YES_OPTION)
         {
            retirement = RETIRE_RATE*(regularPay + overtimePay);
            itemizedDeductions = itemizedDeductions + retirement;
         }
       }
       // Calculate the net pay
       netPay = regularPay + overtimePay - itemizedDeductions;
       
       
       //**************************************************** Display values ***********************************
         String.format("%.2f", regularPay );
         JOptionPane.showMessageDialog( null, regularPay );
         outputStr = "\nThe hours worked: " + hoursPerWeek +
                     "\nHourly pay rate : \t\t\t" + String.format("%7.2f", hourlyPayRate) +
                     "\nRegular Pay: \t\t\t" + String.format("$%7.2f", regularPay) +
                     "\nOvertime Pay    : \t\t\t" + String.format("$%7.2f", overtimePay) +
                     "\nTotal Gross Pay : \t\t\t\t" + String.format("$%7.2f",(regularPay + overtimePay)) +
                     "\nTotal itemized deductions: \t\t" + String.format("$%7.2f", itemizedDeductions);
       if( netPay < 0 )
         JOptionPane.showMessageDialog(null, "Deductions exceed pay", "Error", JOptionPane.ERROR_MESSAGE );
       else
         outputStr = outputStr + "\nNet Pay   : " + String.format("$%7.2f", netPay);
         
       JOptionPane.showMessageDialog(null, outputStr, "Barnhill Fastener", JOptionPane.INFORMATION_MESSAGE );    


   }

}