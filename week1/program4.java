package week1;
import java.util.Scanner;

public class program4 
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        
        //input the values
        System.out.println("Please enter the first number");
        int value1 = reader.nextInt();

        System.out.println("Please enter the second number");
        int value2 = reader.nextInt();

        //calculate average of the values
        int average = value1 + value2 *2;

        //output average
        System.out.println("The average is :"+average);

        reader.close();

    }

}    

