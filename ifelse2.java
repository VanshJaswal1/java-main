public class ifelse2
{
    public static void main(String[] args)
    {
        int age = 20;
        boolean idCard = true;

        if(age >= 18)
        {
            if(idCard)
            {
                System.out.println("Entry allowed");
            }
            else
            {
                System.out.println("Need ID card");
            }
        }
        else
        {
            System.out.println("Too young");
        }
    }
}