package Q11;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class OrderService {

    @Autowired
    @Qualifier("smsNotificationService")
    private NotificationService notificationService;

    public void placeOrder() {

        System.out.println("Order placed");

        notificationService.sendNotification();
    }
}