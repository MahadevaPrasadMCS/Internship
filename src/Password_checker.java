/*
1. Password length should be at-least  6 characters.
2.
*/

import java.util.Scanner;

class string_manipulation{
    public static void main(String [] args)
    {
        String password, password_without_whitespace;
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter your desired password : ");
        password = scr.nextLine();
        if(password.isEmpty())
        {
          System.out.println("You have not entered the password");
          return;
        }
        char ch = password.charAt(0);
        if(password.length() >= 6)
        {
            if (!Character.isLetter(ch))
            {
                System.out.println("The first letter of the password should be a character!");
                return;
            }
            if(!Character.isUpperCase(ch))
            {
                System.out.println("The first letter of the password should be in Uppercase. ex : 'P'rasad");
                return;
            }
            if(password.equals("Admin"))
            {
                System.out.println("Password should not be Admin");
                return;
            }
            password_without_whitespace = password.replaceAll("\\s","");
            System.out.println("Your password set successfully as "+ password_without_whitespace);
            scr.close();
            return;
        }
        System.out.println("Password must have atleast 6 characters");
    }
}

