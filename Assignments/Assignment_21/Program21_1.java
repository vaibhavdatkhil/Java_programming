class Logic
{
    public void ProductOfDigits(int iNo)
    {
        int iDigit = 0;
        int iProduct = 1;

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            iProduct = iProduct * iDigit;
            iNo = iNo/10;
        }
        System.out.println(iProduct);
    }
}


class Program21_1
{
    public static void main(String[] args) 
    {
        Logic lobj = new Logic();
        lobj.ProductOfDigits(1234);
    }
}