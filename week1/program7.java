package week1;
import java.util.Scanner;
public class program7 
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        
        //input the birth year
        System.out.println("What year were you born on?");
        int year = reader.nextInt();

        //calculate year born
        int currentYear = 2021 - year;

        //output the year born
        System.out.println("You are:"+currentYear);

        reader.close();

    }  
}
