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
            ret = a / b;
        }

        if ( calcPMDM.equals ( "multiplication" ) ) {
            ret = a * b;
        }
        return ret;
    }

    public double calcSq(double a) {
        double ret = 0;
        if ( calcPMDM.equals ( "sqrt" ) ) {
            ret = Math.sqrt ( a );
        }

        if ( calcPMDM.equals ( "sqr" ) ) {
            ret = Math.pow ( a, 2 );
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
