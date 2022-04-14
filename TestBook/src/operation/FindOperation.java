package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

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
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入书名:>");
        String bookName=scanner.nextLine();
        int num=bookList.getUsedSize();
        for (int i = 0; i < num; i++) {
            Book book=bookList.getPos(i);
            if(book.getName().equals(bookName)){
                System.out.println(book);
                return;
            }
        }
        System.out.println("暂无此书!");
    }
}
