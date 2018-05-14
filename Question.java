/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examapplication;

import java.util.Arrays;
import jdk.nashorn.internal.runtime.options.Options;

/**
 *
 * @author harmn sandhu
 */
public class Question {
    private int id;
    private String question;
    private String[] options=new String[14];
    private int correctAnswer;

    public int getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(int correctAnswer) {
        this.correctAnswer = correctAnswer;
    }
    private static int idcount=0;
 
    
    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String[] getOptions() {
        return options;
    }

    public void setOptions(String[] options) {
        this.options = options;
    }

   

    public Question() {
    }
    
    

    public Question(String question,String[] options, int correctAnswer) {
        
        this.question = question;
        this.correctAnswer = correctAnswer;
        this.id=++idcount;
        this.options=options;
    }
  
   
    
    @Override
    public String toString() {
        String optionsFormat="";
        for (int i=0; i<options.length;i++) {
            optionsFormat += "Option "+(i+1)+".\t"+options[i]+"\n";
        }
        return question + "\n" +optionsFormat;
    }
    
}
