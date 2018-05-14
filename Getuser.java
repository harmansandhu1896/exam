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
public class Getuser {
     private User[] users=new User[14];

     public User[] getUsers() {
        return users;
    }

    public void setUsers(User[] users) {
        this.users = users;
    }
    public Getuser(UserBank ub) {
        
        addUsers(ub);
    }

    private void addUsers(UserBank ub) {
      User[] q=ub.getUsers();
        
        System.arraycopy(q, 0, users, 0, users.length);
    
    
    }
}
