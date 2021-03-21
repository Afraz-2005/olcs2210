package Test.test;

public class Main {
    public static void main(String[] args) {
        FileUploader obj1 = new FileUploader("hehe", "txt", 5);
        obj1.ShowInfo();

        FileUploader obj2 = new FileUploader("wakanda", "jpg", 3.5f);
        obj2.ShowInfo();

        FileUploader obj3 = new FileUploader("hehe", "txt", 2.9f);
        obj3.ShowInfo();

        FileUploader obj4 = new FileUploader("hehe", "txt", 6);
        obj4.ShowInfo();

        FileUploader obj5 = new FileUploader("hehe", "txt", 0);
        obj5.ShowInfo();

    }
}
