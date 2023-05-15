package com.digitalkitchen.service;

import com.digitalkitchen.entities.Recipes;
import com.digitalkitchen.repository.RecipesRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class RecipesService {

    @Autowired
    private RecipesRepository recipesRepository;

    public RecipesService() {
    }

    public List<Recipes> getAllRecipes() {
        return recipesRepository.findAll();
    }
    
    public Optional<Recipes> getRecipeById(int id) {
        return recipesRepository.findById(id);
    }

    public Recipes addRecipe(Recipes recipe) {
        return recipesRepository.save(recipe);
    }

    public void updateRecipe(Recipes recipe) {
        recipesRepository.save(recipe);
    }

    public void deleteRecipeById(int id) {
        recipesRepository.deleteById(id);
    }
    
}
