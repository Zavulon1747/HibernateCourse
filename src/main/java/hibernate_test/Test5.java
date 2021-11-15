package hibernate_test;

import hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test5 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction();

            session.createQuery("delete Employee where department='Security' or department = 'Sales'").executeUpdate();

//            Employee emp = session.get(Employee.class, 6);
//            session.delete(emp);

            session.getTransaction().commit();

            System.out.println("DONE!");
        } finally {
            factory.close();
        }

    }
}
