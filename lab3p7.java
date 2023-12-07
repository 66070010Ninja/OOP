import java.util.Scanner;
public class lab3p7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("กรุณาระบุความสูงตึก : ");
        int num = sc.nextInt();
        for (int i=0; i<num; i++) {
            System.out.println("#-#-#-#-#");
        }
    }
}
