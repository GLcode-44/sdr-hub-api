package com.gl.sdrhubapi.service;

import com.gl.sdrhubapi.model.PhoneScript;

import java.util.List;

public interface PhoneScriptService {
    PhoneScript createPhoneScript(PhoneScript phoneScript);

    List<PhoneScript> getAllPhoneScripts();

    boolean deletePhoneScript(Long id);

    PhoneScript getPhoneScriptById(Long id);

    PhoneScript updatePhoneScript(Long id, PhoneScript phoneScript);
}
