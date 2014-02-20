package com.graham.ciaTool;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ManagedProperty;
//import javax.annotation.PostConstruct;

import java.io.Serializable; 
import java.text.DecimalFormat;
import java.util.ArrayList;



@ManagedBean(name="reportBean")
@RequestScoped
public class ReportBean implements Serializable {
	private static final long serialVersionUID = 1L;  
	public String stateClimateDivision;
	public int climateDivision;
	
	public ReportBean(){
		System.out.println("report bean started");
	}
	
	@ManagedProperty(value="#{processBean}")
	private ProcessBean process;
	
	public ProcessBean getProcess(){
		return process;
	}
	
	public void setProcess(ProcessBean process){
		this.process = process;
	}
	
	@ManagedProperty(value="#{inputBean.city}")
	private String cityName;
	
	public void setCityName(String cityName){
		this.cityName = cityName;
	}
	
	@ManagedProperty(value="#{inputBean.state}")
	private String stateName;
	
	public void setStateName(String stateName){
		this.stateName = stateName;
		System.out.println(stateName);
	}
	
	@ManagedProperty(value="#{inputBean.demo}")
	private String demoFilter;
	
	public void setDemoFilter(String demoFilter){
		this.demoFilter = demoFilter;
	}
	
	@ManagedProperty(value="#{processBean.stateClimDiv}")
	private String stateClimDiv;
	
	//@PostConstruct 
	public void setStateClimDiv(String stateClimDiv){
		this.stateClimDiv = stateClimDiv;
		System.out.println(stateClimDiv);
	}
	
	@ManagedProperty(value="#{processBean.climDiv}")
	private String climDiv;
	
	public void setClimDiv(String climDiv){
		this.climDiv = climDiv;
	}
	
	@ManagedProperty(value="#{processBean.cityMatchList}")
	private ArrayList<String> cityMatchList;
	
	public void setCityMatchList(ArrayList<String> cityMatchList){
		this.cityMatchList = cityMatchList;
	}
	
	@ManagedProperty(value="#{processBean.citySpringMatchList}")
	private ArrayList<String> citySpringMatchList;
	
	public void setCitySpringMatchList(ArrayList<String> citySpringMatchList){
		this.citySpringMatchList = citySpringMatchList;
	}
	
	@ManagedProperty(value="#{processBean.citySummerMatchList}")
	private ArrayList<String> citySummerMatchList;
	
	public void setCitySummerMatchList(ArrayList<String> citySummerMatchList){
		this.citySummerMatchList = citySummerMatchList;
	}	
	
	@ManagedProperty(value="#{processBean.cityFallMatchList}")
	private ArrayList<String> cityFallMatchList;
	
	public void setCityFallMatchList(ArrayList<String> cityFallMatchList){
		this.cityFallMatchList = cityFallMatchList;
	}
	
	@ManagedProperty(value="#{processBean.cityWinterMatchList}")
	private ArrayList<String> cityWinterMatchList;
	
	public void setCityWinterMatchList(ArrayList<String> cityWinterMatchList){
		this.cityWinterMatchList = cityWinterMatchList;
	}
	
	@ManagedProperty(value="#{processBean.stateMatchList}")
	private ArrayList<String> stateMatchList;
	
	public void setStateMatchList(ArrayList<String> stateMatchList){
		this.stateMatchList = stateMatchList;
	}
	
	@ManagedProperty(value="#{processBean.stateSpringMatchList}")
	private ArrayList<String> stateSpringMatchList;
	
	public void setStateSpringMatchList(ArrayList<String> stateSpringMatchList){
		this.stateSpringMatchList = stateSpringMatchList;
	}
	
	@ManagedProperty(value="#{processBean.stateSummerMatchList}")
	private ArrayList<String> stateSummerMatchList;
	
	public void setStateSummerMatchList(ArrayList<String> stateSummerMatchList){
		this.stateSummerMatchList = stateSummerMatchList;
	}	
	
	@ManagedProperty(value="#{processBean.stateFallMatchList}")
	private ArrayList<String> stateFallMatchList;
	
	public void setStateFallMatchList(ArrayList<String> stateFallMatchList){
		this.stateFallMatchList = stateFallMatchList;
	}
	
	@ManagedProperty(value="#{processBean.stateWinterMatchList}")
	private ArrayList<String> stateWinterMatchList;
	
	public void setStateWinterMatchList(ArrayList<String> stateWinterMatchList){
		this.stateWinterMatchList = stateWinterMatchList;
	}
	
	@ManagedProperty(value="#{processBean.popMatch}")
	private int popMatch;
	
	public void setPopMatch(int popMatch){
		this.popMatch = popMatch;
	}
	
	@ManagedProperty(value="#{processBean.popMatchSpring}")
	private int popMatchSpring;
	
	public void setPopMatchSpring(int popMatchSpring){
		this.popMatchSpring = popMatchSpring;
	}

	@ManagedProperty(value="#{processBean.popMatchSummer}")
	private int popMatchSummer;
	
	public void setPopMatchSummer(int popMatchSummer){
		this.popMatchSummer = popMatchSummer;
	}
	
	@ManagedProperty(value="#{processBean.popMatchFall}")
	private int popMatchFall;
	
	public void setPopMatchFall(int popMatchFall){
		this.popMatchFall = popMatchFall;
	}

	@ManagedProperty(value="#{processBean.popMatchWinter}")
	private int popMatchWinter;
	
	public void setPopMatchWinter(int popMatchWinter){
		this.popMatchWinter = popMatchWinter;
	}
	
	@ManagedProperty(value="#{processBean.temp1981}")
	private float temp1981;
	
	public void setTemp1981(float temp1981){
		this.temp1981 = temp1981;
	}
	
	@ManagedProperty(value="#{processBean.projTemp2011}")
	private float projTemp2011;
	
	public void setProjTemp2011(float projTemp2011){
		this.projTemp2011 = projTemp2011;
	}
	
	@ManagedProperty(value="#{processBean.precip1981}")
	private float precip1981;
	
	public void setPrecip1981(float precip1981){
		this.precip1981 = precip1981;
	}
	
