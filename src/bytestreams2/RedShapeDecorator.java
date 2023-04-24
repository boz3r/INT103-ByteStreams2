package bytestreams2;

/**
 *
 * @author dol
 */
public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape shape) {
        super(shape);
    }
    
    @Override
    public void draw() {
        shape.draw();
        System.out.println("Border: Red");
    }
}
