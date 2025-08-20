import java.util.Scanner;

public class FindLength {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String st = s.nextLine();
        int count = 0;
        int i = 0;

        try {
            while (true) {
                st.charAt(i); // will throw exception when index is invalid
                count++;
                i++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Length of string: " + count);
        }
    }
}
