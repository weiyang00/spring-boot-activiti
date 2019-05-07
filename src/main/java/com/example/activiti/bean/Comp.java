package com.example.activiti.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.io.Serializable;
import java.util.List;


@Entity
public class Comp implements Serializable {
    @Id
    @GeneratedValue
    private Long compId;
    private String compName;
    @OneToMany(mappedBy = "comp", targetEntity = Person.class)
    private List<Person> people;

    public Comp(String compName)
    {this.compName = compName;}

    public Comp() {

    }

    public Long getCompId() {
        return compId;
    }

    public void setCompId(Long compId) {
        this.compId = compId;
    }

    public String getCompName() {
        return compName;
    }

    public void setCompName(String compName) {
        this.compName = compName;
    }

    public List<Person> getPeople() {
        return people;
    }

    public void setPeople(List<Person> people) {
        this.people = people;
    }
}
