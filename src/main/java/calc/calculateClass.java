package calc;

public class calculateClass {

    private String calcPMDM;
    private String calcSq;

    public double calc(double a, double b) {
        double ret = 0;

        if ( calcPMDM.equals ( "plus" ) ) {
            ret = a + b;
        }

        if ( calcPMDM.equals ( "minus" ) ) {
            ret = a - b;
        }

        if ( calcPMDM.equals ( "division" ) ) {
            if ( b == 0 ) ret = 0;
            else ret = a / b;
        }

        if ( calcPMDM.equals ( "multiplication" ) ) {
            ret = a * b;
        }
        return ret;
    }

    public double calcSq(double a) {
        double ret = 0;
        if ( calcSq.equals ( "sqrt" ) ) {
            if ( a == 0 ) ret = 0;
            else ret = Math.sqrt ( a );
        }

        if ( calcSq.equals ( "sqr" ) ) {
            if ( a == 0 ) ret = 0;
            else ret = Math.pow ( a, 2 );
        }

        return ret;
    }

    public void setCalc(String calcPMDM) {
        this.calcPMDM = calcPMDM;
    }

    public String getCalc() {
        return calcPMDM;
    }

    public void setCalcSq(String calcSq) {
        this.calcSq = calcSq;
    }

    public String getCalcSq() {
        return calcSq;
    }
}
