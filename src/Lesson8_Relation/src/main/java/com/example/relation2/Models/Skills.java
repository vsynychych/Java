package com.example.relation2.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString(exclude = "user")
public class Skills {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String type;

    @ManyToOne(fetch = FetchType.LAZY,cascade =CascadeType.ALL)
    @JsonIgnore
    @JoinColumn(name = "user_skills")
    private User user;

    public Skills(String type, User user) {
        this.type = type;
        this.user = user;
    }

    public Skills(String type) {
        this.type = type;
    }

    public Skills(User user) {
        this.user = user;
    }

}
