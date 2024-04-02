package com.question.service;

import com.question.entity.Question;
import org.springframework.stereotype.Service;
import com.question.repository.Questionrepo;
import com.question.service.QuestionService;

import java.util.List;
@Service

public class QuestionServiceImpl implements QuestionService {
    private  Questionrepo questionrepo;

    public QuestionServiceImpl(Questionrepo questionrepo) {
        this.questionrepo = questionrepo;
    }



    @Override
    public Question create(Question question) {
        return questionrepo.save(question);
    }

    @Override
    public List<Question> get() {
        return questionrepo.findAll();
    }

    @Override
    public Question getone(Long QuestionId) {
        return questionrepo.findById( QuestionId).orElseThrow(()->new RuntimeException("No questionfound"));
    }

    @Override
    public List<Question> getQuestionofQuizId(Long quizId) {
        return questionrepo.findByQuizId(quizId);
    }

}