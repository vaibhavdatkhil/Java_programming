class Logic
{
    public void FindFactorial(int iNum)
    {
        int iCnt = 0;
        for(iCnt = 1; iCnt <= (iNum/2); iCnt++)
        {
            if(iNum % iCnt == 0)
            {
                System.out.println("factorial of number is :"+iCnt);
            }
        }
    }
}

public class Program16_3 
{
    public static void main(String[] args)
    {
        Logic lobj = new Logic();
        lobj.FindFactorial(6);
    }
}
