import java.util.ArrayList;
import java.util.Comparator;

public class Library {

    public ArrayList<Book> books = new ArrayList<>();
    public int time;
    public int numberOfBooks;
    public int id;

    public Library(int time, int numberOfBooks, int id) {
        this.time = time;
        this.numberOfBooks = numberOfBooks;
        this.id = id;
    }

    public void sortBooks(){
        

        books.sort(new Comparator<Book>(){
            @Override
            public int compare(Book x, Book y){
                return y.score - x.score;

            }
        });
    }
}
