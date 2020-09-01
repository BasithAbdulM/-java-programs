public class BarkingDog {
    public static void main(String[] args) {

    System.out.println(shouldwakeup(true,-1));

        }
        public static boolean shouldwakeup(boolean barking,int hoursofday){
        boolean result=false;
        if (hoursofday<0||hoursofday>23){
            System.out.println("first");
            return false;
        }
        else if (hoursofday>=8 && hoursofday<=22){
            System.out.println("second");
            result=false;
        }
        else if (hoursofday>=1||hoursofday<=7||hoursofday>=23){
            if(barking==true){
                System.out.println("third");
                result=true;
            }
            else{
                System.out.println("fourth");
                result=false;
            }
        }
        return  result;
    }
}
