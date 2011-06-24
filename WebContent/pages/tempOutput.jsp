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
      	<h2><h:outputText value="#{msgs.convertedPageTitle}" styleClass="emphasis"/></h2>
      	<h:outputText value="#{msgs.convertedTempPrompt}" style="font-style: italic"/>: <br />
      		<h:outputText value="#{temp.finalTemp}"/>
  	</h:body>
</html>