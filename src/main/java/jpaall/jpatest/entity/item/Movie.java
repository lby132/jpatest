package jpaall.jpatest.entity.item;

import javax.persistence.*;

@Entity
@DiscriminatorValue("Movie")
public class Movie extends Item {

    private String actor;
    private String director;
}
