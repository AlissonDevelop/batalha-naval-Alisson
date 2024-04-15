package com.batalhanaval.repository;

import com.batalhanaval.entity.Municao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MunicaoRepository extends JpaRepository<Municao, Long> {
}
