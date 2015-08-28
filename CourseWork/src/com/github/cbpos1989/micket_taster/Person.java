/**
 * 
 */
package com.github.cbpos1989.micket_taster;

/**
 * @author User1
 *
 */
public class Person {

	public String name;
	public String email;
	public String creditCardNum;
	
	Person(){
		this("noName","noEmail","noCardNum");
	}
	Person(String name, String email, String creditCardNum){
		//if(!(name.matches("[a-zA-Z ]*\\d+.*"))){
			//System.out.println("invalid name");
		//}else{
			
			this.name = name;
		//}
		
		if(email.contains("@")){
		this.email = email;
		}else{
			//System.out.println("please enter a valid email");
		}
		if(creditCardNum.length()==(16)){
		this.creditCardNum = creditCardNum;
		
		}else{
			//System.out.println("credit card must be 16 digits");
		}
		
				
	}
	
	public String toString(){
		return this.name + " " + this.email + " " + this.creditCardNum; 
	}
	
}
