package model;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Account {
    @Id
    @GeneratedValue
    private long id;
    private String username;
    private String password;
    private String rank;
    @OneToMany(mappedBy = "account", cascade= CascadeType.ALL, orphanRemoval = true)
    private Collection<Topic> topics;
    @OneToMany(mappedBy = "account", cascade= CascadeType.ALL, orphanRemoval = true)
    private Collection<Post> posts;

    public long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getRank() {
        return rank;
    }

    public Collection<Topic> getTopics() {
        return topics;
    }

    public Collection<Post> getPosts() {
        return posts;
    }

    public Account(String username, String password, String rank, Collection<Topic> topics, Collection<Post> posts) {
        this.username = username;
        this.password = password;
        this.rank = rank;
        this.topics = topics;
        this.posts = posts;
    }
}
