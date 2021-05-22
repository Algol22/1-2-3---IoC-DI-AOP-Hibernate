package spring_introduction;


//@Component
//@Scope("prototype")
public class Dog implements Pet {
//    private String name;
    public Dog() {
        System.out.println("dog bean is created");
    }

    @Override
    public void say(){
        System.out.println("bow-wow");
    }

//    @PostConstruct
//    public void init(){
//        System.out.println("class dog: init method");
//    }
//@PreDestroy
//    public void destroy(){
//        System.out.println("class dog: destroy method");
//    }

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
}
