package com.gcu.data.entity;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table("snakes")
public class SnakeEntity {

    @Id
    private int id;

    @Column("Family")
    private String family;

    @Column("Type")
    private String type;

    @Column("Morph")
    private String morph;

    @Column("Lifespan")
    private int lifespan;

    @Column("AdultSize")
    private int adultSize;

    @Column("CurrentAge")
    private int currentAge;

    public int getId() {
        return id;
    }

    public String getFamily() {
        return family;
    }

    public String getType() {
        return type;
    }

    public String getMorph() {
        return morph;
    }

    public int getLifespan() {
        return lifespan;
    }

    public int getAdultSize() {
        return adultSize;
    }

    public int getCurrentAge() {
        return currentAge;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setMorph(String morph) {
        this.morph = morph;
    }

    public void setLifespan(int lifespan) {
        this.lifespan = lifespan;
    }

    public void setAdultSize(int adultSize) {
        this.adultSize = adultSize;
    }

    public void setCurrentAge(int currentAge) {
        this.currentAge = currentAge;
    }

    public SnakeEntity() {
    }

    public SnakeEntity(String family, String type, String morph, int lifespan, int adultSize, int currentAge) {
        this.family = family;
        this.type = type;
        this.morph = morph;
        this.lifespan = lifespan;
        this.adultSize = adultSize;
        this.currentAge = currentAge;
    }
}
