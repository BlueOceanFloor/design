package FactoryPatter;

public class ShapeFactory {

    //使用 getShape 方法获取形状类型的对象
    public Shape getShape(String shapeType){
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
