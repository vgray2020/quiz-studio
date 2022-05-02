package Main;

public abstract class Question {
    //CLASS VARIABLES
    private final String theQuestion;
    private final String theAnswer;

    //CONSTRUCTOR
    public Question(String question, String answer) {
        this.theQuestion = question;
        this.theAnswer = answer;
    }

    //GETTERS (no setters. don't want others to change. put FINAL above)
    public String getTheQuestion() {
        return theQuestion;
    }

    public String getTheAnswer() {
        return theAnswer;
    }

    //OTHER METHODS
    public abstract boolean checkAnswer(String answer);

}
