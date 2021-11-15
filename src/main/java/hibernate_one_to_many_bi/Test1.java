package hibernate_one_to_many_bi;

import hibernate_one_to_many_bi.entity.Department;
import hibernate_one_to_many_bi.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();

        Session session = null;

        try {
//            session = factory.getCurrentSession();
//
//            Department department = new Department("IT", 550, 1500);
//            Employee emp1 = new Employee("Dima", "Barbashov", 700);
//            Employee emp2 = new Employee("Ilias", "Mamaev", 650);
//            Employee emp3 = new Employee("Olga", "Gagina", 550);
//
//            department.addEmployeeToDepartment(emp1);
//            department.addEmployeeToDepartment(emp2);
//            department.addEmployeeToDepartment(emp3);
//
//            session.beginTransaction();
//            session.save(department);
//
//            session.getTransaction().commit();
//            System.out.println("Done!");
//*************************************************************************
            session = factory.getCurrentSession();
            session.beginTransaction();

            System.out.println("GET DEPARTMENT*******************************");
            Department department = session.get(Department.class, 4);
            System.out.println("SHOW DEPARTMENT^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
            System.out.println(department);
            System.out.println("SHOW EMPLOYEES OF THE DEPARTMENT@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
            System.out.println(department.getEmps());

            session.getTransaction().commit();
            System.out.println("Done!");
//************************************************************************
//            session = factory.getCurrentSession();
//            session.beginTransaction();
//
//            Employee employee = session.get(Employee.class, 1);
//
//            System.out.println(employee);
//            System.out.println(employee.getDepartment());
//
//            session.getTransaction().commit();
//            System.out.println("Done!");
//*********************************************************************************************
//            session = factory.getCurrentSession();
//            session.beginTransaction();
//
//            Employee employee = session.get(Employee.class, 4);
//
//            session.delete(employee);
//
//            session.getTransaction().commit();
//            System.out.println("Done!");
        } finally {
            session.close();
            factory.close();
        }

    }
}
