/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-06-21
 * Time: 21:17
 */
public class MyArrayListEmptyException extends RuntimeException {
    public MyArrayListEmptyException(){

    }

    public MyArrayListEmptyException(String message){
        super(message);
    }
}
