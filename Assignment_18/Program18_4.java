class Logic
{
    public void SumEvenOddDigits(int iNo)
    {
        int iDigit = 0;
        int iSumEven = 0;
        int iSumOdd = 0;

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            if(iDigit % 2 == 0)
            {
                iSumEven = iSumEven + iDigit;
            }
            else
            {
                iSumOdd = iSumOdd + iDigit;
            }
            iNo = iNo /10;
        }
        System.out.println("Sum of even numbers is :"+iSumEven);

        System.out.println("Sum of odd numbers is :"+iSumOdd);

    }
}


public class Program18_4 
{
    public static void main(String[] args) 
    {
        Logic lobj = new Logic();
        lobj.SumEvenOddDigits(123456);
    }
}
