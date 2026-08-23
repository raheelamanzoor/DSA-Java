package Basics;
import java.util.*;
public class Input{
    public static void main(String[] args){

        /*Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for( int i = 0; i<=n; i++)
        {
            System.out.println(i);
        }*/

        /*  Scanner scn = new Scanner(System.in);
        String name = scn.nextLine();
        
        {
            System.out.println("hello " + name);
        } */
       
            Scanner scn = new Scanner(System.in);
            int n = Integer.parseInt(scn.nextLine());
            String name = scn.nextLine();
            System.out.println("Dear " + name + ". Here is counting:");
            for(int i=0; i<=n; i++ )
            {
                System.out.println(i);
            }
    }
}