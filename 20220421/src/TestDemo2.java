/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-04-21
 * Time: 14:42
 */
abstract class Shape{
    public abstract void draw();
}

class Cycle extends Shape{
    @Override
    public void draw() {
        System.out.println("○");
    }
}

class Rect extends Shape{
    @Override
    public void draw() {
        System.out.println("◇");
    }
}

class Triangle extends Shape{
    @Override
    public void draw() {
        System.out.println("△");
    }
}

public class TestDemo2 {
    public static void drawMap(Shape shape){
        shape.draw();
    }

    public static void main(String[] args) {
        drawMap(new Cycle());
        drawMap(new Rect());
        drawMap(new Triangle());
    }
}
