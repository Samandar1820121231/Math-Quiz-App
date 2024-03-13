package uz.gita.lesson7_olimjonov_samandar18.contract;

import uz.gita.lesson7_olimjonov_samandar18.data.QuestionModel;

public interface QuizContract {

    interface Model {
        void initType1Questions();
        void init_easy();
        void init_medium();
        void init_hard();
        void init_olympiad();
        void init_easy_english();
        void init_medium_english();
        void init_hard_english();
        void init_olympiad_english();
        QuestionModel getQuestionByPosition(int index);
        int getSize();
    }

    interface View {
        void loadViews();
        void setQuestion(QuestionModel question);
        void changeTextNextButton(String name);
        void showFinishDialog(int correctAnswers, int totalAnswers);
    }

    interface Presenter {
        void start();
        void goNextQuestion(String answer);

        int getCorrectAnswer(int state, String str);
    }

}
