import java.util.Scanner;

public class Duplicates {


        public static void main(String[] args){
            Scanner s =new Scanner(System.in);
            String str=s.nextLine(       );
            char[] str1=str.toCharArray();


            for(int i=0;i<str.length();i++){
                int count=0;
                for(int j=i+1;j<str.length();j++){
                    if (str.charAt(i) == str.charAt(j)&&str1[i]!=' ') {

                        count++;
                        str1[j]=' ';

                    }

                }
                if (count>=1){
                    str1[i]=str.charAt(i);
                    System.out.println(str1[i]);
                }



            }



        }
    }


