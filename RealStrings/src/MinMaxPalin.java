import java.util.Scanner;

public class MinMaxPalin {

    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        str.toLowerCase();
        String[] a=str.split(" ");
        String b=null,c=null;
        for(int i=0;i<a.length;i++){
            int flag=0;
            for(int j=0;j<a[i].length()/2;j++){
                if(a[i].charAt(j)!=a[i].charAt(a[i].length()-j-1)){
                    flag=1;
                    break;
                }
            }
            if(flag!=1){
                if (b==null){
                    b=a[i];
                }
                else if(b.length()<a[i].length()){
                    b=a[i];
                }
                if(c==null){
                    c=a[i];
                }
                else if(c.length()>a[i].length()){
                    c=a[i];
                }
            }
        }
        System.out.println("MaxPalin  "+b + "   minPalin  " +c);
    }
}
