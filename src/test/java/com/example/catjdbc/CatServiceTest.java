package com.example.catjdbc;

import com.example.catjdbc.model.Cat;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
class CatServiceTest {

    @Autowired
    CatService catService;

    @Test
    void registerNewBornKitten() {

        Cat luchik = catService.registerNewBornKitten("Moses");
        Assertions.assertNotNull(luchik);

        Cat onceAgain = catService.getById(luchik.getId());
        Assertions.assertNotNull(onceAgain);

    }
}