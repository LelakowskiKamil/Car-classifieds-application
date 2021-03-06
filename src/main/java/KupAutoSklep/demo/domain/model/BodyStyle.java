package KupAutoSklep.demo.domain.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "body_style")
public class BodyStyle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "bodyStyle") //nazwa taka jak tabela
    private List<Offer> offers;

    public BodyStyle() {
    }

    public BodyStyle(Integer id, String name, List<Offer> offers) {
        this.id = id;
        this.name = name;
        this.offers = offers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
