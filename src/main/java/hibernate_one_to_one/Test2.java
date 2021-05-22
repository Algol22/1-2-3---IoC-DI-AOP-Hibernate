package hibernate_one_to_one;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Test2 {

    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();
        Session session = null;

try {
//

//    session = factory.getCurrentSession();
//
//    Employee employee = new Employee("Nikolay",
//            "Vladimir", "IT",1000);
//    Detail detail = new Detail("York", "12345678", "putin@mail.ru");
//
//    employee.setEmpDetail(detail);
//   detail.setEmployee(employee);
//    session.beginTransaction();
//
//    session.save(detail);
//
//
//    session.getTransaction().commit();
//    System.out.println("done");


//    session = factory.getCurrentSession();
//    session.beginTransaction();
//
//Detail detail = session.get(Detail.class,4);
//    System.out.println(detail.getEmployee());
//
//    session.getTransaction().commit();
//    System.out.println("done");


    session = factory.getCurrentSession();
    session.beginTransaction();

    Detail detail = session.get(Detail.class,1);
    detail.getEmployee().setEmpDetail(null);
    session.delete(detail);

    session.getTransaction().commit();
    System.out.println("done");

}finally
{
    session.close();
    factory.close();
}
    }
}
