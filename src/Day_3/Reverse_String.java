package Day_3;

public class Reverse_String
{
    public static void main(String[] args)
    {
        String org_str = "This is original String";

        StringBuilder rev_str = new StringBuilder("");

        for(int i = org_str.length()-1; i>-1; i--)
        {
            rev_str.append(org_str.charAt(i));
        }

        System.out.println("Reversing string using String methods \n");
        System.out.println("Your string : " + org_str + " and reversed string : " + rev_str);

        System.out.println("Reversing string using builtin reverse method in StringBuilder methods \n");

        StringBuilder rev_strm = new StringBuilder(org_str).reverse();

        System.out.println("Your string : " + org_str + " and reversed string : " + rev_strm);
    }
}
