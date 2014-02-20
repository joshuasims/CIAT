package com.graham.ciaTool;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.FacesContext;

import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;

import java.sql.*;
import java.awt.image.*;
import java.awt.Graphics2D;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.math.BigDecimal;
import java.util.*;

import com.google.code.geocoder.*;
import com.google.code.geocoder.model.*;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.lang.Object.*;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.ArrayUtils;

import java.net.URLEncoder;

import javax.xml.*;

import java.net.*;

import javax.imageio.*;

import java.io.Serializable; 
import java.util.Random;

import javax.annotation.PostConstruct;

@ManagedBean(name="processBean")                                            
@SessionScoped 
                                                                     
public class ProcessBean implements Serializable{
	
	
	public ProcessBean(){
		System.out.println("Process bean started");
	}
	
	private static final long serialVersionUID = 1L;  
   

    //initialize variables
    public String path = "//Users//joshsims//project//";
    public int inputTime = 0; 
    public String countyName;
    public String contactName;
    public String contactEmail;
   // public static String demoFilter;
    public String filterCode;
   // public static String stratFilter;
    public int climateDivision;
    public String stateClimDiv;
    public String climateDivisionName;
    public Object[] cityList;
    public Object[] countyList; 
    public String popCategory;
    public int pop2007;
    public int pop2010;
    public int population;
    public float popChange;
    public float over65;
    public int houseAge;
    public float highSchool;
    public float poverty;
    public int medianIncome;
    public float ownerOccupy;
    public BigDecimal latitude;
    public BigDecimal longitude;
    public int climDivCode;
    public float temp1951;
    public float temp1981;
    public float precip1951;
    public float precip1981;
    public float tempChange;
    public float tempPercentChange;
    public float precipChange;
    public float precipPercentChange;
    public float projTemp1951;
    public float projTemp1981;
    public float projTemp2011;
    public float projTemp2041;
    public float projTemp2071;
    public float projTempCh2010;
    public float projTempCh2040;
    public float projTempCh2070;
    public float projPrecip1951;
    public float projPrecip1981;
    public float projPrecip2011;
    public float projPrecip2041;
    public float projPrecip2071;
    public float projPrecipCh2010;
    public float projPrecipCh2040;
    public float projPrecipCh2070;
    public float springObTemp;
    public float summerObTemp;
    public float fallObTemp;
    public float winterObTemp;
    public float springProjTemp;
    public float summerProjTemp;
    public float fallProjTemp;
    public float winterProjTemp;
    public float springTempChange;
    public float summerTempChange;
    public float fallTempChange;
    public float winterTempChange;
    public float springObPrecip;
    public float summerObPrecip;
    public float fallObPrecip;
    public float winterObPrecip;
    public float springProjPrecip;
    public float summerProjPrecip;
    public float fallProjPrecip;
    public float winterProjPrecip;
    public float springPrecipChange;
    public float summerPrecipChange;
    public float fallPrecipChange;
    public float winterPrecipChange;
    public Object[] divisionMatchList;
    public Object[] divisionSpringMatchList;
    public Object[] divisionWinterMatchList;
    public Object[] divisionSummerMatchList;
    public Object[] divisionFallMatchList;
    public Object[] countyMatchList;

    public ArrayList<String> stateMatchList = new ArrayList<String>();
    public ArrayList<String> cityMatchList = new ArrayList<String>();
    public ArrayList<Integer> analogRandomNumberList =
	new ArrayList<Integer>();
    public ArrayList<String> analogRandomCityList = new ArrayList<String>();
    public ArrayList<String> analogRandomStateList = new ArrayList<String>();
    
    public ArrayList<String> stateSpringMatchList = new ArrayList<String>();
    public ArrayList<String> citySpringMatchList = new ArrayList<String>();
    public ArrayList<String> stateWinterMatchList = new ArrayList<String>();
    public ArrayList<String> cityWinterMatchList = new ArrayList<String>();
    
    public ArrayList<Integer> analogSpringRandomNumberList =
	new ArrayList<Integer>();
    public ArrayList<String> analogSpringRandomCityList =
	new ArrayList<String>();
    public ArrayList<String> analogSpringRandomStateList =
	new ArrayList<String>();

    public ArrayList<Integer> analogWinterRandomNumberList =
	new ArrayList<Integer>();
    public ArrayList<String> analogWinterRandomCityList = 
	new ArrayList<String>();
    public ArrayList<String> analogWinterRandomStateList = 
	new ArrayList<String>();
    
    public ArrayList<String> stateSummerMatchList = new ArrayList<String>();
    public ArrayList<String> citySummerMatchList = new ArrayList<String>();

    public ArrayList<Integer> analogSummerRandomNumberList =
	new ArrayList<Integer>();
    public ArrayList<String> analogSummerRandomCityList = 
	new ArrayList<String>();
    public ArrayList<String> analogSummerRandomStateList = 
	new ArrayList<String>();

    public ArrayList<String> stateFallMatchList = new ArrayList<String>();
    public ArrayList<String> cityFallMatchList = new ArrayList<String>();

    public ArrayList<Integer> analogFallRandomNumberList =
	new ArrayList<Integer>();
    public ArrayList<String> analogFallRandomCityList = 
	new ArrayList<String>();
    public ArrayList<String> analogFallRandomStateList = 
	new ArrayList<String>();

    public ArrayList<Integer> analogPopList = new ArrayList<Integer>();
    public ArrayList<Float> analogOver65List = new ArrayList<Float>();
    public ArrayList<Integer> analogHouseAgeList = new ArrayList<Integer>();
    public ArrayList<Integer> analogMedianIncomeList = new ArrayList<Integer>();
    public ArrayList<Float> analogHighSchoolList = new ArrayList<Float>();
    public ArrayList<Float> analogPovertyList = new ArrayList<Float>();
    public ArrayList<Float> analogOwnerList = new ArrayList<Float>();
    public ArrayList<Integer> randomPopList = new ArrayList<Integer>();
    public ArrayList<Float> randomOver65List = new ArrayList<Float>();
    public ArrayList<Integer> randomHouseAgeList = new ArrayList<Integer>();
    public ArrayList<Integer> randomMedianIncomeList = new ArrayList<Integer>();
    public ArrayList<Float> randomHighSchoolList = new ArrayList<Float>();
    public ArrayList<Float> randomPovertyList = new ArrayList<Float>();
    public ArrayList<Float> randomOwnerList = new ArrayList<Float>();


    public int analogCD;
    public String analogCounty;
    public String analogState;
    public int analogSpringCD;
    public String analogSpringCounty;
    public String analogSpringState;
    public String analogWinterCD;
    public String analogWinterState;
    public String analogSummerCD;
    public String analogSummerCounty;
    public String analogSummerState;
    public String analogFallCD;
    public String analogFallCounty;
    public String analogFallState;
    public int popMatch = 0;
    public int popMatchWinter = 0;
    public int popMatchSpring = 0;
    public int popMatchSummer = 0;
    public int popMatchFall = 0;
    public float tempMinimum;
    public float tempMaximum;
    public float precipMaximum;
    public float precipMinimum;
    public float popChangeMin;
    public float popChangeMax;
    public int popMinimum;
    public int popMaximum;
    public float over65Minimum;
    public float over65Maximum;
    public float houseAgeMinimum;
    public float houseAgeMaximum;
    public int medianIncomeMinimum;
    public int medianIncomeMaximum;
    public float highSchoolMinimum;
    public float highSchoolMaximum;
    public float povertyMinimum;
    public float povertyMaximum;
    public float ownerMinimum;
    public float ownerMaximum;
    public float springTempMin;
    public float springTempMax;
    public float springPrecipMin;
    public float springPrecipMax;
    public float winterTempMin;
    public float winterTempMax;
    public float winterPrecipMin;
    public float winterPrecipMax;
    public float summerTempMin;
    public float summerTempMax;
    public float summerPrecipMin;
    public float summerPrecipMax;
    public float fallTempMin;
    public float fallTempMax;
    public float fallPrecipMin;
    public float fallPrecipMax;
    public float demoMin;
    public float demoMax;

    public ArrayList<Float> analogLatList = new ArrayList<Float>();
    public ArrayList<Float> analogLongList = new ArrayList<Float>();
    public ArrayList<Float> analogSpringLatList = new ArrayList<Float>();
    public ArrayList<Float> analogSpringLongList = new ArrayList<Float>();
    public ArrayList<Float> analogWinterLatList = new ArrayList<Float>();
    public ArrayList<Float> analogWinterLongList = new ArrayList<Float>();
    public ArrayList<Float> analogSummerLatList = new ArrayList<Float>();
    public ArrayList<Float> analogSummerLongList = new ArrayList<Float>();
    public ArrayList<Float> analogFallLatList = new ArrayList<Float>();
    public ArrayList<Float> analogFallLongList = new ArrayList<Float>();
    int startCount;
    public String strConn = "jdbc:mysql://50.28.21.141:3306/glisadoo_ciat"; 
    public String strUser = "glisadoo_ciat"; 
    public String strPassword = "6886friata";

    public BufferedImage googleImage;
    public BufferedImage googleSpringImage;
    public BufferedImage googleWinterImage;
    public BufferedImage googleSummerImage;
    public BufferedImage googleFallImage;
    public String climateDriver1;
    public String climateDriver2;
    public ArrayList<String> climateDriverList = new ArrayList<String>();
    public ArrayList<String> climateImpactList = new ArrayList<String>();
    public ArrayList<String> cityStateList = new ArrayList<String>();
    public ArrayList<String> populationList = new ArrayList<String>();
    public ArrayList<String> actionList = new ArrayList<String>();
    public ArrayList<String> departmentList = new ArrayList<String>();
    public ArrayList<String> cobenefitList = new ArrayList<String>();
    public ArrayList<String> documentList = new ArrayList<String>();
    public ArrayList<String> linkList = new ArrayList<String>();
    public ArrayList<String> climateDriverList2 = new ArrayList<String>();
    public ArrayList<String> climateImpactList2 = new ArrayList<String>();
    public ArrayList<String> cityStateList2 = new ArrayList<String>();
    public ArrayList<String> populationList2 = new ArrayList<String>();
    public ArrayList<String> actionList2 = new ArrayList<String>();
    public ArrayList<String> departmentList2 = new ArrayList<String>();
    public ArrayList<String> cobenefitList2 = new ArrayList<String>();
    public ArrayList<String> documentList2 = new ArrayList<String>();
    public ArrayList<String> linkList2 = new ArrayList<String>();

    
    
    
	@ManagedProperty(value="#{inputBean.city}")
	private String cityName;
	@ManagedProperty(value="#{dataBean.stateCode}")
	private String stateCode;
	@ManagedProperty(value="#{inputBean.state}")
	private String stateName;
    @ManagedProperty(value="#{inputBean.demo}")
    public String demo;
	@ManagedProperty(value="#{inputBean.concern}")
	private String stratFilter;
	private StreamedContent annualStream;
	private StreamedContent springStream;
	private StreamedContent summerStream;
	private StreamedContent fallStream;
	private StreamedContent winterStream;
	
//	@ManagedProperty("#{reportBean}")
//	private ReportBean report;
	
//	public ReportBean getReport() {
	//	return report;
//	}
	
//	public void setReport(ReportBean report){
	//	this.report = report;
//	}
	
	public void setCityName(String cityName){
		this.cityName = cityName;
	}
	
	public void setStateCode(String stateCode){
		this.stateCode = stateCode;
	}
	
	public void setStratFilter(String stratFilter){
		this.stratFilter = stratFilter;
	}

	public void setDemo(String demo){
		this.demo = demo;
		System.out.println(this.demo);
	}
	
	public void setStateName(String stateName){
		this.stateName = stateName;
	}
	
	public void printStart(){
		System.out.println("Start process");
	}
	
