import java.util.Scanner;
class Program4 
{
    public static boolean Check(int iNo)
{
    if((iNo % 5) == 0)
    {
        return true;
    }
    else
    {
        return false;
    }
}

public static void main(String A[])
{
    int iValue = 0;
    boolean bRet = false;

    System.out.println("Enter a number :");

    Scanner sc = new Scanner(System.in);
    iValue = sc.nextInt();

    bRet = Check(iValue);

    if(bRet == true)
    {
        System.out.println("Divisible by 5");
    }
    else
    {
        System.out.println("Not Divisible by 5");
    }

}
    
}
