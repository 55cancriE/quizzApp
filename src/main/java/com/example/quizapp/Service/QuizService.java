package com.example.quizapp.Service;

import com.example.quizapp.Model.Question;
import com.example.quizapp.Model.QuizResult;
import com.example.quizapp.Repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class QuizService {
    
    @Autowired
    private QuestionRepository questionRepository;

    private QuizResult quizResult = new QuizResult();

    public void startNewQuiz() {
        quizResult = new QuizResult();
    }

    public Question getRandomQuestion() {
        List<Question> questions = questionRepository.findAll();
        Random random = new Random();
        return questions.get(random.nextInt(questions.size()));
    }

    public void submitAnswer(String userAnswer, String correctAnswer) {
        quizResult.setTotalQuestionsAnswered(quizResult.getTotalQuestionsAnswered() + 1);
        if (userAnswer.equals(correctAnswer)) {
            quizResult.setCorrectAnswers(quizResult.getCorrectAnswers() + 1);
        }
    }

    public QuizResult getQuizResults() {
        return quizResult;
    }
}
