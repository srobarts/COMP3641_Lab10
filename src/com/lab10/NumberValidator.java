package com.lab10;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

public class NumberValidator implements Validator {
	
   public void validate(FacesContext context, UIComponent component, Object value)
	   throws ValidatorException {
		   String inputNumber = value.toString();
		   if (!doubleCheck(inputNumber)) {
			   FacesMessage message = com.lab10.util.Messages.getMessage("com.lab10.messages", "badDouble", null);
			   message.setSeverity(FacesMessage.SEVERITY_ERROR);
			   throw new ValidatorException(message);
		   }
	   }
   
   private static boolean doubleCheck(String inputNumber) {
	   try {
		   @SuppressWarnings("unused")
		   double dbl = Double.parseDouble(inputNumber);
		   return true;
	   } catch (NumberFormatException nfe) {
		   return false; 
	   }  
   }
}
