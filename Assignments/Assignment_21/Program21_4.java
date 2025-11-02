class Logic
{
    public void CountFactors(int iNo)
    {
        int iCnt = 0;
        int iCounnt = 0;
        for(iCnt = 1; iCnt <= (iNo/2); iCnt++)
        {
            if(iNo % iCnt == 0)
            {
                iCounnt++;
            }
        }
            System.out.println("Total factors are : "+iCounnt);
    }
}


public class Program21_4 
{
    public static void main(String[] args) 
    {
        Logic lobj = new Logic();
        lobj.CountFactors(12);
    }
}
