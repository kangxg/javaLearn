package controller;

public class login {
	private String username;
	private String password;
	
 public String getUserName()
 {
	 return username;
 }
 public void  setUserName(String name)
 {
	  this.username = name;
 }
 
 public String getPassword()
 {
	 return password;
 }
 public void  setPassword(String pwd)
 {
	  this.password = pwd;
 }
 
 public String execute()
 {
	 return "success";
 }
}
