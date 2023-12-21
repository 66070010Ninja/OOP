public class Student {
    public String name;
    public double mScore;
    public double fScore;

    public void showGrade() {
        double num = (mScore*0.4)+(fScore*0.4)+20;
        String text = "";
        if (num >= 80) {
            text = "A";
        }
        else if ((num >= 70)&&(num < 80)) {
            text = "B";
        }
        else if ((num >= 60)&&(num < 70)) {
            text = "C";
        }
        else if ((num >= 50)&&(num < 60)) {
            text = "D";
        }
        else if ((num < 50)) {
            text = "F";
        }
        System.out.println("Your grade is "+text+".");
    }
}
