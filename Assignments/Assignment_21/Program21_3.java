class Logic
{
    public void DisplayFactors(int iNo)
    {
        int iCnt = 0;
        for(iCnt = 1; iCnt <= (iNo/2);iCnt++)
        {
            if(iNo%iCnt == 0)
            {
                System.out.println(iCnt);
            }
        }
    }
}


class Program21_3
{
    public static void main(String[] args) 
    {
        Logic lobj = new Logic();
        lobj.DisplayFactors(12);
    }
}