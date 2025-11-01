class Logic
{
    public void ChcekSign(int iNo)
    {
        if(iNo < 0)
        {
            System.out.println("Number is negative");
        }
        else if(iNo > 0)
        {
            System.out.println("Number is positive");
        }
        else
        {
            System.out.println("Number is Zero");
        }
    }
}


public class Program18_5 
{
    public static void main(String[] args) 
    {
        Logic lobj = new Logic();
        lobj.ChcekSign(-8);
    }
}
