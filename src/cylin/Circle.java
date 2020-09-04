package cylin;

public class Circle {
    double radius;
    Circle(double ra){
        radius=ra;
    }
    double getradius() {
        return radius;

    }
    double getarea() {
        final double r=3.14;
        return radius*radius*r;
    }
}
