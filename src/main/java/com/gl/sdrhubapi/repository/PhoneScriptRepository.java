package com.gl.sdrhubapi.repository;

import com.gl.sdrhubapi.entity.PhoneScriptEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhoneScriptRepository extends JpaRepository<PhoneScriptEntity, Long> {
}
