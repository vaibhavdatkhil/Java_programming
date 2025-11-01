class Logic 
{
    public void CheckPrime(int iNo) 
    {
        boolean isPrime = true;

        if (iNo <= 1) 
        {
            isPrime = false;
        }
        else 
        {
            for (int iCnt = 2; iCnt <= iNo / 2; iCnt++)
            {
                if (iNo % iCnt == 0) 
                {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) 
        {
            System.out.println("It is a prime number: " + iNo);
        } 
        else
        {
            System.out.println("It is not a prime number: " + iNo);
        }
    }
}

public class Program18_1 {
    public static void main(String[] args) {
        Logic lobj = new Logic();
        lobj.CheckPrime(11);
    }
}
