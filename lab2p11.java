import java.util.Scanner;
public class lab2p11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sn = new Scanner(System.in);
        System.out.print("Input your money : ");
        double n1 = sc.nextDouble();
        System.out.print("Input your account type(Please type A B C or X in uppercase) : ");
        String n2 = sn.nextLine();
        double n3 = 0.00;
        if ((n2.equals("A")) || (n2.equals("C"))) {
            n3 = n1+(n1*(1.5/100));
        }
        else if (n2.equals("B")) {
            n3 = n1+(n1*(2.0/100));
        }
        else if (n2.equals("X")) {
            n3 = n1+(n1*(5.0/100));
        }
        System.out.println("Your total money in one year = " + n3);
    }
}
