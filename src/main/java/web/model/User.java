package web.model;

import lombok.*;

import javax.persistence.*;

@Data
@Entity
@Table(name="usersTable")
public class User {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="lastName")
    private String lastname;

    @Column(name="name")
    private String name;

    @Column(name="numberTelephone")
    private int numberTelephone;

}
