package com.quiz.impl;

import com.quiz.entites.Quiz;
import com.quiz.repository.Quizrepo;
import com.quiz.service.Quizservice;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class QuizServiceimpl implements Quizservice {
    private Quizrepo quizrepo;

    public QuizServiceimpl(Quizrepo quizrepo) {
        this.quizrepo = quizrepo;
    }

    @Override
    public Quiz add(Quiz quiz) {
        return quizrepo.save(quiz);
    }

    @Override
    public List<Quiz> get() {
        return quizrepo.findAll();
    }

    @Override
    public Quiz get(Long id) {
        return quizrepo.findById(id).orElseThrow(()-> new RuntimeException("Quiz not found "));
    }
}
