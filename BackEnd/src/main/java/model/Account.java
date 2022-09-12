package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Account {
    @Id
    @GeneratedValue
    private long id;
    private String username;
    private String password;
}
