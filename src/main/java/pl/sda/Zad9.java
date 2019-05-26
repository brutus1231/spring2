package pl.sda;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.sda.nowy.Book;

import java.util.Arrays;

public class Zad9 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("my-beans.xml");

        String[] beanDefinitionNames = context.getBeanDefinitionNames();

        Arrays.stream(beanDefinitionNames).forEach(System.out::println);

        Book book = (Book)context.getBean("book");
        System.out.println(book.getAuthor().getFirstName());

    }
}
