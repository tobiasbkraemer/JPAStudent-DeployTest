package com.example.jpastudent.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Objects;


@Entity
public class Unicode {

    @Id
    private int unicode;
    private char bogstav;
    private String tegn;
    private String description;

    public Integer getUnicode() {
        return unicode;
    }

    public void setUnicode(int unicode) {
        this.unicode = unicode;
        this.bogstav = (char) unicode;
    }

    public char getBogstav() {
        return bogstav;
    }

    public void setBogstav(char bogstav) {
        this.bogstav = bogstav;
        this.unicode = bogstav;
    }

    public String getTegn() {
        return tegn;
    }

    public void setTegn(String tegn) {
        this.tegn = tegn;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Unicode unicode1 = (Unicode) o;
        return Objects.equals(unicode, unicode1.unicode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(unicode);
    }
}
