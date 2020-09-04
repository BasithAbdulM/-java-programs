package Set2;

public class SimpleCalc {
    double firstnum;
    double secondnum;

    public double getFirstnum() {
        return firstnum;
    }

    public double getSecondnum() {
        return secondnum;
    }

    public void setFirstnum(double firstnum) {
        this.firstnum = firstnum;
    }

    public void setSecondnum(double secondnum) {
        this.secondnum = secondnum;
    }
    public double getaddresult(){
        return firstnum+secondnum;
    }
    public double getsubresult() {
        return firstnum - secondnum;
    }
    public double getmulreult(){
        return firstnum*secondnum;
    }
    public double getdivresult() {
        if(secondnum<=0) {
            return 0;

        }
        else
            return firstnum/secondnum;

    }
    public static void main(String[] args) {
        SimpleCalc calc= new SimpleCalc();
        calc.setFirstnum(5.0);
        calc.setSecondnum(4);
        System.out.println("add="+ calc.getaddresult());
        System.out.println("subract="+ calc.getsubresult());
        calc.setFirstnum(5.25);
        calc.setSecondnum(0);
        System.out.println("multiply="+calc.getmulreult());
        System.out.println("divide="+ calc.getdivresult());

    }
}
