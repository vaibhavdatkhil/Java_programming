class Logic
{
    public void FindMin(int iNo1,int iNo2)
    {
        if(iNo1 > iNo2)
        {
            System.out.println("the NUmber is max number:"+iNo1);
        }
        else
        {
            System.out.println("the NUmber is max number:"+iNo2);
        }
    }
}


class program17_3
{
    public static void main(String[] args) 
    {
        Logic lobj = new Logic();
        lobj.FindMin(3,7);
    }
}