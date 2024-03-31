package com.question.repository;

import com.question.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Questionrepo extends JpaRepository <Question,Long> {


}
