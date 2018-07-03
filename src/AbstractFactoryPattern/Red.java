package AbstractFactoryPattern;

public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("this is Red : fill()");
    }
}
