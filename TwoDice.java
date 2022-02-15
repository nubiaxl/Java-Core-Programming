// Written by Nubia Levon
// Date: 8-27-14
// Course number: CIS163AA 
// Section number: 12557
// MEID: NUB2054987

import java.util.*;
import javax.swing.JOptionPane;

public class TwoDice
{
   public static void main (String args[])
   {
      Die diceOne = new Die();
      Die diceTwo = new Die();
      
      if( diceOne.GetRollDie() > diceTwo.GetRollDie() )
         JOptionPane.showMessageDialog(null, "Dice One Wins! value = " + diceOne.GetRollDie() +
                                                 "\nDice Two value = " + diceTwo.GetRollDie(), "Roll Dice", JOptionPane.INFORMATION_MESSAGE  );
     
      else if( diceOne.GetRollDie() == diceTwo.GetRollDie() )
         JOptionPane.showMessageDialog(null, "Its a tie, both die rolled a " + diceOne.GetRollDie(), "Roll Dice", JOptionPane.INFORMATION_MESSAGE );
      else
         JOptionPane.showMessageDialog(null, "Dice Two Wins! value = " + diceTwo.GetRollDie() +
                                       "\nDice One value = " + diceOne.GetRollDie(), "Roll Dice", JOptionPane.INFORMATION_MESSAGE  );
   

   }


}