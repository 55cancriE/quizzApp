package com.example.quizapp.controller;

import com.example.quizapp.Models.Questions;
import com.example.quizapp.Models.QuizResult;
import com.example.quizapp.Service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/quiz")
public class QuizController {

    @Autowired
    private QuizService quizService;

    @PostMapping("/start")
    public void startQuiz() {
        quizService.startNewQuiz();
    }

    @GetMapping("/question")
    public Question getRandomQuestion() {
        return quizService.getRandomQuestion();
    }

    @PostMapping("/submit")
    public void submitAnswer(@RequestParam String userAnswer, @RequestParam String correctAnswer) {
        quizService.submitAnswer(userAnswer, correctAnswer);
    }

    @GetMapping("/results")
    public QuizResult getResults() {
        return quizService.getQuizResults();
    }
}