	///@PostConstruct 
	public void pullData(){
        System.out.println("start process");

        
	    Object [] filterList = {"Percent over 65",
				"Age of housing stock",
				"Median income",
				"Percent without HS diploma",
				"Percent below poverty line (Individuals)",
				"Pecent owner-occupied"};
		//String state = value;
	    System.out.println("demo = " + demo);
	    Object[] filterCodeList = {"over_65","house_age","median_income","high_school",
                "poverty","owner" };
	    filterCode = filterCodeList[Arrays.asList(filterList).indexOf(demo)].toString();
    	
    			
 
	//pull climate division based upon county input
    			try{
    				Class.forName("com.mysql.jdbc.Driver"); 
    				Connection conn = DriverManager.getConnection(strConn, strUser,
    						strPassword); 
    				String query = ("SELECT * FROM " + "city_demographics" 
    						+ " WHERE name = ? AND state_abbrv = ?;" );
    				PreparedStatement pstmt = conn.prepareStatement(query); 
    				pstmt.setString(1, cityName);
    				pstmt.setString(2, stateCode);
    				System.out.println(pstmt);
    				ResultSet res = pstmt.executeQuery();
    				System.out.println(res.toString());
    				while(res.next()){
    					int cd = res.getInt("climdiv");
    					String cdName = res.getString("name_1");
    					int stateCD = res.getInt("cd_new");
    					//	System.out.println("\n" + cd);
    					climateDivision = cd;
    					climateDivisionName = cdName;
    					stateClimDiv = Integer.toString(stateCD);
    					System.out.println("cd = " + climateDivision);

    				}
    			}
    	catch(SQLException e) {
    		System.out.println(" A SQL error: " + e.getMessage());
    	}    
    	catch (Exception ex) {
    		ex.printStackTrace();
    	}




    	// pull historical mean temps and precip
    	try{
    		Class.forName("com.mysql.jdbc.Driver"); 
    		Connection conn = DriverManager.getConnection(strConn, strUser,
    				strPassword); 	  
    		String query = ("SELECT * FROM " + "clim_past" 
    				+ " WHERE state_cd = ?;"); 	    
    		PreparedStatement pstmt = conn.prepareStatement(query); 
    		pstmt.setInt(1,climateDivision); 

    		ResultSet res = pstmt.executeQuery();		
    		while(res.next()){
    			int cdCode = res.getInt("state_cd");
    			float temp51 = res.getFloat("temp_1951");
    			float temp81 = res.getFloat("temp_1981");
    			float precip51 = res.getFloat("precip_1951");
    			float precip81 = res.getFloat("precip_1981");
    			float tempCh = res.getFloat("temp_change");
    			float tempPCh = res.getFloat("temp_per_change");
    			float precipCh = res.getFloat("precip_change");
    			float precipPCh = res.getFloat("precip_per_change");
    			System.out.println("CD code               = " + cdCode 
    					+ "\nMean Temp 1951-1980   = " + temp51
    					+ "\nMean Temp 1981-2010   = " + temp81
    					+ "\nTemp change           = " + tempCh 
    					+ " (" + tempPCh + "%)" 
    					+ "\nMean Precip 1951-1980 = " + precip51 
    					+ "\nMean Precip 1981-2010 = " +  precip81
    					+  "\nPrecip change         = " + precipCh
    					+ " (" + precipPCh + "%)");
    			climDivCode = cdCode;
    			temp1951 = temp51;
    			temp1981 = temp81;
    			precip1951 = precip51;
    			precip1981 = precip81;
    			tempChange = tempCh;
    			tempPercentChange = tempPCh;
    			precipChange = precipCh;
    			precipPercentChange = precipPCh;
    		}
    	}
    	catch(SQLException e) {
    		System.out.println(" A SQL error: " + e.getMessage());
    	}    
    	catch (Exception ex) {
    		ex.printStackTrace();
    	}

    	// pull CMIP temp data
    	try{
    		Class.forName("com.mysql.jdbc.Driver"); 
    		Connection conn = DriverManager.getConnection(strConn, strUser,
    				strPassword); 	  
    		String query = ("SELECT * FROM " + "climate" 
    				+ " WHERE cd = ?;" );  	    
    		PreparedStatement pstmt = conn.prepareStatement(query); 
    		pstmt.setInt(1, climDivCode); 
    		//  System.out.println(pstmt);
    		ResultSet res = pstmt.executeQuery();		
    		while(res.next()){
    			float pro51 = res.getFloat("projMean51");
    			float pro81 = res.getFloat("projMean81");
    			float pro11 = res.getFloat("projMean11");
    			float pro41 = res.getFloat("projMean41");
    			float proCh2010 = res.getFloat("projChange2010");
    			float proCh2040 = res.getFloat("projChange2040");
    			float proCh2070 = res.getFloat("projChange2070");
    			float obs51 = res.getFloat("obsMean51");
    			float obs81 = res.getFloat("obsMean81");
    			float obsCh2010 = res.getFloat("obsChange2010");
    			System.out.println("CD code               = " + climDivCode 
    					+ "\nProj Temp 1951-1980   = " + pro51
    					+ "\nProj Temp 1981-2010   = " + pro81
    					+ "\nProj Change" + proCh2010 + "%"
    					+ "\nProj Temp 2011-2040 = " + pro11
    					+ "\nProj Change = " + proCh2040 + "%"
    					+ "\nProj Temp 2041-2070 = " +  pro41
    					+ "\nProj Change" + proCh2070 + "%"
    					+ "\nObsv Temp 1951 - 1980 = " + obs51
    					+ "\nObsv Temp 1981 - 2010 = " + obs81
    					+ "\nObsv Change = " + obsCh2010 + "%");
    			projTemp1951 = pro51;
    			projTemp1981 = pro81;
    			projTemp2011 = pro11;
    			projTemp2041 = pro41;
    			projTempCh2010 = proCh2010;
    			projTempCh2040 = proCh2040;
    			projTempCh2070 = proCh2070;
    		}
    	}
    	catch(SQLException e) {
    		System.out.println(" A SQL error: " + e.getMessage());
    	}    
    	catch (Exception ex) {
    		ex.printStackTrace();
    	}

    	// pull CMIP precip data
    	try{
    		Class.forName("com.mysql.jdbc.Driver"); 
    		Connection conn = DriverManager.getConnection(strConn, strUser,
    				strPassword); 	  
    		String query = ("SELECT * FROM " + "precip" 
    				+ " WHERE cd = ?;" );  	    
    		PreparedStatement pstmt = conn.prepareStatement(query); 
    		pstmt.setInt(1, climDivCode); 
    		//  System.out.println(pstmt);
    		ResultSet res = pstmt.executeQuery();		
    		while(res.next()){
    			float pro51 = res.getFloat("projMean51");
    			float pro81 = res.getFloat("projMean81");
    			float pro11 = res.getFloat("projMean11");
    			float pro41 = res.getFloat("projMean41");
    			float proCh2010 = res.getFloat("projChange2010");
    			float proCh2040 = res.getFloat("projChange2040");
    			float proCh2070 = res.getFloat("projChange2070");
    			float obs51 = res.getFloat("obsMean51");
    			float obs81 = res.getFloat("obsMean81");
    			float obsCh2010 = res.getFloat("obsChange2010");
    			System.out.println("CD code               = " + climDivCode 
    					+ "\nProj Precip 1951-1980   = " + pro51
    					+ "\nProj Precip 1981-2010   = " + pro81
    					+ "\nProj Change" + proCh2010 + "%"
    					+ "\nProj Precip 2011-2040 = " + pro11
    					+ "\nProj Change = " + proCh2040 + "%"
    					+ "\nProj Precip 2041-2070 = " +  pro41
    					+ "\nProj Change" + proCh2070 + "%"
    					+ "\nObsv Precip 1951 - 1980 = " + obs51
    					+ "\nObsv Precip 1981 - 2010 = " + obs81
    					+ "\nObsv Change = " + obsCh2010 + "%");
    			projPrecip1951 = pro51;
    			projPrecip1981 = pro81;
    			projPrecip2011 = pro11;
    			projPrecip2041 = pro41;
    			projPrecipCh2010 = proCh2010;
    			projPrecipCh2040 = proCh2040;
    			projPrecipCh2070 = proCh2070;
    		}
    	}
    	catch(SQLException e) {
    		System.out.println(" A SQL error: " + e.getMessage());
    	}    
    	catch (Exception ex) {
    		ex.printStackTrace();
    	}
    	// pull seasonal temp  data
    	try{
    		Class.forName("com.mysql.jdbc.Driver"); 
    		Connection conn = DriverManager.getConnection(strConn, strUser,
    				strPassword); 	  
    		String query = ("SELECT * FROM " + "seasonal_temp" 
    				+ " WHERE cd = ?;" );  	    
    		PreparedStatement pstmt = conn.prepareStatement(query); 
    		pstmt.setInt(1, climDivCode); 
    		//  System.out.println(pstmt);
    		ResultSet res = pstmt.executeQuery();		
    		while(res.next()){
    			float tempSpring81 = res.getFloat("springOb");
    			float tempSummer81 = res.getFloat("summerOb");
    			float tempFall81 = res.getFloat("fallOb");
    			float tempWinter81 = res.getFloat("winterOb");
    			float tempSpring11 = res.getFloat("springProj");
    			float tempSummer11 = res.getFloat("summerProj");
    			float tempFall11 = res.getFloat("fallProj");
    			float tempWinter11 = res.getFloat("winterProj");
    			springObTemp = tempSpring81;
    			summerObTemp = tempSummer81;
    			fallObTemp = tempFall81;
    			winterObTemp = tempWinter81;
    			springProjTemp = tempSpring11;
    			summerProjTemp = tempSummer11;
    			fallProjTemp = tempFall11;
    			winterProjTemp = tempWinter11;
    			springTempChange = springProjTemp - springObTemp;
    			summerTempChange = summerProjTemp - summerObTemp;
    			fallTempChange = fallProjTemp - fallObTemp;
    			System.out.println("Spring observed temp = " + springObTemp
    					+ "\nSummer observed temp = " + summerObTemp
    					+ "\nFall observed temp = " + fallObTemp
    					+ "\nWinter observed temp = " + winterObTemp
    					+ "\nSpring proj temp = " + springProjTemp
    					+ "\nSummer proj temp = " + summerProjTemp
    					+ "\nFall proj temp = " + fallProjTemp
    					+ "\nWinter proj temp = " + winterProjTemp);
    		}
    	}
    	catch(SQLException e) {
    		System.out.println(" A SQL error: " + e.getMessage());
    	}    
    	catch (Exception ex) {
    		ex.printStackTrace();
    	}

    	// pull seasonal precip  data
    	try{
    		Class.forName("com.mysql.jdbc.Driver"); 
    		Connection conn = DriverManager.getConnection(strConn, strUser,
    				strPassword); 	  
    		String query = ("SELECT * FROM " + "seasonal_precip" 
    				+ " WHERE cd = ?;" );  	    
    		PreparedStatement pstmt = conn.prepareStatement(query); 
    		pstmt.setInt(1, climDivCode); 
    		//  System.out.println(pstmt);
    		ResultSet res = pstmt.executeQuery();		
    		while(res.next()){
    			float precipSpring81 = res.getFloat("springOb");
    			float precipSummer81 = res.getFloat("summerOb");
    			float precipFall81 = res.getFloat("fallOb");
    			float precipWinter81 = res.getFloat("winterOb");
    			float precipSpring11 = res.getFloat("springProj");
    			float precipSummer11 = res.getFloat("summerProj");
    			float precipFall11 = res.getFloat("fallProj");
    			float precipWinter11 = res.getFloat("winterProj");
    			springObPrecip = precipSpring81;
    			summerObPrecip = precipSummer81;
    			fallObPrecip = precipFall81;
    			winterObPrecip = precipWinter81;
    			springProjPrecip = precipSpring11;
    			summerProjPrecip = precipSummer11;
    			fallProjPrecip = precipFall11;
    			winterProjPrecip = precipWinter11;
    			springPrecipChange = springProjPrecip - springObPrecip;
    			summerPrecipChange = summerProjPrecip - summerObPrecip;
    			fallPrecipChange = fallProjPrecip - fallObPrecip;
    			winterPrecipChange = winterProjPrecip - fallObPrecip;
    			System.out.println("Spring observed precip = " + springObPrecip
    					+ "\nSummer observed precip = " + summerObPrecip
    					+ "\nFall observed precip = " + fallObPrecip
    					+ "\nWinter observed precip = " + winterObPrecip
    					+ "\nSpring proj precip = " + springProjPrecip
    					+ "\nSummer proj precip = " + summerProjPrecip
    					+ "\nFall proj precip = " + fallProjPrecip
    					+ "\nWinter proj precip = " + winterProjPrecip);
    		}
    	}
    	catch(SQLException e) {
    		System.out.println(" A SQL error: " + e.getMessage());
    	}    
    	catch (Exception ex) {
    		ex.printStackTrace();
    	}



    	//pull city demographics
    	try{
    		Class.forName("com.mysql.jdbc.Driver"); 
    		Connection conn = DriverManager.getConnection(strConn, strUser,
    				strPassword); 
    		String query = ("SELECT * FROM " + "city_demographics" 
    				+ " WHERE NAME = ? AND state_abbrv = ?;" );
    		PreparedStatement pstmt = conn.prepareStatement(query); 
    		pstmt.setString(1, cityName);
    		pstmt.setString(2, stateCode);
    		ResultSet res = pstmt.executeQuery();		
    		while(res.next()){
    			//need to initialize these still
    			int pop = res.getInt("population"); 
    			//	float popChg = res.getFloat("pop_change");
    			float over = res.getFloat("over_65");
    			int ageHouse = res.getInt("house_age");
    			float highS = res.getFloat("high_school");
    			float pov = res.getFloat("poverty");
    			int median = res.getInt("median_income");
    			float owner = res.getFloat("owner");
    			//	int pop2007 = res.get
    			population = pop;

    			System.out.println(population);
    			//popChange = popChg;
    			over65 = over;
    			System.out.println(over65);
    			houseAge = ageHouse;
    			highSchool = highS;
    			poverty = pov;
    			medianIncome = median;
    			ownerOccupy = owner;
    			System.out.println(houseAge);
    		}

    	}
    	catch(SQLException e) {
    		System.out.println(" A SQL error: " + e.getMessage());
    	}    
    	catch (Exception ex) {
    		ex.printStackTrace();
    	}


    	// pull analog list
    	try{
    		double d = 0.50;
    		if(climDivCode == 10101){
    			double x = 2.40;
    			d = x;
    		}


    		float tempIncrement = (float)d;
    		float tempMin = projTemp2011 - tempIncrement;
    		tempMinimum = tempMin;
    		System.out.println("Temp min = " + tempMin);
    		float tempMax = projTemp2011 + tempIncrement;
    		tempMaximum = tempMax;
    		System.out.println("Temp max = " + tempMax);
    		double p = 2.00;
    		if(climDivCode == 10101){
    			double x = 4.00;
    			p = x;
    		}

    		float precipIncrement = (float)p;
    		float precipMin = projPrecip2011 - precipIncrement;
    		precipMinimum = precipMin;
    		System.out.println("Precip min = " + precipMin);
    		float precipMax = projPrecip2011 + precipIncrement;
    		precipMaximum = precipMax;
    		System.out.println("Precip max = " + precipMax);
    		Class.forName("com.mysql.jdbc.Driver"); 
    		Connection conn = DriverManager.getConnection(strConn, strUser,
    				strPassword); 	  
    		String query = ("SELECT * FROM " + "clim_past" 
    				//  + " LEFT JOIN clim_past ON clim_past.state_cd"
    				// + " = great_lakes.state_cd WHERE clim_past.temp_1981"
    				+ " WHERE temp_1981 BETWEEN ? AND ? AND precip_1981 BETWEEN"
    				+ " ? AND ?;");  	    
    		PreparedStatement pstmt = conn.prepareStatement(query); 
    		pstmt.setFloat(1, tempMin); 
    		pstmt.setFloat(2, tempMax);
    		pstmt.setFloat(3, precipMin);
    		pstmt.setFloat(4, precipMax);

    		System.out.println(pstmt);
    		ResultSet rs = pstmt.executeQuery();
    		ArrayList<Integer> divisionList = new ArrayList<Integer>();
    		//ArrayList<String> countyList = new ArrayList<String>();
    		//ArrayList<String> stateList = new ArrayList<String>();
    		while(rs.next()){
    			divisionList.add( rs.getInt("state_cd") );
    			//	countyList.add( rs.getString("county") );
    			//stateList.add( rs.getString("state") );
    		}
    		Object[] divList = divisionList.toArray();
    		int sizeDiv = divList.length;
    		//System.out.println("divs = " sizeDiv);
    		//  System.out.println(divList);
    		divisionMatchList = divList;
    		System.out.println("divs = " + divisionMatchList.length);
    		System.out.println(Arrays.toString(divisionMatchList));
    		//ArrayList<String> countyList = new ArrayList<String>();
    		//while(rs.next()){
    		//	countyList.add( rs.getString("county") );
    		//}
    		//  Object[] countList = countyList.toArray();
    		//int sizeCount = countList.length;
    		// System.out.println(sizeCount);
    		//countyMatchList = countList;
    		//Object[] statList = stateList.toArray();
    		//stateMatchList = stateList;
    	}

    	catch(SQLException e) {
    		System.out.println(" A SQL error: " + e.getMessage());
    	}    
    	catch (Exception ex) {
    		ex.printStackTrace();
    	}

    


    	//	System.out.println(divisionMatchList);




    	// pull analog city list
    	for (Object div : divisionMatchList){
    		try{

    			int popIncrement = 20000;
    			int popMin = population - popIncrement;
    			popMinimum = popMin;
    			System.out.println("popMin = " + popMin);
    			int popMax = population + popIncrement;
    			popMaximum = popMax;
    			System.out.println("popMax = " + popMax);
    			//double c = 5.00;
    		//	float popChIncrement = (float)c;
    			//	float popChMin = popChange - popChIncrement;
    			//popChangeMin = popChMin;
    			//System.out.println("popChMin = " + popChangeMin);  
    			//float popChMax = popChange + popChIncrement;
    			//popChangeMax = popChMax;
    			//System.out.println("popChMax = " + popChangeMax);
    			double o = 5.00;
    			float over65Increment = (float)o;
    			float over65Min = over65 - over65Increment;
    			over65Minimum = over65Min;
    			System.out.println("over65Min = " + over65Minimum);
    			float over65Max = over65 + over65Increment;
    			over65Maximum = over65Max;
    			System.out.println("over65Max = " + over65Maximum);
    			double a = 5.00;
    			float houseAgeIncrement = (float)a;
    			float houseAgeMin = houseAge - houseAgeIncrement;
    			houseAgeMinimum = houseAgeMin;
    			System.out.println("houseAgeMin = " + houseAgeMinimum);
    			float houseAgeMax = houseAge + houseAgeIncrement;
    			houseAgeMaximum = houseAgeMax;
    			System.out.println("houseAgeMax = " + houseAgeMaximum);
    			int medianIncrement = (int)(medianIncome * 0.05);
    			int medianIncomeMin = medianIncome - medianIncrement;
    			medianIncomeMinimum = medianIncomeMin;
    			System.out.println("medianIncomeMin = " + medianIncomeMinimum);
    			int medianIncomeMax = medianIncome + medianIncrement;
    			medianIncomeMaximum = medianIncomeMax;
    			System.out.println("medianIncomeMax = " + medianIncomeMaximum);
    			double h = 5.00;
    			float highSchoolIncrement = (float)h;
    			float highSchoolMin = highSchool - highSchoolIncrement;
    			highSchoolMinimum = highSchoolMin;
    			float highSchoolMax = highSchool + highSchoolIncrement;
    			highSchoolMaximum = highSchoolMax;
    			double p = 5.00;
    			float povertyIncrement = (float)p;
    			float povertyMin = poverty - povertyIncrement;
    			povertyMinimum = povertyMin;
    			float povertyMax = poverty + povertyIncrement;
    			povertyMaximum = povertyMax;
    			double ow = 5.00;
    			float ownerIncrement = (float)ow;
    			float ownerMin = ownerOccupy - ownerIncrement;
    			ownerMinimum = ownerMin;
    			System.out.println("ownerMin = " + ownerMin);
    			float ownerMax = ownerOccupy + ownerIncrement;
    			ownerMaximum = ownerMax;
    			System.out.println("ownerMax = " + ownerMax);
    			double mn = 0.00;
    			double mx = 0.00;
    			float min = (float)mn;
    			float max = (float)mx;
    			System.out.println("filterCode = " + filterCode);
    			System.out.println("code type =" + filterCode.getClass().getName());
    			
    			if (filterCode.equals("over_65")){
    				System.out.println("code = 1");
    				min = over65Min;
    				max = over65Max;
    				demoMin = min;
    				demoMax = max;
    			}
    			else if (filterCode.equals("house_age")){
    				System.out.println("code = 2");
    				min = houseAgeMin;
    				max = houseAgeMax;
    				demoMin = min;
    				demoMax = max;
    			}
    			else if (filterCode.equals("median_income")){
    				System.out.println("code = 3");
    				min = medianIncomeMin;
    				max = medianIncomeMax;
    				demoMin = min;
    				demoMax = max;
    			}
    			else if (filterCode.equals("high_school")){
    				System.out.println("code = 4");
    				min = highSchoolMin;
    				max = highSchoolMax;
    				demoMin = min;
    				demoMax = max;
    			}
    			else if (filterCode.equals("poverty")){
    				System.out.println("code = 5");
    				min = povertyMin;
    				max = povertyMax;
    				demoMin = min;
    				demoMax = max;
    			}
    			else if (filterCode.equals("owner")){
    				System.out.println("code = 6");
    				min = ownerMin;
    				max = ownerMax;
    				demoMin = min;
    				demoMax = max;
    			}
    			System.out.println("min = " + min);
    			System.out.println("max = " + max);
    			Class.forName("com.mysql.jdbc.Driver"); 
    			Connection conn = DriverManager.getConnection(strConn, strUser,
    					strPassword); 	  
    			String query = ("SELECT * FROM " + "city_demographics" 
    					+ " WHERE climdiv = ? AND population BETWEEN ? AND ? AND " + filterCode
    					+ " BETWEEN ? AND ?;" );  	    
    			PreparedStatement pstmt = conn.prepareStatement(query); 
    			pstmt.setObject(1, div); 
    			pstmt.setInt(2, popMinimum);
    			pstmt.setInt(3, popMaximum);
    			pstmt.setFloat(4, min);
    			pstmt.setFloat(5, max);
    			
    			System.out.println(pstmt);
    			ResultSet rs = pstmt.executeQuery();
    			//ArrayList<String> cityMatList = new ArrayList<String>();
    			//String analogStat = new String();
    			while(rs.next()){
    				cityMatchList.add( rs.getString("name") );
    				stateMatchList.add( rs.getString("state_abbrv"));
    				analogPopList.add( rs.getInt("population"));
    				analogOver65List.add( rs.getFloat("over_65"));
    				analogHouseAgeList.add( rs.getInt("house_age"));
    				analogMedianIncomeList.add( rs.getInt("median_income"));
    				analogHighSchoolList.add( rs.getFloat("high_school"));
    				analogPovertyList.add( rs.getFloat("poverty"));
    				analogOwnerList.add(rs.getFloat("owner"));

    			}
    			//Object[] citMatList = cityMatList.toArray();
    			//int sizeCit = citMatList.length;
    			//System.out.println(sizeCit);
    			//  System.out.println(divList);
    			//	cityMatchList = cityMatList;
    			//analogState = analogStat;
    			// System.out.println(cityMatchList[1].toString());
    			//System.out.println(cityMatchList[2].toString());
    		}

    		catch(SQLException e) {
    			System.out.println(" A SQL error: " + e.getMessage());
    		}    
    		catch (Exception ex) {
    			ex.printStackTrace();
    		}
    		System.out.println(cityMatchList.toString());
    	}
    	//System.out.println("cities = " + cityMatchList.size());
    	//System.out.println("states = " + stateMatchList.size());
    	if (cityMatchList.size() == 0){
    		System.out.println("NO ANALOG CITIES OF SAME SIZE FOR ANNUAL");
    		popMatch += 1;
    		// JOptionPane.showMessageDialog(this,"Sorry, cannot find analog \n"
    		//				      + "for your city",
    		//			      "CIAT: Error",
    		//			      JOptionPane.WARNING_MESSAGE);
    		for (Object div : divisionMatchList){
    			try{
    				Class.forName("com.mysql.jdbc.Driver"); 
    				Connection conn = DriverManager.getConnection(strConn, strUser,
    						strPassword); 	  
    				String query = ("SELECT * FROM " + "city_demographics" 
    						+ " WHERE CLIMDIV = ? AND "
    						+ filterCode + " BETWEEN ? AND ? order by population desc limit 5;" );  	    
    				PreparedStatement pstmt = conn.prepareStatement(query); 
    				pstmt.setObject(1, div); 
    				pstmt.setFloat(2, demoMin);
    				pstmt.setFloat(3, demoMax);
    				System.out.println(pstmt);
    				ResultSet rs = pstmt.executeQuery();
    				while(rs.next()){
    					cityMatchList.add( rs.getString("NAME") );
    					stateMatchList.add( rs.getString("STATE_ABBRV"));
    					analogPopList.add( rs.getInt("population"));
    					analogOver65List.add( rs.getFloat("over_65"));
    					analogHouseAgeList.add( rs.getInt("house_age"));
    					analogMedianIncomeList.add( rs.getInt("median_income"));
    					analogHighSchoolList.add( rs.getFloat("high_school"));
    					analogPovertyList.add( rs.getFloat("poverty"));
    					analogOwnerList.add(rs.getFloat("owner"));
    				}
    				//Object[] citMatList = cityMatList.toArray();
    				//int sizeCit = citMatList.length;
    				//System.out.println(sizeCit);
    				//  System.out.println(divList);
    				//	cityMatchList = cityMatList;
    				//analogState = analogStat;
    				// System.out.println(cityMatchList[1].toString());
    				//System.out.println(cityMatchList[2].toString());
    			}

    			catch(SQLException e) {
    				System.out.println(" A SQL error: " + e.getMessage());
    			}    
    			catch (Exception ex) {
    				ex.printStackTrace();
    			}
    		}


    	}
    	if (cityMatchList.size() == 0){
    		System.out.println("NO ANALOG CITIES OF SAME SIZE FOR ANNUAL");
    		popMatch += 1;
    		// JOptionPane.showMessageDialog(this,"Sorry, cannot find analog \n"
    		//				      + "for your city",
    		//			      "CIAT: Error",
    		//			      JOptionPane.WARNING_MESSAGE);
    		for (Object div : divisionMatchList){
    			try{
    				Class.forName("com.mysql.jdbc.Driver"); 
    				Connection conn = DriverManager.getConnection(strConn, strUser,
    						strPassword); 	  
    				String query = ("SELECT * FROM " + "city_demographics " 
    						+ "WHERE CLIMDIV = ? order by population desc limit 5;" );  	    
    				PreparedStatement pstmt = conn.prepareStatement(query);
    				pstmt.setObject(1, div); 
    				System.out.println(pstmt);
    				ResultSet rs = pstmt.executeQuery();
    				while(rs.next()){
    					cityMatchList.add( rs.getString("NAME") );
    					stateMatchList.add( rs.getString("STATE_ABBRV"));
    					analogPopList.add( rs.getInt("population"));
    					analogOver65List.add( rs.getFloat("over_65"));
    					analogHouseAgeList.add( rs.getInt("house_age"));
    					analogMedianIncomeList.add( rs.getInt("median_income"));
    					analogHighSchoolList.add( rs.getFloat("high_school"));
    					analogPovertyList.add( rs.getFloat("poverty"));
    					analogOwnerList.add(rs.getFloat("owner"));
    				}

    			}

    			catch(SQLException e) {
    				System.out.println(" A SQL error: " + e.getMessage());
    			}    
    			catch (Exception ex) {
    				ex.printStackTrace();
    			}
    		}


    	}
    	//	if (state != Ontario){
    	// pull spring analog list
    	try{
    		double d = 0.50;
    		if(climDivCode == 10101){
    			double x = 2.50;
    			d = x;
    		}
    		float tempIncrement = (float)d;
    		float tempMin = springProjTemp - tempIncrement;
    		springTempMin = tempMin;
    		System.out.println("Spring Temp min = " + tempMin);
    		float tempMax = springProjTemp + tempIncrement;
    		springTempMax = tempMax;
    		System.out.println("Spring Temp max = " + tempMax);
    		double p = 1.040;
    		float precipIncrement = (float)p;
    		float precipMin = springProjPrecip - precipIncrement;
    		springPrecipMin = precipMin;
    		System.out.println("Spring Precip min = " + precipMin);
    		float precipMax = springProjPrecip + precipIncrement;
    		springPrecipMax = precipMax;
    		System.out.println("Spring Precip max = " + precipMax);
    		Class.forName("com.mysql.jdbc.Driver"); 
    		Connection conn = DriverManager.getConnection(strConn, strUser,
    				strPassword); 	  
    		String query = ("SELECT * FROM " + "spring_temp" 
    				+ " JOIN spring_precip ON spring_temp.cd"
    				+ " = spring_precip.cd WHERE spring_temp.temp"
    				+ " BETWEEN ? AND ? AND (spring_precip.precip BETWEEN"
    				+ " ? AND ?);");  	    
    		PreparedStatement pstmt = conn.prepareStatement(query); 
    		pstmt.setFloat(1, tempMin); 
    		pstmt.setFloat(2, tempMax);;
    		pstmt.setFloat(3, precipMin);
    		pstmt.setFloat(4, precipMax);

    		System.out.println(pstmt);
    		ResultSet rs = pstmt.executeQuery();
    		ArrayList<Integer> divisionList = new ArrayList<Integer>();
    		//ArrayList<String> countyList = new ArrayList<String>();
    		//ArrayList<String> stateList = new ArrayList<String>();
    		while(rs.next()){
    			divisionList.add( rs.getInt("cd") );
    			//	countyList.add( rs.getString("county") );
    			//stateList.add( rs.getString("state") );
    		}
    		Object[] divList = divisionList.toArray();
    		int sizeDiv = divList.length;
    		//System.out.println("divs = " sizeDiv);
    		//  System.out.println(divList);
    		divisionSpringMatchList = divList;
    		System.out.println("Spring divs = " + divisionSpringMatchList.length);
    		System.out.println(Arrays.toString(divisionSpringMatchList));
    		//ArrayList<String> countyList = new ArrayList<String>();
    		//while(rs.next()){
    		//	countyList.add( rs.getString("county") );
    		//}
    		//  Object[] countList = countyList.toArray();
    		//int sizeCount = countList.length;
    		// System.out.println(sizeCount);
    		//countyMatchList = countList;
    		//Object[] statList = stateList.toArray();
    		//stateMatchList = stateList;
    	}

    	catch(SQLException e) {
    		System.out.println(" A SQL error: " + e.getMessage());
    	}    
    	catch (Exception ex) {
    		ex.printStackTrace();
    	}




    	//	System.out.println(divisionMatchList);
    	// pull analog city list
    	for (Object div : divisionSpringMatchList){
    		try{
    			Class.forName("com.mysql.jdbc.Driver"); 
    			Connection conn = DriverManager.getConnection(strConn, strUser,
    					strPassword); 	  
    			String query = ("SELECT * FROM " + "city_demographics" 
    					+ " WHERE climdiv = ? AND population BETWEEN ? AND ? AND " + filterCode
    					+ " BETWEEN ? AND ?;" );  	    
    			PreparedStatement pstmt = conn.prepareStatement(query);

    			pstmt.setObject(1, div); 
    			pstmt.setInt(2, popMinimum);
    			pstmt.setInt(3, popMaximum);
    			pstmt.setFloat(4, demoMin);
    			pstmt.setFloat(5, demoMax);
    			System.out.println("Spring statement = "+ pstmt);
    			ResultSet rs = pstmt.executeQuery();
    			//ArrayList<String> cityMatList = new ArrayList<String>();
    			//String analogStat = new String();
    			while(rs.next()){
    				citySpringMatchList.add( rs.getString("name") );
    				stateSpringMatchList.add( rs.getString("state_abbrv"));
    			}
    			//Object[] citMatList = cityMatList.toArray();
    			//int sizeCit = citMatList.length;
    			//System.out.println(sizeCit);
    			//  System.out.println(divList);
    			//	cityMatchList = cityMatList;
    			//analogState = analogStat;
    			// System.out.println(cityMatchList[1].toString());
    			//System.out.println(cityMatchList[2].toString());
    			System.out.println(popMatchSpring);
    			System.out.println(citySpringMatchList);
    		}

    		catch(SQLException e) {
    			System.out.println(" A SQL error: " + e.getMessage());
    		}    
    		catch (Exception ex) {
    			ex.printStackTrace();
    		}
    	}
    	//System.out.println("cities = " + cityMatchList.size());
    	//System.out.println("states = " + stateMatchList.size());
    	if (citySpringMatchList.size() == 0){
    		System.out.println("NO ANALOG CITIES OF SAME SIZE FOR SPRING");
    		popMatchSpring += 1;
    		// JOptionPane.showMessageDialog(this,"Sorry, cannot find analog \n"
    		//				      + "for your city",
    		//			      "CIAT: Error",
    		//			      JOptionPane.WARNING_MESSAGE);
    		for (Object div : divisionSpringMatchList){
    			try{
    				Class.forName("com.mysql.jdbc.Driver"); 
    				Connection conn = DriverManager.getConnection(strConn, strUser,
    						strPassword); 	  
    				String query = ("SELECT * FROM " + "city_demographics" 
    						+ " WHERE CLIMDIV = ? AND "
    						+ filterCode + " BETWEEN ? AND ? order by population desc limit 5;" );  	    
    				PreparedStatement pstmt = conn.prepareStatement(query); 
    				pstmt.setObject(1, div); 
    				pstmt.setFloat(2, demoMin);
    				pstmt.setFloat(3, demoMax);
    				//System.out.println(pstmt);
    				ResultSet rs = pstmt.executeQuery();
    				while(rs.next()){
    					citySpringMatchList.add( rs.getString("NAME") );
    					stateSpringMatchList.add( rs.getString("STATE_ABBRV"));
    				}
    				//Object[] citMatList = cityMatList.toArray();
    				//int sizeCit = citMatList.length;
    				//System.out.println(sizeCit);
    				//  System.out.println(divList);
    				//	cityMatchList = cityMatList;
    				//analogState = analogStat;
    				// System.out.println(cityMatchList[1].toString());
    				//System.out.println(cityMatchList[2].toString());

    			}

    			catch(SQLException e) {
    				System.out.println(" A SQL error: " + e.getMessage());
    			}    
    			catch (Exception ex) {
    				ex.printStackTrace();
    			}


    		}
    	}
    	//System.out.println("states = " + stateMatchList.size());
    	if (citySpringMatchList.size() == 0){
    		System.out.println("NO ANALOG CITIES OF SAME SIZE FOR SPRING");
    		popMatchSpring += 1;
    		// JOptionPane.showMessageDialog(this,"Sorry, cannot find analog \n"
    		//				      + "for your city",
    		//			      "CIAT: Error",
    		//			      JOptionPane.WARNING_MESSAGE);
    		for (Object div : divisionSpringMatchList){
    			try{
    				Class.forName("com.mysql.jdbc.Driver"); 
    				Connection conn = DriverManager.getConnection(strConn, strUser,
    						strPassword); 	  
    				String query = ("SELECT * FROM " + "city_demographics" 
    						+ " WHERE CLIMDIV = ? order by population desc limit 5;" );  	    
    				PreparedStatement pstmt = conn.prepareStatement(query);
    				pstmt.setObject(1, div); 
    				//System.out.println(pstmt);
    				ResultSet rs = pstmt.executeQuery();
    				while(rs.next()){
    					citySpringMatchList.add( rs.getString("NAME") );
    					stateSpringMatchList.add( rs.getString("STATE_ABBRV"));
    				}
    				//Object[] citMatList = cityMatList.toArray();
    				//int sizeCit = citMatList.length;
    				//System.out.println(sizeCit);
    				//  System.out.println(divList);
    				//	cityMatchList = cityMatList;
    				//analogState = analogStat;
    				// System.out.println(cityMatchList[1].toString());
    				//System.out.println(cityMatchList[2].toString());

    			}

    			catch(SQLException e) {
    				System.out.println(" A SQL error: " + e.getMessage());
    			}    
    			catch (Exception ex) {
    				ex.printStackTrace();
    			}


    		}
    	}


    	System.out.println("popMatchSpring = " + popMatchSpring);
    	// pull winter analog list
    	try{
    		double d = 0.50;
    		if(climDivCode == 10101){
    			double x = 2.50;
    			d = x;
    		}
    		float tempIncrement = (float)d;
    		float tempMin = winterProjTemp - tempIncrement;
    		winterTempMin = tempMin;
    		System.out.println("Winter Temp min = " + tempMin);
    		float tempMax = winterProjTemp + tempIncrement;
    		winterTempMax = tempMax;
    		System.out.println("Winter Temp max = " + tempMax);
    		double p = 1.00;
    		if(climDivCode == 10101){
    			double x = 2.50;
    			p = x;
    		}
    		float precipIncrement = (float)p;
    		float precipMin = winterProjPrecip - precipIncrement;
    		winterPrecipMin = precipMin;
    		System.out.println("Winter Precip min = " + precipMin);
    		float precipMax = winterProjPrecip + precipIncrement;
    		winterPrecipMax = precipMax;
    		System.out.println("Winter Precip max = " + precipMax);
    		Class.forName("com.mysql.jdbc.Driver"); 
    		Connection conn = DriverManager.getConnection(strConn, strUser,
    				strPassword); 	  
    		String query = ("SELECT * FROM " + "winter_temp" 
    				+ " JOIN winter_precip ON winter_temp.cd"
    				+ " = winter_precip.cd WHERE winter_temp.temp"
    				+ " BETWEEN ? AND ? AND (winter_precip.precip BETWEEN"
    				+ " ? AND ?);");  	    
    		PreparedStatement pstmt = conn.prepareStatement(query); 
    		pstmt.setFloat(1, tempMin); 
    		pstmt.setFloat(2, tempMax);;
    		pstmt.setFloat(3, precipMin);
    		pstmt.setFloat(4, precipMax);

    		System.out.println(pstmt);
    		ResultSet rs = pstmt.executeQuery();
    		ArrayList<Integer> divisionList = new ArrayList<Integer>();
    		//ArrayList<String> countyList = new ArrayList<String>();
    		//ArrayList<String> stateList = new ArrayList<String>();
    		while(rs.next()){
    			divisionList.add( rs.getInt("cd") );
    			//	countyList.add( rs.getString("county") );
    			//stateList.add( rs.getString("state") );
    		}
    		Object[] divList = divisionList.toArray();
    		int sizeDiv = divList.length;
    		//System.out.println("divs = " sizeDiv);
    		//  System.out.println(divList);
    		divisionWinterMatchList = divList;
    		System.out.println("Winter divs = " + divisionWinterMatchList.length);
    		System.out.println(Arrays.toString(divisionWinterMatchList));
    		//ArrayList<String> countyList = new ArrayList<String>();
    		//while(rs.next()){
    		//	countyList.add( rs.getString("county") );
    		//}
    		//  Object[] countList = countyList.toArray();
    		//int sizeCount = countList.length;
    		// System.out.println(sizeCount);
    		//countyMatchList = countList;
    		//Object[] statList = stateList.toArray();
    		//stateMatchList = stateList;
    	}

    	catch(SQLException e) {
    		System.out.println(" A SQL error: " + e.getMessage());
    	}    
    	catch (Exception ex) {
    		ex.printStackTrace();
    	}


    	//	System.out.println(divisionMatchList);
    	// pull analog winter city list
    	for (Object div : divisionWinterMatchList){
    		try{

    			Class.forName("com.mysql.jdbc.Driver"); 
    			Connection conn = DriverManager.getConnection(strConn, strUser,
    					strPassword); 	  
    			String query = ("SELECT * FROM " + "city_demographics" 
    					+ " WHERE climdiv = ? AND population BETWEEN ? AND ? AND " + filterCode
    					+ " BETWEEN ? AND ?;" );  	    
    			PreparedStatement pstmt = conn.prepareStatement(query);

    			pstmt.setObject(1, div); 
    			pstmt.setInt(2, popMinimum);
    			pstmt.setInt(3, popMaximum);
    			pstmt.setFloat(4, demoMin);
    			pstmt.setFloat(5, demoMax);
    			ResultSet rs = pstmt.executeQuery();
    			//ArrayList<String> cityMatList = new ArrayList<String>();
    			//String analogStat = new String();
    			while(rs.next()){
    				cityWinterMatchList.add( rs.getString("name") );
    				stateWinterMatchList.add( rs.getString("state_abbrv"));
    			}
    			//Object[] citMatList = cityMatList.toArray();
    			//int sizeCit = citMatList.length;
    			//System.out.println(sizeCit);
    			//  System.out.println(divList);
    			//	cityMatchList = cityMatList;
    			//analogState = analogStat;
    			// System.out.println(cityMatchList[1].toString());
    			//System.out.println(cityMatchList[2].toString());
    			System.out.println(cityWinterMatchList);
    		}

    		catch(SQLException e) {
    			System.out.println(" A SQL error: " + e.getMessage());
    		}    
    		catch (Exception ex) {
    			ex.printStackTrace();
    		}
    	}
    	//System.out.println("cities = " + cityMatchList.size());
    	//System.out.println("states = " + stateMatchList.size());
    	if (cityWinterMatchList.size() == 0){
    		System.out.println("NO CITIES OF SAME SIZE FOR WINTER");
    		popMatchWinter += 1;
    		// JOptionPane.showMessageDialog(this,"Sorry, cannot find analog \n"
    		//				      + "for your city",
    		//			      "CIAT: Error",
    		//			      JOptionPane.WARNING_MESSAGE);
    		for (Object div : divisionWinterMatchList){
    			try{
    				Class.forName("com.mysql.jdbc.Driver"); 
    				Connection conn = DriverManager.getConnection(strConn, strUser,
    						strPassword); 	  
    				String query = ("SELECT * FROM " + "city_demographics" 
    						+ " WHERE CLIMDIV = ? AND "
    						+ filterCode + " BETWEEN ? AND ? order by population desc limit 5;" );  	    
    				PreparedStatement pstmt = conn.prepareStatement(query); 
    				pstmt.setObject(1, div); 
    				pstmt.setFloat(2, demoMin);
    				pstmt.setFloat(3, demoMax);
    				System.out.println("Winter = " + pstmt);
    				ResultSet rs = pstmt.executeQuery();
    				while(rs.next()){
    					cityWinterMatchList.add( rs.getString("NAME") );
    					stateWinterMatchList.add( rs.getString("STATE_ABBRV"));
    				}
    				//Object[] citMatList = cityMatList.toArray();
    				//int sizeCit = citMatList.length;
    				//System.out.println(sizeCit);
    				//  System.out.println(divList);
    				//	cityMatchList = cityMatList;
    				//analogState = analogStat;
    				// System.out.println(cityMatchList[1].toString());
    				//System.out.println(cityMatchList[2].toString());
    			}

    			catch(SQLException e) {
    				System.out.println(" A SQL error: " + e.getMessage());
    			}    
    			catch (Exception ex) {
    				ex.printStackTrace();
    			}
    		}

    	}

    	if (cityWinterMatchList.size() == 0){
    		System.out.println("NO CITIES OF SAME SIZE FOR WINTER");
    		popMatchWinter += 1;
    		// JOptionPane.showMessageDialog(this,"Sorry, cannot find analog \n"
    		//				      + "for your city",
    		//			      "CIAT: Error",
    		//			      JOptionPane.WARNING_MESSAGE);
    		for (Object div : divisionWinterMatchList){
    			try{
    				Class.forName("com.mysql.jdbc.Driver"); 
    				Connection conn = DriverManager.getConnection(strConn, strUser,
    						strPassword); 	  
    				String query = ("SELECT * FROM " + "city_demographics WHERE" 
    						+ " CLIMDIV = ? order by population desc limit 5;" );  	    
    				PreparedStatement pstmt = conn.prepareStatement(query); 
    				System.out.println("Winter = " + pstmt);
    				pstmt.setObject(1, div);
    				ResultSet rs = pstmt.executeQuery();
    				while(rs.next()){
    					cityWinterMatchList.add( rs.getString("NAME") );
    					stateWinterMatchList.add( rs.getString("STATE_ABBRV"));
    				}
    				//Object[] citMatList = cityMatList.toArray();
    				//int sizeCit = citMatList.length;
    				//System.out.println(sizeCit);
    				//  System.out.println(divList);
    				//	cityMatchList = cityMatList;
    				//analogState = analogStat;
    				// System.out.println(cityMatchList[1].toString());
    				//System.out.println(cityMatchList[2].toString());
    			}

    			catch(SQLException e) {
    				System.out.println(" A SQL error: " + e.getMessage());
    			}    
    			catch (Exception ex) {
    				ex.printStackTrace();
    			}
    		}

    	}

    	// pull summer analog list
    	try{
    		double d = 0.50;
    		if(climDivCode == 10101){
    			double x = 2.50;
    			d = x;
    		}
    		float tempIncrement = (float)d;
    		float tempMin = summerProjTemp - tempIncrement;
    		summerTempMin = tempMin;
    		System.out.println("Summer Temp min = " + tempMin);
    		float tempMax = summerProjTemp + tempIncrement;
    		summerTempMax = tempMax;
    		System.out.println("Summer Temp max = " + tempMax);
    		double p = 1.00;
    		float precipIncrement = (float)p;
    		float precipMin = summerProjPrecip - precipIncrement;
    		summerPrecipMin = precipMin;
    		System.out.println("Summer Precip min = " + precipMin);
    		float precipMax = summerProjPrecip + precipIncrement;
    		summerPrecipMax = precipMax;
    		System.out.println("Summer Precip max = " + precipMax);
    		Class.forName("com.mysql.jdbc.Driver"); 
    		Connection conn = DriverManager.getConnection(strConn, strUser,
    				strPassword); 	  
    		String query = ("SELECT * FROM " + "summer_temp" 
    				+ " JOIN summer_precip ON summer_temp.cd"
    				+ " = summer_precip.cd WHERE summer_temp.temp"
    				+ " BETWEEN ? AND ? AND (summer_precip.precip BETWEEN"
    				+ " ? AND ?);");  	    
    		PreparedStatement pstmt = conn.prepareStatement(query); 
    		pstmt.setFloat(1, tempMin); 
    		pstmt.setFloat(2, tempMax);;
    		pstmt.setFloat(3, precipMin);
    		pstmt.setFloat(4, precipMax);

    		System.out.println(pstmt);
    		ResultSet rs = pstmt.executeQuery();
    		ArrayList<Integer> divisionList = new ArrayList<Integer>();
    		//ArrayList<String> countyList = new ArrayList<String>();
    		//ArrayList<String> stateList = new ArrayList<String>();
    		while(rs.next()){
    			divisionList.add( rs.getInt("cd") );
    			//	countyList.add( rs.getString("county") );
    			//stateList.add( rs.getString("state") );
    		}
    		Object[] divList = divisionList.toArray();
    		int sizeDiv = divList.length;
    		//System.out.println("divs = " sizeDiv);
    		//  System.out.println(divList);
    		divisionSummerMatchList = divList;
    		System.out.println("Summer divs = " + divisionSummerMatchList.length);
    		System.out.println(Arrays.toString(divisionSummerMatchList));
    		//ArrayList<String> countyList = new ArrayList<String>();
    		//while(rs.next()){
    		//	countyList.add( rs.getString("county") );
    		//}
    		//  Object[] countList = countyList.toArray();
    		//int sizeCount = countList.length;
    		// System.out.println(sizeCount);
    		//countyMatchList = countList;
    		//Object[] statList = stateList.toArray();
    		//stateMatchList = stateList;
    	}

    	catch(SQLException e) {
    		System.out.println(" A SQL error: " + e.getMessage());
    	}    
    	catch (Exception ex) {
    		ex.printStackTrace();
    	}

    	// pull analog summer city list
    	for (Object div : divisionSummerMatchList){
    		try{

    			Class.forName("com.mysql.jdbc.Driver"); 
    			Connection conn = DriverManager.getConnection(strConn, strUser,
    					strPassword); 	  
    			String query = ("SELECT * FROM " + "city_demographics" 
    					+ " WHERE climdiv = ? AND population BETWEEN ? AND ? AND " + filterCode
    					+ " BETWEEN ? AND ?;" );  	    
    			PreparedStatement pstmt = conn.prepareStatement(query);

    			pstmt.setObject(1, div); 
    			pstmt.setInt(2, popMinimum);
    			pstmt.setInt(3, popMaximum);
    			pstmt.setFloat(4, demoMin);
    			pstmt.setFloat(5, demoMax);
    			ResultSet rs = pstmt.executeQuery();
    			//ArrayList<String> cityMatList = new ArrayList<String>();
    			//String analogStat = new String();
    			while(rs.next()){
    				citySummerMatchList.add( rs.getString("name") );
    				stateSummerMatchList.add( rs.getString("state_abbrv"));
    			}
    			//Object[] citMatList = cityMatList.toArray();
    			//int sizeCit = citMatList.length;
    			//System.out.println(sizeCit);
    			//  System.out.println(divList);
    			//	cityMatchList = cityMatList;
    			//analogState = analogStat;
    			// System.out.println(cityMatchList[1].toString());
    			//System.out.println(cityMatchList[2].toString());
    		}

    		catch(SQLException e) {
    			System.out.println(" A SQL error: " + e.getMessage());
    		}    
    		catch (Exception ex) {
    			ex.printStackTrace();
    		}
    	}
    	//System.out.println("cities = " + cityMatchList.size());
    	//System.out.println("states = " + stateMatchList.size());
    	if (citySummerMatchList.size() == 0){
    		System.out.println("NO CITIES OF SAME SIZE FOR SUMMER");
    		popMatchSummer += 1;
    		// JOptionPane.showMessageDialog(this,"Sorry, cannot find analog \n"
    		//				      + "for your city",
    		//			      "CIAT: Error",
    		//			      JOptionPane.WARNING_MESSAGE);
    		for (Object div : divisionSummerMatchList){
    			try{
    				Class.forName("com.mysql.jdbc.Driver"); 
    				Connection conn = DriverManager.getConnection(strConn, strUser,
    						strPassword); 	  
    				String query = ("SELECT * FROM " + "city_demographics" 
    						+ " WHERE CLIMDIV = ? AND "
    						+ filterCode + " BETWEEN ? AND ? order by population desc limit 5;" );  	    
    				PreparedStatement pstmt = conn.prepareStatement(query); 
    				pstmt.setObject(1, div); 
    				pstmt.setFloat(2, demoMin);
    				pstmt.setFloat(3, demoMax);
    				//System.out.println(pstmt);
    				ResultSet rs = pstmt.executeQuery();
    				while(rs.next()){
    					citySummerMatchList.add( rs.getString("NAME") );
    					stateSummerMatchList.add( rs.getString("STATE_ABBRV"));;
    				}
    				//Object[] citMatList = cityMatList.toArray();
    				//int sizeCit = citMatList.length;
    				//System.out.println(sizeCit);
    				//  System.out.println(divList);
    				//	cityMatchList = cityMatList;
    				//analogState = analogStat;
    				// System.out.println(cityMatchList[1].toString());
    				//System.out.println(cityMatchList[2].toString());
    			}

    			catch(SQLException e) {
    				System.out.println(" A SQL error: " + e.getMessage());
    			}    
    			catch (Exception ex) {
    				ex.printStackTrace();
    			}
    		}

    	}

    	if (citySummerMatchList.size() == 0){
    		System.out.println("NO CITIES OF SAME SIZE FOR SUMMER");
    		popMatchSummer += 1;
    		// JOptionPane.showMessageDialog(this,"Sorry, cannot find analog \n"
    		//				      + "for your city",
    		//			      "CIAT: Error",
    		//			      JOptionPane.WARNING_MESSAGE);
    		for (Object div : divisionSummerMatchList){
    			try{
    				Class.forName("com.mysql.jdbc.Driver"); 
    				Connection conn = DriverManager.getConnection(strConn, strUser,
    						strPassword); 	  
    				String query = ("SELECT * FROM " + "city_demographics WHERE CLIMDIV " 
    						+ " = ? order by population desc limit 5;" );  	    
    				PreparedStatement pstmt = conn.prepareStatement(query); 
    				//System.out.println(pstmt);
    				ResultSet rs = pstmt.executeQuery();
    				while(rs.next()){
    					citySummerMatchList.add( rs.getString("NAME") );
    					stateSummerMatchList.add( rs.getString("STATE_ABBRV"));;
    				}
    				//Object[] citMatList = cityMatList.toArray();
    				//int sizeCit = citMatList.length;
    				//System.out.println(sizeCit);
    				//  System.out.println(divList);
    				//	cityMatchList = cityMatList;
    				//analogState = analogStat;
    				// System.out.println(cityMatchList[1].toString());
    				//System.out.println(cityMatchList[2].toString());
    			}

    			catch(SQLException e) {
    				System.out.println(" A SQL error: " + e.getMessage());
    			}    
    			catch (Exception ex) {
    				ex.printStackTrace();
    			}
    		}

    	}
    	// pull fall analog list
    	try{
    		double d = 0.50;
    		if(climDivCode == 10101){
    			double x = 2.50;
    			d = x;
    		}
    		float tempIncrement = (float)d;
    		float tempMin = fallProjTemp - tempIncrement;
    		fallTempMin = tempMin;
    		System.out.println("Fall Temp min = " + tempMin);
    		float tempMax = fallProjTemp + tempIncrement;
    		fallTempMax = tempMax;
    		System.out.println("Fall Temp max = " + tempMax);
    		double p = 1.00;
    		float precipIncrement = (float)p;
    		float precipMin = fallProjPrecip - precipIncrement;
    		fallPrecipMin = precipMin;
    		System.out.println("Fall Precip min = " + precipMin);
    		float precipMax = fallProjPrecip + precipIncrement;
    		fallPrecipMax = precipMax;
    		System.out.println("Fall Precip max = " + precipMax);
    		Class.forName("com.mysql.jdbc.Driver"); 
    		Connection conn = DriverManager.getConnection(strConn, strUser,
    				strPassword); 	  
    		String query = ("SELECT * FROM " + "fall_temp" 
    				+ " JOIN fall_precip ON fall_temp.cd"
    				+ " = fall_precip.cd WHERE fall_temp.temp"
    				+ " BETWEEN ? AND ? AND (fall_precip.precip BETWEEN"
    				+ " ? AND ?);");  	    
    		PreparedStatement pstmt = conn.prepareStatement(query); 
    		pstmt.setFloat(1, tempMin); 
    		pstmt.setFloat(2, tempMax);;
    		pstmt.setFloat(3, precipMin);
    		pstmt.setFloat(4, precipMax);

    		System.out.println(pstmt);
    		ResultSet rs = pstmt.executeQuery();
    		ArrayList<Integer> divisionList = new ArrayList<Integer>();
    		//ArrayList<String> countyList = new ArrayList<String>();
    		//ArrayList<String> stateList = new ArrayList<String>();
    		while(rs.next()){
    			divisionList.add( rs.getInt("cd") );
    			//	countyList.add( rs.getString("county") );
    			//stateList.add( rs.getString("state") );
    		}
    		Object[] divList = divisionList.toArray();
    		int sizeDiv = divList.length;
    		//System.out.println("divs = " sizeDiv);
    		//  System.out.println(divList);
    		divisionFallMatchList = divList;
    		System.out.println("Fall divs = " + divisionFallMatchList.length);
    		System.out.println(Arrays.toString(divisionFallMatchList));
    		//ArrayList<String> countyList = new ArrayList<String>();
    		//while(rs.next()){
    		//	countyList.add( rs.getString("county") );
    		//}
    		//  Object[] countList = countyList.toArray();
    		//int sizeCount = countList.length;
    		// System.out.println(sizeCount);
    		//countyMatchList = countList;
    		//Object[] statList = stateList.toArray();
    		//stateMatchList = stateList;
    	}

    	catch(SQLException e) {
    		System.out.println(" A SQL error: " + e.getMessage());
    	}    
    	catch (Exception ex) {
    		ex.printStackTrace();
    	}

    	// pull analog fall city list
    	for (Object div : divisionFallMatchList){
    		try{
    			Class.forName("com.mysql.jdbc.Driver"); 
    			Connection conn = DriverManager.getConnection(strConn, strUser,
    					strPassword); 	  
    			String query = ("SELECT * FROM " + "city_demographics" 
    					+ " WHERE climdiv = ? AND population BETWEEN ? AND ? AND " + filterCode
    					+ " BETWEEN ? AND ?;" );  	    
    			PreparedStatement pstmt = conn.prepareStatement(query);

    			pstmt.setObject(1, div); 
    			pstmt.setInt(2, popMinimum);
    			pstmt.setInt(3, popMaximum);
    			pstmt.setFloat(4, demoMin);
    			pstmt.setFloat(5, demoMax);
    			ResultSet rs = pstmt.executeQuery();
    			//ArrayList<String> cityMatList = new ArrayList<String>();
    			//String analogStat = new String();
    			while(rs.next()){
    				cityFallMatchList.add( rs.getString("name") );
    				stateFallMatchList.add( rs.getString("state_abbrv"));
    			}
    			//Object[] citMatList = cityMatList.toArray();
    			//int sizeCit = citMatList.length;
    			//System.out.println(sizeCit);
    			//  System.out.println(divList);
    			//	cityMatchList = cityMatList;
    			//analogState = analogStat;
    			// System.out.println(cityMatchList[1].toString());
    			//System.out.println(cityMatchList[2].toString());
    		}

    		catch(SQLException e) {
    			System.out.println(" A SQL error: " + e.getMessage());
    		}    
    		catch (Exception ex) {
    			ex.printStackTrace();
    		}
    	}
    	//System.out.println("cities = " + cityMatchList.size());
    	//System.out.println("states = " + stateMatchList.size());
    	if (cityFallMatchList.size() == 0){
    		System.out.println("NO CITIES OF SAME SIZE FOR FALL");
    		popMatchFall += 1;
    		// JOptionPane.showMessageDialog(this,"Sorry, cannot find analog \n"
    		//				      + "for your city",
    		//			      "CIAT: Error",
    		//			      JOptionPane.WARNING_MESSAGE);
    		for (Object div : divisionFallMatchList){
    			try{
    				Class.forName("com.mysql.jdbc.Driver"); 
    				Connection conn = DriverManager.getConnection(strConn, strUser,
    						strPassword); 	  
    				String query = ("SELECT * FROM " + "city_demographics" 
    						+ " WHERE CLIMDIV = ? AND "
    						+ filterCode + " BETWEEN ? AND ? order by population desc limit 5;" );  	    
    				PreparedStatement pstmt = conn.prepareStatement(query); 
    				pstmt.setObject(1, div); 
    				pstmt.setFloat(2, demoMin);
    				pstmt.setFloat(3, demoMax);
    				//System.out.println(pstmt);
    				ResultSet rs = pstmt.executeQuery();
    				while(rs.next()){
    					cityFallMatchList.add( rs.getString("NAME") );
    					stateFallMatchList.add( rs.getString("STATE_ABBRV"));
    				}
    				//Object[] citMatList = cityMatList.toArray();
    				//int sizeCit = citMatList.length;
    				//System.out.println(sizeCit);
    				//  System.out.println(divList);
    				//	cityMatchList = cityMatList;
    				//analogState = analogStat;
    				// System.out.println(cityMatchList[1].toString());
    				//System.out.println(cityMatchList[2].toString());
    			}

    			catch(SQLException e) {
    				System.out.println(" A SQL error: " + e.getMessage());
    			}    
    			catch (Exception ex) {
    				ex.printStackTrace();
    			}
    		}

    	}
    	if (cityFallMatchList.size() == 0){
    		System.out.println("NO CITIES OF SAME SIZE FOR FALL");
    		popMatchFall += 1;
    		// JOptionPane.showMessageDialog(this,"Sorry, cannot find analog \n"
    		//				      + "for your city",
    		//			      "CIAT: Error",
    		//			      JOptionPane.WARNING_MESSAGE);
    		for (Object div : divisionFallMatchList){
    			try{
    				Class.forName("com.mysql.jdbc.Driver"); 
    				Connection conn = DriverManager.getConnection(strConn, strUser,
    						strPassword); 	  
    				String query = ("SELECT * FROM " + "city_demographics WHERE CLIMDIV" 
    						+ " = ? order by population desc limit 5;" );  	    
    				PreparedStatement pstmt = conn.prepareStatement(query);
    				pstmt.setObject(1, div); 
    				//System.out.println(pstmt);
    				ResultSet rs = pstmt.executeQuery();
    				while(rs.next()){
    					cityFallMatchList.add( rs.getString("NAME") );
    					stateFallMatchList.add( rs.getString("STATE_ABBRV"));
    				}
    				//Object[] citMatList = cityMatList.toArray();
    				//int sizeCit = citMatList.length;
    				//System.out.println(sizeCit);
    				//  System.out.println(divList);
    				//	cityMatchList = cityMatList;
    				//analogState = analogStat;
    				// System.out.println(cityMatchList[1].toString());
    				//System.out.println(cityMatchList[2].toString());
    			}

    			catch(SQLException e) {
    				System.out.println(" A SQL error: " + e.getMessage());
    			}    
    			catch (Exception ex) {
    				ex.printStackTrace();
    			}
    		}

    	}

    }
	//String analogCity = 
	    //(String)JOptionPane.showInputDialog(null,
				       //"Select analog city: ",
				       //"CIAT: Input",
				  //		      		   JOptionPane.QUESTION_MESSAGE,
				 //			  		icon,cityMatchList,cityMatchList[0]);
	

