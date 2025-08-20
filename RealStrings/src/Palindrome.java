import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        Scanner s =new Scanner(System.in);
        String str= s.nextLine();
        int k=0;
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(str.length()-i-1)){
                System.out.println(str.charAt(i));
                k=1;
                break;
            }
        }if(k==0) {
            System.out.println("this is palindrome");
        }
    else{

        System.out.println("this is not a palindrome");
    }
    }
}