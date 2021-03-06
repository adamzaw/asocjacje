package com.akadnemia.asocjacja.controller;

import com.akadnemia.asocjacja.dto.TestDto;
import com.akadnemia.asocjacja.dto.mapper.TestMapper;
import com.akadnemia.asocjacja.repository.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/tests")
public class TestController {

    @Autowired
    private TestMapper testMapper;

    @Autowired
    private TestRepository testRepository;


    @GetMapping("/{id}")
    public TestDto sayHello(@PathVariable Long id){
    return testMapper.mapToTestDto(testRepository.findById(id).get());
}
}

