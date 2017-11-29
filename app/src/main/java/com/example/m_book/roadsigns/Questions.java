package com.example.m_book.roadsigns;

import android.graphics.drawable.Drawable;

/**
 * Created by M-book on 30.10.2017.
 */

class Questions {
    private int idquestion, trueAnswer;
    private String urlImages, answer1, answer2, answer3, answer4;



    public Questions(String urlImages, String answer1, String answer2, String answer3, String answer4, int trueAnswer) {
//        this.idquestion = idquestion;
        this.urlImages = urlImages;
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.answer3 = answer3;
        this.answer4 = answer4;
        this.trueAnswer = trueAnswer;
    }



    public String getUrlImages() {
        return urlImages;
    }

    public void setUrlImages(String urlImages) {
        this.urlImages = urlImages;
    }

    public String getAnswer1() {
        return answer1;
    }

    public void setAnswer1(String answer1) {
        this.answer1 = answer1;
    }

    public String getAnswer2() {
        return answer2;
    }

    public void setAnswer2(String answer2) {
        this.answer2 = answer2;
    }

    public String getAnswer3() {
        return answer3;
    }

    public void setAnswer3(String answer3) {
        this.answer3 = answer3;
    }

    public String getAnswer4() {
        return answer4;
    }

    public void setAnswer4(String answer4) {
        this.answer4 = answer4;
    }

    public int getTrueAnswer() {
        return trueAnswer;
    }

    public void setTrueAnswer(int trueAnswer) {
        this.trueAnswer = trueAnswer;
    }


}
