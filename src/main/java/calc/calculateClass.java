package calc;

public class calculateClass {

    private static String calcMe;

    public static calculateClass operation = new calculateClass();

    //    public calculateClass(String calcMe) {
//        this.calcMe = calcMe;
//    }

    public static Integer calcMeNow(int a, int b) {
        int ret = 0;

        if ( calcMe.equals ( "plus" ) ) {
            ret = a + b;
        }

        if ( calcMe.equals ( "minus" ) ) {
            ret = a - b;
        }

        if ( calcMe.equals ( "division" ) ) {
            ret = a / b;
        }

        if ( calcMe.equals ( "multiplication" ) ) {
            ret = a * b;
        }

        return ret;
    }

    public void setCalcMe(String calcMe) {
        this.calcMe = calcMe;
    }

    public String getCalcMe() {
        return calcMe;
    }

}
