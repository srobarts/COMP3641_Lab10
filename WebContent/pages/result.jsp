<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>

<html>
  <head>
   <title>greeting page</title>
  </head>    
  <body>
     <f:view>
     	<h3>
 	 <h:outputText value="#{msgs.greeting_text}" />,
 	 <h:outputText value="#{personBean.personName}" />
         <h:outputText value="#{msgs.sign}" />
    	</h3>
     </f:view>
 </body>	
</html>