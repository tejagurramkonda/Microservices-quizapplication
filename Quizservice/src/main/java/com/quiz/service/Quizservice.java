package com.quiz.service;

import com.quiz.entites.Quiz;

import java.util.List;

public interface Quizservice {
    Quiz add(Quiz quiz);
    List<Quiz> get();
    Quiz get(Long id);


}
