import java.util.Arrays;
import java.util.Comparator;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-04-14
 * Time: 23:49
 */
class Book implements Comparable<Book>{
    public String name;
    public double price;

    public Book(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Book o) {
        return (int)(this.price-o.price);
    }
}

/*class PriceComparator implements Comparator<Book>{

    @Override
    public int compare(Book o1, Book o2) {
        return (int) (o1.price- o2.price);
    }
}*/

public class TestDemo {
    public static void main(String[] args) {
        Book book[]=new Book[2];
        book[0]=new Book("三国",99.0);
        book[1]=new Book("Java",30.99);
        Arrays.sort(book);
        System.out.println(Arrays.toString(book));
    }
}
