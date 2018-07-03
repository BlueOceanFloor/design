package AbstractFactoryPattern;

public class ShapeFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public Shape getShape(String shapeType) {
        if(shapeType == null){
            return null;
        }
        if("circle".equals(shapeType)){
            return new Circle();
        } else if("rectangle".equals(shapeType)){
            return new Rectangle();
        } else if("square".equals(shapeType)){
            return new Square();
        }
        return null;
    }
}
