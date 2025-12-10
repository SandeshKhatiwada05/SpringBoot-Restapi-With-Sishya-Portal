package com.sandesh.RESTAPIsSpringBoot.repository;

import com.sandesh.RESTAPIsSpringBoot.entity.Sishya;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SishyaRepository extends JpaRepository<Sishya, Long> {
}
