class Logic
{
    public void PrintEvenNumbers(int iNo)
    {
         int iCnt = 0;
        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            if(iCnt % 2 == 0)
            {
                System.out.println(iCnt);
            }
        }
    }
}

public class Program18_2 
{
    public static void main(String[] args) 
    {
        Logic lobj = new Logic();
        lobj.PrintEvenNumbers(20);
    }
}
