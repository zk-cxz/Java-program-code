package user;

import book.BookList;
import operation.IOperation;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-04-13
 * Time: 20:23
 */
public abstract class User {
    protected String name;

    public User(String name) {
        this.name = name;
    }

    public abstract int menu();

    public IOperation[] iOperation;   //接口数组   这里不进行初始化

    public void doOperation(int choice, BookList bookList){
        iOperation[choice].work(bookList);
    }
}
