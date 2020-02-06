/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threeletteracronym;

/**
 *
 * @author JohnV
 */
import javax.swing.*;
public class ThreeLetterAcronym {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            
                String words;
		String acronym="";
		
		int length; 
		
		char c;
		words = JOptionPane.showInputDialog(null, "Please enter your words to make acronym");
		int count = 1;
		length = 0;
		acronym += Character.toUpperCase(words.charAt(length));
		
		while(length < words.length())
		{	
			
			if(words.charAt(length) == ' ' && count < 3)
			{
				count++;
				acronym += Character.toUpperCase(words.charAt(length + 1));
				
			}
			++length;
			
			
		}
		
		if (count != 3)
		{
			JOptionPane.showMessageDialog(null,"Please use 3 words ");
		}
		else
		{
		JOptionPane.showMessageDialog(null,"Your 3 letter acronym is: " + acronym);
		}
    }
    
    public static void TurrellwasHere(){
            System.out.println("Turrell Was Here");
}
    public static void smithWasHere(){
     System.out.println("Smith was here");
 }

    
}
