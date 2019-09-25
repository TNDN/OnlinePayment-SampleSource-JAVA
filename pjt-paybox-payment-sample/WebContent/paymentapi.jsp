<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="paybox.payment.sample.module.PayboxModule"%>
<%@page import="paybox.payment.sample.model.RequestPayment"%>
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
	//payment.jsp 요청 파라미터 설정
	int paymentType = Integer.parseInt(request.getParameter("Payment_Type"));
	String pgCode = new String(request.getParameter("PGCode").getBytes("ISO-8859-1"),"UTF-8");
	String orderNo = new String(request.getParameter("OrderNo").getBytes("ISO-8859-1"),"UTF-8");
	double transAmount = Double.parseDouble(request.getParameter("TransAmount"));
	String notiUrl = new String(request.getParameter("NotiUrl").getBytes("ISO-8859-1"),"UTF-8");
	String returnUrl = new String(request.getParameter("ReturnUrl").getBytes("ISO-8859-1"),"UTF-8");
	String cancelUrl = new String(request.getParameter("CancelUrl").getBytes("ISO-8859-1"),"UTF-8");
	String orderInfo = new String(request.getParameter("OrderInfo").getBytes("ISO-8859-1"),"UTF-8");
	String email = new String(request.getParameter("Email").getBytes("ISO-8859-1"),"UTF-8");
	String additionalInfo = new String(request.getParameter("AdditionalInfo").getBytes("ISO-8859-1"),"UTF-8");

	//결제창 호출 파라미터 설정
	RequestPayment requestPayment = new RequestPayment();
	requestPayment.setPartnerAPIId(PayboxConstants.PARTNER_API_ID);
	requestPayment.setPartnerAPIKey(PayboxConstants.PARTNER_API_KEY);
	requestPayment.setPaymentType(paymentType);
	requestPayment.setPgCode(pgCode);
	requestPayment.setOrderNo(orderNo);
	requestPayment.setTransAmount(transAmount);
	requestPayment.setNotiUrl(notiUrl);
	requestPayment.setReturnUrl(returnUrl);
	requestPayment.setCancelUrl(cancelUrl);
	requestPayment.setOrderInfo(orderInfo);
	requestPayment.setEmail(email);
	requestPayment.setAdditionalInfo(additionalInfo);
	
	String encData = PayboxModule.getPaymentEncrypt(PayboxConstants.PAYMENT_ENCRYPT_URL, requestPayment);
	
	StringBuffer sbHtml = new StringBuffer();
	if(requestPayment.getResult() != null){
		sbHtml.append("<script>alert('"+ requestPayment.getResult().getDetail() + "'); self.close();</script>");
		out.print(sbHtml.toString());
		
		return;
	}
	
	sbHtml.append("<form id='payboxsubmit' name='payboxsubmit' action='" + String.format(PayboxConstants.REQUEST_PAYMENT_URL, pgCode) + "' method='GET'>");
    sbHtml.append("<input type='hidden' name='param' value='" + encData + "'/>");
    sbHtml.append("<script>document.forms['payboxsubmit'].submit();</script>");
	
	out.print(sbHtml.toString());
%>
<body>
</body>
</html>