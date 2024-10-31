package com.koreait.homework_10.controller;

import com.koreait.homework_10.repository.QuestionRepository;
import com.koreait.homework_10.vo.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/questions")
public class QuestionController {

    @Autowired
    private QuestionRepository questionRepository;

    @GetMapping
    public List<Question> getAllQuestions() {
        return questionRepository.findAll();
    }

    @GetMapping("/search")
    public List<Question> searchQuestions(@RequestParam String query) {
        return questionRepository.findByTextContaining(query);
    }
}