	@ManagedProperty(value="#{processBean.projPrecip2011}")
	private float projPrecip2011;

	public void setProjPrecip2011(float projPrecip2011){
		this.projPrecip2011 = projPrecip2011;
	}
	
	@ManagedProperty(value="#{processBean.springObTemp}")
	private float springObTemp;
	
	public void setSpringObTemp(float springObTemp){
		this.springObTemp = springObTemp;
	}
	
	@ManagedProperty(value="#{processBean.springProjTemp}")
	private float springProjTemp;
	
	public void setSpringProjTemp(float springProjTemp){
		this.springProjTemp = springProjTemp;
	}
	
	@ManagedProperty(value="#{processBean.summerObTemp}")
	private float summerObTemp;
	
	public void setSummerObTemp(float summerObTemp){
		this.summerObTemp = summerObTemp;
	}
	
	@ManagedProperty(value="#{processBean.summerProjTemp}")
	private float summerProjTemp;
	
	public void setSummerProjTemp(float summerProjTemp){
		this.summerProjTemp = summerProjTemp;
	}
	
	@ManagedProperty(value="#{processBean.fallObTemp}")
	private float fallObTemp;
	
	public void setFallObTemp(float fallObTemp){
		this.fallObTemp = fallObTemp;
	}
	
	@ManagedProperty(value="#{processBean.fallProjTemp}")
	private float fallProjTemp;
	
	public void setFallProjTemp(float fallProjTemp){
		this.fallProjTemp = fallProjTemp;
	}
	
	@ManagedProperty(value="#{processBean.winterObTemp}")
	private float winterObTemp;
	
	public void setWinterObTemp(float winterObTemp){
		this.winterObTemp = winterObTemp;
	}
	
	@ManagedProperty(value="#{processBean.winterProjTemp}")
	private float winterProjTemp;
	
	public void setWinterProjTemp(float winterProjTemp){
		this.winterProjTemp = winterProjTemp;
	}
	
	@ManagedProperty(value="#{processBean.springObPrecip}")
	private float springObPrecip;
	
	public void setSpringObPrecip(float springObPrecip){
		this.springObPrecip = springObPrecip;
	}
	
	@ManagedProperty(value="#{processBean.springProjPrecip}")
	private float springProjPrecip;
	
	public void setSpringProjPrecip(float springProjPrecip){
		this.springProjPrecip = springProjPrecip;
	}
	
	@ManagedProperty(value="#{processBean.summerObPrecip}")
	private float summerObPrecip;
	
	public void setSummerObPrecip(float summerObPrecip){
		this.summerObPrecip = summerObPrecip;
	}
	
	@ManagedProperty(value="#{processBean.summerProjPrecip}")
	private float summerProjPrecip;
	
	public void setSummerProjPrecip(float summerProjPrecip){
		this.summerProjPrecip = summerProjPrecip;
	}
	
	@ManagedProperty(value="#{processBean.fallObPrecip}")
	private float fallObPrecip;
	
	public void setFallObPrecip(float fallObPrecip){
		this.fallObPrecip = fallObPrecip;
	}
	
	@ManagedProperty(value="#{processBean.fallProjPrecip}")
	private float fallProjPrecip;
	
	public void setFallProjPrecip(float fallProjPrecip){
		this.fallProjPrecip = fallProjPrecip;
	}
	
	@ManagedProperty(value="#{processBean.winterObPrecip}")
	private float winterObPrecip;
	
	public void setWinterObPrecip(float winterObPrecip){
		this.winterObPrecip = winterObPrecip;
	}
	
	@ManagedProperty(value="#{processBean.winterProjPrecip}")
	private float winterProjPrecip;
	
	public void setWinterProjPrecip(float winterProjPrecip){
		this.winterProjPrecip = winterProjPrecip;
	}
	
	
	public String imageLogo;
	public String imageHistory;
	public String imageHistory1;
	public String imageTemp;
	public String imageSpringTemp;
	public String imageWinterTemp;
	public String imageSummerTemp;
	public String imageFallTemp;
	public String imagePrecip;
	public String imageSpringPrecip;
	public String imageSummerPrecip;
	public String imageFallPrecip;
	public String imageWinterPrecip;
	public String demographic;
	public String demographicAnalog;
	public String strategies;
	public String strategies2;
	
	public String image3 = new String();
	public String image4 = new String();
	public String image5 = new String();
	public String image6 = new String();
	public String image7 = new String();
	public String image8 = new String();
	
