package com.maa.tp_eburtis.repository;

import com.maa.tp_eburtis.model.Personne;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PersonneRepository extends JpaRepository<Personne,Long> {
}
