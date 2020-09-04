package cylin;

public class Cylinder  extends Circle {
    double height;

    Cylinder(double ra, double he) {
        super(ra);
        height = he;

    }

    double getheight() {
        return height;

    }

    double getvolume() {
        return getarea() * height;

    }

    public static void main(String[] args) {
        Circle ci = new Circle(3.75);
        System.out.println(ci.getradius());
        System.out.println(ci.getarea());
        Cylinder cy = new Cylinder(5.55, 7.25);
        System.out.println(cy.getradius());
        System.out.println(cy.getheight());
        System.out.println(cy.getarea());
        System.out.println(cy.getvolume());


    }

}
