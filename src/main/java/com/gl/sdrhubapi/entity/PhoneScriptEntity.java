package com.gl.sdrhubapi.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name="phone_script_entity")
public class PhoneScriptEntity {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name="phone_script_a")
    private String scriptA;

    @Column(name="script_a_text")
    private String script_a_text;

    @Column(name="hits_a")
    private int hitsA;

    @Column(name="misses_a")
    private int missesA;

    @Column(name="phone_script_b")
    private String scriptB;

    @Column(name="script_b_text")
    private String script_b_text;

    @Column(name="hits_b")
    private int hitsB;

    @Column(name="misses_b")
    private int missesB;
}
