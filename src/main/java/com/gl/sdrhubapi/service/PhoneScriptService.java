package com.gl.sdrhubapi.service;

import com.gl.sdrhubapi.model.PhoneScript;

import java.util.List;

public interface PhoneScriptService {
    PhoneScript createPhoneScript(PhoneScript phoneScript);

    List<PhoneScript> getAllPhoneScripts();
}
