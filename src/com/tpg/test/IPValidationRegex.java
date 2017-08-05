package com.tpg.test;

import java.util.regex.*;

public class IPValidationRegex {

	private static final String IPV4_REGEX = "(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)";
	/*private static final String IPV4_REGEX = "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
			"([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
			"([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
			"([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";*/
	//private static final String IPV4_REGEX = "^(?:(?:25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[1-9]?[0-9])\\.){3}?:25[0-5]|2[0-4][0-9]|[1][0-9][0-9]|[1-9]?[0-9])$";

	private static final String IPV6_REGEX = "([0-9a-f]{1,4}:){7}([0-9a-f]){1,4}";
	/*private static final String IPV6_REGEX ="^[0-9a-f]{1,4}:" + "[0-9a-f]{1,4}:" +
	"[0-9a-f]{1,4}:" + "[0-9a-f]{1,4}:" +
	"[0-9a-f]{1,4}:" + "[0-9a-f]{1,4}:" +
	"[0-9a-f]{1,4}:" + "[0-9a-f]{1,4}$";*/
	
	private static Pattern ipv4Pattern;
	private static Pattern ipv6Pattern;
	
	public IPValidationRegex(){
		ipv4Pattern = Pattern.compile(IPV4_REGEX);
		ipv6Pattern = Pattern.compile(IPV6_REGEX);
	}
	
	public static void main(String[] args){
		IPValidationRegex ipChecker = new IPValidationRegex();
		String test1Ipv4 = "1.2.3.4";
		String test2Ipv4 = "1.2.3.4.5";
		String test3Ipv4 = "1.2.3";
		String test4Ipv4 = "10.0.3.256";
		String test5Ipv4 = "192.168.1.255";
		
		String test1Ipv6 = "2001:0db8:85a3:0000:0000:8a2e:0370:7334";
		String test2Ipv6 = "2001:0db8:85a3:0000:0000:8a2e:0370";
		String test3Ipv6 = "2001:0db8:85a3:0000:0000:8a2e:0370:7334:7334";
		String test4Ipv6 = "2001:0db8:85a3:0000:0000:8a2e:0370:733h";
		String test5Ipv6 = "2001:0db8:85a3:0000:0000:8a2e:0370:73333";
		
		System.out.println(test1Ipv4 + ":" + ipChecker.validateIp(test1Ipv4));
		System.out.println(test2Ipv4 + ":" + ipChecker.validateIp(test2Ipv4));
		System.out.println(test3Ipv4 + ":" + ipChecker.validateIp(test3Ipv4));
		System.out.println(test4Ipv4 + ":" + ipChecker.validateIp(test4Ipv4));
		System.out.println(test5Ipv4 + ":" + ipChecker.validateIp(test5Ipv4));
		
		System.out.println(test1Ipv6 + ":" + ipChecker.validateIp(test1Ipv6));
		System.out.println(test2Ipv6 + ":" + ipChecker.validateIp(test2Ipv6));
		System.out.println(test3Ipv6 + ":" + ipChecker.validateIp(test3Ipv6));
		System.out.println(test4Ipv6 + ":" + ipChecker.validateIp(test4Ipv6));
		System.out.println(test5Ipv6 + ":" + ipChecker.validateIp(test5Ipv6));
	}
	
	public String validateIp(String ip){
		Matcher ipv4Matcher = ipv4Pattern.matcher(ip);
		Matcher ipv6Matcher = ipv6Pattern.matcher(ip);
		
		 return ipv4Matcher.matches()? " valid ! " : ipv6Matcher.matches()? " valid !" : " invalid ";
		
		/*if (ipv4Matcher.matches())
			return true;
		else
			return ipv6Matcher.matches();*/
	}
	
}
