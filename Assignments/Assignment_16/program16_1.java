class Logic
{
    public void CalculateSum(int n)
    {
        int iSum = 0;
        int iCnt = 0;

        for(iCnt = 0; iCnt <= n; iCnt++)
        {
            iSum = iSum + iCnt;
        }
        System.out.println("Sum of first n natural number is :"+iSum);
    }
}

class Program16_1
{
    public static void main(String A[])
    {
        Logic lobj = new Logic();
        lobj.CalculateSum(10);
    }

}