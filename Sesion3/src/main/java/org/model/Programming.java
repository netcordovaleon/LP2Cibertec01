package org.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "PROGRAMMINGLANG")
public class Programming {
    @Id
    @Column(name = "ID")
    private int Id;
    @Column(name = "NAMELAN")
    private String Name;
    @Column(name = "DESCRIPTIONLAN")
    private String Description;
    @Column(name = "REGISTERDATE")
    private Date RegisterDate;
    @Column(name = "STATUSLAN")
    private char Status;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public Date getRegisterDate() {
        return RegisterDate;
    }

    public void setRegisterDate(Date registerDate) {
        RegisterDate = registerDate;
    }

    public char getStatus() {
        return Status;
    }

    public void setStatus(char status) {
        Status = status;
    }


}
