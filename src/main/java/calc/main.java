package calc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class main {

    private static int numA = 0;
    private static int numB = 0;
    private static int numC = 0;

    public static void enterABC() {
        Scanner enterNumber = new Scanner ( System.in );
        System.out.println ( "Введите число A" );
        numA = enterNumber.nextInt ();
        System.out.println ( "Введите число B" );
        numB = enterNumber.nextInt ();
        System.out.println ( "Введите число C" );
        numC = enterNumber.nextInt ();

    }

    public static void main(String[] args) {
        enterABC ();
        ApplicationContext context = new ClassPathXmlApplicationContext ( "calcConfig.xml" );
        calculateClass plus = (calculateClass) context.getBean ( "calculatePlus" );
        calculateClass minus = (calculateClass) context.getBean ( "calculateMinus" );
        calculateClass division = (calculateClass) context.getBean ( "calculateDivision" );
        calculateClass multiplication = (calculateClass) context.getBean ( "calculateMultiplication" );
        System.out.println ( division.calcMeNow (numA,numB) );

    }

}
