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
public class AddOperation implements IOperation {
    @Override
    public void work(BookList bookList){
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入书名:>");
        String bookName=scanner.nextLine();
        System.out.println("请输入作者:>");
        String bookAuthor=scanner.nextLine();
        System.out.println("请输入类型:>");
        String bookType=scanner.nextLine();
        System.out.println("请输入价格:>");
        double bookPrice=scanner.nextDouble();
        Book book=new Book(bookName,bookAuthor,bookPrice,bookType);
        int num=bookList.getUsedSize();
        bookList.setBooks(num,book);
        bookList.setUsedSize(num+1);
        System.out.println("新增图书成功!");
    }
}
