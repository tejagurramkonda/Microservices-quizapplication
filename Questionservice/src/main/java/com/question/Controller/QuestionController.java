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
    @GetMapping("/{questionId}")
    public Question getone(@PathVariable Long questionId){
        return questionService.getone(questionId);
    }
    @GetMapping("/quiz/{quizId}")

    public  List <Question> getQuestionofQuizId(@PathVariable Long quizId){
        return  questionService.getQuestionofQuizId(quizId);

    }

    }

