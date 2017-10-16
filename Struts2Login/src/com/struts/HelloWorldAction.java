package com.struts;

public class HelloWorldAction {
	private String username;
	private String password;
         
	    public String execute() throws Exception {

	    	
	        System.out.println("Username: " + this.getUsername());  
	        System.out.println("Password: " + this.getPassword());  
	     
	        if (  getUsername() == null ||getUsername().equals("") )
	            return "error";

	        return "success";
	    }
       
		
	 public String getUsername()
	 {
		 return username;
	 }
	 public void  setUsername(String name)
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
    

}
