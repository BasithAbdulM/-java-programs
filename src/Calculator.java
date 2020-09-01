public class Calculator {
    Floor floor;
    Carpet carpet;
    public Calculator(Floor f,Carpet ca) {
        floor=f;
        carpet=ca;
    }
    public double getTotalCost() {
        return floor.getarea()*carpet.getcost();
}
    public static void main(String[] args) {
        Floor floor=new Floor(5.4,4.5);
        floor.getarea();
        System.out.println("Floor Area"+" "+floor.getarea());
        Carpet carpet=new Carpet(1.5);
        carpet.getcost();
        System.out.println("Cost"+" "+"Per"+" "+"Sq/m"+" "+carpet.getcost());
        Calculator calculator=new Calculator(floor,carpet);
        calculator.getTotalCost();
        System.out.println("Total"+" "+"Cost"+calculator.getTotalCost());
        floor=new Floor(2.75,4.0);
        floor.getarea();
        System.out.println("Floor Area"+" "+floor.getarea());
        carpet=new Carpet(3.5);
        carpet.getcost();
        calculator=new Calculator(floor,carpet);
        calculator.getTotalCost();
        System.out.println("Cost"+" "+"Per"+" "+"Sq/m"+" "+carpet.getcost());
        System.out.println("Total"+" "+"Cost"+calculator.getTotalCost());
    }
}
