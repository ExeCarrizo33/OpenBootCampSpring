package com.example.obspringdata;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CocheRepository extends JpaRepository<Coche, Long> {

}

