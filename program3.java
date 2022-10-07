import java.util.Scanner;

public class program3 
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        
        //input length and height
        System.out.println("Please enter Length");
        int length = reader.nextInt();

        System.out.println("Please enter Height");
        int height = reader.nextInt();

        //calculate area and perimeter
        int area = length * height;
        int perimeter = (length * height)*2;

        //output area
        System.out.println("The area is :"+area);
        System.out.println("The perimeter is :"+perimeter);

       reader.close();

    }
    
    
    




}