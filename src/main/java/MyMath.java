public class MyMath {
    public static void main(String args[]){
        System.out.println(isEven(-5));
        System.out.println(isOdd(-5));
        System.out.println(add(3,4));
    }
    public static boolean isEven(int a){
        int reminder = a % 2;
        return reminder == 0;
    }

    public static boolean isOdd(int a){
        int reminder = a % 2;
        return reminder != 0;
    }

    /**
     * This method is used to perform addition operation
     * @param a
     * @param b
     * @return
     */
    public static int add(int a , int b){
        return a+b;
    }
    public static double add(double a, double b){
        return a+b;
    }


    /**
     * This method is used to perform subtract operation a-b
     * @param a
     * @param b
     * @return
     */
    public static int sub(int a, int b){
        return a-b;
    }

    public static int mul(int a, int b){
        return a*b;
    }
    public static boolean isEqual(int a, int b){
        return a == b;
    }

    public static int incrementByOne(int a){
        return ++a;//return a+1;
    }

    public static int incrementByX(int a, int incrementBy){
        return a + incrementBy;
    }


}
