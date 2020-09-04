package Set2;

public class Wall {
    double width ;
    double height;
    Wall(){

    }

    Wall(double wi, double he) {
        this.width=wi;
        this.height=he;
    }
    public double getWidth(){
        return this.width;

    }
    public double getHeight(){
        return  this.height;
    }
    public double setwidth(double wi){
        return this.width;
    }
    public double setheight(double he){
        return this.height;
    }
    public  double getarea(){
        return this.width*this.height;
    }

    public static void main(String[] args) {
        Wall wall = new Wall(5,4);
        System.out.println("area="+ wall.getarea());
        wall.setwidth(0);
        wall.setheight(-1.5);
        System.out.println("width="+ wall.getWidth());
        System.out.println("height="+ wall.getHeight());
        System.out.println("area="+ wall.getarea());

    }
}
