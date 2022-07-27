package com.gl.sdrhubapi.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="competitors")
@AllArgsConstructor
@NoArgsConstructor
public class CompetitorEntity {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name="company_name")
    private String company;

    @Column(name="description")
    private String description;

    @Column(name="states")
    private String states;

    @Column(name="our_advantage")
    private String our_advantage;
}
