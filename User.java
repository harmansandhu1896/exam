package examapplication;

    public class User {
        private String nameFull,studentId;

    User(UserBank ub) {
        
   }

    public String getNameFull() {
        return nameFull;
    }

    public void setNameFull(String nameFull) {
        this.nameFull = nameFull;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public User(String nameFull, String studentId) {
        this.nameFull = nameFull;
        this.studentId = studentId;
    }
   @Override
    public String toString() {
        String optionsFormat="welcome ";
    
        return  optionsFormat +"\n"+studentId + "\n" +nameFull;
    }
   
   
}
