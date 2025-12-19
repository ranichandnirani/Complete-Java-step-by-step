//Public 
package bank;
// class Account {
//     public String name;
// }

//Default
// class Account {
//       String name;
// }

//Protected

// class Account {
//      public String name;
//      protected String email;
// }

//Private
class Account {
     public String name;
     protected String email;
     private String password;

     // for access(getter(use for taking information) and setters(set value of private))

     public String getPassword() {
        return this.password;
     }

     public void setPassword(String pass) {
        this.password = pass;
     }
}
public class BuiltIn {
    public static void main(String[] args) {
        Account account1 = new Account();
        account1.name = "Union bank";
        account1.email = "unionbank@gmail.com";
        account1.setPassword("abcd"); 
        System.out.println(account1.getPassword());
    }
}
