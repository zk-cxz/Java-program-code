package operation;

import book.BookList;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-04-13
 * Time: 23:23
 */
public class FindOperation implements IOperation {
    @Override
    public void work(BookList bookList){
        System.out.println("查找图书!");
    }
}
