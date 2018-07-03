package AbstractFactoryPattern;

public class ColorFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        if(color == null){
            return null;
        }
        if("red".equals(color)){
            return new Red();
        } else if("green".equals(color)){
            return new Green();
        } else if("blue".equals(color)){
            return new Blue();
        }
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