	//@SuppressWarnings("restriction")
	//@PostConstruct
	public void imageMaker(){
	
			stateClimateDivision = process.stateClimDiv;
			climDiv = Integer.toString(process.climDivCode);
			imageLogo = new String("images/GLAA-C_Logo.png");

			imageHistory = 
			    new String( "resources/data/" + stateName 
								 + "_Climatic_Division_"
								 + stateClimateDivision + "-0.png");
			System.out.println(imageHistory);
			System.out.println(climDiv);
			imageHistory1 = 
			    new String( "resources/data/" + stateName 
								 + "_Climatic_Division_"
								 + stateClimateDivision + "-1.png");


			imageTemp = 
			    new String( "resources/data/plots/temp/" + climDiv + "_plot.png");

			imageSpringTemp = 
			    new String("resources/data/plots/seasonalTemp/"
								+ climDiv + "/" + climDiv
								+ "_spring_TAVG_plot.png");
	
			imageWinterTemp = 
			    new String("resources/data/plots/seasonalTemp/"
								+ climDiv + "/" + climDiv
								+ "_winter__TAVG_plot.png");

			imageSummerTemp = 
			    new String("resources/data/plots/seasonalTemp/"
								+ climDiv + "/" + climDiv
								+ "_summer__TAVG_plot.png");

			imageFallTemp =
			    new String("resources/data/plots/seasonalTemp/"
								+ climDiv + "/" + climDiv
								+ "_fall_TAVG_plot.png");

			imagePrecip =
			    new String( "resources/data/plots/precip/"
								 + climDiv + "_plot.png");

			imageSpringPrecip = 
			    new String( "resources/data/plots/seasonalPrecip/"
								 + climDiv + "/" + climDiv
								 + "_spring_PRCP_plot.png");

			imageWinterPrecip = 
			    new String("resources/data/plots/seasonalPrecip/"
								+ climDiv + "/" + climDiv
								+ "_winter_PRCP_plot.png");

			imageSummerPrecip = 
			    new String("resources/data/plots/seasonalPrecip/"
								+ climDiv + "/" + climDiv
								+ "_summer_PRCP_plot.png");

			imageFallPrecip =
			    new String("resources/data/plots/seasonalPrecip/"
								+ climDiv + "/" + climDiv
								+ "_fall_PRCP_plot.png");


			// try{
			if(stateName == "Ontario"){
				String im3 = 
				    new String("resources/data/gis/"
									+ "caTemp1951.png");
				

				String im4 = 
				    new String("resources/data/gis/"
									+ "caTemp1981.png");

				String im5 = 
				    new String("data/gis/" 
									+ "caTempCh.png");

				String im6 =
				    new String("resources/data/gis/"
									+"caPrecip1951.png");

				String im7 = 
				    new String("resources/data/gis/"
									+ "caPrecip1981.png");

				String im8 =
				    new String("resources/data/gis/"
									+ "caPrecipCh.png");
				image3 = im3;
				image4 = im4;
				image5 = im5;
				image6 = im6;
				image7 = im7;
				image8 = im8;
			    }
			else{
			    String im3 = 
				new String("resources/data/gis/"
								    + "greatLakesTemp51.jpg");
			    String im4 = 
				new String("resources/data/gis/"
								    + "greatLakesTemp81.jpg");
	
			    String im5 = 
				new String("resources/data/gis/" 
								    + "greatLakesTempChange.jpg");
	
			    String im6 =
				new String("resources/data/gis/"
								    +"greatLakesPrecip51.jpg");
	
			    String im7 = 
				new String("resources/data/gis/"
								    + "greatLakesPrecip81.jpg");
	
			
			    String im8 =
				new String("resources/data/gis/"
								    + "greatLakesPrecipChange.jpg");
			    
			    image3 = im3;
			    image4 = im4;
			    image5 = im5;
			    image6 = im6;
			    image7 = im7;
			    image8 = im8;
			}
	    }


	public String getImageLogo(){
		return imageLogo;
	}
	public String getStateName() {
		return stateName;
	}
	public String getStateClimDiv() {
		return stateClimDiv;
	}
	public String getImageHistory() {
		return imageHistory;
	}
	public String getImageHistory1() {
		return imageHistory1;
	}
	public String getImageTemp() {
		return imageTemp;
	}
	public String getImageSpringTemp() {
		return imageSpringTemp;
	}
	public String getImageWinterTemp() {
		return imageWinterTemp;
	}
	public String getImageSummerTemp() {
		return imageSummerTemp;
	}
	public String getImageFallTemp() {
		return imageFallTemp;
	}
	public String getImagePrecip() {
		return imagePrecip;
	}
	public String getImageSpringPrecip() {
		return imageSpringPrecip;
	}
	public String getImageSummerPrecip() {
		return imageSummerPrecip;
	}
	public String getImageFallPrecip() {
		return imageFallPrecip;
	}
	public String getImageWinterPrecip() {
		return imageWinterPrecip;
	}
	public String getImage3() {
		return image3;
	}
	public String getImage4() {
		return image4;
	}
	public String getImage5() {
		return image5;
	}
	public String getImage6() {
		return image6;
	}
	public String getImage7() {
		return image7;
	}
	public String getImage8() {
		return image8;
	}
	
