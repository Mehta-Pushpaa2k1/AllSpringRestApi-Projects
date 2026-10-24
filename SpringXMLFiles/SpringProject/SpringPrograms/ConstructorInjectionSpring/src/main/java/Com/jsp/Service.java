package Com.jsp;
import org.springframework.stereotype.Component;
import org.springframework..stereotype.Component;

@Component
public class Service {

    Dao dao;

    public Service(Dao dao) {
        this.dao = dao;
    }

    public void saveCar(Car car) {
        dao.save(car);
    }
}