    public String getFilterCode() {
		return filterCode;
	}

	public void setFilterCode(String filterCode) {
		this.filterCode = filterCode;
	}

	public void geocodeCity(){

	
	//geocode city location
	try{
	    final Geocoder geocoder = new Geocoder();
	    GeocoderRequest geocoderRequest =
		new GeocoderRequestBuilder().setAddress(cityName 
							+ "," 
							+
							stateName).setLanguage("en").getGeocoderRequest();
	    GeocodeResponse geocoderResponse = geocoder.geocode(geocoderRequest);
	    //System.out.println(geocoderResponse);
	    List<GeocoderResult> someList = geocoderResponse.getResults();
	    GeocoderResult data = someList.get(0);
	    GeocoderGeometry data_2 = data.getGeometry();
	    latitude = data_2.getLocation().getLat();
	    longitude = data_2.getLocation().getLng();
	}
	catch (IndexOutOfBoundsException e) {
	    System.out.println("Error geocoding city: " + e.getMessage());
	}
	    
	}

    public void geocodeAnalogs(){

	//generate random numbers for analog lists. 
	//	int i;
	//	int iEnd;
	//if (cityMatchList.size() < 5){
	//    iEnd = cityMatchList.size();
	//	}
	//else{
	//  iEnd = 5;
	//}
	//for (i=0;i<iEnd;i++){
	//   int START = 0;
	//   int END = cityMatchList.size();
	//   Random random = new Random();
	//   int randReturn = random.nextInt(END);
	//   analogRandomNumberList.add(randReturn);
	//	}
	//System.out.println(analogRandomNumberList);
	
	//	for (Integer rand : analogRandomNumberList){
	//  analogRandomCityList.add(cityMatchList.get(rand));
	//  System.out.println("CityListSize = " + analogRandomCityList.size());
	// analogRandomStateList.add(stateMatchList.get(rand));
	// System.out.println("StateListSize = " + analogRandomStateList.size());
	//   randomPopList.add(analogPopList.get(rand));
	//  System.out.println("PopListSize = " + randomPopList.size());
	//  randomOver65List.add(analogOver65List.get(rand));
	//  System.out.println("OverListSize = " + randomOver65List.size());
	//  randomHouseAgeList.add(analogHouseAgeList.get(rand));
	//  System.out.println("HouseListSize = " + randomHouseAgeList.size());
	//  randomMedianIncomeList.add(analogMedianIncomeList.get(rand));
	//  System.out.println("IncomeListSize = " + randomMedianIncomeList.size());
	//  randomHighSchoolList.add(analogHighSchoolList.get(rand));
	//  System.out.println("HighSchoolSize = " + randomHighSchoolList.size());
	//  randomPovertyList.add(analogPovertyList.get(rand)); 
	//  System.out.println("PovertyListSize = " + randomPovertyList.size());
	//  randomOwnerList.add(analogOwnerList.get(rand));
	//  System.out.println("OwnerListSize = " + randomOwnerList.size());
	//}
	//System.out.println(analogRandomCityList);
	//ystem.out.println(analogRandomStateList);
	    

	//	for (String city : analogRandomCityList){
	int i;
	int iEnd;
	if (cityMatchList.size() < 5){
	    iEnd = cityMatchList.size();
	}
	else{
	    iEnd = 5;
	}
	for (i=0;i<iEnd;i++){
	    //	for (String city : cityMatchList){
	    String analogCityName = cityMatchList.get(i);;
	    String analogStat = stateMatchList.get(i);
	    // if (s.equals(value))
	    // String analogCityName = city;
	    //String analogStat = analogRandomStateList.get(analogRandomCityList.indexOf(city));

	    //geocode city location
	    try{
	    final Geocoder geocoder = new Geocoder();
	    GeocoderRequest geocoderRequest =
		new GeocoderRequestBuilder().setAddress(analogCityName 
							+ "," 
							+
							analogStat).setLanguage("en").getGeocoderRequest();
	    GeocodeResponse geocoderResponse = geocoder.geocode(geocoderRequest);
	    //System.out.println(geocoderResponse);
	    List<GeocoderResult> someList = geocoderResponse.getResults();
	    //System.out.println(someList.size());
	    GeocoderResult data = someList.get(0);
	    GeocoderGeometry data_2 = data.getGeometry();
	    Float lat = data_2.getLocation().getLat().floatValue();
	    Float lon = data_2.getLocation().getLng().floatValue();
	    analogLatList.add(lat);
	    //int sizeLat = analogLatList.size();
	    //System.out.println(sizeLat);
	    analogLongList.add(lon);
	    //int sizeLong = analogLongList.size();
	    //System.out.println(sizeLong);
	    }
	    catch (IndexOutOfBoundsException e) {
		//	System.out.println("Error retrieving analog: " + e.getMessage());
	    }
	}

	try {
	    Thread.sleep(1000);
	} catch(InterruptedException ex) {
	    Thread.currentThread().interrupt();
	}

	//generate random numbers for spring analog lists. 
	//	int x;
	//int xEnd;
	//if (citySpringMatchList.size() < 5){
	//   xEnd = citySpringMatchList.size();
	//	}
	//else{
	//   xEnd = 5;
	//}
	//for (x=0;x<xEnd;x++){
	//   int START = 0;
	//   int END = citySpringMatchList.size();
	//   Random random = new Random();
	//   int randReturn = random.nextInt(END);
	//   analogSpringRandomNumberList.add(randReturn);
	//	}
	//System.out.println(analogSpringRandomNumberList);
	
	//	for (Integer rand : analogSpringRandomNumberList){
	//   analogSpringRandomCityList.add(citySpringMatchList.get(rand));
	//   analogSpringRandomStateList.add(stateSpringMatchList.get(rand));
	//}
	//System.out.println(analogSpringRandomCityList);
	//System.out.println(analogSpringRandomStateList);


	int x;
	int xEnd;
	if (citySpringMatchList.size() < 5){
	    xEnd = citySpringMatchList.size();
	}
	else{
	    xEnd = 5;
	}
	for (x=0;x<xEnd;x++){
	//	for (String citySpring : citySpringMatchList){
	    String analogSpringCityName = citySpringMatchList.get(x);
	    String analogSpringStat = stateSpringMatchList.get(x);
		//geocode spring analogs
	//for (String citySpring : analogSpringRandomCityList){
	    // if (s.equals(value))
	//   String analogSpringCityName = citySpring;
	//  String analogSpringStat =
	//	analogSpringRandomStateList.get(analogSpringRandomCityList.indexOf(citySpring));
	//   System.out.println("analogSpring= " + analogSpringCityName);
	//   System.out.println(analogSpringStat);
	    //geocode city location
	    try{
	    final Geocoder geocoderSpring = new Geocoder();
	    GeocoderRequest geocoderRequestSpring =
		new GeocoderRequestBuilder().setAddress(analogSpringCityName 
							+ "," 
							+
							analogSpringStat).setLanguage("en").getGeocoderRequest();
	    System.out.println(geocoderRequestSpring);
	    GeocodeResponse geocoderResponseSpring =
		geocoderSpring.geocode(geocoderRequestSpring);
	    System.out.println(geocoderResponseSpring);
	    List<GeocoderResult> springList = geocoderResponseSpring.getResults();
	    System.out.println(springList.size());
	    GeocoderResult dataSpring = springList.get(0);
	    GeocoderGeometry data_2Spring = dataSpring.getGeometry();
	    Float latSpring = data_2Spring.getLocation().getLat().floatValue();
	    Float lonSpring = data_2Spring.getLocation().getLng().floatValue();
	    analogSpringLatList.add(latSpring);
	    int sizeLat = analogSpringLatList.size();
	    System.out.println("sizeLat = " + sizeLat);
	    analogSpringLongList.add(lonSpring);
	    int sizeLong = analogSpringLongList.size();
	    System.out.println("sizeLong = " + sizeLong);
	    }
	    catch (IndexOutOfBoundsException e) {
			System.out.println("Error retrieving Spring analog: "
					   + e.getMessage());
	    }
	    try {
		Thread.sleep(1000);
	    } catch(InterruptedException ex) {
		Thread.currentThread().interrupt();
	    }
	}
	    
	try {
	    Thread.sleep(1000);
	} catch(InterruptedException ex) {
	    Thread.currentThread().interrupt();
	}



	//generate random numbers for winter analog lists. 
	//	int y;
	//	int yEnd;
	//if (cityWinterMatchList.size() < 5){
	//  yEnd = cityWinterMatchList.size();
	//}
	//else{
	//  yEnd = 5;
	//}
	//for (y=0;y<yEnd;y++){
	//   int START = 0;
	//  int END = cityWinterMatchList.size();
	//  Random random = new Random();
	//  int randReturn = random.nextInt(END);
	//  analogWinterRandomNumberList.add(randReturn);
	//}
	//System.out.println(analogWinterRandomNumberList);
	
	//for (Integer rand : analogWinterRandomNumberList){
	//  analogWinterRandomCityList.add(cityWinterMatchList.get(rand));
	//  analogWinterRandomStateList.add(stateWinterMatchList.get(rand));
	//}
	//System.out.println(analogWinterRandomCityList);
	//System.out.println(analogWinterRandomStateList);





	//geocode winter analogs
	//	for (String cityWinter : analogWinterRandomCityList){
	    // if (s.equals(value))
	//	for (String cityWinter : cityWinterMatchList){
	int y;
	int yEnd;
	if (cityWinterMatchList.size() < 5){
	    yEnd = cityWinterMatchList.size();
	}
	else{
	    yEnd = 5;
	}
	for (y=0;y<yEnd;y++){
	    String analogWinterCityName = cityWinterMatchList.get(y);
	    String analogWinterStat =
		stateWinterMatchList.get(y);
		//analogWinterRandomStateList.get(analogWinterRandomCityList.indexOf(cityWinter));
	    System.out.println("analogWinter= " + analogWinterCityName);
	    System.out.println(analogWinterStat);
	    //geocode city location
	    try{
	    final Geocoder geocoderWinter = new Geocoder();
	    GeocoderRequest geocoderRequestWinter =
		new GeocoderRequestBuilder().setAddress(analogWinterCityName 
							+ "," 
							+
							analogWinterStat).setLanguage("en").getGeocoderRequest();
	    GeocodeResponse geocoderResponseWinter = 
		geocoderWinter.geocode(geocoderRequestWinter);
	    // System.out.println(geocoderResponseWinter);
	    List<GeocoderResult> winterList = geocoderResponseWinter.getResults();
	    System.out.println(winterList.size());
	    GeocoderResult dataWinter = winterList.get(0);
	    GeocoderGeometry data_2Winter = dataWinter.getGeometry();
	    Float latWinter = data_2Winter.getLocation().getLat().floatValue();
	    Float lonWinter = data_2Winter.getLocation().getLng().floatValue();
	    analogWinterLatList.add(latWinter);
	    int sizeLat = analogWinterLatList.size();
	    System.out.println("sizeLat = " + sizeLat);
	    analogWinterLongList.add(lonWinter);
	    int sizeLong = analogWinterLongList.size();
	    System.out.println("sizeLong = " + sizeLong);
	    }
	    catch (IndexOutOfBoundsException e) {
			System.out.println("Error retrieving Winter analog: "
					   + e.getMessage());
	    }
	}
	    
	try {
	    Thread.sleep(1000);
	} catch(InterruptedException ex) {
	    Thread.currentThread().interrupt();
	}

	//generate random numbers for summer analog lists. 
	//	int s;
	//int sEnd;
	//if (citySummerMatchList.size() < 5){
	//  sEnd = citySummerMatchList.size();
	//}
	//else{
	//  sEnd = 5;
	//}
	//for (s=0;s<sEnd;s++){
	//  int START = 0;
	//  int END = citySummerMatchList.size();
	//  Random random = new Random();
	//  int randReturn = random.nextInt(END);
	//  analogSummerRandomNumberList.add(randReturn);
	//}
	//System.out.println(analogSummerRandomNumberList);
	
	//	for (Integer rand : analogSummerRandomNumberList){
	//  analogSummerRandomCityList.add(citySummerMatchList.get(rand));
	//  analogSummerRandomStateList.add(stateSummerMatchList.get(rand));
	//}
	//System.out.println(analogSummerRandomCityList);
	//System.out.println(analogSummerRandomStateList);





	//geocode summer analogs
	//	for (String citySummer : analogSummerRandomCityList){
	    // if (s.equals(value))
	//	for (String citySummer : citySummerMatchList){
	int s;
	int sEnd;
	if (citySummerMatchList.size() < 5){
	    sEnd = citySummerMatchList.size();
	}
	else{
	    sEnd = 5;
	}
	for (s=0;s<sEnd;s++){
	    String analogSummerCityName = citySummerMatchList.get(s);
	    String analogSummerStat =
		stateSummerMatchList.get(s);
		//	analogSummerRandomStateList.get(analogSummerRandomCityList.indexOf(citySummer));
	    System.out.println("analogSummer= " + analogSummerCityName);
	    System.out.println(analogSummerStat);
	    //geocode city location
	    try{
	    final Geocoder geocoderSummer = new Geocoder();
	    GeocoderRequest geocoderRequestSummer =
		new GeocoderRequestBuilder().setAddress(analogSummerCityName 
							+ "," 
							+
							analogSummerStat).setLanguage("en").getGeocoderRequest();
	    GeocodeResponse geocoderResponseSummer = geocoderSummer.geocode(geocoderRequestSummer);
	    // System.out.println(geocoderResponseWinter);
	    List<GeocoderResult> summerList = geocoderResponseSummer.getResults();
	    System.out.println(summerList.size());
	    GeocoderResult dataSummer = summerList.get(0);
	    GeocoderGeometry data_2Summer = dataSummer.getGeometry();
	    Float latSummer = data_2Summer.getLocation().getLat().floatValue();
	    Float lonSummer = data_2Summer.getLocation().getLng().floatValue();
	    analogSummerLatList.add(latSummer);
	    int sizeLat = analogSummerLatList.size();
	    System.out.println("sizeLat = " + sizeLat);
	    analogSummerLongList.add(lonSummer);
	    int sizeLong = analogSummerLongList.size();
	    System.out.println("sizeLong = " + sizeLong);
	    }
	    catch (IndexOutOfBoundsException e) {
			System.out.println("Error retrieving Summer analog: "
					   + e.getMessage());
	    }
	}

	try {
	    Thread.sleep(1000);
	} catch(InterruptedException ex) {
	    Thread.currentThread().interrupt();
	}

	//generate random numbers for fall analog lists. 
	//	int f;
	//int fEnd;
	//if (cityFallMatchList.size() < 5){
	//   fEnd = cityFallMatchList.size();
	//}
	//else{
	//   fEnd = 5;
	//}
	//for (f=0;f<fEnd;f++){
	//   int START = 0;
	//   int END = cityFallMatchList.size();
	//   Random random = new Random();
	//   int randReturn = random.nextInt(END);
	//   analogFallRandomNumberList.add(randReturn);
	//}
	//System.out.println(analogFallRandomNumberList);
	
	//for (Integer rand : analogFallRandomNumberList){
	//  analogFallRandomCityList.add(cityFallMatchList.get(rand));
	//  analogFallRandomStateList.add(stateFallMatchList.get(rand));
	//}
	//System.out.println(analogFallRandomCityList);
	//System.out.println(analogFallRandomStateList);





	//geocode fall analogs
	//for (String cityFall : analogFallRandomCityList){
	    // if (s.equals(value))
	//	for (String cityFall : cityFallMatchList){
	int f;
	int fEnd;
	if (cityFallMatchList.size() < 5){
	    fEnd = cityFallMatchList.size();
	}
	else{
	    fEnd = 5;
	}
	for (f=0;f<fEnd;f++){
	    String analogFallCityName = cityFallMatchList.get(f);
	    String analogFallStat =
		stateFallMatchList.get(f);
		//analogFallRandomStateList.get(analogFallRandomCityList.indexOf(cityFall));
	    System.out.println("analogFall= " + analogFallCityName);
	    System.out.println(analogFallStat);
	    //geocode city location
	    try{
	    final Geocoder geocoderFall = new Geocoder();
	    GeocoderRequest geocoderRequestFall =
		new GeocoderRequestBuilder().setAddress(analogFallCityName 
							+ "," 
							+
							analogFallStat).setLanguage("en").getGeocoderRequest();
	    GeocodeResponse geocoderResponseFall = geocoderFall.geocode(geocoderRequestFall);
	    System.out.println(geocoderResponseFall);
	    List<GeocoderResult> fallList = geocoderResponseFall.getResults();
	    System.out.println(fallList.size());
	    GeocoderResult dataFall = fallList.get(0);
	    GeocoderGeometry data_2Fall = dataFall.getGeometry();
	    Float latFall = data_2Fall.getLocation().getLat().floatValue();
	    Float lonFall = data_2Fall.getLocation().getLng().floatValue();
	    analogFallLatList.add(latFall);
	    int sizeLat = analogFallLatList.size();
	    System.out.println("sizeLat = " + sizeLat);
	    analogFallLongList.add(lonFall);
	    int sizeLong = analogFallLongList.size();
	    System.out.println("sizeLong = " + sizeLong);
	    }
	    catch (IndexOutOfBoundsException e) {
			System.out.println("Error retrieving Fall analog: "
					   + e.getMessage());
	    }
	}




    }
    
	
    public void storeData(){
	//insert prepared statement into database
	//	String climString = climateDivision.getText();
	//System.out.println("CD= " + climDivCode);
	try{
	    Class.forName("com.mysql.jdbc.Driver"); 
	    Connection conn = DriverManager.getConnection(strConn,
							  strUser, strPassword); 
	    String sql =
		"INSERT INTO `cities`(`CityName`,`County`,`State`,"
		 + "`ClimateDivision`,`ContactName`,`ContactEmail`,`Latitude`,"
		+ "`Longitude`) VALUES"+ "(?,?,?,?,?,?,?,?)"; 
	    
	    PreparedStatement pstmt = conn.prepareStatement(sql); 
	    pstmt.setString(1, cityName); 
	    pstmt.setString(2, countyName); 
	    pstmt.setString(3, stateName);
	    pstmt.setInt(4, climateDivision);
	    pstmt.setString(5, contactName);
	    pstmt.setString(6, contactEmail);
	    pstmt.setFloat(7, latitude.floatValue());
	    pstmt.setFloat(8, longitude.floatValue());
	    pstmt.executeUpdate(); 
	    // conn.close();
	    //	    System.out.println(pstmt);
	}
	catch(SQLException e) {
	    System.out.println(" A SQL error: " + e.getMessage());
	}    
	catch (Exception ex) {
	    ex.printStackTrace();
	}
    }
    
