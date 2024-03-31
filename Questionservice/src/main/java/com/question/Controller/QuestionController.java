package com.question.Controller;


import com.question.entity.Question;
import org.springframework.web.bind.annotation.*;
import com.question.service.QuestionService;

import java.util.List;

@RestController
@RequestMapping("/question")
public class QuestionController {
    private QuestionService questionService;

    public QuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }

    @PostMapping
    public Question create(@RequestBody Question question){
        return questionService.create(question);
    }
    @GetMapping
    public List<Question> getall(){
        return questionService.get();
    }
    @GetMapping("/{QuestionId}")
    public Question getone(@PathVariable Long Questionid){
        return questionService.getone(Questionid);
    }

    }
