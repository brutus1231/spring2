package pl.sda.nowy;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter @Setter
@Component
public class Author {

    private String firstName = "Marek";
    private String lastName = "Adamski";
}
