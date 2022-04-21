package test1;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: a
 * Date: 2022-04-21
 * Time: 16:15
 */
interface IShape{
    public abstract void draw();
}

class Cycle implements IShape {
    @Override
    public void draw() {
        System.out.println("○");
    }
}

class Rect implements IShape {
    @Override
    public void draw() {
        System.out.println("◇");
    }
}

class Triangle implements IShape {
    @Override
    public void draw() {
        System.out.println("△");
    }
}

public class TestDemo2 {
    public static void drawMap(IShape shape){
        shape.draw();
    }

    public static void main(String[] args) {
        drawMap(new Cycle());
        drawMap(new Rect());
        drawMap(new Triangle());
    }
}
