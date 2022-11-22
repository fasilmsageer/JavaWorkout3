import java.util.Scanner;

public class Substring
{
    public static void main(String a[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String stringValue = sc.nextLine();


        for(int i=0; i<stringValue.length(); i++)
        {
            String subStr = "";
            for(int j=i; j< stringValue.length(); j++) {
                subStr = subStr + stringValue.charAt(j);
                System.out.println(subStr + "\n");
            }
        }
    }
}