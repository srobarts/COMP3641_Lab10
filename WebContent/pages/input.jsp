<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>

<html>
 <head>
  <title>enter your name page</title>
 </head>
 <body>
   <f:view>
     <h1>
      <h:outputText value="#{msgs.inputname_header}"/>
     </h1>
     <h:form id="helloForm">
      <h:outputText value="#{msgs.prompt}"/>
      <h:inputText value="#{personBean.personName}" />
      <h:commandButton value="#{msgs.button_text}" />
     </h:form>
   </f:view>
 </body>
</html> 