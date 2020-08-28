<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
   
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<c:out value="${'Hello bobby'}"/>
<br>
<%-- <c:set var='age' value='25'/>
<c:out value="${age}" />
<c:if test="${age > 15}">
age is more than 15
</c:if>
<br>
----------------------------------
<br>
<br>
below is the result of c:choose
<br>
<c:choose>
<c:when test="${age > 24}"> age > 24 </c:when>
<c:when test="${age <25 && age>=21}"> age <=25 && age>=21 </c:when>
<c:otherwise> else less < = 20 <c:out value="${age }"/> </c:otherwise>
</c:choose> --%>


<!-- names from servlet are as follows -->

<%-- <c:forEach var="name" items="${playerList}">
 <c:out  value="${name}"/> <br>
</c:forEach> --%>
<%-- <c:forEach var="i" begin="1" end="10">
<c:out  value="${i}"/> <br>
</c:forEach>
<br>
<c:forTokens items = "${playerList}" delims = "," var = "name" varStatus="cnt">
<c:out value="${cnt.count}"></c:out>
         <c:out value = "${name}"/><p>
      </c:forTokens> --%>
      
      <c:set var="age" value="10.55" />
      <%-- <fmt:parseNumber  var="x" integerOnly="true"  type="number" value="${age}" /> --%>
      <fmt:formatNumber type = "number" 
         maxFractionDigits = "1" value = "${age}" /></p>
<c:out value="${age}"></c:out>
<%-- <br>

after convert
<br>
<c:out value="${x}"/> --%>
</body>
</html>