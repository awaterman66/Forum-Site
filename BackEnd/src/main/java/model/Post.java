package model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity

public class Post {
    @Id
    @GeneratedValue
    private long id;
    @ManyToOne
    @JsonIgnore
    private Topic topic;
    @ManyToOne
    @JsonIgnore
    private Account account;
    @Lob
    private String comment;

    public Post(Topic topic, Account account, String comment) {
        this.topic = topic;
        this.account = account;
        this.comment = comment;
    }

    public long getId() {
        return id;
    }

    public Topic getTopic() {
        return topic;
    }

    public Account getAccount() {
        return account;
    }

    public String getComment() {
        return comment;
    }
}
