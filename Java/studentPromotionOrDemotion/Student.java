package imam.Afraz;

public class Student {

    private static int id;
    private String name;
    private float gpa;

    public Student(String name, float gpa) {
        if (this.gpaValidator(this.gpa) && this.promotionOrDemotion(gpa)) {
            this.id += 1;
            this.name = name;
            this.gpa = gpa;
            System.out.println("\nThe student is promoted to the next session!");
        }
        else {
            System.out.println("\nThe student is demoted as he failed.\n");
        }
    }
    public void showInfo(){

        System.out.println("|-----Student-Info------|\n");
        System.out.println("Student's name: " + this.name);
        System.out.println("Student's GPA: " + this.gpa);
        System.out.println("\n|-----------------------|");
    }
    public boolean gpaValidator(float gpa) {
        return (gpa >= 0.0 && gpa <= 5.0) ? true : false;
    }
    public boolean promotionOrDemotion(float gpa) {
        return (gpa > 3.5) ? true : false;
    }
}
