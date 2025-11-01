class Logic
{
    public void PrintReverse(int iNo)
    {
        int iCnt = 0;
        for(iCnt = iNo; iCnt > 0; iCnt--)
        {
            System.out.println(iCnt);
        }
    }
}

public class Program20_2 
{
    public static void main(String[] args) 
    {
        Logic lobj = new Logic();
        lobj.PrintReverse(10);
    }
}