	public String analog;
	//@SuppressWarnings("restriction")
	//@PostConstruct
	public String annualPeerMaker(){
		temp1981 = process.temp1981;
		projTemp2011 = process.projTemp2011;
		precip1981 = process.precip1981;
		projPrecip2011 = process.projPrecip2011;
		popMatch = process.popMatch;
		System.out.println("temp = " + temp1981);
		String secondString = new String();
		String thirdString = new String();
		String fourthString = new String();
		String fifthString = new String();
		if (cityMatchList.size() > 1){
		    secondString = "C: " + cityMatchList.get(1) + ", " 
			+ stateMatchList.get(1) + "   ";
		}
		else{
		    secondString = "";
		}
		if (cityMatchList.size() > 2){
		    thirdString = "D: " + cityMatchList.get(2) + ", "
			+ stateMatchList.get(2) + "   ";
		}
		else{
		    thirdString = "";
		}
		if (cityMatchList.size() > 3){
		    fourthString = "E: " + cityMatchList.get(3) + ", "
			+ stateMatchList.get(3) + "   ";
		}
		else{
		    fourthString = "";
		}
		if (cityMatchList.size() > 4){
		    fifthString = "F: " + cityMatchList.get(4) + ", "
			+ stateMatchList.get(4) + "   ";
		}
		else{
		    fifthString = "";
		}
		String popString = new String();
		if (popMatch == 0){
			    popString = 
				"The climate peer cities also fall within the same population category."
				+ "<br />;The cities fall within 5% of the demographic attribute: "
				+ demoFilter + "<br /><br />";
		}
		else if (popMatch == 1){ popString = 
			" No cities of the same population size were found which match"
			+ " the above criterea <br />"
			+ "The cities fall within 5% of the demographic attribute: "
			+ demoFilter + "<br /><br />";
		}
		else if (popMatch == 2){ popString =
			" No cities of the same population were found which match"
			+ " the above criterea <br />"
			+ " Nor were cities found which match the demographic attribute: "
			+ demoFilter + "<br /><br />";
		}
		double tmp1981 = 0;
		double tmp2011 = 0;
		double prcp1981 = 0;
		double prcp2011 = 0;
		String degreesUnit;
		String lengthUnit;
		if (stateName.equals("Ontario")){
		    double t1981 = 0;
		    double t2011 = 0;
		    double p1981 = 0;
		    double p2011 = 0;
		    t1981 = (temp1981 - 32) * (5.0/9.0);
		    tmp1981 += t1981;
		    t2011 = (projTemp2011 - 32) * (5.0/9.0);
		    tmp2011 += t2011;
		    p1981 = (precip1981) * (2.54);
		    prcp1981 += p1981;
		    p2011 = (projPrecip2011) * (2.54);
		    prcp2011 += p2011;
		    degreesUnit = "degrees C";
		    lengthUnit = "cm";
		    System.out.println("Got ontario");
		    
		}
		else{
			System.out.println("temp1981 = " + Float.toString(temp1981));
		    tmp1981 = temp1981;
		    tmp2011 = projTemp2011;
		    prcp1981 = precip1981;
		    prcp2011 = projPrecip2011;
		    degreesUnit = "degrees F";
		    lengthUnit = "in";
		    System.out.println("tmp1981 = " + tmp1981);
		}
		String temp1981d = new DecimalFormat("##.##").format(tmp1981);
		String temp2011d = new DecimalFormat("##.##").format(tmp2011);
		String precip1981d = new DecimalFormat("##.##").format(prcp1981);
		String precip2011d = new DecimalFormat("##.##").format(prcp2011);
		System.out.println("temp1981 = " + temp1981d);
		System.out.println("temp2011 = " + temp2011d);
		System.out.println("precip1981 = " + precip1981d);
		System.out.println("precip2011 = " + precip2011d);
		    
		try{
		    analog = "Climate Peer Cities:<br />"
			+ " <br />Cities whose current 30 year average temperature"
			+ " lies within "
			+ "0.5 degrees F <br />"
			+ " of your projected 30 year average temperature for the year 2040, <br /> "
			+ "and whose current yearly precipitation lies within 4 inches <br />"
			+ "of your projected "
			+ "yearly average precipitation.<br /><br />"

			+ popString
			+ "Current Temp: " 
			+ temp1981d + " " + degreesUnit
			+ "<br />Projected Temp: " + temp2011d + " " + degreesUnit
			+ "<br />Current Precipitaion: " + precip1981d + " " + lengthUnit
			+ "<br />Projected Precipitation: " + precip2011d + " " + lengthUnit 
			+"<br /><br /> A: " + cityName + ", " + stateName
			+ "<br /><br />Matches: <br /><br />"
			+ "B: " + cityMatchList.get(0) + ", " 
			+ stateMatchList.get(0) + "   "
			+ "<br />" + secondString
			+ "<br />" + thirdString
			+ "<br />" + fourthString
			+ "<br />" + fifthString
			+ "";
			
		   
		}
		catch(IndexOutOfBoundsException e){
		    e.printStackTrace();
		}
		 return analog;
	}
	public String getAnalog() {
		return analog;
	}


	public void setAnalog(String analog) {
		this.analog = analog;
	}
	
	public String analogSpring;
	public String springPeerMaker(){
		springObTemp = process.springObTemp;
		springProjTemp = process.springProjTemp;
		springObPrecip = process.springObPrecip;
		springProjPrecip = process.springProjPrecip;
		popMatchSpring = process.popMatchSpring;
		String secondString = new String();
		String thirdString = new String();
		String fourthString = new String();
		String fifthString = new String();
		if (citySpringMatchList.size() > 1){
		    secondString = "C: " + citySpringMatchList.get(1) + ", " 
			+ stateSpringMatchList.get(1) + "   ";
		}
		else{
		    secondString = "";
		}
		if (citySpringMatchList.size() > 2){
		    thirdString = "D: " + citySpringMatchList.get(2) + ", "
			+ stateSpringMatchList.get(2) + "   ";
		}
		else{
		    thirdString = "";
		}
		if (citySpringMatchList.size() > 3){
		    fourthString = "E: " + citySpringMatchList.get(3) + ", "
			+ stateSpringMatchList.get(3) + "   ";
		}
		else{
		    fourthString = "";
		}
		if (citySpringMatchList.size() > 4){
		    fifthString = "F: " + citySpringMatchList.get(4) + ", "
			+ stateSpringMatchList.get(4) + "   ";
		}
		else{
		    fifthString = "";
		}
		String popString = new String();
		if (popMatchSpring == 0){
			    popString = 
				"The climate peer cities also fall within the same population category."
				+ "<br />The cities fall within 5% of the demographic attribute: "
				+ demoFilter + "<br /><br />";
		}
		else if (popMatchSpring == 1){ popString = 
			" No cities of the same population size were found which match"
			+ " the above criterea <br />"
			+ "The cities fall within 5% of the demographic attribute: "
			+ demoFilter + "<br /><br />";
		}
		else if (popMatchSpring == 2){ popString =
			" No cities of the same population were found which match"
			+ " the above criterea <br />"
			+ " Nor were cities found which match the demographic attribute: "
			+ demoFilter + "<br /><br />";
		}
		double tmp1981 = 0;
		double tmp2011 = 0;
		double prcp1981 = 0;
		double prcp2011 = 0;
		String degreesUnit;
		String lengthUnit;
		if (stateName == "Ontario"){
		    double t1981 = 0;
		    double t2011 = 0;
		    double p1981 = 0;
		    double p2011 = 0;
		    t1981 = (springObTemp - 32) * (5.0/9.0);
		    tmp1981 += t1981;
		    t2011 = (springProjTemp - 32) * (5.0/9.0);
		    tmp2011 += t2011;
		    p1981 = (springObPrecip) * (2.54);
		    prcp1981 += p1981;
		    p2011 = (springProjPrecip) * (2.54);
		    prcp2011 += p2011;
		    degreesUnit = "degrees C";
		    lengthUnit = "cm";
		    
		}
		else{
		    tmp1981 = springObTemp;
		    tmp2011 = springProjTemp;
		    prcp1981 = springObPrecip;
		    prcp2011 = springProjPrecip;
		    degreesUnit = "degrees F";
		    lengthUnit = "in";
		}
		String temp1981d = new DecimalFormat("##.##").format(tmp1981);
		String temp2011d = new DecimalFormat("##.##").format(tmp2011);
		String precip1981d = new DecimalFormat("##.##").format(prcp1981);
		String precip2011d = new DecimalFormat("##.##").format(prcp2011);
		    
		try{
		    analogSpring = "Climate Peer Cities:<br />"
			+ " <br />Cities whose current 30 year average temperature"
			+ " lies within "
			+ "0.5 degrees F <br />"
			+ " of your projected 30 year average temperature for the year 2040, <br /> "
			+ "and whose current yearly precipitation lies within 4 inches <br />"
			+ "of your projected "
			+ "yearly average precipitation.<br /><br />"

			+ popString
			+ "Current Temp: " 
			+ temp1981d + " " + degreesUnit
			+ "<br />Projected Temp: " + temp2011d + " " + degreesUnit
			+ "<br />Current Precipitaion: " + precip1981d + " " + lengthUnit
			+ "<br />Projected Precipitation: " + precip2011d + " " + lengthUnit 
			+"<br /><br /> A: " + cityName + ", " + stateName
			+ "<br /><br />Matches: <br /><br />"
			+ "B: " + citySpringMatchList.get(0) + ", " 
			+ stateSpringMatchList.get(0) + "   "
			+ "<br />" + secondString
			+ "<br />" + thirdString
			+ "<br />" + fourthString
			+ "<br />" + fifthString
			+ "";
			
		   
		}
		catch(IndexOutOfBoundsException e){
		    e.printStackTrace();
		}
		 return analogSpring;
	}
	public String getAnalogSpring() {
		return analogSpring;
	}


