package hibernate_one_to_many_uni;


import hibernate_one_to_many_uni.entity.Department;
import hibernate_one_to_many_uni.entity.Employee;
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
//            Department department = new Department("Coach", 200, 1200);
//            Employee emp1 = new Employee("Olga", "Gagina", 300);
//            Employee emp2 = new Employee("Mutniy", "Chel", 1100);
//
//            department.addEmployeeToDepartment(emp1);
//            department.addEmployeeToDepartment(emp2);
//
//            session.beginTransaction();
//            session.save(department);
//
//            session.getTransaction().commit();
//            System.out.println("Done!");

//            session = factory.getCurrentSession();
//            session.beginTransaction();
//
//            Department department = session.get(Department.class, 3);
//
//            System.out.println(department);
//            System.out.println(department.getEmps());
//
//            session.getTransaction().commit();
//            System.out.println("Done!");

//            session = factory.getCurrentSession();
//            session.beginTransaction();
//
//            Employee employee = session.get(Employee.class, 4);
//
//            System.out.println(employee);
//
//            session.getTransaction().commit();
//            System.out.println("Done!");
//*********************************************************************************************
            session = factory.getCurrentSession();
            session.beginTransaction();

            Department department = session.get(Department.class, 3);// delete all the stuff of employees, because Department is one-to-many and has links to all employees
//            Employee employee = session.get(Employee.class, 6);             // delete only 1 employee, because employee doesn't have a link on department

            session.delete(department);

            session.getTransaction().commit();
            System.out.println("Done!");
        } finally {
            session.close();
            factory.close();
        }

    }
}
