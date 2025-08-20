public class Pattern5 {
    public static void main(String[] args){
        int n=10;
        for (int i=0;i<n;i++){
            for(int j=0;j<2*i+1;j++){
                if(j==i){
                    System.out.print("0");
                }
                else {
                    if(j>i) {
                        System.out.print(n-(j-i));
                    }
                    else{
                        System.out.print((n-i+j));
                    }
                }
            }
            System.out.println();
        }
    }
}
