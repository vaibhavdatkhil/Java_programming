class Logic
{
    public void CountEvenOddRange(int iNo)
    {
        int iCnt = 0;
        int iCEven = 0;
        int iCOdd = 0;

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            if(iCnt % 2 == 0)
            {
                iCEven++;
            }
            else
            {
                iCOdd++;
            }
        }
        System.out.println("The count of Even number is : "+iCEven);
         System.out.println("The count of Odd number is : "+iCOdd);
    }
}


public class Program21_2 
{
    public static void main(String[] args) 
    {
        Logic lobj = new Logic();
        lobj.CountEvenOddRange(10);
        
    }
    
}
