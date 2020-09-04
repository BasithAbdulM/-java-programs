package Set2;

public class ComplexNumber {
    double real,imaginary;
    ComplexNumber(double r,double i) {
        this.real=r;
        this.imaginary=i;

    }
    double getreal() {
        return this.real;
    }
    double getimaginary() {
        return this.imaginary;
    }
    public void add(double r1, double i1) {
        this.real+=r1;
        this.imaginary+=i1;
    }
    public void add(ComplexNumber comp) {
        this.real+=comp.real;
        this.imaginary+=comp.imaginary;

    }
    public void subract(double r2 , double l2) {
        this.real-=r2;
        this.imaginary-=l2;
    }
    public void subract(ComplexNumber com) {
        this.real-=com.real;
        this.imaginary-=com.imaginary;
    }
    public static void main(String[] args) {
        ComplexNumber one = new ComplexNumber(1.0,1.0);
        ComplexNumber num = new ComplexNumber(2.5,-1.5);
        one.add(1,1);
        System.out.println("one.real=" + one.getreal());
        System.out.println("one.imaginary=" + one.getimaginary());
        one.subract(num);
        System.out.println("one.real=" + one.getreal());
        System.out.println("one.imaginary=" + one.getimaginary());
        num.subract(one);
        System.out.println("num.real=" + num.getreal());
        System.out.println("num.imaginary=" + num.getimaginary());



    }
}
