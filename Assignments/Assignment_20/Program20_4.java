class Logic
{
    public void LargestDigit(int iNo)
    {
        int iDigit = 0;
        int iMax = 0;

        while(iNo != 0)
        {
            iDigit = iNo % 10;       
            if(iDigit > iMax) 
            {      
                iMax = iDigit;
            }
            iNo = iNo / 10;          
        }

        System.out.println("Largest digit is : " + iMax);
        }
    }
    


public class Program20_4 
{
    Logic lobj = new Logic();
    lobj.FindLargestDigit(83429);
}
