/**
	 * Purpose:
	 * Demonstrate how to +,-,*,/,%(modulation) returns a remainder
	 * Date 9/24/2015
	 * @author walihassan
	 *
	 * 
	 */
import javax.swing.JOptionPane;

public class Expressions {
	
	public static void main(String[] args) {
		
	double div2, addivsub,addiv, multi, multi2;
	int div, rem, sum, avg, num1, num2, num3, num4, num5;
	/*
	 * The expression for addiv was changed to a double so the output would display the correct value as written on the chart  
	 * The expression for multi was also changed so that the correct value would be displayed as per the chart
	 * 	 
	 * */
	div = 1 / 2;
	System.out.println(div);
	rem = 1 % 2;
	System.out.println(rem);
	div2 = 1.0 / 2;
	System.out.println(div2);
	addiv = 5 + 7.0 / 2.0;
	System.out.println(addiv);
	String slogan = "Beat" + ' ' + "Army";
	System.out.println(slogan);
	addivsub = 6 + 13 / 5 - 35 % 3;
	System.out.println(addivsub);
	multi = (3.5 * 5 / 4);
	System.out.println(multi);
	multi2 = (3.5 * 5) / 4;
	System.out.println(multi2);
	// prompt the user by using JOptionPane 
	String input1 = JOptionPane.showInputDialog("Five numbers are needed to calculate the sum and average.\n																							Enter the first number below");
	num1 = Integer.parseInt(input1);
	String input2 = JOptionPane.showInputDialog("Enter the second number");
	num2 = Integer.parseInt(input2);
	String input3 = JOptionPane.showInputDialog("Enter the third number");
	num3 = Integer.parseInt(input3);
	String input4 = JOptionPane.showInputDialog("Enter the fourth number");
	num4 = Integer.parseInt(input4);
	String input5 = JOptionPane.showInputDialog("Enter the fifth number");
	num5 = Integer.parseInt(input5);
	sum = num1 + num2 + num3 + num4 + num5;
	avg = sum / 5;
	
	JOptionPane.showMessageDialog(null,"The sum of the numbers is " + sum + "\nand the average is " + avg);
	
	}

}
