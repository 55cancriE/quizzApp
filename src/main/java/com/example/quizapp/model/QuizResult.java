package com.example.quizapp.Models;

import javax.persistence.*;

@Entity
public class QuizResult {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int totalQuestionsAnswered;
    
    private int correctAnswers;

    // Getters and Setters
}