	public void setAnalogSpring(String analogSpring) {
		this.analogSpring = analogSpring;
	}

	public String analogSummer;
	public String summerPeerMaker(){
		summerObTemp = process.summerObTemp;
		summerProjTemp = process.summerProjTemp;
		summerObPrecip = process.summerObPrecip;
		summerProjPrecip = process.summerProjPrecip;
		popMatchSummer = process.popMatchSummer;
		String secondString = new String();
		String thirdString = new String();
		String fourthString = new String();
		String fifthString = new String();
		if (citySummerMatchList.size() > 1){
		    secondString = "C: " + citySummerMatchList.get(1) + ", " 
			+ stateSummerMatchList.get(1) + "   ";
		}
		else{
		    secondString = "";
		}
		if (citySummerMatchList.size() > 2){
		    thirdString = "D: " + citySummerMatchList.get(2) + ", "
			+ stateSummerMatchList.get(2) + "   ";
		}
		else{
		    thirdString = "";
		}
		if (citySummerMatchList.size() > 3){
		    fourthString = "E: " + citySummerMatchList.get(3) + ", "
			+ stateSummerMatchList.get(3) + "   ";
		}
		else{
		    fourthString = "";
		}
		if (citySummerMatchList.size() > 4){
		    fifthString = "F: " + citySummerMatchList.get(4) + ", "
			+ stateSummerMatchList.get(4) + "   ";
		}
		else{
		    fifthString = "";
		}
		String popString = new String();
		if (popMatchSummer == 0){
			    popString = 
				"The climate peer cities also fall within the same population category."
				+ "<br />The cities fall within 5% of the demographic attribute: "
				+ demoFilter + "<br /><br />";
		}
		else if (popMatchSummer == 1){ popString = 
			" No cities of the same population size were found which match"
			+ " the above criterea <br />"
			+ "The cities fall within 5% of the demographic attribute: "
			+ demoFilter + "<br /><br />";
		}
		else if (popMatchSummer == 2){ popString =
			" No cities of the same population were found which match"
			+ " the above criterea <br />"
			+ " Nor were cities found which match the demographic attribute: "
			+ demoFilter + "<br /><br />";
		}
		double tmp1981 = 0;
		double tmp2011 = 0;
		double prcp1981 = 0;
		double prcp2011 = 0;
		String degreesUnit;
		String lengthUnit;
		if (stateName == "Ontario"){
		    double t1981 = 0;
		    double t2011 = 0;
		    double p1981 = 0;
		    double p2011 = 0;
		    t1981 = (summerObTemp - 32) * (5.0/9.0);
		    tmp1981 += t1981;
		    t2011 = (summerProjTemp - 32) * (5.0/9.0);
		    tmp2011 += t2011;
		    p1981 = (summerObPrecip) * (2.54);
		    prcp1981 += p1981;
		    p2011 = (summerProjPrecip) * (2.54);
		    prcp2011 += p2011;
		    degreesUnit = "degrees C";
		    lengthUnit = "cm";
		    
		}
		else{
		    tmp1981 = summerObTemp;
		    tmp2011 = summerProjTemp;
		    prcp1981 = summerObPrecip;
		    prcp2011 = summerProjPrecip;
		    degreesUnit = "degrees F";
		    lengthUnit = "in";
		}
		String temp1981d = new DecimalFormat("##.##").format(tmp1981);
		String temp2011d = new DecimalFormat("##.##").format(tmp2011);
		String precip1981d = new DecimalFormat("##.##").format(prcp1981);
		String precip2011d = new DecimalFormat("##.##").format(prcp2011);
		    
		try{
		    analogSummer = "Climate Peer Cities:<br />"
			+ " <br />Cities whose current 30 year average temperature"
			+ " lies within "
			+ "0.5 degrees F <br />"
			+ " of your projected 30 year average temperature for the year 2040, <br /> "
			+ "and whose current yearly precipitation lies within 4 inches <br />"
			+ "of your projected "
			+ "yearly average precipitation.<br /><br />"

			+ popString
			+ "Current Temp: " 
			+ temp1981d + " " + degreesUnit
			+ "<br />Projected Temp: " + temp2011d + " " + degreesUnit
			+ "<br />Current Precipitaion: " + precip1981d + " " + lengthUnit
			+ "<br />Projected Precipitation: " + precip2011d + " " + lengthUnit 
			+"<br /><br /> A: " + cityName + ", " + stateName
			+ "<br /><br />Matches: <br /><br />"
			+ "B: " + citySummerMatchList.get(0) + ", " 
			+ stateSummerMatchList.get(0) + "   "
			+ "<br />" + secondString
			+ "<br />" + thirdString
			+ "<br />" + fourthString
			+ "<br />" + fifthString
			+ "";
			
		   
		}
		catch(IndexOutOfBoundsException e){
		    e.printStackTrace();
		}
		 return analogSummer;
	}
	public String getAnalogSummer() {
		return analogSummer;
	}


