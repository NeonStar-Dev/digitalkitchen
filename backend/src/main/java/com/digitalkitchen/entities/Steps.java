package com.digitalkitchen.entities;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;


@Entity
@Table(name = "steps")
public class Steps {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "recipe_id", referencedColumnName = "id")
    private Recipes recipe;

    private int recipeID;

    @Column(name = "step_number")
    private int stepNumber;

    @Column(name = "step_description")
    private String description;

    // Getters

    public int getID() {
        return this.ID;
    }

    public Recipes getRecipe() {
        return recipe;
    }
    
    public int getRecipeID() {
        return recipeID;
    }
    
    public int getStepNumber() {
        return stepNumber;
    }
    
    public String getDescription() {
        return description;
    }
    
    // Setters
    
    public void setRecipe(Recipes recipe) {
        this.recipe = recipe;
    }
    
    public void setRecipeID(int recipeID) {
        this.recipeID = recipeID;
    }
    
    public void setStepNumber(int stepNumber) {
        this.stepNumber = stepNumber;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    
}