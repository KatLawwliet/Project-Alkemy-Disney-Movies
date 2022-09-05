package ProjectAlkemy.Disney.persistence.entity;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name = "category")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_category")
    private Long idCategory;


    @Column(name = "name")
    private String name;

    @Column(name = "image")
    private String image;

    @OneToMany(mappedBy = "category")
    private List<MovieSerie> movieSeries;

    //Getters and Setters

    public Long getIdCategory() {return idCategory;}
    public void setIdCategory(Long idCategory) {this.idCategory = idCategory;}


    public String getName() {return name;}
    public void setName(String name) {this.name = name;}


    public String getImage() {return image;}
    public void setImage(String image) {this.image = image;}


    public List<MovieSerie> getMovieSeries() {return movieSeries;}
    public void setMovieSeries(List<MovieSerie> movieSeries) {this.movieSeries = movieSeries;}
}
