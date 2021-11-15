package hibernate_test;

import hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test4 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction();

            session.createQuery("update Employee set salary=1500 where department='IT'").executeUpdate();

//            Employee emp = session.get(Employee.class, 6);
//            emp.setName("Lubovnica");
//            emp.setDepartment("Boss's office");
//            emp.setSalary(3200);

            session.getTransaction().commit();

            System.out.println("DONE!");
        }
        finally {
            factory.close();
        }

    }
}
