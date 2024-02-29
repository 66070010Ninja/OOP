package Ex01;

// import
import java.util.*;

// ExceptionDemo
public class ExceptionDemo {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("4", "8");
        try {
            double a = Double.parseDouble(list.get(0));
            double b = Double.parseDouble(list.get(1));
            double c = Double.parseDouble(list.get(2));
            System.out.println("x1: " + (-b+Math.sqrt(Math.pow(b, 2) - 4*a*c))/(2*a));
            System.out.println("x2: " + (-b-Math.sqrt(Math.pow(b, 2) - 4*a*c))/(2*a));
        }
        catch (NumberFormatException e) {
            System.out.println("Please input data in number format only.");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Please enter 3 numbers as a, b, and c respectively.");
        }
    }
}
