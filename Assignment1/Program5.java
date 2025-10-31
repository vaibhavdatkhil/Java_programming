import java.util.Scanner;

class Program5
{
    public static void Accept(int iNo)
{
    int iCnt = 0;
    for(iCnt = 1; iCnt <= iNo; iCnt++)
    {
        System.out.println(" * ");
    }
}
    public static void main(String A[])
    {
         int iValue = 0;

         System.out.println("Enter the number :");
         Scanner sc = new Scanner(System.in);
         iValue = sc.nextInt();

         Accept(iValue);
    }
    
}
