package com.gl.sdrhubapi.repository;

import com.gl.sdrhubapi.entity.LeadEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LeadRepository extends JpaRepository<LeadEntity, Long> {
}
