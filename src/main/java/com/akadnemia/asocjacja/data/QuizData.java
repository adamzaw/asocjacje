package com.akadnemia.asocjacja.data;

import com.akadnemia.asocjacja.model.quiz.Answer;
import com.akadnemia.asocjacja.model.quiz.Question;
import com.akadnemia.asocjacja.model.quiz.Test;
import com.akadnemia.asocjacja.repository.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class QuizData implements CommandLineRunner {

    @Autowired
    TestRepository testRepository;

    @Override
    public void run(String... args) throws Exception {


        Test test = new Test("About everything");
        Question question = new Question("What is The Capital of Poland");
        question.addAnswer(new Answer("Warsaw",true));
        question.addAnswer(new Answer("Mumbai",false));
        question.addAnswer(new Answer("Kolkatta",false));
        Question question2 = new Question("Who is CEO of Tesla Motors?");
        question2.addAnswer(new Answer("Bill Gates",false));
        question2.addAnswer(new Answer("Steve Jobs",false));
        question2.addAnswer(new Answer("Elon Musk",true));
        Question question3 = new Question("Name World's Richest Man?");
        question3.addAnswer(new Answer("Jeff Bazo",false));
        question3.addAnswer(new Answer("Bill Gates",false));
        question3.addAnswer(new Answer("Mark Zuckenberg",true));


        test.addQuestion(question);
        test.addQuestion(question2);
        test.addQuestion(question3);


        testRepository.save(test);

    }
}
