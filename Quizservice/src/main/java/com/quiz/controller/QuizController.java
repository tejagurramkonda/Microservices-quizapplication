package com.quiz.controller;

import com.quiz.entites.Quiz;
import com.quiz.service.Quizservice;
import jakarta.persistence.Id;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quiz")
public class QuizController {
    private Quizservice quizservice;

    public QuizController(Quizservice quizservice) {
        this.quizservice = quizservice;
    }
    @PostMapping

    public Quiz create(@RequestBody Quiz quiz){
        return quizservice.add(quiz);
    }
    @GetMapping
    public List<Quiz> getall( ){
        return quizservice.get();
    }
    @GetMapping("/{id}")
    public Quiz getone(@PathVariable Long id){
        return  quizservice.get(id);
    }

}
