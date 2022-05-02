package Main;

import java.util.ArrayList;
import java.util.Scanner;

public class RunQuiz {
    //design quiz. variables.
    private Scanner scanner = new Scanner(System.in);
    private ArrayList<Question>questions = new ArrayList<>();
    private int numOfQuestionsCorrect = 0;

    //constructor
    public RunQuiz () {

    }

    //add method
    public void addQuestion(Question question) {
        this.questions.add(question);

    }

    public void runQuiz () {
        //for EACH loop to loop through questions
        for (Question question : questions) {
            System.out.println(question.getTheQuestion());

            String usersAnswer = this.getUsersAnswers();

            boolean userGotQuestionCorrect = question.checkAnswer(usersAnswer);

            if(userGotQuestionCorrect) {
                this.numOfQuestionsCorrect++;
            }
        }

        double percentageCorrect = (this.numOfQuestionsCorrect/this.questions.size()) * 100;

    }

    private String getUsersAnswers() {
        String usersAnswer = scanner.nextLine();
        return usersAnswer;

    }





}
