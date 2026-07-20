//add
public class Sum{
    public static void main(String[] args){
        int x = 15;
        int y = 10;
        int sum = x+y;

        System.out.println("sum of " + x + " and " + y + " is " + sum);

    //multiply
    int prd = x*y;
    System.out.println("Product of " + x + " and " + y + " is " + prd);

    //div
    int v1 = x/y;
    System.out.println(v1);
    
    int v2 = y/x;
    System.out.println(v2);

    int v3 = x%y;
    System.out.println(v3);

    //exp
    int exp = (x*y)/(x+y);
    System.out.println(exp);

    }
}