	public void setAnalogSummer(String analogSummer) {
		this.analogSummer = analogSummer;
	}
	
	public String analogFall;
	public String fallPeerMaker(){
		fallObTemp = process.fallObTemp;
		fallProjTemp = process.fallProjTemp;
		fallObPrecip = process.fallObPrecip;
		fallProjPrecip = process.fallProjPrecip;
		popMatchFall = process.popMatchFall;
		String secondString = new String();
		String thirdString = new String();
		String fourthString = new String();
		String fifthString = new String();
		if (cityFallMatchList.size() > 1){
		    secondString = "C: " + cityFallMatchList.get(1) + ", " 
			+ stateFallMatchList.get(1) + "   ";
		}
		else{
		    secondString = "";
		}
		if (cityFallMatchList.size() > 2){
		    thirdString = "D: " + cityFallMatchList.get(2) + ", "
			+ stateFallMatchList.get(2) + "   ";
		}
		else{
		    thirdString = "";
		}
		if (cityFallMatchList.size() > 3){
		    fourthString = "E: " + cityFallMatchList.get(3) + ", "
			+ stateFallMatchList.get(3) + "   ";
		}
		else{
		    fourthString = "";
		}
		if (cityFallMatchList.size() > 4){
		    fifthString = "F: " + cityFallMatchList.get(4) + ", "
			+ stateFallMatchList.get(4) + "   ";
		}
		else{
		    fifthString = "";
		}
		String popString = new String();
		if (popMatchFall == 0){
			    popString = 
				"The climate peer cities also fall within the same population category."
				+ "<br />The cities fall within 5% of the demographic attribute: "
				+ demoFilter + "<br /><br />";
		}
		else if (popMatchFall == 1){ popString = 
			" No cities of the same population size were found which match"
			+ " the above criterea <br />"
			+ "The cities fall within 5% of the demographic attribute: "
			+ demoFilter + "<br /><br />";
		}
		else if (popMatchFall == 2){ popString =
			" No cities of the same population were found which match"
			+ " the above criterea <br />"
			+ " Nor were cities found which match the demographic attribute: "
			+ demoFilter + "<br /><br />";
		}
		double tmp1981 = 0;
		double tmp2011 = 0;
		double prcp1981 = 0;
		double prcp2011 = 0;
		String degreesUnit;
		String lengthUnit;
		if (stateName == "Ontario"){
		    double t1981 = 0;
		    double t2011 = 0;
		    double p1981 = 0;
		    double p2011 = 0;
		    t1981 = (fallObTemp - 32) * (5.0/9.0);
		    tmp1981 += t1981;
		    t2011 = (fallProjTemp - 32) * (5.0/9.0);
		    tmp2011 += t2011;
		    p1981 = (fallObPrecip) * (2.54);
		    prcp1981 += p1981;
		    p2011 = (fallProjPrecip) * (2.54);
		    prcp2011 += p2011;
		    degreesUnit = "degrees C";
		    lengthUnit = "cm";
		    
		}
		else{
		    tmp1981 = fallObTemp;
		    tmp2011 = fallProjTemp;
		    prcp1981 = fallObPrecip;
		    prcp2011 = fallProjPrecip;
		    degreesUnit = "degrees F";
		    lengthUnit = "in";
		}
		String temp1981d = new DecimalFormat("##.##").format(tmp1981);
		String temp2011d = new DecimalFormat("##.##").format(tmp2011);
		String precip1981d = new DecimalFormat("##.##").format(prcp1981);
		String precip2011d = new DecimalFormat("##.##").format(prcp2011);
		    
		try{
		    analogFall = "Climate Peer Cities:<br />"
			+ " <br />Cities whose current 30 year average temperature"
			+ " lies within "
			+ "0.5 degrees F <br />"
			+ " of your projected 30 year average temperature for the year 2040, <br /> "
			+ "and whose current yearly precipitation lies within 4 inches <br />"
			+ "of your projected "
			+ "yearly average precipitation.<br /><br />"

			+ popString
			+ "Current Temp: " 
			+ temp1981d + " " + degreesUnit
			+ "<br />Projected Temp: " + temp2011d + " " + degreesUnit
			+ "<br />Current Precipitaion: " + precip1981d + " " + lengthUnit
			+ "<br />Projected Precipitation: " + precip2011d + " " + lengthUnit 
			+"<br /><br /> A: " + cityName + ", " + stateName
			+ "<br /><br />Matches: <br /><br />"
			+ "B: " + cityFallMatchList.get(0) + ", " 
			+ stateFallMatchList.get(0) + "   "
			+ "<br />" + secondString
			+ "<br />" + thirdString
			+ "<br />" + fourthString
			+ "<br />" + fifthString
			+ "";
			
		   
		}
		catch(IndexOutOfBoundsException e){
		    e.printStackTrace();
		}
		 return analogFall;
	}
	
	public String getAnalogFall() {
		return analogFall;
	}

