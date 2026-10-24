package Q11;


import org.springframework.stereotype.Component;

@Component
public class SmsNotificationService
        implements NotificationService {

    @Override
    public void sendNotification() {

        System.out.println("SMS notification sent");
    }
}