// Written by Nubia Levon
// Date: 8-27-14
// Course number: CIS163AA 
// Section number: 12557
// MEID: NUB2054987

import java.util.*;
import javax.swing.JOptionPane;

public class MadLib
{
   public static void main (String args[])
   {
      String adjective;
      String noun1;
      String verbtobe;
      String properNoun;
      String noun2;
      String verb;
      String nurseryRhyme;
      
      do
      {   // Request the words for each english part of speech
         adjective = JOptionPane.showInputDialog(null, "Please enter an adjective:", "Mad Lib", JOptionPane.INFORMATION_MESSAGE );
         noun1 = JOptionPane.showInputDialog(null, "Please enter a noun", "Mad Lib", JOptionPane.INFORMATION_MESSAGE );
         verbtobe = JOptionPane.showInputDialog(null, "Please enter a verb to be", "Mad Lib", JOptionPane.INFORMATION_MESSAGE );
         properNoun = JOptionPane.showInputDialog(null, "Please enter a proper noun", "Mad Lib", JOptionPane.INFORMATION_MESSAGE );
         noun2 = JOptionPane.showInputDialog(null, "Please enter a noun", "Mad Lib", JOptionPane.INFORMATION_MESSAGE );
         verb = JOptionPane.showInputDialog(null, "Please enter a verb", "Mad Lib", JOptionPane. INFORMATION_MESSAGE );
         
         // Compose the nursery rhyme string
         nurseryRhyme = properNoun + " had a " + adjective + " " + noun1 + "\n" +
                        "Its " + noun2 + " " +  verbtobe + " " + adjective + " as snow\n" +
                        "And everywhere that " + properNoun + " " + verb + "\n" +
                        "The " + noun1 + " " + verbtobe + " sure to go.\n";
         
         // Show the nursery rhyme that was composed               
         JOptionPane.showMessageDialog(null, nurseryRhyme, "Nursery Rhyme", JOptionPane.INFORMATION_MESSAGE );
         // while  the user continues to want to play
      } while( JOptionPane.showConfirmDialog(null, "Would you like to do it again?", "Mad Lib", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE  )
               == JOptionPane.YES_OPTION        );      
      
      
   }


}