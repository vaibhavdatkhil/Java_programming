class Logic
{
    public void CheckEvenOdd(int num)
    {
        if(num % 2 == 0)
        {
            System.out.println("Number is Even");
        }
        else
        {
            System.out.println("Number is Odd");
        }
    }
}

public class Program16_2
{
    public static void main(String  A[]) 
    {
        Logic lobj = new Logic();
        lobj.CheckEvenOdd(4);
    }
    
}
