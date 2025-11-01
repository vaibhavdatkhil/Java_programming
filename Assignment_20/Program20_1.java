class Logic
{
    public void SumEvenNumbers(int iNo)
    {
        int iCnt = 0;
        int iSumEven = 0;
        for(iCnt = 1; iCnt <= iNo ; iCnt++)
        {
            if(iCnt % 2 == 0)
            {
                iSumEven = iSumEven + iCnt;
            }
        }
        System.out.println(iSumEven);
    }
}

public class Program20_1 
{
    public static void main(String[] args) 
    {
        Logic lobj = new Logic();
        lobj.SumEvenNumbers(10);
    }
}
