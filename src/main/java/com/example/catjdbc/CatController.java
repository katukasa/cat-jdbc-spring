package com.example.catjdbc;

import com.example.catjdbc.model.Cat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CatController {

    private CatService catService;

    public CatController(CatService catService) {
        this.catService = catService;
    }

    @GetMapping("/")
    public Cat registerCat(@RequestParam String name){

        return catService.registerNewBornKitten(name);

    }



}
