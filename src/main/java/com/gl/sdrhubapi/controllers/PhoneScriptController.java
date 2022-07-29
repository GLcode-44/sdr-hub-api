package com.gl.sdrhubapi.controllers;

import com.gl.sdrhubapi.model.PhoneScript;
import com.gl.sdrhubapi.service.PhoneScriptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    @DeleteMapping("/phone_script_entity/{id}")
    public ResponseEntity<Map<String, Boolean>> deletePhoneScript(@PathVariable Long id) {
        boolean deleted = false;
        deleted = phoneScriptService.deletePhoneScript(id);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", deleted);
        return ResponseEntity.ok(response);
    }
    @GetMapping("/phone_script_entity/{id}")
    public ResponseEntity<PhoneScript> getPhoneScriptById(@PathVariable Long id) {
        PhoneScript phoneScript = null;
        phoneScript = phoneScriptService.getPhoneScriptById(id);
        return ResponseEntity.ok(phoneScript);
    }
    @PutMapping("/phone_script_entity/{id}")
    public ResponseEntity<PhoneScript> updatePhoneScript(@PathVariable Long id,
                                                         @RequestBody PhoneScript phoneScript) {
        phoneScript = phoneScriptService.updatePhoneScript(id, phoneScript);
        return ResponseEntity.ok(phoneScript);
    }
}
