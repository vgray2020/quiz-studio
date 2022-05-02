package Main;

public class QuizRunnerMain {
    public static void main(String[] args) {
        RunQuiz myQuiz = new RunQuiz();

        MultipleChoiceQuestion myMultipleChoiceQuestion = new MultipleChoiceQuestion
                ( "What season is it?\nA: Spring \nB: Summer\nPlease enter A or B","A" );
        myQuiz.addQuestion(myMultipleChoiceQuestion);

        CheckBox myCheckboxQuestion = new CheckBox("Select all that apply. Which is a dog?\nA: Lab \nB: Golfer\nC: Fish", "A" );
        myQuiz.addQuestion(myCheckboxQuestion);

        TrueFalse myTrueFalseQuestion = new TrueFalse("Dogs eat meat?\n True or False?", "True" );
        myQuiz.addQuestion(myTrueFalseQuestion);

       myQuiz.runQuiz();





    }
}
