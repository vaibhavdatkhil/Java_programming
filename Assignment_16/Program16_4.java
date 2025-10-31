class Logic
{
    public void ReverseNumber(int iNum)
    {
        int iDigit = 0;

        while(iNum != 0)
        {
            iDigit = iNum % 10;
            System.out.println(iDigit);
            iNum = iNum/10;
        }
    }
}

class Program16_4
{
    public static void main(String[] args)
    {
        Logic lobj = new Logic();
        lobj.ReverseNumber(1234);
    }
}