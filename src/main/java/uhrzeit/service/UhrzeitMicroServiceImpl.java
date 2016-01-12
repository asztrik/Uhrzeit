package uhrzeit.service;

        import org.springframework.stereotype.Service;

        import java.text.DateFormat;
        import java.text.SimpleDateFormat;
        import java.util.Calendar;
        import java.util.Date;

/**
 * Created by asztrik on 1/10/16.
 * Microservice-implementation, separate Klasse (SOLID)
 */

@Service
public class UhrzeitMicroServiceImpl implements UhrzeitMicroService {

    public String name() {
        return "Uhrzeit MicroService";
    }

    public String uhrzeit() {

        DateFormat df = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
        Date d = Calendar.getInstance().getTime();

        return df.format(d);

    }
}
