package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity

public class Post {
    @Id
    @GeneratedValue
    private long id;

    private Account account;
    private String comment;
}
