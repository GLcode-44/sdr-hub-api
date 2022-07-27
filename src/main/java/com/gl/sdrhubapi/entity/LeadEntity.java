package com.gl.sdrhubapi.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="leads")
@AllArgsConstructor
@NoArgsConstructor
public class LeadEntity {

    @Id
    @Column(name = "id")
    private String id;
    @Column(name = "first_name")
    private String first_name;
    @Column(name = "last_name")
    private String last_name;

    @Column(name = "title")
    private String title;

    @Column(name = "company")
    private String account_name;

    @Column(name = "description")
    private String description;

    @Column(name = "phone")
    private String phone_number;

    @Column(name = "state")
    private String primary_address_state;

    @Column(name = "email")
    private String email;

    @Column(name = "lead_source")
    private String leadSource;

    @Column(name = "website")
    private String website;

    @Column(name= "class_")
    private String class_;

    @Column(name= "class_type")
    private String classType;

    @Column(name= "status")
    private String status;

    @Column(name= "tags")
    private String tags;

    @Column(name= "lead_disqualification_reason")
    private String lead_disqualification_reason;

    @Column(name= "lead_source_description")
    private String lead_source_description;

    @Column(name="call_count")
    private int call_count;

    @Column(name="email_count")
    private int email_count;

    @Column(name="total_contacts")
    private int total_contacts;

}




