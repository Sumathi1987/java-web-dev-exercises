package org.launchcode.java.FunwithQuizzes;

//import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class QuizRunner {

    public static void main(String[] args) {
        Quiz myQuiz = new Quiz(new ArrayList<>());
        ArrayList<String> possAns1 = new ArrayList<>(Arrays.asList("go dog go", "duck duck goose", "meatballs", "bee"));
        ArrayList<Integer> correctAns1 = new ArrayList<>(Arrays.asList(2,3));
        Checkbox newQuestion1 = new Checkbox(2, "Which is the best movie?", possAns1, correctAns1);
        myQuiz.addQuestion(newQuestion1);
        ArrayList<String> possAns2 = new ArrayList<>(Arrays.asList("vijay", "Ajith", "Rajini", " surya", " vikram"));
        MultipleChoice newQuestion2 = new MultipleChoice(1, "Who is the best actor?", 3, possAns2);
        myQuiz.addQuestion(newQuestion2);
        TrueOrFalse newQuestion3 = new TrueOrFalse(1, "Are all actors earn well?", true);
        myQuiz.addQuestion(newQuestion3);

        myQuiz.runQuiz();

        myQuiz.gradeQuiz();
    }
}

