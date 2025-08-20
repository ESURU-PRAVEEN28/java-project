public class Pattern2 {
    public static void main(String[] args){
        int n=4;
        int k=2*n-1;
        for (int i=0;i<k;i++){
            for(int j=0;j<k;j++){
                if (i==j || j==(k-1-i)){
                    if (i < n) {


                        System.out.print(i + 1);
                    }
                    else{
                        System.out.print(k-i);
                    }
                }
                else{
                    System.out.print(" ");
                }
            }

            System.out.print("\n");
        }
    }
}