    //    private void createGUI() {
    //	  JLabel label = new JLabel(
    //				  "You are successfully running a Swing applet!");
    //	label.setHorizontalAlignment(JLabel.CENTER);
    //	label.setBorder(BorderFactory.createMatteBorder(1,1,1,1,Color.black));
    //	getContentPane().add(label, BorderLayout.CENTER);
    // }
   
    //public void start(){
	//text.append ( "Applet started: "+ startCount++ +"\n" );
    //  }
 
    //  public void stop(){
       //	text.append( "Applet stopped.\n");
    //  }

    public void googleMap(){
	if (analogLatList.size() != 0){
	try{
	    ArrayList<String> googleLatList = new ArrayList<String>();
	    ArrayList<String> googleLonList = new ArrayList<String>();
	    for (Float lat : analogLatList){
		googleLatList.add(lat.toString());
	    }
	    for (Float lon : analogLongList){
		googleLonList.add(lon.toString());
	    }

	    String secondString = new String();
	    String thirdString = new String();
	    String fourthString = new String();
	    String fifthString = new String();
	    if (cityMatchList.size() > 1) {
		secondString = "%7C" + googleLatList.get(1) + "," 
		    + googleLonList.get(1);
	    }
	    if (cityMatchList.size() > 2) {
		thirdString = "%7C" + googleLatList.get(2) + ","
		    + googleLonList.get(2);
	    }
	    if (cityMatchList.size() > 3) {
		fourthString = "%7C" + googleLatList.get(3) + "," 
		    + googleLonList.get(3);
	    }
	    if (cityMatchList.size() > 4) {
		fifthString = "%7C" + googleLatList.get(4) + "," 
		    + googleLonList.get(4);
	    }
	    //open static google map using google map api

	    try{
		BufferedImage image = 
			ImageIO.read(new URL("http://maps.google.com/maps/api/"
					     + "staticmap?center=" + latitude.toString()
					     + "," + longitude.toString()
					     + "&zoom=5&size=800x800&markers=color:"
					     + "blue%7Clabel:A%7C" + latitude.toString()
					     + "," + longitude.toString() 
					     + "&markers=color:red%7Clabel:B%7C" + googleLatList.get(0)
					     + "," + googleLonList.get(0) +  "%7C"
					     + "&markers=color:red%7Clabel:C" +  secondString 
					     + "&markers=color:red%7Clabel:D" + thirdString
					     + "&markers=color:red%7Clabel:E" + fourthString
					     + "&markers=color:red%7Clabel:F" + fifthString 
					     + "&sensor=false&maptype=hybrid"));
		googleImage = image;
		    //	JLabel label = new JLabel(new ImageIcon(image));
		    //	panel.add(label);
		    //frame.add(panel);
		    //frame.pack();
		    //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    //frame.setLocationRelativeTo(null);
		    //frame.setVisible(true);   
		    }
	    catch (IOException e) {
		e.printStackTrace();
	    }
	}
	catch (IndexOutOfBoundsException e) {
	    System.out.println("Error retrieving analog: " + e.getMessage());
	}
	}
	else {
	    try{
		BufferedImage image = 
		    ImageIO.read(new URL("http://maps.google.com/maps/api/"
					 + "staticmap?center=" + latitude.toString()
					 + "," + longitude.toString()
					 + "&zoom=5&size=800x800&markers=color:"
					 + "blue%7Clabel:A%7C" + latitude.toString()
					 + "," + longitude.toString() 
					 + "&sensor=false&maptype=hybrid"));
		googleImage = image;
		//	JLabel label = new JLabel(new ImageIcon(image));
		//	panel.add(label);
		//frame.add(panel);
		//frame.pack();
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.setLocationRelativeTo(null);
		//frame.setVisible(true);   
	    }
	    catch (IOException e) {
		e.printStackTrace();
	    }
	}

	try {
	    Thread.sleep(1000);
	} catch(InterruptedException ex) {
	    Thread.currentThread().interrupt();
	}

	// map spring
	//System.out.println(analogSpringLatList.get(0));
	//System.out.println(analogSpringLongList.get(0));
	if (analogSpringLatList.size() > 0){
	    System.out.println("Spring map loop works");
	    System.out.println(citySpringMatchList);
	    try{
		ArrayList<String> googleLatList = new ArrayList<String>();
		ArrayList<String> googleLonList = new ArrayList<String>();
		for (Float lat : analogSpringLatList){
		    googleLatList.add(lat.toString());
		}
		for (Float lon : analogSpringLongList){
		    googleLonList.add(lon.toString());
		}

		String secondString = new String();
		String thirdString = new String();
		String fourthString = new String();
		String fifthString = new String();
		if (citySpringMatchList.size() > 1) {
		    secondString = "%7C" + googleLatList.get(1) + ","
			+ googleLonList.get(1);
		}
		if (citySpringMatchList.size() > 2) {
		    thirdString = "%7C" + googleLatList.get(2) + ","
			+ googleLonList.get(2);
		}
		if (citySpringMatchList.size() > 3) {
		    fourthString = "%7C" + googleLatList.get(3) + ","
			+ googleLonList.get(3);
		}
		if (citySpringMatchList.size() > 4) {
		    fifthString = "%7C" + googleLatList.get(4) + ","
			+ googleLonList.get(4);
		}
		//open static google map using google map api

		try{
		    BufferedImage image = 
			ImageIO.read(new URL("http://maps.google.com/maps/api/"
					     + "staticmap?center=" + latitude.toString()
					     + "," + longitude.toString()
					     + "&zoom=5&size=800x800&markers=color:"
					     + "blue%7Clabel:A%7C" + latitude.toString()
					     + "," + longitude.toString() 
					     + "&markers=color:red%7Clabel:B%7C" + googleLatList.get(0)
					     + "," + googleLonList.get(0) +  "%7C"
					     + "&markers=color:red%7Clabel:C" +  secondString 
					     + "&markers=color:red%7Clabel:D" + thirdString
					     + "&markers=color:red%7Clabel:E" + fourthString
					     + "&markers=color:red%7Clabel:F" + fifthString 
					     + "&sensor=false&maptype=hybrid"));
		    googleSpringImage = image;
		    //	JLabel label = new JLabel(new ImageIcon(image));
		    //	panel.add(label);
		    //frame.add(panel);
		    //frame.pack();
		    //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    //frame.setLocationRelativeTo(null);
		    //frame.setVisible(true);   
		}
		catch (IOException e) {
		    e.printStackTrace();
		}
	    }
	    catch (IndexOutOfBoundsException e) {
		System.out.println("Error retrieving Spring analog map: "
				   + e.getMessage());
	    }
	}
	else {
	    try{
		BufferedImage image = 
		    ImageIO.read(new URL("http://maps.google.com/maps/api/"
					 + "staticmap?center=" + latitude.toString()
					 + "," + longitude.toString()
					 + "&zoom=5&size=800x800&markers=color:"
					 + "blue%7Clabel:A%7C" + latitude.toString()
					 + "," + longitude.toString() 
					 + "&sensor=false&maptype=hybrid"));
		googleSpringImage = image;
		//	JLabel label = new JLabel(new ImageIcon(image));
		//	panel.add(label);
		//frame.add(panel);
		//frame.pack();
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.setLocationRelativeTo(null);
		//frame.setVisible(true);   
	    }
	    catch (IOException e) {
		e.printStackTrace();
	    }
	}

	try {
	    Thread.sleep(1000);
	} catch(InterruptedException ex) {
	    Thread.currentThread().interrupt();
	}
	// map winter
	//System.out.println(analogWinterLatList.get(0));
	//System.out.println(analogWinterLongList.get(0));
	if (analogWinterLatList.size() > 0){
	    System.out.println("Winter map loop works");
	    try{
		ArrayList<String> googleLatList = new ArrayList<String>();
		ArrayList<String> googleLonList = new ArrayList<String>();
		for (Float lat : analogWinterLatList){
		    googleLatList.add(lat.toString());
		}
		for (Float lon : analogWinterLongList){
		    googleLonList.add(lon.toString());
		}

		String secondString = new String();
		String thirdString = new String();
		String fourthString = new String();
		String fifthString = new String();
		if (cityWinterMatchList.size() > 1) {
		    secondString = "%7C" + googleLatList.get(1) + "," 
			+ googleLonList.get(1);
		}
		if (cityWinterMatchList.size() > 2) {
		    thirdString = "%7C" + googleLatList.get(2) + "," 
			+ googleLonList.get(2);
		}
		if (cityWinterMatchList.size() > 3) {
		    fourthString = "%7C" + googleLatList.get(3) + ","
			+ googleLonList.get(3);
		}
		if (cityWinterMatchList.size() > 4) {
		    fifthString = "%7C" + googleLatList.get(4) + ","
			+ googleLonList.get(4);
		}
		//open static google map using google map api

		try{
		    BufferedImage image = 
			ImageIO.read(new URL("http://maps.google.com/maps/api/"
					     + "staticmap?center=" + latitude.toString()
					     + "," + longitude.toString()
					     + "&zoom=5&size=800x800&markers=color:"
					     + "blue%7Clabel:A%7C" + latitude.toString()
					     + "," + longitude.toString() 
					     + "&markers=color:red%7Clabel:B%7C" + googleLatList.get(0)
					     + "," + googleLonList.get(0) +  "%7C"
					     + "&markers=color:red%7Clabel:C" +  secondString 
					     + "&markers=color:red%7Clabel:D" + thirdString
					     + "&markers=color:red%7Clabel:E" + fourthString
					     + "&markers=color:red%7Clabel:F" + fifthString 
					     + "&sensor=false&maptype=hybrid"));
		    googleWinterImage = image;
		    //	JLabel label = new JLabel(new ImageIcon(image));
		    //	panel.add(label);
		    //frame.add(panel);
		    //frame.pack();
		    //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    //frame.setLocationRelativeTo(null);
		    //frame.setVisible(true);   
		}
		catch (IOException e) {
		    e.printStackTrace();
		}
	    }
	    catch (IndexOutOfBoundsException e) {
		System.out.println("Error retrieving Winter analog map: " + e.getMessage());
	    }
	}
	else {
	    try{
		BufferedImage image = 
		    ImageIO.read(new URL("http://maps.google.com/maps/api/"
					 + "staticmap?center=" + latitude.toString()
					 + "," + longitude.toString()
					 + "&zoom=5&size=800x800&markers=color:"
					 + "blue%7Clabel:A%7C" + latitude.toString()
					 + "," + longitude.toString() 
					 + "&sensor=false&maptype=hybrid"));
		googleWinterImage = image;
		//	JLabel label = new JLabel(new ImageIcon(image));
		//	panel.add(label);
		//frame.add(panel);
		//frame.pack();
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.setLocationRelativeTo(null);
		//frame.setVisible(true);   
	    }
	    catch (IOException e) {
		e.printStackTrace();
	    }
	}

	try {
	    Thread.sleep(1000);
	} catch(InterruptedException ex) {
	    Thread.currentThread().interrupt();
	}

	// map summer
	//System.out.println(analogSummerLatList.get(0));
	//System.out.println(analogSummerLongList.get(0));
	if (analogSummerLatList.size() > 0){
	    System.out.println("Summer map loop works");
	    try{
		ArrayList<String> googleLatList = new ArrayList<String>();
		ArrayList<String> googleLonList = new ArrayList<String>();
		for (Float lat : analogSummerLatList){
		    googleLatList.add(lat.toString());
		}
		for (Float lon : analogSummerLongList){
		    googleLonList.add(lon.toString());
		}
	
		String secondString = new String();
		String thirdString = new String();
		String fourthString = new String();
		String fifthString = new String();
		if (citySummerMatchList.size() > 1) {
		    secondString = "%7C" + googleLatList.get(1) + ","
			+ googleLonList.get(1);
		}
		if (citySummerMatchList.size() > 2) {
		    thirdString = "%7C" + googleLatList.get(2) + ","
			+ googleLonList.get(2);
		}
		if (citySummerMatchList.size() > 3) {
		    fourthString = "%7C" + googleLatList.get(3) + ","
			+ googleLonList.get(3);
		}
		if (citySummerMatchList.size() > 4) {
		    fifthString = "%7C" + googleLatList.get(4) + "," 
			+ googleLonList.get(4);
		}
		//open static google map using google map api

		try{
		    BufferedImage image = 
			ImageIO.read(new URL("http://maps.google.com/maps/api/"
					     + "staticmap?center=" + latitude.toString()
					     + "," + longitude.toString()
					     + "&zoom=5&size=800x800&markers=color:"
					     + "blue%7Clabel:A%7C" + latitude.toString()
					     + "," + longitude.toString() 
					     + "&markers=color:red%7Clabel:B%7C" + googleLatList.get(0)
					     + "," + googleLonList.get(0) +  "%7C"
					     + "&markers=color:red%7Clabel:C" +  secondString 
					     + "&markers=color:red%7Clabel:D" + thirdString
					     + "&markers=color:red%7Clabel:E" + fourthString
					     + "&markers=color:red%7Clabel:F" + fifthString 
					     + "&sensor=false&maptype=hybrid"));
		    googleSummerImage = image;
  
		}
		catch (IOException e) {
		    e.printStackTrace();
		}
	    }
	    catch (IndexOutOfBoundsException e) {
		System.out.println("Error retrieving Summer analog map: " + e.getMessage());
	    }
	}
	else {
	    try{
		BufferedImage image = 
		    ImageIO.read(new URL("http://maps.google.com/maps/api/"
					 + "staticmap?center=" + latitude.toString()
					 + "," + longitude.toString()
					 + "&zoom=5&size=800x800&markers=color:"
					 + "blue%7Clabel:A%7C" + latitude.toString()
					 + "," + longitude.toString() 
					 + "&sensor=false&maptype=hybrid"));
		googleSummerImage = image;
 
	    }
	    catch (IOException e) {
		e.printStackTrace();
	    }
	}

	try {
	    Thread.sleep(1000);
	} catch(InterruptedException ex) {
	    Thread.currentThread().interrupt();
	}

	// map fall
	//System.out.println(analogFallLatList.get(0));
	//System.out.println(analogFallLongList.get(0));
	if (analogFallLatList.size() > 0){
	    System.out.println("Fall map loop works");
	    try{
		ArrayList<String> googleLatList = new ArrayList<String>();
		ArrayList<String> googleLonList = new ArrayList<String>();
		for (Float lat : analogFallLatList){
		    googleLatList.add(lat.toString());
		}
		for (Float lon : analogFallLongList){
		    googleLonList.add(lon.toString());
		}
	
		String secondString = new String();
		String thirdString = new String();
		String fourthString = new String();
		String fifthString = new String();
		if (cityFallMatchList.size() > 1) {
		    secondString = "%7C" + googleLatList.get(1) + ","
			+ googleLonList.get(1);
		}
		if (cityFallMatchList.size() > 2) {
		    thirdString = "%7C" + googleLatList.get(2) + ","
			+ googleLonList.get(2);
		}
		if (cityFallMatchList.size() > 3) {
		    fourthString = "%7C" + googleLatList.get(3) + ","
			+ googleLonList.get(3);
		}
		if (cityFallMatchList.size() > 4) {
		    fifthString = "%7C" + googleLatList.get(4) + "," 
			+ googleLonList.get(4);
		}
		//open static google map using google map api

		try{
		    BufferedImage image = 
			ImageIO.read(new URL("http://maps.google.com/maps/api/"
					     + "staticmap?center=" + latitude.toString()
					     + "," + longitude.toString()
					     + "&zoom=5&size=800x800&markers=color:"
					     + "blue%7Clabel:A%7C" + latitude.toString()
					     + "," + longitude.toString() 
					     + "&markers=color:red%7Clabel:B%7C" + googleLatList.get(0)
					     + "," + googleLonList.get(0) +  "%7C"
					     + "&markers=color:red%7Clabel:C" +  secondString 
					     + "&markers=color:red%7Clabel:D" + thirdString
					     + "&markers=color:red%7Clabel:E" + fourthString
					     + "&markers=color:red%7Clabel:F" + fifthString 
					     + "&sensor=false&maptype=hybrid"));
		    googleFallImage = image;
		    //	JLabel label = new JLabel(new ImageIcon(image));
		    //	panel.add(label);
		    //frame.add(panel);
		    //frame.pack();
		    //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    //frame.setLocationRelativeTo(null);
		    //frame.setVisible(true);   
		}
		catch (IOException e) {
		    e.printStackTrace();
		}
	    }
	    catch (IndexOutOfBoundsException e) {
		System.out.println("Error retrieving Fall analog map: "
				   + e.getMessage());
	    }
	}
	else {
	    try{
		BufferedImage image = 
		    ImageIO.read(new URL("http://maps.google.com/maps/api/"
					 + "staticmap?center=" + latitude.toString()
					 + "," + longitude.toString()
					 + "&zoom=5&size=800x800&markers=color:"
					 + "blue%7Clabel:A%7C" + latitude.toString()
					 + "," + longitude.toString() 
					 + "&sensor=false&maptype=hybrid"));
		googleFallImage = image;
		//	JLabel label = new JLabel(new ImageIcon(image));
		//	panel.add(label);
		//frame.add(panel);
		//frame.pack();
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.setLocationRelativeTo(null);
		//frame.setVisible(true);   
	    }
	    catch (IOException e) {
		e.printStackTrace();
	    }
	    
	    System.out.println(stateClimDiv);
	}

	inputTime += 1;


    }
    
