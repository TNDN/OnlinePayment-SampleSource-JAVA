<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>TNDN</title>
</head>
<%
	//cancel.jsp 요청 파라미터 설정
	String resultCode = new String(request.getParameter("resultCode").getBytes("ISO-8859-1"),"UTF-8");
	String resultMessage = new String(request.getParameter("resultMessage").getBytes("ISO-8859-1"),"UTF-8");
	String resultNMessage = new String(request.getParameter("resultNMessage").getBytes("ISO-8859-1"),"UTF-8");
	int paymentType = Integer.parseInt(request.getParameter("paymentType"));
	String orderNo = new String(request.getParameter("orderNo").getBytes("ISO-8859-1"),"UTF-8");
	
	String orderInfo = new String(request.getParameter("orderInfo").getBytes("ISO-8859-1"),"UTF-8");
	double transAmount = Double.parseDouble(request.getParameter("transAmount"));
	String email = new String(request.getParameter("email").getBytes("ISO-8859-1"),"UTF-8");
	String additionalInfo = new String(request.getParameter("additionalInfo").getBytes("ISO-8859-1"),"UTF-8");
	
	if ("SUCCESS" == resultCode)
    {
        //결제 성공
    }
    else
    {
        //결제 실패
        out.print("resultCode=" + resultCode + "<br/>");
        out.print("resultMessage=" + resultMessage + "<br/>");
        out.print("resultNMessage=" + resultNMessage);
    }
%>
<body>
</body>
</html>