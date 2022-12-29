package com.example.projectA.model;

import org.springframework.boot.autoconfigure.domain.EntityScan;

public class UserModel {
    String name;
    String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}

/***@Entity
@Table(name = "users")
public class UserModel {
@Id
@Column(name = "id", nullable = false, length())
@GeneratedVlue(strategy = GenerationType.Auto)
private Long id;



@Column(name = "first_name", nullable = false)
private String name1;

@Column(name = "last_name", nullable = false)
private String name2;

@Column(name = "email", nullable = false)
private String emailID;

@Column(name = "password", nullable = false)
private String password;

}
 */

