package be.thomasmore.graduaten.demo4.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String naam;
    private String klas;

    public Student() {
    }

    public Student(Long id, String naam, String klas) {
        this.id = id;
        this.naam = naam;
        this.klas = klas;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNaam() { return naam; }
    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getKlas() { return klas; }
    public void setKlas(String klas) { this.klas = klas; }

    @Override
    public String toString() {
        return naam + " van Klas " + klas;
    }
}
