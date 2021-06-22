import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	// declare variables
        int num1 ,num2,sum;
        boolean doItAgain=true;

        do{
            //get the two numbers
            try {
                num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter the first number : "));
                num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter the second number : "));

                //determine the sum
                sum = num1 + num2;

                //display the sum
                JOptionPane.showMessageDialog(null, "The sum of " + num1 +" and " + num2 + " is " + sum);
                 doItAgain=false;
            }catch(NumberFormatException nfe){
                JOptionPane.showMessageDialog(null,"You have entered the wrong input. please enter a number");
            }
        }while(doItAgain);
    }
}
