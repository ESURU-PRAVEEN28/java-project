import java.util.Scanner;

public class CountVowelsConsonents {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String st=s.nextLine();
        int vcount=0,ccount=0;
        for (int i=0;i<st.length();i++){
            if (st.charAt(i)=='a'||st.charAt(i)=='e'||st.charAt(i)=='i'||st.charAt(i)=='o'||st.charAt(i)=='u'){
                vcount++;
            }
            else if (st.charAt(i)>='a'&&st.charAt(i)<='z') {
                ccount++;

            }
        }
        System.out.println(vcount +"\n"+ccount);

    }
}
