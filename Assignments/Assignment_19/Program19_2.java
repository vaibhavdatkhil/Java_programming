class Logic
{
    public void DisplayGrade(int iMarks)
    {
        if (iMarks < 0 || iMarks > 100)
        {
            System.out.println("Invalid marks entered: " + iMarks);
        }

        if(iMarks >= 90)
        {
            System.out.println("Grade is 'A' for "+iMarks);
        }
        else if(iMarks >=80 )
        {
            System.out.println("Grade is 'B' for "+iMarks);
        }
        else if(iMarks >=70 )
        {
            System.out.println("Grade is 'C' for "+iMarks);
        }
        else if(iMarks >=60 )
        {
            System.out.println("Grade is 'D' for "+iMarks);
        }
        else if(iMarks >=50)
        {
            System.out.println("Grade is 'E' for "+iMarks);
        }
        else
        {
            System.out.println("Fail");
        }
    }
}


class Program19_2
{
    public static void main(String[] args) 
    {
        Logic lobj = new Logic();
        lobj.DisplayGrade(82);
    }
}