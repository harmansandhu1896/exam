/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examapplication;

import java.util.Random;

/**
 *
 * @author harmn sandhu
 */
public class Exam {
     private int id;
     private static int idcount=0;
     private Question[] questions=new Question[14];

    public Exam(QuestionBank qb) {
        
        this.id=++idcount;
        addQuestions(qb);
    }
    
    
    private void addQuestions(QuestionBank qb){
        
        Question[] q=qb.getQuestions();
        
        System.arraycopy(q, 0, questions, 0, questions.length);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Question[] getQuestions() {
        return questions;
    }

    public void setQuestions(Question[] questions) {
        this.questions = questions;
    }
    
  /**  
    public static Question[] randomizeArray(Question[] array){
		Random rgen = new Random();  // Random number generator			
 
		for (int i=0; i<array.length; i++) {
		    int randomPosition = rgen.nextInt(array.length);
		    Question temp = array[i];
		    array[i] = array[randomPosition];
		    array[randomPosition] = temp;
		}
 
		return array;
	} **/
}
