// 🔐 3. Login Authentication
// Scenario:
// The system should allow login only if both username and password match.
// Task:
// Create a program where you take username and password as input and
// check if they match stored values using logical operators.

class Authentication{
  private String storeduserName="Sreenu";
  private int storedpassword=1122;

    public boolean login(String userName, int password) {
    return userName.equals(storeduserName) && password == storedpassword;
    }
}
class LoginAuthentication{
  public static void main (String[] args) {
    Authentication auth=new Authentication();
    
    String enteredUser="Sreenu";
    int enteredPassword=1122;
    
    if(auth.login(enteredUser,enteredPassword)){
      System.out.println("Login Successfull:"+enteredUser);
    }else{
      System.out.println("Invalid Credential..Please Try Again..");
    }
  }
}