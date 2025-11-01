class Logic
{
    public void CheckLeapYear(int iYear)
    {
        if ( % 400 == 0) 
        {
            System.out.println(iYear + " is a Leap Year.");
        } 
        else if (iYear % 100 == 0) 
        {
            System.out.println(iYear + " is Not a Leap Year.");
        } 
        else if (iYear % 4 == 0) 
        {
            System.out.println(iYear + " is a Leap Year.");
        } 
        else 
        {
            System.out.println(iYear + " is Not a Leap Year.");
        }
    }
}

public class Program19_1 
{
    public static void main(String[] args) 
    {
        Logic lobj = new Logic();
        lobj.CheckLeapYear(2024);
    }
}
