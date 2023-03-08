package ua.knu.fit.mit.lection7.entity;


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
    private String name;
    private short age;

}
