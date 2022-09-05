package ProjectAlkemy.Disney.controller;


import ProjectAlkemy.Disney.persistence.entity.Category;
import ProjectAlkemy.Disney.persistence.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    CategoryService categoryService;

    @PostMapping("/save")
    public Category save(@RequestBody Category category)
    {return categoryService.save(category);}


    public Optional<Category> findById(@PathVariable("id") Long id)
    {return categoryService.findById(id);}



}
