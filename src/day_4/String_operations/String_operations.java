package day_4.String_operations;

public class String_operations
{
    private final String str1;
    public String_operations(String str1)
    {
        this.str1 = str1;
    }
    public int lengthFind(){
        int count = 0;
        char [] length = str1.toCharArray();
        for(int i=0; i<length.length; i++) count++;
        return count;
    }
    public int lengthFind(String str1){
        int count = 0;
        char [] length = str1.toCharArray();
        for(int i=0; i<length.length; i++) count++;
        return count;
    }
    public String reverser()
    {
        char [] str_arr = str1.toCharArray();
        char [] rev_arr = new char[str_arr.length];
        for(int i=0; i<str_arr.length; i++)
        {
            rev_arr[i] = str_arr[str_arr.length-1-i];
        }
        return new String(rev_arr);
    }

    public boolean equalManual(String str2)
    {
        if(lengthFind(str1) != lengthFind(str2))
        {
            return false;
        }

        char [] str_1 = str1.toCharArray();
        char [] str_2 = str2.toCharArray();

        for(int i=0; i<str_1.length; i++)
        {
            if(str_1[i] != str_2[i])
            {
                return false;
            }
        }
        return true;
    }
    public boolean equalManual(String str1, String str2)
    {
        if(lengthFind(str1) != lengthFind(str2))
        {
            return false;
        }

        char [] str_1 = str1.toCharArray();
        char [] str_2 = str2.toCharArray();

        for(int i=0; i<str_1.length; i++)
        {
            if(str_1[i] != str_2[i])
            {
                return false;
            }
        }
        return true;
    }
    public int compareToManual(String str2)
    {
        int count = 0;
        if(equalManual(str1, str2)) return 0;
        else if(lengthFind(str1) < lengthFind(str2))
        {
            for(int i=0; i<str1.length(); i++)
            {
                if(str1.charAt(i) != str2.charAt(i)) count--;
            }
            return count;
        }
        else
        {
            for(int i=0; i<str2.length(); i++)
            {
                if(str1.charAt(i) != str2.charAt(i)) count++;
            }
            return count;
        }
    }
}