    public void genImages(){
    	FacesContext context = FacesContext.getCurrentInstance();
    	try{
    		//Graphics2D annual2d = googleImage.createGraphics();
    		//Graphics2D spring2d = googleSpringImage.createGraphics();
    		//Graphics2D summer2d = googleSummerImage.createGraphics();
    		//Graphics2D fall2d = googleFallImage.createGraphics();
    		//Graphics2D winter2d = googleWinterImage.createGraphics();
    		ByteArrayOutputStream annualStr = new ByteArrayOutputStream();
    		ByteArrayOutputStream springStr = new ByteArrayOutputStream();
    		ByteArrayOutputStream summerStr = new ByteArrayOutputStream();
    		ByteArrayOutputStream fallStr = new ByteArrayOutputStream();
    		ByteArrayOutputStream winterStr = new ByteArrayOutputStream();
    		ImageIO.write(googleImage,"png", annualStr);
    		ImageIO.write(googleSpringImage,"png", springStr);
    		ImageIO.write(googleSummerImage,"png", summerStr);
    		ImageIO.write(googleFallImage,"png", fallStr);
    		ImageIO.write(googleWinterImage,"png", winterStr);
    		annualStream = new DefaultStreamedContent(new ByteArrayInputStream(annualStr.toByteArray()),"image/png");
    		springStream = new DefaultStreamedContent(new ByteArrayInputStream(springStr.toByteArray()),"image/png");
    		summerStream = new DefaultStreamedContent(new ByteArrayInputStream(summerStr.toByteArray()),"image/png");
    		fallStream = new DefaultStreamedContent(new ByteArrayInputStream(fallStr.toByteArray()),"image/png");
    		winterStream = new DefaultStreamedContent(new ByteArrayInputStream(winterStr.toByteArray()),"image/png");
    		
    		}
    	catch(Exception ex){
    		ex.printStackTrace();
    	}
    		
    }
    
