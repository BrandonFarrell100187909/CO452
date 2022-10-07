
public class program2 
{
public enum grades
{
    NS, F, D, C, B, A;
}


{}
    public final int GRADE_NS = 0;
    public final int GRADE_F = 39;
    public final int GRADE_D = 49;
    public final int GRADE_C = 59;
    public final int GRADE_B = 69;
    public final int GRADE_A = 100;

    {
    if(mark >= GRADE_NS && mark <= GRADE_F)
        System.out.println("This is a failed attempt");
    else if (mark >= GRADE_F && mark <= GRADE_D)
        System.out.println("This is a pass");
    else if (mark >= GRADE_D && mark <= GRADE_C)
        System.out.println("This is a 2:2");
    else if (mark >= GRADE_C && mark <= GRADE_B);
        System.out.println("This is a 2:1");
    if (mark >= GRADE_B && mark <= GRADE_A)
        System.out.println("This is a 1st");
    else
        System.out.println("This is an invalid mark");
    }





}