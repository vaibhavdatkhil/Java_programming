class Logic
{
    public void CheckPerfect(int iNo)
    {
       int iCnt = 0;
       int iSum = 0;

        for(iCnt = 1; iCnt <= iNo/2; iCnt++)
        {
            if(iNo % iCnt == 0)
            {
                iSum = iSum + iCnt;
            }
        }

        if(iSum == iNo)
        {
            System.out.println(iNo + " is a Perfect Number");
        }
        else
        {
            System.out.println(iNo + " is not a Perfect Number");
        } 
    }
}

public class Program20_3 
{
    public static void main(String[] args) 
    {
        Logic lobj = new Logic();
        lobj.CheckPerfect(6);
    }
}
