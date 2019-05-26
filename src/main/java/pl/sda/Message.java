package pl.sda;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;

@Getter @Setter
public class Message {

    @Value("#{'Ala ma kota'}")
    private String text;

    private String sender;

    @Value("#{1==2}")
    private boolean isExamPass;

    @Value("#{student1.indexNumber < 200 ? true : false}")
    private boolean isSend;

}
