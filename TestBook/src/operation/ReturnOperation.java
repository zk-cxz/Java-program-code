package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

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
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入书名:>");
        String bookName=scanner.nextLine();
        int num=bookList.getUsedSize();
        for (int i = 0; i < num; i++) {
            Book book = bookList.getPos(i);
            if (book.getName().equals(bookName)) {
                book.setBorrowed(false);
                System.out.println("归还图书成功!");
                return;
            }
        }
        System.out.println("此书不属于此图书馆书籍!");
    }
}
