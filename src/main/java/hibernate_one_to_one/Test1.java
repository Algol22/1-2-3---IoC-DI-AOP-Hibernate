package hibernate_one_to_one;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Test1 {

    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();
        Session session = null;

try {
//    Session session = factory.getCurrentSession();
//    Employee employee = new Employee("Putin",
//            "Vladimir", "IT",1000);
//    Detail detail = new Detail("Baku", "12345678", "putin@mail.ru");
//
//    employee.setEmpDetail(detail);
//    session.beginTransaction();
//
//    session.save(employee);
//
//    session.getTransaction().commit();
//    System.out.println("done");

//    session = factory.getCurrentSession();
//    session.beginTransaction();
//Employee emp = session.get(Employee.class,1);
//    System.out.println(emp.getEmpDetail());
//
//    session.getTransaction().commit();
//    System.out.println("done");


    session = factory.getCurrentSession();
    session.beginTransaction();
    Employee emp = session.get(Employee.class,2);
    session.delete(emp);

    session.getTransaction().commit();
    System.out.println("done");


}finally
{
    session.close();
    factory.close();
}
    }
}
