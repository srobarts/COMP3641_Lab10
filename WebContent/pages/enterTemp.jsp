<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"  
"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml"
      xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html">
<f:loadBundle basename="com.lab10.messages" var="msgs"/>
   
   <h:head>
      <h:outputStylesheet library="css" name="styles.css"/>
      <title><h:outputText value="#{msgs.indexWindowTitle}"/></title>
   </h:head>
   
   <h:body>
      	<h:outputText value="#{msgs.indexPageTitle}" styleClass="emphasis"/>
      	<h:form>
         	<h:panelGrid columns="2">
            	<h:outputText value="#{msgs.tempPrompt}"/>
            	<h:inputText value="#{temp.inputTemp}"/>
      		</h:panelGrid>
         	<h:commandButton value="#{msgs.buttonPrompt}" action="#{temp.calcTemp}"/>
    	</h:form>
  	</h:body>
</html>