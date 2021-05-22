package hibernate_one_to_many_bi;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Test1 {

    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(hibernate_one_to_many_bi.Employee.class)
                .addAnnotatedClass(hibernate_one_to_many_bi.Department.class)
                .buildSessionFactory();
        Session session = null;

try {

//    session = factory.getCurrentSession();
//    Department dep = new Department("IT", 300, 1200);
//    Employee emp = new Employee("Putin", "Vladimir",800);
//    Employee emp2 = new Employee("Elena", "Vladimir",800);
//
//    dep.addEmployeeToDepartment(emp);
//    dep.addEmployeeToDepartment(emp2);
//
//    session.beginTransaction();
//    session.save(dep);
//
//    session.getTransaction().commit();
//    System.out.println("done");


//    session = factory.getCurrentSession();
//    session.beginTransaction();
//    Department department = session.get(Department.class,1);
//    System.out.println(department);
//    System.out.println(department.getEmps());
//
//
//    session.getTransaction().commit();
//    System.out.println("done");



//    session = factory.getCurrentSession();
//    session.beginTransaction();
//    Employee employee = session.get(Employee.class,1);
//    System.out.println(employee);
//    System.out.println(employee.getDepartment());
//
//
//    session.getTransaction().commit();
//    System.out.println("done");



    session = factory.getCurrentSession();
    session.beginTransaction();
    Employee employee = session.get(Employee.class,1);

session.delete(employee);

    session.getTransaction().commit();
    System.out.println("done");
}finally
{
    session.close();
    factory.close();
}
    }
}
