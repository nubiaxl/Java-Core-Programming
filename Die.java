// Written by Nubia Levon
// Date: 8-27-14
// Course number: CIS163AA 
// Section number: 12557
// MEID: NUB2054987

import java.util.*;
import javax.swing.JOptionPane;

public class Die
{
   private int rollDie;
    
    
   public void SetRollDie( int d )
   {
      rollDie = d;
   }
   
   public int GetRollDie()
   {
      return rollDie;
   }
   
   public Die()
   {
      final int HIGHEST_DIE_VALUE = 6;
      final int LOWEST_DIE_VALUE = 1;
      
      rollDie = ((int)(Math.random()*100) % HIGHEST_DIE_VALUE + LOWEST_DIE_VALUE);
   }
   
   
   


}