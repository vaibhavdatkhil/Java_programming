class Logic
{
    public void CheckDivisible(int iNo)
    {
        if(iNo % 5 == 0 && iNo % 11 == 0)
        {
            System.out.println(iNo+"Divisible by 5 and 11");
        }
        else
        {
            System.out.println(iNo+" " +"Not Divisible by 5 and 11");
        }
    }
}

public class Program19_3 
{
    public static void main(String[] args) 
    {
        Logic lobj = new Logic();
        lobj.CheckDivisible(55);
    }
}
