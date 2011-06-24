package com.lab10;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="temp") // or @Named("temp")
@SessionScoped
public class TemperatureBean implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private double inputTemp = 0;
	private double finalTemp = 0;
	
	public double getInputTemp() {
		return inputTemp;
	}
	
	public void setInputTemp(double inputTemp) {
		this.inputTemp = inputTemp;
	}
	
	public double getFinalTemp() {
		finalTemp = this.inputTemp + 100;
		return finalTemp;
	}
	
	public void setFinalTemp(double finalTemp) {
		this.finalTemp = finalTemp;
	}
	
	public double calcTemp() {
		finalTemp = this.inputTemp + 100;
		return finalTemp;
	}
}
