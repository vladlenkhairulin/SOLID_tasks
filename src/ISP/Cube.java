package ISP;

public class Cube implements TwoDimensional, ThreeDimensional{
    private int edge;
    public Cube(int edge) {
        this.edge = edge;
    }
    @Override
    public double area() {
        return 6 * edge * edge;
    }
    @Override
    public double volume() {
        return edge * edge * edge;
    }
}
