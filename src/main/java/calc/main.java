package calc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext ( "calcConfig.xml" );
        calculateClass value = (calculateClass) context.getBean ( "calculate" );
        System.out.println ( calculateClass.calcMeNow () );

    }


    private int numA = 0;
    private int numB = 0;
    private int numC = 0;

    public void enterABC() {
        Scanner enterNumber = new Scanner ( System.in );
        System.out.println ( "Введите число A" );
        numA = enterNumber.nextInt ();
        System.out.println ( "Введите число B" );
        numB = enterNumber.nextInt ();
        System.out.println ( "Введите число C" );
        numC = enterNumber.nextInt ();

    }
}