    public StreamedContent getAnnualStream(){
    	return annualStream;
    }
    public StreamedContent getSpringStream(){
    	return springStream;
    }
    public StreamedContent getSummerStream(){
    	return summerStream;
    }
    public StreamedContent getFallStream(){
    	return fallStream;
    }
    public StreamedContent getWinterStream(){
    	return winterStream;
    }
    	
    
    
    
    public int getPopMatch() {
		return popMatch;
	}

	public void setPopMatch(int popMatch) {
		this.popMatch = popMatch;
	}

	public int getPopMatchWinter() {
		return popMatchWinter;
	}

	public void setPopMatchWinter(int popMatchWinter) {
		this.popMatchWinter = popMatchWinter;
	}

	public int getPopMatchSpring() {
		return popMatchSpring;
	}

	public void setPopMatchSpring(int popMatchSpring) {
		this.popMatchSpring = popMatchSpring;
	}

	public int getPopMatchSummer() {
		return popMatchSummer;
	}

	public void setPopMatchSummer(int popMatchSummer) {
		this.popMatchSummer = popMatchSummer;
	}

	public int getPopMatchFall() {
		return popMatchFall;
	}

	public void setPopMatchFall(int popMatchFall) {
		this.popMatchFall = popMatchFall;
	}

	public ArrayList<String> getStateMatchList() {
		return stateMatchList;
	}

