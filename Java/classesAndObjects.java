import java.util.*;

//Class
class BookList {

    //setting private variables
    private String bookName, authorName, ISBN;
    private int yearOfRelease, price;
    
    //setting public methods in class (Encapsulation) to get access to the private variables

    //Get methods for string variables
    public String getBookInfo_Name() {
        return bookName;
    } public String getBookInfo_authorName() {
        return authorName;
    } public String getBookInfo_ISBN() {
        return ISBN;
    }
    
    //Get methods for integer variables
    public int getBookInfo_yearOfRelease() {
        return yearOfRelease;
    } public int getBookInfo_price() {
        return price;
    }
    
    //Set methods for string variables
    public void setBookInfo_Name(String BookName) {
        bookName = BookName;
    } public void setBookInfo_authorName(String AuthorName) {
        authorName = AuthorName;
    } public void setBookInfo_ISBN(String isbn) {
        ISBN = isbn;
    }

    //Set methods for integer variables
    public void setBookInfo_yearOfRelease(int year_release) {
        yearOfRelease = year_release;
    } public void setBookInfo_price(int Price) {
        price = Price;
    }
}

public class classesAndObjects {
    //method to clear the console
    public static void clearConsole() {   
        System.out.print("\033[H\033[2J");   
        System.out.flush();   
       } 
    //main method
    public static void main(String[] args) {
        clearConsole();

        Scanner s1 = new Scanner(System.in);
        Scanner s2 = new Scanner(System.in);
        Scanner s3 = new Scanner(System.in);
        Scanner s4 = new Scanner(System.in);
        Scanner s5 = new Scanner(System.in);
        Scanner co = new Scanner(System.in);
        BookList objects = new BookList();

        //setting loop for continuation
        while (true) {

            //setting text values of the string variables
            System.out.print("\n\nEnter the book Name: ");
            String book_name = s1.nextLine();
            System.out.print("Enter the book's author name: ");
            String author_name = s2.nextLine();
            System.out.print("Enter the book's ISBN number: ");
            String isbn_num = s3.nextLine();

            //setting number values for the integer variables
            System.out.print("Enter the book's year of release: ");
            int yearOf_release = s4.nextInt();
            System.out.print("Enter the book's price: ");
            int PRICE = s5.nextInt();

            objects.setBookInfo_Name(book_name);
            objects.setBookInfo_authorName(author_name);
            objects.setBookInfo_ISBN(isbn_num);

            objects.setBookInfo_yearOfRelease(yearOf_release);
            objects.setBookInfo_price(PRICE);

            System.out.println("\nAdded your Wished book to cart.\n");

            //Displaying the variable
            System.out.println("Book name: " + objects.getBookInfo_Name());
            System.out.println("Author: " + objects.getBookInfo_authorName());
            System.out.println("ISBN Number: " + objects.getBookInfo_ISBN());
            System.out.println("Year of release: " + objects.getBookInfo_yearOfRelease());
            System.out.println("Price: " + objects.getBookInfo_price() + " BDT");

            System.out.print("\nDo you want to re-do the process? y/n: ");
            char cont = co.next().charAt(0);
            
            switch (cont) {
                case 'y':
                    clearConsole();

                case 'n':
                    break;

                default:
                    System.out.println(".....Invalid input!.....");
                    s1.close();
                    s2.close();
                    s3.close();
                    s4.close();
                    s5.close();
                    co.close();
            }
        }
    }
}
