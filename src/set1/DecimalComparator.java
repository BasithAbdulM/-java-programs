package set1;

public class DecimalComparator {
    public static void main(String[] args) {

        System.out.println(areEqualsbythreedcp(-3.123,3.123));
    }
    public static boolean areEqualsbythreedcp(double firstnum, double secondnum){
        if((int) (firstnum*1000)==(secondnum*1000)){
            return true;
        }

        else

    {
        return false;
    }
    }

}
