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

    // 通过反射 来规避每增加一个产品就需要增加一次实现的缺点

    public static Object getClass (Class<?extends Shape> clazz){

        if(null == clazz){
            return null;
        }

        Object object = null;
        try {
            object = Class.forName(clazz.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return object;
    }
}
