package ua.knu.fit.mit.lection8.all;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class MyEntity {

    @Id
    @GeneratedValue
    private long id;
    private String title;
    private int weight;

}
