package Day_3;

public class Palindrome
{
    public static void main(String [] args)
    {
        String org_str = "Hello world";
        String rev_str = new StringBuilder(org_str).reverse().toString();

        if(org_str.equals(rev_str)) System.out.println("Strings : " + org_str + " and " + rev_str + " are palindrome");
        else System.out.println("Strings : " + org_str + " and " + rev_str + " are not palindrome");
    }
}

