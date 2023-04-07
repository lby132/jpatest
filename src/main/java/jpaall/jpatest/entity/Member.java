package jpaall.jpatest.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Embedded
    private Address addresses;

    @OneToMany(mappedBy = "members")
    private List<Order> orders = new ArrayList<>();

}
