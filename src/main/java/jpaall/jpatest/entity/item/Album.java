package jpaall.jpatest.entity.item;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@DiscriminatorValue("Movie")
public class Album extends Item {

    private String artist;
    private String etc;
}
