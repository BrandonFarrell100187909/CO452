import java.util.Scanner;
public class program6 
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        
        //input the age of the person based on how old they will be this year
        System.out.println("How old will you be this year?");
        int age = reader.nextInt();

        //calculate year born
        int year = 2021 - age;

        //output the year born
        System.out.println("You were born on the year :"+year);

        //message to the user if they are age 18 years or older
        if (age == 18)
        {
            System.out.println("You are 18 years or older.");
        }

        reader.close();

    }
}
