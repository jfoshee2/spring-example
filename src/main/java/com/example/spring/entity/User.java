package com.example.spring.entity;

public class User extends Entity{



    private int userId;
    private String userName;
    private String userNumber;

    public User(int userId, String userName, String userNumber) {
        this.userId = userId;
        this.userName = userName;
        this.userNumber = userNumber;
    }
    private User(UserBuilder builder){
        this.userId = builder.userId;
        this.userName = builder.userName;
        this.userNumber = builder.userNumber;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserNumber() {
        return userNumber;
    }

    public void setUserNumber(String userNumber) {
        this.userNumber = userNumber;
    }

    public static class UserBuilder {
        private int userId;
        private String userName;
        private String userNumber;

        public User build() {
            return new User(this);
        }

      public UserBuilder withUserId(int userId){
            this.userId=userId;
            return this;
      }

      public UserBuilder withUserName(String userName){
            this.userName =userName;
            return this;
        }

       public UserBuilder withUserNumber(String userNumber){
            this.userNumber = userNumber;
            return this;
       }

    }
}
