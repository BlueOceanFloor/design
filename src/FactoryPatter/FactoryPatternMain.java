package FactoryPatter;

import org.w3c.dom.css.Rect;

public class FactoryPatternMain {

    public static void main(String[] args) {

        // 工厂模式

        // 通过单一实现
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape1 = shapeFactory.getShape("circle");
        shape1.draw();

        Shape shape2 = shapeFactory.getShape("rectangle");
        shape2.draw();

        Shape shape3 = shapeFactory.getShape("square");
        shape3.draw();

        // 通过反射实现
        Circle circle = (Circle) ShapeFactory.getClass(Circle.class);
        circle.draw();

        Rectangle rectangle = (Rectangle) ShapeFactory.getClass(Rectangle.class);
        rectangle.draw();

        Square square = (Square) ShapeFactory.getClass(Square.class);
        square.draw();

    }

}
