package ProjectAlkemy.Disney.persistence.service;

import ProjectAlkemy.Disney.persistence.CategoryRepository;
import ProjectAlkemy.Disney.persistence.entity.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    CategoryRepository categoryRepository;
    public Category save(Category category)
        {return categoryRepository.save(category);}

    public Optional<Category> findById(Long id)
        {return categoryRepository.findById(id);}
}
