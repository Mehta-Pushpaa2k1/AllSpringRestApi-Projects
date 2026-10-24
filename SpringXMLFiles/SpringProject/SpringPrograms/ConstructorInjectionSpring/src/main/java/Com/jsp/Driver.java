package Com.jsp;
import Model.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("config.xml");


        Car c1 = (Car) context.getBean("car1");
        Car c2 = (Car) context.getBean("car2");
        Car c3 = (Car) context.getBean("car3");
        Car c4 = (Car) context.getBean("car4");
        Car c5 = (Car) context.getBean("car5");

        c1.display();
        c2.display();
        c3.display();
        c4.display();
        c5.display();

    }
}