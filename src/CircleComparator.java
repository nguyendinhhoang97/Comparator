public class CircleComparator extends Circle implements Comparator<CircleComparator>{

    public CircleComparator() {
    }

    public CircleComparator(double radius) {
        super(radius);
    }

    public CircleComparator(double radius, String color, boolean filled) {
        super(radius, color, filled);
    }

    @Override
    public int compare(CircleComparator t1, CircleComparator t2) {
        if(t1.getRadius() > t2.getRadius()){
            return 2;
        }

        return 1;
    }
}