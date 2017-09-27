package calc;

public class calculateClass {

    private  String calcMe;

    public void setCalcMe(String calcMe) {
        this.calcMe = calcMe;
    }

    public String getCalcMe() {
        return calcMe;
    }

//    public calculateClass(String calcMe) {
//        this.calcMe = calcMe;
//    }


    public  Integer calcMeNow() {
        int ret = 0;

        if (calcMe == "plus") {
            ret = 2 + 3;
        }
        return ret;
    }


}
