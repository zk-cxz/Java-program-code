package operation;

import book.Book;
import book.BookList;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-04-13
 * Time: 23:21
 */
public class DisplayOperation implements IOperation {
    @Override
    public void work(BookList bookList){
        int num=bookList.getUsedSize();
        for (int i = 0; i < num; i++) {
            Book book=bookList.getPos(i);
            System.out.println(book);
        }
    }
}
