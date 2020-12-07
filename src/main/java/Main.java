import hibernateUtil.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {
Session session = HibernateUtil.getSessionFactory().openSession();
Transaction tx = session.beginTransaction();
tx.commit();
HibernateUtil.shutdown();

    }
}
