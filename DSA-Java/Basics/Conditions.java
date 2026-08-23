package Basics;
public class Conditions{
    public static void main (String[] args){
        int n1 = 10;
        int n2 = 10;
        if (n1 == n2)
        {
            System.out.println(n1 + " is equal to " + n2);
        }
        else
        {
            if (n1 > n2 )
            {
                System.out.println(n1 + " is greater than " + n2);
            }
            else
            {
                System.out.println(n1 + " is less than " + n2);
            }
        }
    }
}