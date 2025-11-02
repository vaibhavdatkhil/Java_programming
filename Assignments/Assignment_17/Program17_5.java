class Logic
{
    public void PrintTable(int iNo)
    {
        int iCnt = 0;
        for(iCnt = 1; iCnt <= 10; iCnt++)
        {
            System.out.println(iCnt*iNo);
        }
    }
}
public class Program17_5 
{
    public static void main(String[] args) 
    {
        Logic lobj = new Logic();
        lobj.PrintTable(3);
    }
}
