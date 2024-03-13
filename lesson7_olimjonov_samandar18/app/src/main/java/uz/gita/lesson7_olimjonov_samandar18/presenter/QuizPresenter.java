package uz.gita.lesson7_olimjonov_samandar18.presenter;

import uz.gita.lesson7_olimjonov_samandar18.contract.QuizContract;
import uz.gita.lesson7_olimjonov_samandar18.view.QuizActivity;

public class QuizPresenter implements QuizContract.Presenter {
    private QuizContract.Model model;
    private QuizContract.View view;
    private int pos;
    private int questionCount = 0;
    private int correctAnswers = 0;
    private String answer;

    public QuizPresenter(QuizContract.Model model, QuizContract.View view) {
        this.model = model;
        this.view = view;
        questionCount = model.getSize();
    }

    public int getCorrectAnswers() {
        return correctAnswers;
    }

    public void setCorrectAnswers(int correctAnswers) {
        this.correctAnswers = correctAnswers;
    }

    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }


    @Override
    public void start() {
        correctAnswers = 0;
        pos = 0;
        QuizActivity.state = 1;
        view.setQuestion(model.getQuestionByPosition(pos));
        if (pos == questionCount - 1) {
            view.changeTextNextButton("FINISH");
        } else {
            QuizActivity.state(1);
//            view.changeTextNextButton("CHECK");
        }
    }

    @Override
    public void goNextQuestion(String answer) {
        setAnswer(answer);
        if (model.getQuestionByPosition(pos).answer.equals(answer))
            correctAnswers++;
        if (pos + 1 < questionCount)
            view.setQuestion(model.getQuestionByPosition(++pos));
        else
            view.showFinishDialog(correctAnswers, questionCount);
        if (pos == questionCount - 1)
            view.changeTextNextButton("FINISH");
//        else
//            view.changeTextNextButton("CHECK");
    }

    @Override
    public int getCorrectAnswer(int state, String str) {
        int ans = 0;
        for (int i = 0; i < 4; ++i) {
            if(model.getQuestionByPosition(state).answer.equals(model.getQuestionByPosition(state).variants.get(i)))
                return model.getQuestionByPosition(state).answer.equals(str) ? i : 0;
        }
        return 0;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getAnswer() {
        return answer;
    }
}
