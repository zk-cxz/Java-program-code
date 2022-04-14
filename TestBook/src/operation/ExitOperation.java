package operation;

import book.Book;
import book.BookList;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-04-13
 * Time: 23:22
 */
public class ExitOperation implements IOperation {
    //销毁或者使用数据后退出
    @Override
    public void work(BookList bookList){
        System.out.println("退出系统!");
        int num=bookList.getUsedSize();
        for (int i = 0; i < num; i++) {
            bookList.setBooks(i,null);
        }
        System.exit(0);
    }
}
