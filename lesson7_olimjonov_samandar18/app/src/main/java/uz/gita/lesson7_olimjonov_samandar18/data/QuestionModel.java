package uz.gita.lesson7_olimjonov_samandar18.data;

import java.util.ArrayList;

public class QuestionModel {
    public String question;
    public ArrayList<String> variants;
    public String answer;

    public QuestionModel(String question, ArrayList<String> variants, String answer) {
        this.question = question;
        this.variants = variants;
        this.answer = answer;
    }

}
