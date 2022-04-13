package user;

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
}
