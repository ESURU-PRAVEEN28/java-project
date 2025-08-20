import java.util.Scanner;

public class LargestSmallest {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        String[] a=str.split(" ");
        int[] b=new int[a.length];
        for (int i=0;i< a.length;i++){
            b[i]=a[i].length();
        }
        int ind=b[0],max=0,min=0,val=b[0];
        for(int i=0;i<b.length;i++){
            if (b[i]<ind){
                ind=b[i];
                min=i;
            }
            if(b[i]>val){
                val=b[i];
                max=i;
            }
        }
        System.out.println(a[min] +"\n"+a[max]);

    }
}
