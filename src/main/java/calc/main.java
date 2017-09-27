package calc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("calcConfig.xml");
        calculateClass value = (calculateClass) context.getBean("calculate");
        System.out.println(calculateClass.calcMeNow());
    }
}
