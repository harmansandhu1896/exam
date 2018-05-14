/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examapplication;

/**
 *
 * @author harmn sandhu
 */
public class QuestionBank {
    private Question[] questions=new Question[1000];
    private static int count=0;

    public QuestionBank() {
    }

    public Question[] getQuestions() {
        return questions;
    }

    public void setQuestions(Question[] questions) {
        this.questions = questions;
    }

    
    public void addQuestion(Question question){
        questions[count]=question;      
        count++;
    }
    
}
