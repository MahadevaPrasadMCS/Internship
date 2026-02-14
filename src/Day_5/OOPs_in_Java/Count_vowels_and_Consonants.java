package Day_5.OOPs_in_Java;

class Count
{
    public int vowel_counter(String str)
    {
        int count = 0;
        for(int i=0; i<str.length();i++)
        {
            char ch = Character.toLowerCase(str.charAt(i));
              if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
              {
                  count++;
              }
        }
        return count;
    }
    public int consonant_counter(String str)
    {
        int count = 0;
        for(int i=0; i<str.length();i++)
        {
            char ch = Character.toLowerCase(str.charAt(i));
            if(Character.isLetter(ch))
            {
                if(ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u')
                {
                    count++;
                }
            }
        }
        return count;
    }
}

public class Count_vowels_and_Consonants
{
    public static void main(String [] args)
    {
        String str = "Hello world";

        Count vowel = new Count();

        int vowels = vowel.vowel_counter(str);
        int consonants = vowel.consonant_counter(str);

        System.out.println("You have "+vowels+" number of vowels in your string "+str);
        System.out.println("You have "+consonants+" number of consonants in your string "+str);
    }
}
