package com.lab10;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ActionEvent;

@ManagedBean(name="temp") // or @Named("temp")
@SessionScoped
public class ConversionBean implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private double inputDist = 0;
	private double finalDist = 0;
	private String convType = "";
	private String convResult = "";
	private String convMessage = "";
	
	public double getInputDist() {
		return inputDist;
	}
	
	public void setInputDist(double inputDist) {
		this.inputDist = inputDist;
	}
	
	public double getFinalDist() {
		return finalDist;
	}
	
	public void setFinalTemp(double finalDist) {
		this.finalDist = finalDist;
	}
	
	public String getConvType() {
		return convType;
	}
	
	public void setConvType(String convType) {
		this.convType = convType;
	}
	
	public String getConvResult() {
		return convResult;
	}
	
	public void setConvResult(String convResult) {
		this.convResult = convResult;
	}
	
	public String getConvMessage() {
		return convMessage;
	}
	
	public void setConvMessage(String convMessage) {
		this.convMessage = convMessage;
	}
	
	public void handleMouseClick(ActionEvent e) {
		try {
			double dist = inputDist;
			if(convType.equals("km")) {
				//miles to kilometres conversion
				finalDist = dist * 1.609344;
				convResult = "Kilometres";
				convMessage = "Conversion from miles to kilometres";
			} else {
				//kilometres to miles conversion
				finalDist = dist * 0.62137;
				convResult = "Miles";
				convMessage = "Conversion from kilometres to miles";
			}
		} catch (Exception nfe) {
			//number format exception
		}
	}
	
	
}
