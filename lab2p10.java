import java.util.*;
public class lab2p10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double cost = sc.nextDouble();
        if (cost <= 50000) {
            System.out.print(cost*(0.2));
        }
        else {
            System.out.print(cost*(0.1));
        }
    }
}
