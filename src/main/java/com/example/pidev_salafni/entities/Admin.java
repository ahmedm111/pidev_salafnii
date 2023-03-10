package com.example.pidev_salafni.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name="Admin")
public class Admin  implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long ID;
    private String AdminName;
    private String AdminLastName;
    private String Mail;
    private Date BirthDate;
    private String AdminLogin;
    private String AdminPaassword;

    @Override
    public String toString() {
        return "Admin{" +
                "ID=" + ID +
                ", AdminName='" + AdminName + '\'' +
                ", AdminLastName='" + AdminLastName + '\'' +
                ", Mail='" + Mail + '\'' +
                ", BirthDate=" + BirthDate +
                ", AdminLogin='" + AdminLogin + '\'' +
                ", AdminPaassword='" + AdminPaassword + '\'' +
                '}';
    }
}