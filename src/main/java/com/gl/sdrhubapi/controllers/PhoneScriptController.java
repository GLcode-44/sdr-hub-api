package com.gl.sdrhubapi.controllers;

import com.gl.sdrhubapi.model.PhoneScript;
import com.gl.sdrhubapi.service.PhoneScriptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class PhoneScriptController {
    private final PhoneScriptService phoneScriptService;


    public PhoneScriptController(PhoneScriptService phoneScriptService) {
        this.phoneScriptService = phoneScriptService;
    }

    @PostMapping("/phone_script_entity")
    public PhoneScript createPhoneScript(@RequestBody PhoneScript phoneScript) {
        return phoneScriptService.createPhoneScript(phoneScript);
    }

    @GetMapping("/phone_script_entity")
    public List<PhoneScript> getAllPhoneScripts() {
        return phoneScriptService.getAllPhoneScripts();
    }
}
