package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Topic {
    @Id
    @GeneratedValue
    private long id;
    private String topicName;
    private Collection<Post> posts;
}
