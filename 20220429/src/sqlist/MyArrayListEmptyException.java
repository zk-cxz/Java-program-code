package sqlist;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-04-29
 * Time: 23:24
 */
public class MyArrayListEmptyException extends RuntimeException{
    public MyArrayListEmptyException() {

    }

    public MyArrayListEmptyException(String message) {
        super(message);
    }
}
