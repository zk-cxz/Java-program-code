package operation;

import book.BookList;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-04-12
 * Time: 18:41
 */
public class BorrowOperation implements IOperation {
    @Override
    public void work(BookList bookList){
        System.out.println("借阅图书!");
    }
}
