class Logic
{
    public void CheckPalindrome(int iNum)
    {
        int iDigit = 0;
        int iNum1 = 0;
        int iRev = 0;

        while(iNum != 0)
        {
            iDigit = iNum % 10;
            iRev = (iRev*10)+iDigit;
            iNum = iNum/10;
        }
        if(iNum1 == iRev)
            {
                System.out.println("It is palindrome number");
            }
            else
            {
                System.out.println("It is not palindrome number");
            }  
    }
}


public class Program17_2 
{
    public static void main(String[] args) 
    {
        Logic lobj = new Logic();
        lobj.CheckPalindrome(121);
    }
}
