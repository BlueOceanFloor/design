package AbstractFactoryPattern;

public class AbstractFactoryPatternMain {

    public static void main(String[] args) {
        AbstractFactory abstractFactoryShape = FactoryProducer.getFactory("shape");

        Shape shape1 = abstractFactoryShape.getShape("square");
        shape1.draw();
        Shape shape2 = abstractFactoryShape.getShape("circle");
        shape2.draw();
        Shape shape3 = abstractFactoryShape.getShape("rectangle");
        shape3.draw();

        AbstractFactory abstractFactoryColor = FactoryProducer.getFactory("color");
        Color color1 = abstractFactoryColor.getColor("red");
        color1.fill();
        Color color2 = abstractFactoryColor.getColor("blue");
        color2.fill();
        Color color3 = abstractFactoryColor.getColor("green");
        color3.fill();
    }
}
