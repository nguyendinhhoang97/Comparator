import java.util.Arrays;

public class CircleComparatorTest {
    public static void main(String[] args){
        CircleComparator[] list = new CircleComparator[3];
        list[0] = new CircleComparator(4);
        list[1] = new CircleComparator();
        list[2] = new CircleComparator(3);

        for(int i = 0; i <  list.length-1; i++){
            if(list[i].compare(list[i], list[i+1])==2){
                CircleComparator temp = list[i];
                list[i] = list[i+1];
                list[i+1] = temp;
            }

        }

        for(CircleComparator i : list){
            System.out.println(i.getRadius());
        }

        double[] circles = new double[3];
        circles[0] = new CircleComparator(0).getRadius();
        circles[1] = new CircleComparator(4).getRadius();
        circles[2] = new CircleComparator(3).getRadius();

        Arrays.sort(circles);

        for(double comparableCircle : circles){
            System.out.println(comparableCircle);
        }
    }
}