import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;

public class Main {
    //INPUT
//    noofBooks, noofLibraries, noofDays
//    0-bookScore
//    0-NoofBooks, signupDays, scannableBooks
//    0-bookIds

    //OUTPUT
//    Nooflibraries
//    0-libI, no.books
//    0-book id
    public static int numOfBooks = 0;
    public static int numOfLib = 0;
    public static int numOfDays = 0;

    public static int bookScore = 0;
    public static int bookId = 0;
    public static int libId = 0;

    public static void main(String[] args) {
        read_file("a_example.txt");
        new Book(bookId, bookScore);
        new Library(numOfDays, numOfBooks, libId);
        
    }
    
    public static void read_file(String fileName){
        try{
            BufferedReader br =  new BufferedReader(new FileReader(fileName));
            String[] chars = br.readLine().split(" ");
            numOfBooks = Integer.parseInt(chars[0]);
            numOfLib = Integer.parseInt(chars[1]);
            numOfDays = Integer.parseInt(chars[2]);
            
            String[] = 
                    
                    
        }
        catch(FileNotFoundException ex){
            System.out.println("File not found!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
