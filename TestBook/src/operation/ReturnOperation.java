package operation;

import book.BookList;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-04-13
 * Time: 23:24
 */
public class ReturnOperation implements IOperation {
    @Override
    public void work(BookList bookList){
        System.out.println("归还图书!");
    }
}
