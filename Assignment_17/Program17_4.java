class Logic
{
    public void FindMin(int iNo1,int iNo2,int iNo3)
    {
        if(iNo1 < iNo2 && iNo1 < iNo3)
        {
            System.out.println("the NUmber is min number:"+iNo1);
        }
        else if(iNo2 < iNo1 && iNo2 < iNo3)
        {
            System.out.println("the NUmber is min number:"+iNo2);
        }
        else
        {
            System.out.println("the NUmber is min number:"+iNo3);
        }
    }
}


class program17_3
{
    public static void main(String[] args) 
    {
        Logic lobj = new Logic();
        lobj.FindMin(3,7,8);
    }
}