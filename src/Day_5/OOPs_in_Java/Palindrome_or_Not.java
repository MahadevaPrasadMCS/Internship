package Day_5.OOPs_in_Java;

class Palindrome
{
    public boolean palindromeChecker(String str1, String str2)
    {
        return str1.equals(str2);
    }
}

public class Palindrome_or_Not
{
    public static void main(String [] args)
    {
        String org_str = "Hello";
        Palindrome pal = new Palindrome();
        String rev_str = new StringBuilder(org_str).reverse().toString();
        boolean result = pal.palindromeChecker(org_str, rev_str);

        if(result)
        {
            System.out.println("The string " + org_str + " and reverse string "+rev_str+" are palindromes");
        }
        else
        {
            System.out.println("The string " + org_str + " and reverse string "+rev_str+" are not palindromes");
        }
    }
}
