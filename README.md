# quizzApp

## Overview

This is a simple quiz application built with Spring Boot that allows users to take quizzes by answering multiple-choice questions.

## Features

- Start a new quiz session.
- Get a random multiple-choice question.
- Submit answers and track performance.
- View total questions answered with details on correct and incorrect submissions.

## API Endpoints

1. **Start a New Quiz Session**
   - **Endpoint**: `POST /api/quiz/start`
   
2. **Get Random Question**
   - **Endpoint**: `GET /api/quiz/question`
   
3. **Submit Answer**
   - **Endpoint**: `POST /api/quiz/submit`
     - **Parameters**:
       - `userAnswer`: The answer submitted by the user.
       - `correctAnswer`: The correct answer for comparison.

4. **Get Results**
   - **Endpoint**: `GET /api/quiz/results`

## Database

The application uses an H2 in-memory database for simplicity, with some seeded questions provided in the `data.sql` file.

## Running the Application

To run the application:
1. Clone the repository.
2. Navigate to the project directory.
3. Use Maven to build and run:
   
```bash
mvn spring-boot:run
