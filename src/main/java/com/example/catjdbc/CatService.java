package com.example.catjdbc;

import com.example.catjdbc.model.Cat;
import com.example.catjdbc.repository.CatRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CatService {

    private CatRepository catRepository;

    public CatService(CatRepository catRepository) {
        this.catRepository = catRepository;
    }

    public Cat registerNewBornKitten(String name){
        Cat cat = new Cat();
        cat.setAge(0L);
        cat.setName(name);
        return catRepository.save(cat);
    }

    public Cat getById(Long id){
        return catRepository.getOne(id);

    }


}
