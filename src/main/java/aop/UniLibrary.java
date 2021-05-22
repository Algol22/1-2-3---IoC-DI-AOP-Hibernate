package aop;


import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary{


    public void getBook(){
        System.out.println("мы берем книгу из UniLibrary");
        System.out.println("------------------------------------");
    }

    public String returnBook(){
        int a = 10/0;
        System.out.println("мы возвращаем книгу в UniLibrary");
        return "Война и мир";

    }

    public void getMagazine(){
        System.out.println("мы берем журнал из UniLibrary");
        System.out.println("------------------------------------");
    }

    public void returnMagazine(){
        System.out.println("мы возвращаем журнал в UniLibrary");
        System.out.println("------------------------------------");
    }

    public void addBook(String person_name, Book book){
        System.out.println("мы добавляем книгу в UniLibrary");
        System.out.println("------------------------------------");
    }

    public void addMagazine(){
        System.out.println("мы добавляем журнал в UniLibrary");
        System.out.println("------------------------------------");
    }
}
