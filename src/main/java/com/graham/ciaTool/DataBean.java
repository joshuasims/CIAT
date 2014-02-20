package com.graham.ciaTool;


import javax.faces.bean.ManagedBean; 
import javax.faces.bean.ManagedProperty;                   
import javax.faces.bean.SessionScoped;                  

import javax.faces.event.AjaxBehaviorEvent;

import java.io.Serializable;                            
//import java.lang.Object.*;   
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.sql.*;

@ManagedBean(name="dataBean")                                            
@SessionScoped 

public class DataBean implements Serializable  {
	private static final long serialVersionUID = 1L;  
	public static String stateCode;
    public String strConn = "jdbc:mysql://50.28.21.141:3306/glisadoo_ciat"; 
    public String strUser = "glisadoo_ciat"; 
    public String strPassword = "6886friata";
	private List<String> cityList;
	@ManagedProperty("#{inputBean.state}")
	private String state;
	
	public String getState(){
		return state;
	}
	
	public void setState(String state){
		this.state = state;
	}
	
	public void queryCityList(AjaxBehaviorEvent ev){	    
	    //pull cities within given state from database
	    Object [] stateList = {"Illinois","Indiana","Michigan",
				 "Minnesota","New_York","Ohio",
				 "Pennyslvania","Wisconsin","Ontario"};
		//String state = value;
	    System.out.println("state = " + state);
	    Object[] stateCodeList = {"IL","IN","MI","MN","NY","OH",
			      "PA","WI","ON"}; //assign state code
	    stateCode = stateCodeList[Arrays.asList(stateList).indexOf(InputBean.state)].toString();
		System.out.println(stateCode);
	    try{
		Class.forName("com.mysql.jdbc.Driver"); 
		Connection conn = DriverManager.getConnection(strConn, strUser,
							      strPassword); 
				
		String query = ("SELECT name FROM " + 
				"city_demographics WHERE state_abbrv = ? ORDER BY name;");
		PreparedStatement pstmt = conn.prepareStatement(query);
		
		pstmt.setString(1, stateCode);
		ResultSet rs = pstmt.executeQuery();
		ArrayList<String> resultList = new ArrayList<String>();
		//System.out.println(rs.size);
		while(rs.next()){
		    resultList.add( rs.getString("name") );
		}
		//Object[] citList = resultList.toArray();
		//int size = citList.length;
		 //System.out.println(size);
		cityList = resultList;
	    }
	    catch(SQLException e) {
		System.out.println(" A SQL error1: " + e.getMessage());
	    }    
	    catch (Exception ex) {
		ex.printStackTrace();
	    }
	}
	
	public List<String> getCityList(){
		return cityList;
	}

	public String getStateCode(){
		return stateCode;
	}
	
	
}
