package model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Topic {
    @Id
    @GeneratedValue
    private long id;
    private String topicName;
    @OneToMany
    private Collection<Post> posts;
    @ManyToOne
    @JsonIgnore
    private Account account;

    public Topic(String topicName, Collection<Post> posts, Account account) {
        this.topicName = topicName;
        this.posts = posts;
        this.account = account;
    }

    public long getId() {
        return id;
    }

    public String getTopicName() {
        return topicName;
    }

    public Collection<Post> getPosts() {
        return posts;
    }

    public Account getAccount() {
        return account;
    }
}
