import java.util.Scanner;

public class Leftshift {

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        int b[]=new int[n];
        System.out.println("enter the element for left rotation:");
        int k=s.nextInt();
        for (int i=0;i<n;i++) {
           a[i]=s.nextInt();
        }
        for (int i=0;i<n;i++){
            int j=(i+n-k)%n;
            b[j]=a[i];

        }
        for (int i=0;i<n;i++) {
            System.out.println(b[i]);
        }


    }
}
