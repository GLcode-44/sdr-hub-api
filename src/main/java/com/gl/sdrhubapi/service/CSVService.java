package com.gl.sdrhubapi.service;

import java.io.IOException;
import java.util.List;

import com.gl.sdrhubapi.entity.LeadEntity;
import com.gl.sdrhubapi.helper.CSVHelper;
import com.gl.sdrhubapi.repository.LeadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class CSVService {
    @Autowired
    LeadRepository repository;
    public void save(MultipartFile file) {
        try {
            List<LeadEntity> leads = CSVHelper.csvToLeads(file.getInputStream());
            repository.saveAll(leads);
        } catch (IOException e) {
            throw new RuntimeException("fail to store csv data: " + e.getMessage());
        }
    }
    public List<LeadEntity> getAllLeads() {
        return repository.findAll();
    }
}