	public void setStateMatchList(ArrayList<String> stateMatchList) {
		this.stateMatchList = stateMatchList;
	}

	public ArrayList<String> getStateSpringMatchList() {
		return stateSpringMatchList;
	}

	public void setStateSpringMatchList(
			ArrayList<String> stateSpringMatchList) {
		this.stateSpringMatchList = stateSpringMatchList;
	}

	public  ArrayList<String> getStateWinterMatchList() {
		return stateWinterMatchList;
	}

	public void setStateWinterMatchList(
			ArrayList<String> stateWinterMatchList) {
		this.stateWinterMatchList = stateWinterMatchList;
	}

	public ArrayList<String> getStateSummerMatchList() {
		return stateSummerMatchList;
	}

	public void setStateSummerMatchList(
			ArrayList<String> stateSummerMatchList) {
		this.stateSummerMatchList = stateSummerMatchList;
	}

	public ArrayList<String> getStateFallMatchList() {
		return stateFallMatchList;
	}

	public void setStateFallMatchList(ArrayList<String> stateFallMatchList) {
		this.stateFallMatchList = stateFallMatchList;
	}

	public ArrayList<String> getCityMatchList() {
		return cityMatchList;
		}

	public void setCityMatchList(ArrayList<String> cityMatchList) {
		this.cityMatchList = cityMatchList;
	}

