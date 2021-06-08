package JavaCodes;

public class StringRotation
{
    public static void main(String args[])
    {
        String str1= "abcde";
        String str2= "cdeab";
        if(str1.length() != str2.length())
        {
            System.out.println("Both strings are different");
        }
        else{
            str1 = str1.concat(str1);
            if(str1.indexOf(str2)!= -1)
            {
                System.out.println("String 2 is rotation of string 1");
            }
            else
            {
                System.out.println("Both strings are different");
            }
        }

    }
}
