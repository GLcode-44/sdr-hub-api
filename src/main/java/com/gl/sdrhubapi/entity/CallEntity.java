package com.gl.sdrhubapi.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="calls")
@AllArgsConstructor
@NoArgsConstructor
public class CallEntity {

    @Id
    @Column(name="related_to_id")
    private String RelatedToId;

    @Column(name="subject")
    private String subject;

    @Column(name="invitation_body")
    private String invitationBody;

    @Column(name="call_status")
    private String callStatus;

    @Column(name="direction")
    private String direction;

    @Column(name="duration")
    private int duration;

    @Column(name="start_date")
    private String startDate;

}
