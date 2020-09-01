public class Carpet {
    double cost;
    public Carpet(double c) {
        cost=c;
        if(cost<0) {
            cost=0;
        }
        else {
            cost=cost;

        }
    }
    double getcost() {
        return cost;
    }
}