	public void setAnalogFall(String analogFall) {
		this.analogFall = analogFall;
	}
	public String analogWinter;
	public String winterPeerMaker(){
		winterObTemp = process.winterObTemp;
		winterProjTemp = process.winterProjTemp;
		winterObPrecip = process.winterObPrecip;
		winterProjPrecip = process.winterProjPrecip;
		popMatchWinter = process.popMatchWinter;
		String secondString = new String();
		String thirdString = new String();
		String fourthString = new String();
		String fifthString = new String();
		if (cityWinterMatchList.size() > 1){
		    secondString = "C: " + cityWinterMatchList.get(1) + ", " 
			+ stateWinterMatchList.get(1) + "   ";
		}
		else{
		    secondString = "";
		}
		if (cityWinterMatchList.size() > 2){
		    thirdString = "D: " + cityWinterMatchList.get(2) + ", "
			+ stateWinterMatchList.get(2) + "   ";
		}
		else{
		    thirdString = "";
		}
		if (cityWinterMatchList.size() > 3){
		    fourthString = "E: " + cityWinterMatchList.get(3) + ", "
			+ stateWinterMatchList.get(3) + "   ";
		}
		else{
		    fourthString = "";
		}
		if (cityWinterMatchList.size() > 4){
		    fifthString = "F: " + cityWinterMatchList.get(4) + ", "
			+ stateWinterMatchList.get(4) + "   ";
		}
		else{
		    fifthString = "";
		}
		String popString = new String();
		if (popMatchWinter == 0){
			    popString = 
				"The climate peer cities also fall within the same population category."
				+ "<br />The cities fall within 5% of the demographic attribute: "
				+ demoFilter + "<br /><br />";
		}
		else if (popMatchWinter == 1){ popString = 
			" No cities of the same population size were found which match"
			+ " the above criterea <br />"
			+ "The cities fall within 5% of the demographic attribute: "
			+ demoFilter + "<br /><br />";
		}
		else if (popMatchWinter == 2){ popString =
			" No cities of the same population were found which match"
			+ " the above criterea <br />"
			+ " Nor were cities found which match the demographic attribute: "
			+ demoFilter + "<br /><br />";
		}
		double tmp1981 = 0;
		double tmp2011 = 0;
		double prcp1981 = 0;
		double prcp2011 = 0;
		String degreesUnit;
		String lengthUnit;
		if (stateName == "Ontario"){
		    double t1981 = 0;
		    double t2011 = 0;
		    double p1981 = 0;
		    double p2011 = 0;
		    t1981 = (winterObTemp - 32) * (5.0/9.0);
		    tmp1981 += t1981;
		    t2011 = (winterProjTemp - 32) * (5.0/9.0);
		    tmp2011 += t2011;
		    p1981 = (winterObPrecip) * (2.54);
		    prcp1981 += p1981;
		    p2011 = (winterProjPrecip) * (2.54);
		    prcp2011 += p2011;
		    degreesUnit = "degrees C";
		    lengthUnit = "cm";
		    
		}
		else{
		    tmp1981 = winterObTemp;
		    tmp2011 = winterProjTemp;
		    prcp1981 = winterObPrecip;
		    prcp2011 = winterProjPrecip;
		    degreesUnit = "degrees F";
		    lengthUnit = "in";
		}
		String temp1981d = new DecimalFormat("##.##").format(tmp1981);
		String temp2011d = new DecimalFormat("##.##").format(tmp2011);
		String precip1981d = new DecimalFormat("##.##").format(prcp1981);
		String precip2011d = new DecimalFormat("##.##").format(prcp2011);
		    
		try{
		    analogWinter = "Climate Peer Cities:<br />"
			+ " <br />Cities whose current 30 year average temperature"
			+ " lies within "
			+ "0.5 degrees F <br />"
			+ " of your projected 30 year average temperature for the year 2040, <br /> "
			+ "and whose current yearly precipitation lies within 4 inches <br />"
			+ "of your projected "
			+ "yearly average precipitation.<br /><br />"

			+ popString
			+ "Current Temp: " 
			+ temp1981d + " " + degreesUnit
			+ "<br />Projected Temp: " + temp2011d + " " + degreesUnit
			+ "<br />Current Precipitaion: " + precip1981d + " " + lengthUnit
			+ "<br />Projected Precipitation: " + precip2011d + " " + lengthUnit 
			+"<br /><br /> A: " + cityName + ", " + stateName
			+ "<br /><br />Matches: <br /><br />"
			+ "B: " + cityWinterMatchList.get(0) + ", " 
			+ stateWinterMatchList.get(0) + "   "
			+ "<br />" + secondString
			+ "<br />" + thirdString
			+ "<br />" + fourthString
			+ "<br />" + fifthString
			+ "";
			
		   
		}
		catch(IndexOutOfBoundsException e){
		    e.printStackTrace();
		}
		 return analogWinter;
	}
	public String getAnalogWinter() {
		return analogWinter;
	}


	public void setAnalogWinter(String analogWinter) {
		this.analogWinter = analogWinter;
	}	
	
	
	public String demoMaker(){
		demographic = ""
			    + "<br /><br />Demographic data from the 2010 census:<br /><br />"
			    + "Population: " + process.population + "<br /> "
			    + "Median age of housing stock: " + process.houseAge + "<br />"
			    + "Percent population over age of 65: " + process.over65 +  "<br />" 
			    + "Median income: " + process.medianIncome + "<br /> "
			    + "Percent without HS diploma: " + process.highSchool + "<br />"
			    + "Percent below poverty line: " + process.poverty + "<br />"
			    + "Percent owner-occupied residences: " + process.ownerOccupy + "<br />"
			    + "<br /><br />"
			    + "";
		//	int demoWidth = 500;
			//int demoHeight = 400;
			System.out.println(demographic);
			return demographic;
			
	}
	
	public String getDemographic() {
		return demographic;
	}


