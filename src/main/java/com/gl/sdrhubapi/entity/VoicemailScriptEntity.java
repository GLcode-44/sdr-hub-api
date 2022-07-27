package com.gl.sdrhubapi.entity;

import javax.persistence.*;

@Entity
@Table(name="voicemail_scripts")
public class VoicemailScriptEntity {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name="voicemail_script_a")
    private String scriptA;

    @Column(name="voicemail_script_b")
    private String scriptB;
}
