/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examapplication;

import examapplication.Data.Userlist;
import examapplication.Data.Data;
import java.util.Scanner;

/**
 *
 * @author harmn sandhu
 */
public class ExamApplication {

    /**
     * @param args the command line arguments
     */
    public static QuestionBank qb=new QuestionBank();
    public static UserBank ub=new UserBank();
   
    // create manual test block starts here
    public static void createQuestion(QuestionBank qb){
     
        Scanner input=new Scanner(System.in).useDelimiter("\n");
       
      int choice=0;
      do{
          if (choice==2){
              break;
          }
          else{
        System.out.println("Enter you question here");
        String questionString=input.next();
        String[] options=new String[3];
        
        for (int i=0; i<options.length; i++){
            
        System.out.println("Enter your options here "+i);
        
        options[i]=input.next();
        
        }
        
        System.out.println("Enter correct answer here");
        int correctAnswer=input.nextInt();
        Question question=new Question(questionString, options, correctAnswer);
        qb.addQuestion(question);
        
          }
        System.out.println("Enter 1 to add more questions ");
        System.out.println("Enter 2 to exit from this menu");
        choice=input.nextInt();             
      }while(choice!=2);
        
    }
    
    // create manual test block ends here
    
    /** public boolean checkuser(){
    
    String fName;String sId;
    Getuser getuser=new Getuser(ub);  
    boolean here=false;
    
    
    
    
    
    return here;
    }**/
    
    // take exam block starts here
    public  static void takeExam(){
        
        Exam exam=new Exam(qb);
       
        Scanner input=new Scanner(System.in).useDelimiter("\\n");
        System.out.println("");
        int right=0;
       
        int choice;
        Question[] questions=exam.getQuestions();
        
        for (int i=0; i<questions.length; i++){
            if(questions[i]==null){
                break;
            }
        System.out.println((i+1)+". "+questions[i]);
        System.out.print("Answer: ");
     
            choice=input.nextInt();

        if ((choice-1)==(questions[i].getCorrectAnswer())){
            right++;
        }
            
            }
        
        System.out.println("You scored "+right+" out of "+questions.length);
        
    }
    
    // take block exam ends here
    
 // main menu starts here   
    public static void menu(){
        
      Scanner input=new Scanner(System.in);
      int choice;
     
      
      do{
           System.out.println("1. Take Exam");
           System.out.println("2. Admin");
           System.out.println("3. Exit");
           System.out.println("Enter Choice: ");
           choice=input.nextInt();
           
           switch(choice){
               
               case 1: takeExam();
                   break;
               case 2: admin();
                   break;
               case 3: break;
               default:
                   System.err.println("Invalid Option");
                   break;
           }
             
      }while(choice!=3);
      
    }
 // main menu ends here   
    
// admin block starts
    public static void admin() {
    Scanner input=new Scanner(System.in);
      int choice=0;
      do{
           System.out.println("1. Add Question");
           System.out.println("2. Exit");
           System.out.println("Enter Choice: ");
           choice=input.nextInt();
           
           switch(choice){
               case 1: createQuestion(qb);
                   break;
               case 2: break;
               
               default:
                   System.err.println("Invalid Option");
                   break;
           }
             
      }while(choice!=2);    
    }
 // admin block ends   
    
    public static void main(String[] args) {
        // TODO code application logic here
        Data dummyData=new Data(qb);
       // Userlist dummyUser=new Userlist(ub);
        menu();
        
    }
}
