package Test;

import Model.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("config.xml");

        Car c1 = context.getBean("car1", Car.class);
        Car c2 = context.getBean("car2", Car.class);
        Car c3 = context.getBean("car3", Car.class);
        Car c4 = context.getBean("car4", Car.class);
        Car c5 = context.getBean("car5", Car.class);

        c1.display();
        c2.display();
        c3.display();
        c4.display();
        c5.display();
    }
}