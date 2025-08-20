public class Pattern3 {

        public static void main(String[] args){
            int n=4;
            int k=2*n;
            for (int i=1;i<=n;i++){
                for (int j=1;j<=k;j++){
                    if (j > n - (i - 1) && j <= n + (i - 1)) {
                        System.out.print("*");
                    } else {
                        if (j <= n) {
                            System.out.print(j);
                        } else {
                            System.out.print(k + 1 - j);
                        }
                    }

                }
                System.out.println();

            }
        }
    }


