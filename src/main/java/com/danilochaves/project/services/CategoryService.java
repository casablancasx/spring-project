package com.danilochaves.project.services;

import com.danilochaves.project.entities.Category;
import com.danilochaves.project.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class CategoryService {
    @Autowired
    private CategoryRepository repository;


    public List<Category> findAll(){
        List<Category> list = repository.findAll();
        return list;
    }

    public Category findById(Long id){
        Optional<Category> obj = repository.findById(id);
        return obj.get();
    }
}
