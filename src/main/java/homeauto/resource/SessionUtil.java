package homeauto.resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionUtil {

    private static SessionUtil instance = new SessionUtil();
    private SessionFactory sessionFactory;

    private SessionUtil() {
        Configuration configuration = new Configuration();
        configuration.configure();

        sessionFactory = configuration.buildSessionFactory();
    }

    public static SessionUtil getInstance() {
        return instance;
    }

    public static Session getSession() {
        Session session = getInstance().sessionFactory.openSession();

        return session;
    }
}