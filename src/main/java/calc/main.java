package calc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class main {

    private static int numA = 0;
    private static int numB = 0;
    private static int numC = 0;

    static ApplicationContext context = new ClassPathXmlApplicationContext ( "calcConfig.xml" );
    public static calculateClass pls = (calculateClass) context.getBean ( "calculatePlus" );
    public static calculateClass min = (calculateClass) context.getBean ( "calculateMinus" );
    public static calculateClass div = (calculateClass) context.getBean ( "calculateDivision" );
    public static calculateClass mul = (calculateClass) context.getBean ( "calculateMultiplication" );
    public static calculateClass sqrt = (calculateClass) context.getBean ( "calculateSqrt" );
    public static calculateClass sqr = (calculateClass) context.getBean ( "calculateSqr" );

    public static void enterABC() {
        Scanner enterNumber = new Scanner ( System.in );
        System.out.println ( "Поиск решений квадратного уравнения" );
        System.out.println ( "Введите число A" );
        numA = enterNumber.nextInt ();
        System.out.println ( "Введите число B" );
        numB = enterNumber.nextInt ();
        System.out.println ( "Введите число C" );
        numC = enterNumber.nextInt ();

    }

    public static void main(String[] args) {
        enterABC ();
        System.out.println ( "Дискриминант квадратного уравнения = " + dis () );
        System.out.println ( "Первый корень квадратного уравнения = " + quadraticEquationX1 () );
        System.out.println ( "Второй корень квадратного уравнения = " + quadraticEquationX2 () );
    }

    public static double quadraticEquationX1() {
        if (numA  == 0 ) return 0;
        return ((-1)*numB + sqrt.calcSq ( dis () )) / (2 * numA);
    }

    public static double quadraticEquationX2() {
        if (numA  == 0 ) return 0;
        return ((-1)*numB - sqrt.calcSq ( dis () )) / (2 * numA);
    }

    public static double dis() {

        return (sqr.calcSq ( numB ) - 4 * numA * numC);
    }


}
