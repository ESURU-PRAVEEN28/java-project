import java.util.Arrays;
import java.util.Scanner;

public class MinMax {
    public static void main(String[] args){
        Scanner s =new Scanner(System.in);
        String str=s.nextLine(       );
        char[] str1=str.toCharArray();

        int[] arr=new int[str.length()];

        for(int i=0;i<str.length();i++){
            int count=0;
            for(int j=0;j<str.length();j++){
                if (str.charAt(i) == str.charAt(j)) {

                    count++;

                }

            }
            arr[i]=count;


        }
        int index=arr[0],min=0,max=0,val=arr[0];
        for(int i=0;i<str.length();i++){

            if(arr[i]<index &&str.charAt(i)!=' '){
                min=i;
                index=arr[i];
            }
            else if(arr[i]>val&&str.charAt(i)!=' '){
                max=i;
                val=arr[i];
            }

        }
        System.out.println("\n"+str.charAt(min));
        System.out.println(str.charAt(max));
    }
}
