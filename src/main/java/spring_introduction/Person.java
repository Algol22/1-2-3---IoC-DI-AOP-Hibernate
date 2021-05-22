package spring_introduction;

import org.springframework.beans.factory.annotation.Value;

//@Component ("personBean")
public class Person {
//    @Autowired
//    @Qualifier("dog")
    private Pet pet;
    @Value("${person.surname}")
    private String surname;
    @Value("${person.age}")
    private int age;
//@Autowired
//    public Person(Pet pet) {
//        System.out.println("person bean is created");
//        this.pet = pet;
//    }
    public Person(Pet pet) {
        System.out.println("person bean is created");
        this.pet = pet;
    }

//    @Autowired
//    @Qualifier("dog")
//    public void setPet(Pet pet) {
//        System.out.println("class person: set pet");
//        this.pet = pet;
//    }

    public void callYourPet(){
        System.out.println("hello, my lovely pet");
        pet.say();
    }


    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        System.out.println("set surname");
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("set age");
        this.age = age;
    }
}