	public ArrayList<String> getCitySpringMatchList() {
		return citySpringMatchList;
	}

	public void setCitySpringMatchList(ArrayList<String> citySpringMatchList) {
		this.citySpringMatchList = citySpringMatchList;
	}

	public ArrayList<String> getCityWinterMatchList() {
		return cityWinterMatchList;
	}

	public void setCityWinterMatchList(ArrayList<String> cityWinterMatchList) {
		this.cityWinterMatchList = cityWinterMatchList;
	}

	public ArrayList<String> getCitySummerMatchList() {
		return citySummerMatchList;
	}

	public  void setCitySummerMatchList(ArrayList<String> citySummerMatchList) {
		this.citySummerMatchList = citySummerMatchList;
	}

	public ArrayList<String> getCityFallMatchList() {
		return cityFallMatchList;
	}

	public void setCityFallMatchList(ArrayList<String> cityFallMatchList) {
		this.cityFallMatchList = cityFallMatchList;
	}

	public BufferedImage getGoogleImage() {
		return googleImage;
	}

	public void setGoogleImage(BufferedImage googleImage) {
		this.googleImage = googleImage;
	}

	public BufferedImage getGoogleSpringImage() {
		return googleSpringImage;
	}

	public void setGoogleSpringImage(BufferedImage googleSpringImage) {
		this.googleSpringImage = googleSpringImage;
	}

	public BufferedImage getGoogleWinterImage() {
		return googleWinterImage;
	}

	public void setGoogleWinterImage(BufferedImage googleWinterImage) {
		this.googleWinterImage = googleWinterImage;
	}

	public BufferedImage getGoogleSummerImage() {
		return googleSummerImage;
	}

	public void setGoogleSummerImage(BufferedImage googleSummerImage) {
		this.googleSummerImage = googleSummerImage;
	}
	
	public BufferedImage getGoogleFallImage() {
		return googleSummerImage;
	}

	public void setGoogleFallImage(BufferedImage googleFallImage) {
		this.googleFallImage = googleFallImage;
	}
	

	public float getTemp1981() {
		return temp1981;
	}

	public void setTemp1981(float temp1981) {
		this.temp1981 = temp1981;
	}

	public float getPrecip1981() {
		return precip1981;
	}

	public void setPrecip1981(float precip1981) {
		this.precip1981 = precip1981;
	}

	public float getProjTemp2011() {
		return projTemp2011;
	}

	public void setProjTemp2011(float projTemp2011) {
		this.projTemp2011 = projTemp2011;
	}

	public float getProjPrecip2011() {
		return projPrecip2011;
	}

	public void setProjPrecip2011(float projPrecip2011) {
		this.projPrecip2011 = projPrecip2011;
	}

	public float getSpringObTemp() {
		return springObTemp;
	}

	public void setSpringObTemp(float springObTemp) {
		this.springObTemp = springObTemp;
	}

	public float getSummerObTemp() {
		return summerObTemp;
	}

	public void setSummerObTemp(float summerObTemp) {
		this.summerObTemp = summerObTemp;
	}

	public float getFallObTemp() {
		return fallObTemp;
	}

	public void setFallObTemp(float fallObTemp) {
		this.fallObTemp = fallObTemp;
	}

	public float getWinterObTemp() {
		return winterObTemp;
	}

	public void setWinterObTemp(float winterObTemp) {
		this.winterObTemp = winterObTemp;
	}

	public float getSpringProjTemp() {
		return springProjTemp;
	}

	public void setSpringProjTemp(float springProjTemp) {
		this.springProjTemp = springProjTemp;
	}

	public float getSummerProjTemp() {
		return summerProjTemp;
	}

	public void setSummerProjTemp(float summerProjTemp) {
		this.summerProjTemp = summerProjTemp;
	}

	public float getFallProjTemp() {
		return fallProjTemp;
	}

	public void setFallProjTemp(float fallProjTemp) {
		this.fallProjTemp = fallProjTemp;
	}

	public float getWinterProjTemp() {
		return winterProjTemp;
	}

	public void setWinterProjTemp(float winterProjTemp) {
		this.winterProjTemp = winterProjTemp;
	}

	public float getSpringObPrecip() {
		return springObPrecip;
	}

	public void setSpringObPrecip(float springObPrecip) {
		this.springObPrecip = springObPrecip;
	}

	public float getSummerObPrecip() {
		return summerObPrecip;
	}

	public void setSummerObPrecip(float summerObPrecip) {
		this.summerObPrecip = summerObPrecip;
	}

	public float getFallObPrecip() {
		return fallObPrecip;
	}

	public void setFallObPrecip(float fallObPrecip) {
		this.fallObPrecip = fallObPrecip;
	}

	public float getWinterObPrecip() {
		return winterObPrecip;
	}

	public void setWinterObPrecip(float winterObPrecip) {
		this.winterObPrecip = winterObPrecip;
	}

	public float getSpringProjPrecip() {
		return springProjPrecip;
	}

	public void setSpringProjPrecip(float springProjPrecip) {
		this.springProjPrecip = springProjPrecip;
	}

	public float getSummerProjPrecip() {
		return summerProjPrecip;
	}

	public void setSummerProjPrecip(float summerProjPrecip) {
		this.summerProjPrecip = summerProjPrecip;
	}

	public float getFallProjPrecip() {
		return fallProjPrecip;
	}

	public void setFallProjPrecip(float fallProjPrecip) {
		this.fallProjPrecip = fallProjPrecip;
	}

	public float getWinterProjPrecip() {
		return winterProjPrecip;
	}

	public void setWinterProjPrecip(float winterProjPrecip) {
		this.winterProjPrecip = winterProjPrecip;
	}

	public void pullStrategies(){
	
	if (projTempCh2040 >= 1.00){
	    climateDriver1 = "Increasing temperatures";
	}
	else if (projTempCh2040 <= -1.00){
	    climateDriver1 = "Decreasing temperatures";
	}
	
	if (projPrecipCh2040 >= 1.00){
	    climateDriver2 = "Increasing precipitation";
	}
	else if (projPrecipCh2040 <= -1.00){
	    climateDriver2 = "Decreasing precipitation";
	}
	try{
	    Class.forName("com.mysql.jdbc.Driver"); 
	    Connection conn = DriverManager.getConnection(strConn, strUser,
							  strPassword); 	  
	    String query = ("SELECT * FROM " + "strategies" 
			    + " WHERE (Climate_Driver = ? or Climate_Driver = ?) "
			    + "AND Population BETWEEN ? AND ?;");
			   
	    PreparedStatement pstmt = conn.prepareStatement(query); 
	    pstmt.setString(1, climateDriver1);
	    pstmt.setString(2, climateDriver2);
	    pstmt.setInt(3, popMinimum);
	    pstmt.setInt(4, popMaximum);
	    System.out.println(pstmt);
	    

	    //System.out.println(pstmt);
	    ResultSet rs = pstmt.executeQuery();
	    while(rs.next()){
		climateDriverList.add( rs.getString("Climate_Driver") );
		climateImpactList.add( rs.getString("Climate_Impacts"));
		cityStateList.add( rs.getString("City_State_(Province)"));
		populationList.add( rs.getString("Population"));
		actionList.add( rs.getString("Adaptation_Action"));
		departmentList.add( rs.getString("Primary_Department"));
		cobenefitList.add( rs.getString("Cobenefits"));
		documentList.add( rs.getString("Document_Name"));
		linkList.add( rs.getString("Document_Link"));
	    }
	    //  System.out.println(climateDriverList.get(0));
	    //System.out.println(climateImpactList.get(0));
	    //System.out.println(cityStateList.get(0));
	    //System.out.println(populationList.get(0));
	    System.out.println(climateDriverList.size());

	    if(climateDriverList.size() == 0){
		 
		query = ("SELECT * FROM " + "strategies" 
				+ " WHERE (Climate_Driver = ? or Climate_Driver = ?); ");
		    
		    
		pstmt = conn.prepareStatement(query); 
		pstmt.setString(1, climateDriver1);
		pstmt.setString(2, climateDriver2);
		System.out.println(pstmt);
		rs = pstmt.executeQuery();
		while(rs.next()){
		    climateDriverList.add( rs.getString("Climate_Driver") );
		    climateImpactList.add( rs.getString("Climate_Impacts"));
		    cityStateList.add( rs.getString("City_State_(Province)"));
		    populationList.add( rs.getString("Population"));
		    actionList.add( rs.getString("Adaptation_Action"));
		    departmentList.add( rs.getString("Primary_Department"));
		    cobenefitList.add( rs.getString("Cobenefits"));
		    documentList.add( rs.getString("Document_Name"));
		    linkList.add( rs.getString("Document_Link"));
		}
		System.out.println(climateDriverList.get(0));
		System.out.println(climateImpactList.get(0));
		System.out.println(cityStateList.get(0));
		System.out.println(populationList.get(0));
		System.out.println(climateDriverList.size());
	    
	    }
	    String query2 = ("SELECT * FROM " + "strategies" 
			     + " WHERE (Climate_Driver = ?) ");
	    
	    
	    PreparedStatement pstmt2 = conn.prepareStatement(query2); 
	    pstmt2.setString(1, stratFilter);
	    
	    
	    ResultSet rs2 = pstmt2.executeQuery();
	    while(rs2.next()){
		climateDriverList2.add( rs2.getString("Climate_Driver") );
		climateImpactList2.add( rs2.getString("Climate_Impacts"));
		cityStateList2.add( rs2.getString("City_State_(Province)"));
		populationList2.add( rs2.getString("Population"));
		actionList2.add( rs2.getString("Adaptation_Action"));
		departmentList2.add( rs2.getString("Primary_Department"));
		cobenefitList2.add( rs2.getString("Cobenefits"));
		documentList2.add( rs2.getString("Document_Name"));
		linkList2.add( rs2.getString("Document_Link"));
	    }
	    
	}
	catch(SQLException e) {
	    System.out.println(" A SQL error: " + e.getMessage());
	}    
	catch (Exception ex) {
	    ex.printStackTrace();
	}
	//	if (springTempChange >= 1.00{
	
    }
    
    public String getClimateDivisionName(){
    	return climateDivisionName;
    }
    
    public String getCityName(){
    	return cityName;
    }
    
    public String getStateName(){
    	return stateName;
    }
    
    @PostConstruct 
    public String getStateClimDiv(){
    	return stateClimDiv;
    }
    
    public void setStateClimDiv(String stateClimDiv){
    	this.stateClimDiv = stateClimDiv;
    }
  
    
    public String getClimDiv(){
    	String climDiv = Integer.toString(climDivCode); 
    	return climDiv;
    }

/*    public String controlMethod(){
    	System.out.println("start pull");
    	pullData();
    	System.out.println("start geocode");
    	geocodeCity();
        geocodeAnalogs();
    	System.out.println("start store");
    	storeData();
    	System.out.println("start map");
    	googleMap();
    	report.imageMaker();
    	return "display_report";
    }*/
    
}


   