	public void setDemographic(String demographic) {
		this.demographic = demographic;
	}	
	
	
	public String demoAnalogMaker(){
		
		
		ArrayList<Integer> analogPopList = process.analogPopList;
		System.out.println("Pop = " + analogPopList.size());
		ArrayList<Float>analogOver65List = process.analogOver65List;
		System.out.println("Over = " + analogOver65List.size());
		ArrayList<Integer> analogHouseAgeList = process.analogHouseAgeList;
		System.out.println("House = " + analogHouseAgeList.size());
		ArrayList<Integer> analogMedianIncomeList = process.analogMedianIncomeList;
		System.out.println("Income = " + analogMedianIncomeList.size());
		ArrayList<Float> analogHighSchoolList = process.analogHighSchoolList;
		System.out.println("HighSchool = " + analogHighSchoolList.size());
		ArrayList<Float> analogPovertyList = process.analogPovertyList;
		System.out.println("Poverty = " + analogPovertyList.size());
		ArrayList<Float> analogOwnerList = process.analogOwnerList;
		System.out.println("Owner = " + analogOwnerList.size());

		String demographicAnalogHead = ""
				+ "<br /><br />Demographic data from the 2010 census<br />"
				+ "for your annual climate peer cities:<br /><br />";
		demographicAnalog = "" + demographicAnalogHead + "<br /><br />";
		int d;
		int dEnd;
		if (cityMatchList.size() < 5){
			dEnd = (cityMatchList.size());
		}
		else{
			dEnd = 5;
		}
		for (d=0;d<dEnd;d++){
			System.out.println(d);
			String demo = "" + cityMatchList.get(d) + ","
					+ stateMatchList.get(d) + "<br />"
					+ "Population: " + analogPopList.get(d) + "<br />"
					+ "Median age of housing stock: " + analogHouseAgeList.get(d) + "<br />"
					+ "Percent population over age of 65: " + analogOver65List.get(d) +  "<br />" 
					+ "Median income: " + analogMedianIncomeList.get(d) + "<br /> "
					+ "Percent without HS diploma: " + analogHighSchoolList.get(d) + "<br />"
					+ "Percent below poverty line: " + analogPovertyList.get(d) + "<br />"
					+ "Percent owner-occupied residences: " + analogOwnerList.get(d) + "<br />";
			demographicAnalog += demo + "<br /><br />";   
		}
		//int demoAnalogWidth = 500;
		//int demoAnalogHeight = 400;
		System.out.println(demographicAnalog);
		return demographicAnalog; 

	}
	
	public String getDemographicAnalog() {
		return demographicAnalog;
	}


	public void setDemographicAnalog(String demographicAnalog) {
		this.demographicAnalog = demographicAnalog;
	}	
	
	
	public String strategyMaker(){
		String strategyHead = "The following climate change adaptation strategies derive"
			    + " from study conducted at the University of Michigan in the Spring of 2013.<br />"
			    + "This database includes examples of adaptation from municipal plans across"
			    + " the US and Canada.<br />"
			    + " For each adaptation strategy action noted below we have tried to include"
			    + " the climate driver and climate impact that the strategies is responding to,"
			    + "<br />as well as the primary department responsible for the action,"
			    + " the title of the plan where the action is embedded and a link to that plan.";
			strategies = "" + strategyHead + "<br /><br />";
			ArrayList<String> climateDriverList = process.climateDriverList;
			System.out.println(climateDriverList.size());
			ArrayList<String> climateImpactList = process.climateImpactList;
			ArrayList<String> cityStateList = process.cityStateList;
			ArrayList<String> populationList = process.populationList;
			ArrayList<String> actionList = process.actionList;
			ArrayList<String> departmentList =  process.departmentList;
			ArrayList<String> cobenefitList = process.cobenefitList;
			ArrayList<String> documentList = process.documentList;
			ArrayList<String> linkList = process.linkList;
			int i;
			for (i=0;i<(climateDriverList.size());i++){
			    String strat =  "" + (i+1) + "<br />" + "Climate Driver: " + 
				climateDriverList.get(i) + "<br />"
				+ "Climate Impact: " + climateImpactList.get(i) + "<br /> "
				+ "City: " + cityStateList.get(i) + "<br /> "
				+ "Population: " + populationList.get(i) + "<br />"
				+ "Action: " + actionList.get(i) + "<br />"
				+ "Department: " + departmentList.get(i) + "<br />"
				+ "Cobenefits: " + cobenefitList.get(i) + "<br />"
				+ "Document Name: " + documentList.get(i) + "<br />"
				+ "Document Link: " + linkList.get(i) + "<br />";
			    strategies += strat + "<br /><br />";
			}
			System.out.println(strategies);
			return strategies;
		}
	
	public String getStrategies() {
		return strategies;
	}


	public void setStrategies(String strategies) {
		this.strategies = strategies;
	}	

	public String strategyMaker2(){
		
			String strategyHead2 = "The following climate change adaptation strategies derive"
			    + " from study conducted at the University of Michigan in the Spring of 2013.<br />"
			    + "This database includes examples of adaptation from municipal plans across"
			    + " the US and Canada.<br />"
			    + " For each adaptation strategy action noted below we have tried to include"
			    + " the climate driver and climate impact that the strategies is responding to,"
			    + "<br />as well as the primary department responsible for the action,"
			    + " the title of the plan where the action is embedded and a link to that plan.";
			strategies2 = "" + strategyHead2 + "<br /><br />";
			ArrayList<String> climateDriverList2 = process.climateDriverList2;
			ArrayList<String> climateImpactList2 = process.climateImpactList2;
			ArrayList<String> cityStateList2 = process.cityStateList2;
			ArrayList<String> populationList2 = process.populationList2;
			ArrayList<String> actionList2 = process.actionList2;
			ArrayList<String> departmentList2 =  process.departmentList2;
			ArrayList<String> cobenefitList2 = process.cobenefitList2;
			ArrayList<String> documentList2 = process.documentList2;
			ArrayList<String> linkList2 = process.linkList2;
			int x;
			for (x=0;x<(climateDriverList2.size());x++){
			    String strat2 =  "" + (x+1) + "<br />" + "Climate Driver: " + 
				climateDriverList2.get(x) + "<br /> "
				+ "Climate Impact: " + climateImpactList2.get(x) + "<br />"
				+ "City: " + cityStateList2.get(x) + "<br />"
				+ "Population: " + populationList2.get(x) + "<br />"
				+ "Action: " + actionList2.get(x) + "<br />"
				+ "Department: " + departmentList2.get(x) + "<br />"
				+ "Cobenefits: " + cobenefitList2.get(x) + "<br />"
				+ "Document Name: " + documentList2.get(x) + "<br />"
				+ "Document Link: " + linkList2.get(x) + "<br />";
			    strategies2 += strat2 + "<br /><br />";
			    
			}
			System.out.println(strategies2);
			return strategies2;
	}
	
	public String getStrategies2() {
		return strategies2;
	}


	public void setStrategies2(String strategies2) {
		this.strategies2 = strategies2;
	}	

	
}
