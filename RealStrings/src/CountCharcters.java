import java.util.Scanner;

public class CountCharcters
{

    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String st=s.nextLine();
        int count=0;
        for (int i=0;i<st.length();i++){
            if (st.charAt(i)!=' '){
                count++;
            }
        }
        System.out.println(count);

    }
}

