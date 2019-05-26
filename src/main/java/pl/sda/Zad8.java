package pl.sda;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Zad8 {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("my-beans.xml");
    }
}
