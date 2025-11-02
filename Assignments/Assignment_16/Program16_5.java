class Logic
{
    public void CountDigits(int iNum)
    {
         int iDigit = 0;
         int iCount = 0;

        while(iNum != 0)
        {
            iDigit = iNum % 10;
            iCount++;
            iNum = iNum/10;
        }
        System.out.println("count is:"+iCount);
    }
}

public class Program16_5 
{
    public static void main(String[] args) 
    {
        Logic lobj = new Logic();
        lobj.CountDigits(1234444);
    }
}
