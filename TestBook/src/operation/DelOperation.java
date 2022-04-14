package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-04-12
 * Time: 18:42
 */
public class DelOperation implements IOperation {
    @Override
    public void work(BookList bookList){
        int index=0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入书名:>");
        String bookName=scanner.nextLine();
        int num=bookList.getUsedSize();
        int i=0;
        for (i = 0; i < num; i++) {
            Book book=bookList.getPos(i);
            if(book.getName().equals(bookName)){
                index=i;
                break;
            }
        }
        if(i==num){
            System.out.println("查无此书!");
            return;
        }
        for (int j = index; j < num-1; j++) {
            Book book=bookList.getPos(j+1);
            bookList.setBooks(j,book);
        }
        bookList.setBooks(num-1,null);
        bookList.setUsedSize(num-1);
        System.out.println("删除图书成功!");
    }
}
