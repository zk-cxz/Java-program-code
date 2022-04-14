package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

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
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入书名:>");
        String bookName=scanner.nextLine();
        int num=bookList.getUsedSize();
        for (int i = 0; i < num; i++) {
            Book book=bookList.getPos(i);
            if(book.getName().equals(bookName)){
                if(book.isBorrowed()==false) {
                    book.setBorrowed(true);
                    System.out.println("借阅图书成功!");
                }else{
                    System.out.println("此书已被借阅!");
                }
                return;
            }
        }
        System.out.println("暂无此书!");
    }
}
