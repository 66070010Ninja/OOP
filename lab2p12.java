import java.util.Scanner;
public class lab2p12 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        System.out.print("Please insert your name : ");
        String name = sc2.nextLine();
        System.out.print("Please insert your age : ");
        int age = sc1.nextInt();
        System.out.print("Please insert number of working days : ");
        int numDay1 = sc1.nextInt();
        System.out.print("Please insert number of absent days : ");
        int numDay2 = sc1.nextInt();
        System.out.print("Please insert your body weight : ");
        double weight = sc1.nextDouble();
        double salary = 0;
        if ((21 <= age)&&(age <= 30)) {
            salary = (numDay1*300)-(numDay2*50);
        } else if ((31 <= age)&&(age <= 40)) {
            salary = (numDay1*500)-(numDay2*50);
        } else if ((41 <= age)&&(age <= 50)) {
            salary = (numDay1*1000)-(numDay2*25);
        } else if ((51 <= age)&&(age <= 60)) {
            salary = (numDay1*3000);
        }
        
        System.out.println("Hi, " + name);
        int cost = (int)salary;
        System.out.println("Your salary is " + cost);
        if ((10 <= weight)&&(weight <= 60)) {
            salary = salary + 5000;
        } else if ((61 <= weight)&&(weight <= 90)) {
            salary = salary + (5000-((weight-60)*10));
        }
        int bonus = (int)salary;
        System.out.println("Your salary and bonus is " + bonus);
    }
}
