package bytestreams2;

/**
 *
 * @author dol
 */
public abstract class ShapeDecorator implements Shape {

    protected Shape shape;

    public ShapeDecorator(Shape shape) {
        this.shape = shape;

    }

    @Override
    public void draw() {

    }
}
