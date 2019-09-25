<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="paybox.payment.sample.module.PayboxModule"%>
<%@page import="com.google.gson.GsonBuilder"%>
<%@page import="paybox.payment.sample.model.PartnerNotification"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>TNDN</title>
</head>
<%
	//Request Body 읽기
	String body = PayboxModule.getBody(request);
	
	if (body != "")
    {
        //FAIL로 응답 시 최대 10회까지 재 전송 처리
        out.print("<xml><returnCode><![CDATA[FAIL]]></returnCode>></xml>");
    }
	
	GsonBuilder gson = new GsonBuilder();
	PartnerNotification partnerNotification = gson.create().fromJson(body, PartnerNotification.class);
	
	//out.print("TransactionId=" + partnerNotification.getTransactionId() + "<br/>");
    //out.print("TransactionDateTime=" + partnerNotification.getTransactionDateTime() + "<br/>");
    //out.print("TransactionCurrency=" + partnerNotification.getTransactionCurrency() + "<br/>");
    //out.print("TransactionPGCode=" + partnerNotification.getTransactionPGCode() + "<br/>");
    //out.print("OrderNo=" + partnerNotification.getOrderNo() + "<br/>");

    //out.print("OrderInfo=" + partnerNotification.getOrderInfo() + "<br/>");
    //out.print("TransAmount=" + partnerNotification.getTransAmount() + "<br/>");
    //out.print("Email=" + partnerNotification.getEmail() + "<br/>");
    //out.print("AdditionalInfo=" + partnerNotification.getAdditionalInfo() + "<br/>");

    //out.print("ExchangeCurrecy=" + partnerNotification.getExchangeCurrecy() + "<br/>");
    //out.print("ExchangeAmount=" + partnerNotification.getExchangeAmount() + "<br/>");
    //out.print("ExchangeRate=" + partnerNotification.getExchangeRate() + "<br/>");
	out.print("<xml><returnCode><![CDATA[SUCCESS]]></returnCode>></xml>");
%>
<body>
</body>
</html>