class Logic
{
    public void CalculatePower(int base,int exp)
    {
        int iCnt = 0;
        int iPower = 1;

        for(iCnt = 1; iCnt <= exp; iCnt++)
        {
            iPower = iPower * base;
        }
        System.out.println("Power is :"+iPower);
    }
}

public class Program19_5 
{
    public static void main(String[] args) 
    {
        Logic lobj = new Logic();
        lobj.CalculatePower(2,5);
    }
}
