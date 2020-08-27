package com.example.catjdbc.repository;

import com.example.catjdbc.model.Cat;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CatRepository extends JpaRepository<Cat, Long> {

    List<Cat> findAllByAgeGreaterThan(Long minAge);

}
