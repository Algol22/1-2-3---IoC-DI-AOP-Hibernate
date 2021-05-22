package hibernate_test.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.tool.schema.internal.exec.ScriptTargetOutputToFile;


public class Test1 {

    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();

try {
    Session session = factory.getCurrentSession();
    Employee emp = new Employee("Aleksandr", "Ivanov", "HR", 660);
    session.beginTransaction();
    session.save(emp);
    session.getTransaction().commit();
    System.out.println("done");
}finally
{
    factory.close();
}
    }
}
