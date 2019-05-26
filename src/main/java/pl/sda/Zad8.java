package pl.sda;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Zad8 {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("my-beans.xml");

//        Student student1 = (Student) context.getBean("student1");
//        System.out.println(student1);

        Message message1 = (Message) context.getBean("message1");
        System.out.println(message1.getText());
        System.out.println(message1.isSend());
        System.out.println(message1.getSender());


    }
}
