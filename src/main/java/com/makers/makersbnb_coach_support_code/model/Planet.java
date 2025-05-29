package com.makers.makersbnb_coach_support_code.model;

import jakarta.persistence.*;

// @Entity - instances of this class map to database records
@Entity
// @Table - those records can be found in the spaces table
@Table(name = "PLANETS")
public class Planet {
    @Id
    // the value of id is generated automatically
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private String name;
    private Integer circumference;

    public Planet(String name, String description, Integer circumference) {
        this.name = name;
        this.description = description;
        this.circumference = circumference;
    }

    public String getName() { return this.name; }
    public void setName(String name) { this.name = name; }

    public String getDescription() { return this.description; }
    public void setDescription(String description) { this.description = description; }

    public Integer getCircumference() { return this.circumference; }
    public void setCircumference(Integer circumference) { this.circumference = circumference; }
}
