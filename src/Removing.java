import java.util.Scanner;

public class Removing {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        int b[]=new int[n];
        for(int i=0;i<n;i++){
            int count=0;
            for (int j=i+1;j<n;j++){
                if (a[i]==a[j]){
                    a[j]=-11;

                }

            }
            if (a[i]>0){
                System.out.println(a[i]);
            }


        }
    }
}
