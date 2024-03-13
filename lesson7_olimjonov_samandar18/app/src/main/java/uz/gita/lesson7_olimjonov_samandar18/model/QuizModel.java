package uz.gita.lesson7_olimjonov_samandar18.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import uz.gita.lesson7_olimjonov_samandar18.contract.QuizContract;
import uz.gita.lesson7_olimjonov_samandar18.data.QuestionModel;

public class QuizModel implements QuizContract.Model {
    List<QuestionModel> questions;

    @Override
    public void initType1Questions() {
        List<QuestionModel> questions = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            ArrayList<String> variants = new ArrayList<>();
            for (int j = 0; j < 4; j++) {
                variants.add("Variant: " + (char) (65 + j));
            }
            Collections.shuffle(variants);
            questions.add(new QuestionModel("Quesiton: " + (i + 1), variants, "Variant: A"));
            this.questions = questions;
        }
    }

    @Override
    public void init_easy() {
        List<QuestionModel> questionModels = new ArrayList<>();
        ArrayList<String> variants = new ArrayList<>();
        variants.add("5050");
        variants.add("5100");
        variants.add("5550");
        variants.add("5555");
        questionModels.add(new QuestionModel("1 + 2 + ... + 100 = ?", variants, "5050"));
        variants = new ArrayList<>();
        variants.add("2");
        variants.add("3");
        variants.add("4");
        variants.add("5");
        questionModels.add(new QuestionModel("Calculate the number of divisors of 131", variants, "2"));
        variants = new ArrayList<>();
        variants.add("115");
        variants.add("120");
        variants.add("125");
        variants.add("130");
        questionModels.add(new QuestionModel("Calculate the sum of divisors of 56", variants, "120"));
        variants = new ArrayList<>();
        variants.add("2");
        variants.add("3");
        variants.add("4");
        variants.add("5");
        questionModels.add(new QuestionModel("Find the smallest odd even number", variants, "3"));
        variants = new ArrayList<>();
        variants.add("15");
        variants.add("16");
        variants.add("17");
        variants.add("18");
        questionModels.add(new QuestionModel("If a is rational and b is irrational and we have a + b = 17 What is the value of a - b ?", variants, "17"));
        variants = new ArrayList<>();
        variants.add("1");
        variants.add("2");
        variants.add("3");
        variants.add("4");
        questionModels.add(new QuestionModel("61231 * 61232 - 61230 * 61233 = ?", variants, "2"));
        variants = new ArrayList<>();
        variants.add("7.0");
        variants.add("7.1");
        variants.add("7.2");
        variants.add("7.3");
        questionModels.add(new QuestionModel("ax = by = cz va x + y + z = 49.7 bo'lsa, (1 / a) + (1 / b) + (1 / c) = ?", variants, "7.1"));
        variants = new ArrayList<>();
        variants.add("1");
        variants.add("2");
        variants.add("3");
        variants.add("4");
        questionModels.add(new QuestionModel("(a.aa + b.bb + c.cc) / (a.bc + b.ca + c.ab) = ?", variants, "1"));
        variants = new ArrayList<>();
        variants.add("120");
        variants.add("130");
        variants.add("140");
        variants.add("150");
        questionModels.add(new QuestionModel("lcd(120,600) = ?", variants, "120"));
        variants = new ArrayList<>();
        variants.add("338320");
        variants.add("338330");
        variants.add("338340");
        variants.add("338350");
        questionModels.add(new QuestionModel("1 * 1 + 2 * 2 + 3 * 3 + ... + 100 * 100 = ?", variants, "338350"));
        variants = new ArrayList<>();
        this.questions = questionModels;
    }

    @Override
    public void init_medium() {
        List<QuestionModel> questionModels = new ArrayList<>();
        ArrayList<String> variants = new ArrayList<>();
        variants.add("1");
        variants.add("2");
        variants.add("3");
        variants.add("4");
        questionModels.add(new QuestionModel("what's the last digit of 0! + 1! + 2! + ... + 300!", variants, "4"));
        variants = new ArrayList<>();
        variants.add("-125");
        variants.add("63");
        variants.add("-62");
        variants.add("-63");
        questionModels.add(new QuestionModel("1 - 2 + 3 - 4 + 5 - 6 + ... - 124 + 125", variants, "63"));
        variants = new ArrayList<>();
        variants.add("23");
        variants.add("24");
        variants.add("25");
        variants.add("26");
        questionModels.add(new QuestionModel("How many zeros at the end of 100!", variants, "24"));
        variants = new ArrayList<>();
        variants.add("0.6");
        variants.add("0.7");
        variants.add("0.8");
        variants.add("1.0");
        questionModels.add(new QuestionModel("Find the smallest distance from the point A(-1,2) to the line 3x + 4y - 2 = 0 ?", variants, "0.6"));
        variants = new ArrayList<>();
        variants.add("30");
        variants.add("45");
        variants.add("60");
        variants.add("90");
        questionModels.add(new QuestionModel("What's the small angle between the lines y = 2x - 4 and y = -3x + 1 ?", variants, "45"));
        variants = new ArrayList<>();
        variants.add("1");
        variants.add("2");
        variants.add("3");
        variants.add("4");
        questionModels.add(new QuestionModel("What's the sum of roots of  |1 − |1 − x|| = 0.5 ?", variants, "4"));
        variants = new ArrayList<>();
        variants.add("18");
        variants.add("19");
        variants.add("20");
        variants.add("21");
        questionModels.add(new QuestionModel("What's the sum of integer roots of the inequality |x - 2| < 5 ?", variants, "18"));
        variants = new ArrayList<>();
        variants.add("1");
        variants.add("2");
        variants.add("3");
        variants.add("4");
        questionModels.add(new QuestionModel("Solve the equaltion (x + 1) + (x + 4) + (x + 7) + · · · + (x + 28) = 155", variants, "1"));
        variants = new ArrayList<>();
        variants.add("cos(x)");
        variants.add("tan(x)");
        variants.add("cot(x)");
        variants.add("sin(x)");
        questionModels.add(new QuestionModel("What's the derivative of sin(x)", variants, "cos(x)"));
        variants = new ArrayList<>();
        variants.add("1 / 2");
        variants.add("1 / 3");
        variants.add("1 / 4");
        variants.add("1 / 5");
        questionModels.add(new QuestionModel("If a > 0 and b > 0 and a + b = 1.What is the maximum value of a * b ?", variants, "1 / 2"));
        variants = new ArrayList<>();
        this.questions = questionModels;
    }

    @Override
    public void init_hard() {
        List<QuestionModel> questionModels = new ArrayList<>();
        ArrayList<String> variants = new ArrayList<>();
        variants.add("4");
        variants.add("5");
        variants.add("6");
        variants.add("7");
        questionModels.add(new QuestionModel("What's the minimum value of  a*a+b*b+2ab-2a-2b+7 ?", variants, "6"));
        variants = new ArrayList<>();
        variants.add("-2");
        variants.add("-3");
        variants.add("-4");
        variants.add("-5");
        questionModels.add(new QuestionModel("if a,b,c is the root of equation x^3 - x + 1 = 0 What is the value of (1 / (a + 1)) + (1 / (b + 1)) + (1 / (c + 1)) ?", variants, "-2"));
        variants = new ArrayList<>();
        variants.add("1 / 3");
        variants.add("1 / 4");
        variants.add("1 / 5");
        variants.add("1 / 6");
        questionModels.add(new QuestionModel("(1 / (3 * 4)) + ((1 * 2) / (3 * 4 * 5)) + ((1 * 2 * 3) / (3 * 4 * 5 * 6)) + ... + ... = ?", variants, "1 / 6"));
        variants = new ArrayList<>();
        variants.add("-1");
        variants.add("-25");
        variants.add("-16");
        variants.add("16");
        questionModels.add(new QuestionModel("Let y = ax + b and y = cx + d be two tangent lines to the curve f(x) = x^2 + 4 passing through the origin.Find the value of a*c ?", variants, "-16"));
        variants = new ArrayList<>();
        variants.add("225");
        variants.add("250");
        variants.add("325");
        variants.add("350");
        questionModels.add(new QuestionModel("How many 3 digit natural numbers are such that each digit is either all digits are odd or all digits are even ?", variants, "225"));
        variants = new ArrayList<>();
        variants.add("1");
        variants.add("3 / 2");
        variants.add("2");
        variants.add("5 / 2");
        questionModels.add(new QuestionModel("If the tangent line to the curve y = x^3 - 2x^2 + 2 at the point (1,1) passes through (0,a),find the value of a.", variants, "2"));
        variants = new ArrayList<>();
        variants.add("3");
        variants.add("5");
        variants.add("7");
        variants.add("9");
        questionModels.add(new QuestionModel("Find the largest real number k such that f(x) = -x^3 + kx^2 -3kx + 1 decreases ?", variants, "9"));
        variants = new ArrayList<>();
        variants.add("6 / 5");
        variants.add("5 / 4");
        variants.add("4 / 3");
        variants.add("3 / 2");
        questionModels.add(new QuestionModel("Find the area of the region that is enclosed by the curves y = 2x and y = x^2.", variants, "4 / 3"));
        variants = new ArrayList<>();
        variants.add("9");
        variants.add("2x - 18");
        variants.add("9 - 2x");
        variants.add("2x");
        questionModels.add(new QuestionModel("Let 2^x = 2022.Simplify the following: |x - 9| + 2|x - 10| + |x - 11|", variants, "2x - 18"));
        variants = new ArrayList<>();
        variants.add("1 / 4");
        variants.add("1 / 5");
        variants.add("1 / 6");
        variants.add("1 / 7");
        questionModels.add(new QuestionModel("Suppose that a + b + c + d = 1 and a,b,c,d >= 0.Find the maximum value of ab + bc + cd + da", variants, "1 / 4"));
        variants = new ArrayList<>();
        this.questions = questionModels;
    }

    @Override
    public void init_olympiad() {
        List<QuestionModel> questionModels = new ArrayList<>();
        ArrayList<String> variants = new ArrayList<>();
        variants.add("8 / 3");
        variants.add("16 / 3");
        variants.add("32 / 3");
        variants.add("104 / 105");
        questionModels.add(new QuestionModel("Find the volume bounded by the graphs y = x^2, y = 2 - x^2, z = 0, z = y + 3.", variants, "32 / 3"));
        variants = new ArrayList<>();
        variants.add("1 / (4e)");
        variants.add("1 / (2e)");
        variants.add("e^4 / 4");
        variants.add("4e");
        questionModels.add(new QuestionModel("Find the value of c in which the equation ln(x) = c * x^4 has exactly one solution", variants, "1 / (4e)"));
        variants = new ArrayList<>();
        variants.add("[1,(2)]");
        variants.add("[1,(5 / 3)]");
        variants.add("[1,(4 / 3)]");
        variants.add("[1,(3 / 2)");
        questionModels.add(new QuestionModel("Solve the equation:\n[x]+[2x]+[3x]=6", variants, "[1,(4 / 3)]"));
        variants = new ArrayList<>();
        variants.add("1.5");
        variants.add("sqrt(6)");
        variants.add("2.5");
        variants.add("sqrt(5)");
        questionModels.add(new QuestionModel("For angles a,b,c following is true\nsin(a) + sin(b) + sin(c) >= 2\nWhat's the maximum value of\ncos(a) + cos(b) + cos(c) ", variants, "sqrt(5)"));
        variants = new ArrayList<>();
        variants.add("1");
        variants.add("2");
        variants.add("3");
        variants.add("4");
        questionModels.add(new QuestionModel("If the equation x^2 + ax + b = 0 has\ntwo roots,how many roots the equation\nx^4 + ax^3 + (b - 2)x^2 - ax + 1 = 0 has ?", variants, "4"));
        variants = new ArrayList<>();
        variants.add("880");
        variants.add("890");
        variants.add("990");
        variants.add("980");
        questionModels.add(new QuestionModel("If n^3 + 100 is divisible by n + 10\nWhat's the maximum natural value of n ?", variants, "890"));
        variants = new ArrayList<>();
        variants.add("480");
        variants.add("420");
        variants.add("450");
        variants.add("540");
        questionModels.add(new QuestionModel("Find the area bounded by the grapth\n|x - 60| + |y| = |x / 4|", variants, "480"));
        variants = new ArrayList<>();
        variants.add("100");
        variants.add("90");
        variants.add("80");
        variants.add("120");
        questionModels.add(new QuestionModel("If (a,b,c,d) is a pair of natural numbers,\n1<=a<b<c<d<=10 and a+d>b+c is true.\nHow many pairs of (a,b,c,d) exist ?", variants, "80"));
        variants = new ArrayList<>();
        variants.add("3324");
        variants.add("3328");
        variants.add("2401");
        variants.add("3428");
        questionModels.add(new QuestionModel("If a,b,c,d>=-1 and a+b+c+d=4.\nWhat's the maximum value of \n(a^2 + 3)(b^2 + 3)(c^2 + 3)(d^2 + 3)", variants, "3328"));
        variants = new ArrayList<>();
        variants.add("(137 * pi^4) / 128");
        variants.add("(69 * pi^4) / 64");
        variants.add("(37 * pi^4) / 32");
        variants.add("(141 * pi^4) / 128");
        questionModels.add(new QuestionModel("What's the sum of max and min value of\ny = (arcsin(x))^4 + (arccos(x))^4 ?", variants, "(137 * pi^4) / 128"));
        variants = new ArrayList<>();
        this.questions = questionModels;
    }

    @Override
    public void init_easy_english() {
        List<QuestionModel> questionModels = new ArrayList<>();
        ArrayList<String> variants = new ArrayList<>();
        variants.add("Identify the correct sentence:");
        variants.add("He don't like coffee.");
        variants.add("He doesn't like coffee.");
        variants.add("He not likes coffee.");
        variants.add("He isn't like coffee.");
        questionModels.add(new QuestionModel("Identify the correct sentence:", variants, "He doesn't like coffee."));
        variants = new ArrayList<>();
        variants.add("Sad");
        variants.add("Joyful");
        variants.add("Angry");
        variants.add("Tired");
        questionModels.add(new QuestionModel("Choose the synonym for \"happy\":", variants, "Joyful"));
        variants = new ArrayList<>();
        variants.add("Childs");
        variants.add("Childes");
        variants.add("Children");
        variants.add("Childies");
        questionModels.add(new QuestionModel("What's the plural form of the child?", variants, "Children"));
        variants = new ArrayList<>();
        variants.add("Quick");
        variants.add("Slow");
        variants.add("Rapid");
        variants.add("Swift");
        questionModels.add(new QuestionModel("Identify the antonym for fast:", variants, "Slow"));
        variants = new ArrayList<>();
        variants.add("Jump");
        variants.add("On");
        variants.add("Happy");
        variants.add("Quickly");
        questionModels.add(new QuestionModel("Which of the following is preposition?", variants, "On"));
        variants = new ArrayList<>();
        variants.add("Go");
        variants.add("Goes");
        variants.add("Going");
        variants.add("Gone");
        questionModels.add(new QuestionModel("Choose the correct form of the verb to complete the sentence:\n" +
                "she ____ to the store every day", variants, "Goes"));
        variants = new ArrayList<>();
        variants.add("Runned");
        variants.add("Ran");
        variants.add("Running");
        variants.add("Runned");
        questionModels.add(new QuestionModel("What is the past tense of the run?", variants, "Ran"));
        variants = new ArrayList<>();
        variants.add("And");
        variants.add("But");
        variants.add("Or");
        variants.add("So");
        questionModels.add(new QuestionModel("Select the appropriate conjunction to complete the sentence:\n" +
                "she likes tea, _____ she doesn't drink coffee", variants, "But"));
        variants = new ArrayList<>();
        variants.add("Cat");
        variants.add("Quickly");
        variants.add("Climbed");
        variants.add("Tree");
        questionModels.add(new QuestionModel("Identify the adverb in the sentence:\n" +
                "the cat quickly climbed the tree.", variants, "Quickly"));
        variants = new ArrayList<>();
        variants.add("Mouses");
        variants.add("Mice");
        variants.add("Micees");
        variants.add("Mousen");
        questionModels.add(new QuestionModel("What is the plural of mouse?", variants, "Mice"));
        this.questions = questionModels;
    }

    @Override

    public void init_medium_english() {
        List<QuestionModel> questionModels = new ArrayList<>();
        ArrayList<String> variants = new ArrayList<>();

        variants.add("Correct the sentence: \"The team plays good in every match.\"");
        variants.add("The team plays good in every match.");
        variants.add("The team plays well in every match.");
        variants.add("The team plays goodly in every match.");
        variants.add("The team plays good at every match.");
        questionModels.add(new QuestionModel("Correct the sentence:", variants, "The team plays well in every match."));

        variants = new ArrayList<>();
        variants.add("Choose the correct word to complete the sentence: \"His success is a result of hard work and _____.\"");
        variants.add("Dedication");
        variants.add("Destiny");
        variants.add("Fortunate");
        variants.add("Coincidence");
        questionModels.add(new QuestionModel("Complete the sentence:", variants, "Dedication"));

        variants = new ArrayList<>();
        variants.add("Identify the correct tense of the verb in the sentence: \"She will have completed her project by tomorrow.\"");
        variants.add("Present Continuous");
        variants.add("Future Perfect");
        variants.add("Past Simple");
        variants.add("Present Perfect");
        questionModels.add(new QuestionModel("Identify the tense:", variants, "Future Perfect"));

        variants = new ArrayList<>();
        variants.add("Choose the appropriate conjunction to complete the sentence: \"He was tired _____ he continued working.\"");
        variants.add("Although");
        variants.add("Because");
        variants.add("But");
        variants.add("So");
        questionModels.add(new QuestionModel("Complete the sentence:", variants, "but"));

        variants = new ArrayList<>();
        variants.add("Identify the correct form of the adjective: \"The movie was ____, and we enjoyed it a lot.\"");
        variants.add("Interested");
        variants.add("Interesting");
        variants.add("Interestingly");
        variants.add("Interestful");
        questionModels.add(new QuestionModel("Identify the adjective form:", variants, "Interesting"));

        variants = new ArrayList<>();
        variants.add("Choose the correct preposition: \"He is allergic _____ cats.\"");
        variants.add("to");
        variants.add("with");
        variants.add("on");
        variants.add("at");
        questionModels.add(new QuestionModel("Complete the sentence:", variants, "to"));

        variants = new ArrayList<>();
        variants.add("Identify the indirect object in the sentence: \"She gave her friend a gift.\"");
        variants.add("She");
        variants.add("gave");
        variants.add("friend");
        variants.add("gift");
        questionModels.add(new QuestionModel("Identify the indirect object:", variants, "friend"));

        variants = new ArrayList<>();
        variants.add("Choose the correct form of the verb to complete the sentence: \"The students ____ a test tomorrow.\"");
        variants.add("is having");
        variants.add("are having");
        variants.add("have");
        variants.add("will have");
        questionModels.add(new QuestionModel("Complete the sentence:", variants, "will have"));

        variants = new ArrayList<>();
        variants.add("Identify the correct comparative form of the adjective: \"This book is ____ than the one I read last week.\"");
        variants.add("good");
        variants.add("better");
        variants.add("best");
        variants.add("well");
        questionModels.add(new QuestionModel("Identify the comparative form:", variants, "better"));

        variants = new ArrayList<>();
        variants.add("Choose the correct conjunction to join the sentences: \"I like coffee. I don't like tea.\"");
        variants.add("Although");
        variants.add("But");
        variants.add("So");
        variants.add("While");
        questionModels.add(new QuestionModel("Complete the sentence:", variants, "But"));
        this.questions = questionModels;
    }

    @Override

    public void init_hard_english() {
        List<QuestionModel> questionModels = new ArrayList<>();
        ArrayList<String> variants = new ArrayList<>();

        variants.add("Correct the sentence: \"Each of the students in the class has lost their textbooks.\"");
        variants.add("Each of the students in the class have lost their textbooks.");
        variants.add("Each of the students in the class has lost his or her textbooks.");
        variants.add("Each of the students in the class lost their textbooks.");
        variants.add("Each of the students in the class has lost their textbook.");
        questionModels.add(new QuestionModel("Correct the sentence:", variants, "Each of the students in the class has lost his or her textbooks."));

        variants = new ArrayList<>();
        variants.add("Choose the correct word to complete the sentence: \"His ____ achievements are well-recognized in the field of science.\"");
        variants.add("Scientific");
        variants.add("Science-related");
        variants.add("Scientifically");
        variants.add("Scienceful");
        questionModels.add(new QuestionModel("Complete the sentence:", variants, "Scientific"));

        variants = new ArrayList<>();
        variants.add("Identify the correct form of the verb in the sentence: \"She had been _______ in the project for several months.\"");
        variants.add("Working");
        variants.add("Work");
        variants.add("Works");
        variants.add("Worked");
        questionModels.add(new QuestionModel("Identify the verb form:", variants, "Working"));

        variants = new ArrayList<>();
        variants.add("Choose the appropriate conjunction to complete the sentence: \"_______ the challenges, they managed to complete the project on time.\"");
        variants.add("Despite");
        variants.add("Although");
        variants.add("Notwithstanding");
        variants.add("In spite of");
        questionModels.add(new QuestionModel("Complete the sentence:", variants, "Despite"));

        variants = new ArrayList<>();
        variants.add("Identify the correct form of the adverb: \"He played the piano ________ than anyone in the competition.\"");
        variants.add("More skillful");
        variants.add("More skillfully");
        variants.add("Most skillful");
        variants.add("Most skillfully");
        questionModels.add(new QuestionModel("Identify the adverb form:", variants, "More skillfully"));

        variants = new ArrayList<>();
        variants.add("Choose the correct preposition: \"She is _______ good at solving complex problems.\"");
        variants.add("Very");
        variants.add("Much");
        variants.add("Extremely");
        variants.add("Exceptionally");
        questionModels.add(new QuestionModel("Complete the sentence:", variants, "Exceptionally"));

        variants = new ArrayList<>();
        variants.add("Identify the direct object in the sentence: \"The professor gave the students challenging assignments.\"");
        variants.add("Professor");
        variants.add("Gave");
        variants.add("Students");
        variants.add("Assignments");
        questionModels.add(new QuestionModel("Identify the direct object:", variants, "Assignments"));

        variants = new ArrayList<>();
        variants.add("Choose the correct form of the verb to complete the sentence: \"By the time they arrived, the guests ________ already.\"");
        variants.add("Was leaving");
        variants.add("Were leaving");
        variants.add("Leave");
        variants.add("Had left");
        questionModels.add(new QuestionModel("Complete the sentence:", variants, "Had left"));

        variants = new ArrayList<>();
        variants.add("Identify the correct superlative form of the adjective: \"This is _______ book I've ever read.\"");
        variants.add("Good");
        variants.add("Better");
        variants.add("Best");
        variants.add("Well");
        questionModels.add(new QuestionModel("Identify the superlative form:", variants, "Best"));
        variants = new ArrayList<>();
        variants.add("Choose the correct conjunction to join the sentences: \"I enjoy hiking. It helps me relax.\"");
        variants.add("Therefore");
        variants.add("Moreover");
        variants.add("Consequently");
        variants.add("Hence");
        questionModels.add(new QuestionModel("Complete the sentence:", variants, "Moreover"));
        this.questions = questionModels;
    }

    @Override

    public void init_olympiad_english() {
        List<QuestionModel> questionModels = new ArrayList<>();
        ArrayList<String> variants = new ArrayList<>();

        variants.add("Choose the correct word to complete the sentence: \"The politician's speeches were filled with _______ rhetoric.\"");
        variants.add("Persuasive");
        variants.add("Sincere");
        variants.add("Eloquent");
        variants.add("Verbose");
        questionModels.add(new QuestionModel("Complete the sentence:", variants, "Eloquent"));

        variants = new ArrayList<>();
        variants.add("Identify the correct form of the verb in the sentence: \"The team, along with their coach, _______ been practicing tirelessly.\"");
        variants.add("Has");
        variants.add("Have");
        variants.add("Are");
        variants.add("Is");
        questionModels.add(new QuestionModel("Identify the correct verb form:", variants, "Has"));

        variants = new ArrayList<>();
        variants.add("Choose the appropriate conjunction to complete the sentence: \"The experiment was successful; ________, it was groundbreaking.\"");
        variants.add("Similarly");
        variants.add("Consequently");
        variants.add("Nevertheless");
        variants.add("Therefore");
        questionModels.add(new QuestionModel("Complete the sentence:", variants, "Moreover"));

        variants = new ArrayList<>();
        variants.add("Identify the correct form of the adverb: \"The orchestra played the piece _______ last night.\"");
        variants.add("Exceptionally");
        variants.add("Skillful");
        variants.add("Skillfully");
        variants.add("Exceptional");
        questionModels.add(new QuestionModel("Identify the adverb form:", variants, "Exceptionally"));

        variants = new ArrayList<>();
        variants.add("Choose the correct preposition: \"He was accused _______ stealing the company's confidential information.\"");
        variants.add("With");
        variants.add("For");
        variants.add("Of");
        variants.add("From");
        questionModels.add(new QuestionModel("Complete the sentence:", variants, "Of"));

        variants = new ArrayList<>();
        variants.add("Identify the correct conjunction in the sentence: \"She not only completed her research, _______ she also presented it at the conference.\"");
        variants.add("And");
        variants.add("But");
        variants.add("Yet");
        variants.add("Furthermore");
        questionModels.add(new QuestionModel("Identify the conjunction:", variants, "but"));

        variants = new ArrayList<>();
        variants.add("Choose the correct form of the adjective: \"The mystery novel had a _______ plot that kept readers guessing until the end.\"");
        variants.add("Intricate");
        variants.add("Intricater");
        variants.add("Intricatious");
        variants.add("Intricacy");
        questionModels.add(new QuestionModel("Identify the adjective form:", variants, "Intricate"));

        variants = new ArrayList<>();
        variants.add("Identify the direct object in the sentence: \"The teacher assigned the students a challenging project.\"");
        variants.add("Teacher");
        variants.add("Assigned");
        variants.add("Students");
        variants.add("Project");
        questionModels.add(new QuestionModel("Identify the direct object:", variants, "Project"));

        variants = new ArrayList<>();
        variants.add("Choose the correct form of the verb to complete the sentence: \"By the time she arrives, we _______ the meeting.\"");
        variants.add("Will start");
        variants.add("Had started");
        variants.add("Have started");
        variants.add("Are starting");
        questionModels.add(new QuestionModel("Complete the sentence:", variants, "Will have started"));

        variants = new ArrayList<>();
        variants.add("Identify the correct comparative form of the adjective: \"Her presentation was _______ than I expected.\"");
        variants.add("Good");
        variants.add("Better");
        variants.add("Best");
        variants.add("Well");
        questionModels.add(new QuestionModel("Identify the comparative form:", variants, "Better"));
        this.questions = questionModels;
    }

    @Override
    public QuestionModel getQuestionByPosition(int index) {
        return questions.get(index);
    }

    @Override
    public int getSize() {
        return questions.size();
    }
}
