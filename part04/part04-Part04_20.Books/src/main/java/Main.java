import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        Scanner sc=new Scanner(System.in);
        ArrayList<Book> books=new ArrayList<>();
        
        String toBePrinted="";
        while(true){
            System.out.println("Title: ");
            String title=sc.nextLine();
            if(title.isEmpty()){
                System.out.println("What information will be printed?");
                toBePrinted=sc.nextLine();
                break;
            }
            System.out.println("Pages: ");
            int pages=Integer.valueOf(sc.nextLine());
            System.out.println("Publication year: ");
            int year=Integer.valueOf(sc.nextLine());
            
            books.add(new Book(title, pages, year));
        }
        
        for(Book b : books){
            if(toBePrinted.equals("name")){
                System.out.println(b.getName());
            }else{
                System.out.println(b);
            }
            
        }
    }
}
