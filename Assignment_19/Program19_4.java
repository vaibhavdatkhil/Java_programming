class Logic
{
    public void PrintDigits(int iNo)
    {
        int iDigit = 0;
        while(iNo != 0)
        {
            iDigit = iNo % 10;
            iNo = iNo/10;
            System.out.println(iDigit);
           
        }

        
    }
}


public class Program19_4 
{
    public static void main(String[] args) 
    {
        Logic lobj = new Logic();
        lobj.PrintDigits(9876);
    }
}
