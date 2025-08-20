import java.util.Arrays;
import java.util.Scanner;

public class anagram {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        String b = s.nextLine();
        int count = 0;
        if(a.length()!=b.length()){
            System.out.println("this is not an annagram");
        }
        else{
            a.toLowerCase();
            b.toLowerCase();
            char[] str1 =a.toCharArray();
            char[] str2=b.toCharArray();
            Arrays.sort(str1);
            Arrays.sort(str2);
            if (Arrays.equals(str1,str2)){
                System.out.println("this is anagram");
            }
            else{
                System.out.println("this is not  anagram");
            }
        }
    }
}
