import java.util.Scanner;

public class conversion {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        for (int i=0;i<str.length();i++){
            if (Character.isLowerCase(str.charAt(i))){
                System.out.print(Character.toUpperCase((str.charAt(i))));
            }
            else if (Character.isUpperCase(str.charAt(i))){
                System.out.print(Character.toLowerCase((str.charAt(i))));
            }
        }

    }
}
