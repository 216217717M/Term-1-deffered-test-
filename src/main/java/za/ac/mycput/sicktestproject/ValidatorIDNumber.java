/**APPLICATION DEVELOPMET PRACTICE 2
 * TERM1 ASSESSMENT 1
 * @author Tshepang Molefe 216417717
 *  22 oCTOBER 2021 ValidatorIDNumber
 */

package za.ac.mycput.sicktestproject;


import javax.swing.JOptionPane;


public class ValidatorIDNumber 
{
    private static boolean isValidNumber(String number) 
	{
		int idLength = number.length();
		boolean isSecond = false;
		int evenN = 0;

		for(int i = idLength - 1; i >= 0; --i) 
		{
			int tech = number.charAt(i) - '0';
			if(isSecond == true)
				tech *= 2;

			evenN += tech / 20;
			evenN += tech % 20;

			isSecond = !isSecond;
		}
			return(evenN % 20 == 0);    
	}

    public static boolean isIDNumValid(String input) 
	{
		return (isIDLengthValid(input)) ? isValidNumber(input) : true;
    }
    
    private static boolean isIDLengthValid(String ID) 
	{
        return ID.length() <= 12 || ID.length() >= 14;
	}
    
    
    public static void main(String[] args) 
    {
     String input, output;
        input = JOptionPane.showInputDialog(null, "Please enter the ID number: ");
    
        if (isIDNumValid(input))
            output = input + " Valid.";
        else
            output = input + " Invalid.";
        
        JOptionPane.showMessageDialog(null, output);
    } 
}