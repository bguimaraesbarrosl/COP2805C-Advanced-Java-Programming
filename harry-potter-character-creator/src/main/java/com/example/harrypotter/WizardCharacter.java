package com.example.harrypotter;

import jakarta.persistence.*;

@Entity
@Table(name = "wizards")
public class WizardCharacter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private String house;

    @Column
    private String wandWood;

    @Column
    private String patronus;

    @Column
    private String favoriteSpell;

    @Column
    private int powerLevel;

    public WizardCharacter() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public String getWandWood() {
        return wandWood;
    }

    public void setWandWood(String wandWood) {
        this.wandWood = wandWood;
    }

    public String getPatronus() {
        return patronus;
    }

    public void setPatronus(String patronus) {
        this.patronus = patronus;
    }

    public String getFavoriteSpell() {
        return favoriteSpell;
    }

    public void setFavoriteSpell(String favoriteSpell) {
        this.favoriteSpell = favoriteSpell;
    }

    public int getPowerLevel() {
        return powerLevel;
    }

    public void setPowerLevel(int powerLevel) {
        this.powerLevel = powerLevel;
    }

    @Override
    public String toString() {
        return "WizardCharacter{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", house='" + house + '\'' +
                ", wandWood='" + wandWood + '\'' +
                ", patronus='" + patronus + '\'' +
                ", favoriteSpell='" + favoriteSpell + '\'' +
                ", powerLevel=" + powerLevel +
                '}';
    }
}