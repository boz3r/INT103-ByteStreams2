package bytestreams2;

/**
 *
 * @author dol
 */
public class lab1 {
    public static void main(String[] args) {
        Circle c = new Circle();
        Rectangle r = new Rectangle();

        RedShapeDecorator redc = new RedShapeDecorator(c);
        RedShapeDecorator redr = new RedShapeDecorator(r);

        redc.draw();
        redr.draw();
    }
}
