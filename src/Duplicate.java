import java.util.Scanner;

public class Duplicate {

    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for (int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        int visited=0;
        for (int i=0;i<n;i++){
            int count=0;
            for (int j=i+1;j<n;j++){
                if (a[i]==a[j]){
                    count++;
                    a[j]=visited;
                }
            }
            if (count>=1 && a[i]>0){
                System.out.println(a[i]);
            }
        }

    }
}
