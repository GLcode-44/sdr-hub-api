package com.gl.sdrhubapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PhoneScript {

    private long id;

    private String scriptA;

    private String script_a_text;

    private int hitsA;

    private int missesA;

    private String scriptB;

    private String script_b_text;

    private int hitsB;

    private int missesB;
}
