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
        calculateClass pls = (calculateClass) context.getBean ( "calculatePlus" );
        calculateClass min = (calculateClass) context.getBean ( "calculateMinus" );
        calculateClass div = (calculateClass) context.getBean ( "calculateDivision" );
        calculateClass mul = (calculateClass) context.getBean ( "calculateMultiplication" );
        calculateClass sqrt = (calculateClass) context.getBean ( "calculateSqrt" );
        calculateClass sqr = (calculateClass) context.getBean ( "calculateSqr" );
//        System.out.println ( div.calc ( numA, numB ) );
        System.out.println ( quadraticEquationX1 () );
    }

    public static Integer quadraticEquationX1() {
        int x1 = 0;

        return x1;
    }

    public static Integer quadraticEquationX2() {
        return ;
    }

    public static Integer dis() {
        return sqr.calcSq ( numB ) + 4 * numA * numC;
    }
}
