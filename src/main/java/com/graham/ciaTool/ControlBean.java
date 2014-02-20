package com.graham.ciaTool;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.faces.application.FacesMessage;
import java.io.Serializable; 

@ManagedBean
@RequestScoped
public class ControlBean implements Serializable {
	
	private static final long serialVersionUID = 1L;  

	@ManagedProperty("#{processBean}")
	private ProcessBean process;
	
	@ManagedProperty("#{reportBean}")
	private ReportBean report;
	
	
	public ProcessBean getProcess() {
		return process;
	}


	public void setProcess(ProcessBean process) {
		this.process = process;
	}


	public ReportBean getReport() {
		return report;
	}
	
	public void setReport(ReportBean report) {
		this.report = report;
	}

	public ControlBean(){
		System.out.println("control bean started");
	}
	
	//@PostConstruct 
    public String controlMethod(){
		//FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Preparing Report"));
    	System.out.println("start pull");
    	process.pullData();
    	System.out.println("start geocode");
    	process.geocodeCity();
        process.geocodeAnalogs();
    	System.out.println("start store");
    	process.storeData();
    	System.out.println("start map");
    	process.googleMap();
    	process.genImages();
    	process.pullStrategies();
    	report.imageMaker();
    	report.annualPeerMaker();
    	report.springPeerMaker();
    	report.summerPeerMaker();
    	report.fallPeerMaker();
    	report.winterPeerMaker();
    	report.demoMaker();
    	report.demoAnalogMaker();
    	report.strategyMaker();
    	report.strategyMaker2();
    	return "display_report";
    }	
	
}
