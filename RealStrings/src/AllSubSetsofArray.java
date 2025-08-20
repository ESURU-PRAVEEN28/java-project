import java.util.Scanner;

public class AllSubSetsofArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String st = s.nextLine();
        for(int i=0;i<=st.length();i++){
            for(int j=i+1;j<=st.length();j++){
                System.out.println(st.substring(i,j));
            }
        }
    }
}
