package jpaall.jpatest.entity.item;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@DiscriminatorValue("Movie")
public class Book extends Item {

    private String author;
    private String isbn;
}
