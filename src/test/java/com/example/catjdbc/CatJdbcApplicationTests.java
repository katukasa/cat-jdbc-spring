package com.example.catjdbc;

import com.example.catjdbc.model.Cat;
import com.example.catjdbc.repository.CatRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Sort;

import javax.transaction.Transactional;
import java.util.List;

@SpringBootTest
@Transactional
class CatJdbcApplicationTests {

    @Autowired
    CatRepository catRepository;


    @Test
    void contextLoads() {
        Cat one = catRepository.getOne(1L);
        List<Cat> all = catRepository.findAllByAgeGreaterThan(20L);
        Assertions.assertEquals("Mara",one.getName());
        Assertions.assertEquals(1, all.size());
    }

}
