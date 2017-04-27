package dudinbi3;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by student on 3/6/17.
 */
@Data
@Entity
@Table(name = "people")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String firstName;
    private String lastName;
}
