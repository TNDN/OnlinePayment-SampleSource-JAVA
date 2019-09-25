<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="paybox.payment.sample.module.PayboxModule"%>
<%@page import="paybox.payment.sample.model.RequestCancelPayment"%>
<%@page import="paybox.payment.sample.model.ReeponseCancelPayment"%>
<%@page import="paybox.payment.sample.model.CreateToken"%>
<%@ page import="paybox.payment.sample.*"%>
<%@ page import="paybox.payment.sample.config.*"%>
<%@ page import="paybox.payment.sample.module.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>TNDN</title>
</head>
<%
	//cancel.jsp 요청 파라미터 설정
	int cancelType = Integer.parseInt(request.getParameter("Cancel_Type"));
	String transactionId = new String(request.getParameter("TransactionId").getBytes("ISO-8859-1"),"UTF-8");
	double transAmount = Double.parseDouble(request.getParameter("TransAmount"));
	
	//토큰 생성 파라미터 설정
	CreateToken createToken = new CreateToken();
	createToken.setPartnerAPIId(PayboxConstants.PARTNER_API_ID);
	createToken.setPartnerAPIKey(PayboxConstants.PARTNER_API_KEY);
	
	String token = PayboxModule.createToken(PayboxConstants.CREATE_TOKEN_URL, createToken);
	StringBuffer sbHtml = new StringBuffer();
	if(createToken.getResult() != null){
		sbHtml.append("<script>alert('"+ createToken.getResult().getDetail() + "'); self.close();</script>");
		out.print(sbHtml.toString());
		
		return;
	}
	
	//결제취소 파라미터 설정
	RequestCancelPayment requestCancelPayment = new RequestCancelPayment();
	requestCancelPayment.setCancelType(cancelType);
	requestCancelPayment.setTransactionId(transactionId);
	requestCancelPayment.setTransAmount(transAmount);
	
	ReeponseCancelPayment reeponseCancelPayment = PayboxModule.cacenlPayment(PayboxConstants.CANCEL_PAYMENT_URL, token, requestCancelPayment);
	if(requestCancelPayment.getResult() != null){
		sbHtml.append("<script>alert('"+ requestCancelPayment.getResult().getDetail() + "'); self.close();</script>");
		out.print(sbHtml.toString());
		
		return;
	}
	
	sbHtml.append("<script>alert('" + String.format("%s/%s/%s/%s/%s", reeponseCancelPayment.getData().getResultCode()
            , reeponseCancelPayment.getData().getResultMessage()
            , reeponseCancelPayment.getData().getResultNMessage()
            , reeponseCancelPayment.getData().getTransactionId()
            , reeponseCancelPayment.getData().getCancelDataTime()) + "');self.close();</script>");
	
	out.print(sbHtml.toString());
%>
<body>
</body>
</html>