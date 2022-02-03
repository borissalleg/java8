package com.j8.model;

import java.io.Serializable;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="tbl_usuario")
public class useModel implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_usuario")
    private int id;

    @Column(name="email", nullable = false, length = 50)
    private String mail;
    
    @Column( nullable = false, length = 50)
    private String password;


    //@OneToOne(cascade = CascadeType.ALL)
    //@JoinColumn(name = "fk_user", referencedColumnName = "id_user_type")
   // private userTypeModel idUsertype;


   

    public useModel() {
    }

 
    
   
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMail() {
        return this.mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

   

    
}
