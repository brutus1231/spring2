package pl.sda.nowy;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Getter @Setter
@Component
public class Book {

    private String title = "Gra o tron";

    @Autowired
    private Author author;

}
