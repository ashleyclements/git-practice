package com.example.superheroes.model;

import jakarta.persistence.*;


@Entity
@Table(name="heroes")
public class Hero {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    private String name;
    private String alias;
    private String superpower;
    private int teamid;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAlias() {
        return alias;
    }

    public String getSuperpower() {
        return superpower;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", alias='" + alias + '\'' +
                ", superpower='" + superpower + '\'' +
                ", teamid=" + teamid +
                '}';
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public void setSuperpower(String superpower) {
        this.superpower = superpower;
    }

    public void setTeamid(int teamid) {
        this.teamid = teamid;
    }

    public int getTeamid() {
        return teamid;
    }

}


