package com.example.BootcampEj3;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
public interface CocheRepository extends JpaRepository<Coche,Long> {


}
