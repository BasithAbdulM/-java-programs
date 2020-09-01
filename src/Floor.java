public class Floor {
    double width;
    double length;


    public Floor(double i, double j) {
        width=i;
        length=j;
        if(width<0) {
            width=0;
        }
        else {
            width=width;
        }
        if(length<0) {
            length=0;
        }
        else {
            length=length;
        }
    }
    double getarea() {
          return width*length;

    }

}

