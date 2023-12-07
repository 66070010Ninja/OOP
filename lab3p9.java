import java.util.Scanner;
public class lab3p9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int odd = 0;
        int even = 0;
        while (true) {
            int num = sc.nextInt();
            if (num == -1) {
                break;
            }
            if (num%2 == 0) {
                even++;
            }
            else {
                odd++;
            }
        }
        System.out.println("Odd number = "+ odd +" and Even number = " + even);
    }
}
