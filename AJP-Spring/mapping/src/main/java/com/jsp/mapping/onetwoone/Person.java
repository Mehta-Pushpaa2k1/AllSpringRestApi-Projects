package com.jsp.mapping.onetwoone;
import jakarta.persistence.*;

@Entity
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "aadhaar_id", unique = true)
    private AadharCard aadhaarCard;

    public Person(Long id, String name, AadharCard aadhaarCard) {
        this.id = id;
        this.name = name;
        this.aadhaarCard = aadhaarCard;
    }

    public AadharCard getAadhaarCard() {
        return aadhaarCard;
    }

    public void setAadhaarCard(AadharCard aadhaarCard) {
        this.aadhaarCard = aadhaarCard;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}