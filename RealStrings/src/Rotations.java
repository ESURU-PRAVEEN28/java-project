import java.util.Scanner;

public class Rotations {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String str=s.nextLine();
        String str1=s.nextLine();
        str=str.concat(str);
        if(str.contains(str1)){
            System.out.println("it is rotation");

        }
        else{
            System.out.println("not a rotation");
        }
    }
}
