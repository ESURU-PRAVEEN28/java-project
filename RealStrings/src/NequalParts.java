import java.util.Scanner;

public class NequalParts {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String st = s.nextLine();
        System.out.println("enter the length");
        int n=s.nextInt();
        int len=st.length()/n;
        if (st.length()%n!=0){
            System.out.println("this is an equal parts:");
        }
        else{
            for(int i=0;i<st.length();i++){
                System.out.println(st.substring(i,i+len));
                i=i+len-1;

            }
        }

        int count = 0;


    }

}
