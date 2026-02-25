package ProblemStatements;

class User implements IValidate{
  private String userId;
  private String password;
  
  public User() {
	  
  }
  
  public User(String userId, String password) {
	  this.userId = userId;
	  this.password = password;
	 }
  
  public void addUser(String userId, String password) {
      this.userId = userId;
      this.password = password;
      System.out.println("User Registered Successfully!");
  }

  @Override
  public boolean isAuthenticated(String userId, String password) {
      return this.userId != null &&
             this.userId.equals(userId) &&
             this.password.equals(password);
  }


public String getUserId() {
    return userId;
}

public String getPassword() {
    return password;
}

@Override
public String toString() {
    return "User [userId=" + userId + "]";
}
}
