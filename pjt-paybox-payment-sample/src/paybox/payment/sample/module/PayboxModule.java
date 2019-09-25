package paybox.payment.sample.module;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.servlet.http.HttpServletRequest;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import paybox.payment.sample.model.CreateToken;
import paybox.payment.sample.model.ErrorResult;
import paybox.payment.sample.model.ReeponseCancelPayment;
import paybox.payment.sample.model.RequestCancelPayment;
import paybox.payment.sample.model.RequestDataResult;
import paybox.payment.sample.model.RequestPayment;

public class PayboxModule {
	public static String getPaymentEncrypt(String requestUrl, RequestPayment requestPayment){
		String data = "";
		try {
			URL url = new URL(requestUrl);
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.setConnectTimeout(5000);
			con.setReadTimeout(5000);
			con.setRequestMethod("POST");
			con.setRequestProperty("Content-Type", "application/json");
			con.setDoInput(true);
			con.setDoOutput(true);
			con.setUseCaches(false);
			con.setDefaultUseCaches(false);
			
			OutputStreamWriter wr = new OutputStreamWriter(con.getOutputStream());
			wr.write(new Gson().toJson(requestPayment));
			wr.flush();

			GsonBuilder gson = new GsonBuilder();
			StringBuilder sb = new StringBuilder();
			BufferedReader br = null;
			String line = "";
			
			if (con.getResponseCode() == HttpURLConnection.HTTP_OK) {
				br = new BufferedReader(new InputStreamReader(con.getInputStream(), "utf-8"));
				while ((line = br.readLine()) != null) {
					sb.append(line).append("\n");
				}
				br.close();
				
				RequestDataResult requestDataResult = gson.create().fromJson(sb.toString(), RequestDataResult.class);
				data = requestDataResult.getData();
				
			} else {
				br = new BufferedReader(new InputStreamReader(con.getErrorStream(), "utf-8"));
				while ((line = br.readLine()) != null) {
					sb.append(line).append("\n");
				}
				br.close();
				
				ErrorResult errorResult = gson.create().fromJson(sb.toString(), ErrorResult.class);
				requestPayment.setResult(errorResult.getResult());
			}
		} catch (Exception e){
			System.err.println(e.toString());
		}
		
		return data;
	}
	
	public static String createToken(String requestUrl, CreateToken createToken){
		String data = "";
		try {
			URL url = new URL(requestUrl);
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.setConnectTimeout(5000);
			con.setReadTimeout(5000);
			con.setRequestMethod("POST");
			con.setRequestProperty("Content-Type", "application/json");
			con.setDoInput(true);
			con.setDoOutput(true);
			con.setUseCaches(false);
			con.setDefaultUseCaches(false);
			
			OutputStreamWriter wr = new OutputStreamWriter(con.getOutputStream());
			wr.write(new Gson().toJson(createToken));
			wr.flush();

			GsonBuilder gson = new GsonBuilder();
			StringBuilder sb = new StringBuilder();
			BufferedReader br = null;
			String line = "";
			
			if (con.getResponseCode() == HttpURLConnection.HTTP_OK) {
				br = new BufferedReader(new InputStreamReader(con.getInputStream(), "utf-8"));
				while ((line = br.readLine()) != null) {
					sb.append(line).append("\n");
				}
				br.close();
				
				RequestDataResult requestDataResult = gson.create().fromJson(sb.toString(), RequestDataResult.class);
				data = requestDataResult.getData();
				
			} else {
				br = new BufferedReader(new InputStreamReader(con.getErrorStream(), "utf-8"));
				while ((line = br.readLine()) != null) {
					sb.append(line).append("\n");
				}
				br.close();
				
				ErrorResult errorResult = gson.create().fromJson(sb.toString(), ErrorResult.class);
				createToken.setResult(errorResult.getResult());
			}
		} catch (Exception e){
			System.err.println(e.toString());
		}
		
		return data;
	}
	
	public static ReeponseCancelPayment cacenlPayment(String requestUrl, String token, RequestCancelPayment requestCancelPayment){
		ReeponseCancelPayment reeponseCancelPayment = null;
		
		try {
			URL url = new URL(requestUrl);
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.setRequestProperty("Authorization", token);
			con.setConnectTimeout(5000);
			con.setReadTimeout(5000);
			con.setRequestMethod("POST");
			con.setRequestProperty("Content-Type", "application/json");
			con.setDoInput(true);
			con.setDoOutput(true);
			con.setUseCaches(false);
			con.setDefaultUseCaches(false);
			
			OutputStreamWriter wr = new OutputStreamWriter(con.getOutputStream());
			wr.write(new Gson().toJson(requestCancelPayment));
			wr.flush();

			GsonBuilder gson = new GsonBuilder();
			StringBuilder sb = new StringBuilder();
			BufferedReader br = null;
			String line = "";
			
			if (con.getResponseCode() == HttpURLConnection.HTTP_OK) {
				br = new BufferedReader(new InputStreamReader(con.getInputStream(), "utf-8"));
				while ((line = br.readLine()) != null) {
					sb.append(line).append("\n");
				}
				br.close();
				
				reeponseCancelPayment = gson.create().fromJson(sb.toString(), ReeponseCancelPayment.class);				
			} else {
				br = new BufferedReader(new InputStreamReader(con.getErrorStream(), "utf-8"));
				while ((line = br.readLine()) != null) {
					sb.append(line).append("\n");
				}
				br.close();
				
				ErrorResult errorResult = gson.create().fromJson(sb.toString(), ErrorResult.class);
				requestCancelPayment.setResult(errorResult.getResult());
			}
		} catch (Exception e){
			System.err.println(e.toString());
		}
		
		return reeponseCancelPayment;
	}
	
	public static String getBody(HttpServletRequest request) throws IOException {
	    String body = null;
	    StringBuilder stringBuilder = new StringBuilder();
	    BufferedReader bufferedReader = null;

	    try {
	        InputStream inputStream = request.getInputStream();
	        if (inputStream != null) {
	            bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
	            char[] charBuffer = new char[128];
	            int bytesRead = -1;
	            while ((bytesRead = bufferedReader.read(charBuffer)) > 0) {
	                stringBuilder.append(charBuffer, 0, bytesRead);
	            }
	        } else {
	            stringBuilder.append("");
	        }
	    } catch (IOException ex) {
	        throw ex;
	    } finally {
	        if (bufferedReader != null) {
	            try {
	                bufferedReader.close();
	            } catch (IOException ex) {
	                throw ex;
	            }
	        }
	    }

	    body = stringBuilder.toString();
	    return body;
	}
}
