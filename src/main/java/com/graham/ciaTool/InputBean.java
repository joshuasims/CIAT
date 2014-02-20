package com.graham.ciaTool;

import javax.faces.bean.ManagedBean;                    
import javax.faces.bean.SessionScoped;                  

import java.io.Serializable;                            
//import java.lang.Object.*;   
//import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//import java.sql.*;

@ManagedBean(name="inputBean")                                            
@SessionScoped                                          
public class InputBean implements Serializable {       
	private static final long serialVersionUID = 1L;    
	                                  
	public static String state;
	private List<String> stateList;
	private List<String> concernList;
	private List<String> demoList;

	private String city;
//	private static String cityName;
	private String concern;
	private String demo;
	private String name;                                
	private String email;

	//private ArrayList<String> cityList;
	                                                    
	public InputBean() {                               
		System.out.println("CiaTool started!");      
	}                      
	
	public List<String> getStateList(){
	     stateList = Arrays.asList("Illinois","Indiana","Michigan",
				 "Minnesota","New_York","Ohio",
				 "Pennyslvania","Wisconsin","Ontario");
	    return stateList;
	}
	public String getState(){
		return state;
	}
	public void setState(String state){
		this.state = state;
		System.out.println(state);
	}	
	
	public String getCity(){                            
		return city;                                    
	}
	
//	public static String getCityName(){
	//	cityName = city;
		//return city;
	//}
	public void setCity(String city){                   
		this.city = city;                               
	}     
	
	public List<String> getConcernList(){

		 concernList = Arrays.asList("Increasing temperatures", "Temperature variability",
				      "Increasing precipitation","Decreasing precipitation",
				      "Precipitation variability", "Increase in storm severity",
	                               "Increase in extreme weather events" );
	    return concernList;
	}
	
	public String getConcern(){
		return concern;
	}
	
	public void setConcern(String concern){
		this.concern = concern;
	}	
	
	public List<String> getDemoList(){

		 demoList = Arrays.asList("Percent over 65",
					"Age of housing stock",
					"Median income",
					"Percent without HS diploma",
					"Percent below poverty line (Individuals)",
					"Pecent owner-occupied");
	    return demoList;
	}
	
	public String getDemo(){
		return demo;
	}
	
	public void setDemo(String demo){
		this.demo = demo;
	}	
	
	public String getName(){                            
		return name;                                    
	}
	public void setName(String name){                   
		this.name = name;                               
	}     
	                                                    
	public String getEmail(){                           
		return email;                                   
	}                                                   
	public void setEmail(String email){                 
		this.email = email;                             
	}                                                   
	
}                                                       
