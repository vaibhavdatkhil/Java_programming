class Logic
{
    public void SumOfDigits(int iNum)
    {
        int iDigit = 0;
         int iSum = 0;

        while(iNum != 0)
        {
            iDigit = iNum % 10;
            iSum = iSum + iDigit;
            iNum = iNum/10;
        }
        
        System.out.println("Sum is:"+iSum);
    }
}

public class program17_1 
{
    public static void main(String[] args) 
    {
        Logic lobj = new Logic();
        lobj.SumOfDigits(1234);
    }
}
