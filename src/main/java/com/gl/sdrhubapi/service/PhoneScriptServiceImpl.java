package com.gl.sdrhubapi.service;

import com.gl.sdrhubapi.entity.PhoneScriptEntity;
import com.gl.sdrhubapi.model.PhoneScript;
import com.gl.sdrhubapi.repository.PhoneScriptRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PhoneScriptServiceImpl implements PhoneScriptService{

    private PhoneScriptRepository phoneScriptRepository;

    public PhoneScriptServiceImpl(PhoneScriptRepository phoneScriptRepository) {
        this.phoneScriptRepository = phoneScriptRepository;
    }
    @Override
    public PhoneScript createPhoneScript(PhoneScript phoneScript) {
        PhoneScriptEntity phoneScriptEntity = new PhoneScriptEntity();

        BeanUtils.copyProperties(phoneScript, phoneScriptEntity);
        phoneScriptRepository.save(phoneScriptEntity);
        return phoneScript;
    }

    @Override
    public List<PhoneScript> getAllPhoneScripts() {
        List<PhoneScriptEntity> phoneScriptEntities
                = phoneScriptRepository.findAll();
        List<PhoneScript> phoneScripts = phoneScriptEntities
                .stream()
                .map(phon -> new PhoneScript(phon.getId()
                ,phon.getScriptA(),phon.getScript_a_text(), phon.getHitsA()
                , phon.getMissesA(), phon.getScriptB(), phon.getScript_b_text()
                , phon.getHitsB(), phon.getMissesB()))
                        .collect(Collectors.toList());
        return phoneScripts;
    }
}
