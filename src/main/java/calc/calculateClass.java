package calc;

public class calculateClass {

    private static String calcMe;

    public static calculateClass operation = new calculateClass();

    //    public calculateClass(String calcMe) {
//        this.calcMe = calcMe;
//    }

    public static Integer calcMeNow() {
        int ret = 0;

        if (calcMe == "plus") {
            ret = 2 + 3;
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
