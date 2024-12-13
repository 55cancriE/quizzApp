package com.example.quizapp.Models;

import javax.persistence.*;

@Entity
public class Questions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String questionText;
    
    private String optionA;
    
    private String optionB;
    
    private String optionC;
    
    private String optionD;

    private String correctAnswer;

    // Getters and Setters
}
