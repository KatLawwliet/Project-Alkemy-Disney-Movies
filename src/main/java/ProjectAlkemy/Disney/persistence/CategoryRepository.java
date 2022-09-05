package ProjectAlkemy.Disney.persistence;

import ProjectAlkemy.Disney.persistence.crud.CategoryCrudRepository;
import ProjectAlkemy.Disney.persistence.entity.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class CategoryRepository {

    @Autowired
    CategoryCrudRepository categoryCrudRepository;

    public Category save(Category category)
        {return categoryCrudRepository.save(category);}

    public Optional<Category> findById(Long idCategory  )
        {return categoryCrudRepository.findById(idCategory);}


}
