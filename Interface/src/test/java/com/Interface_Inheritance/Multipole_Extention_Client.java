package com.Interface_Inheritance;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;

import org.testng.ITestContext;
import org.testng.ITestResult;

public class Multipole_Extention_Client implements Multipole_extention_By_Interface {

	public static void main(String[] args) throws SQLException {
		Multipole_Extention_Client mec = new Multipole_Extention_Client();
		mec.free();
		mec.onFinish(null);

	} 

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("execution done  ItestListener");
		
	}

	
	//array interface 
	@Override
	public void free() throws SQLException {
	System.out.println("array interface");
		
	}

	@Override
	public Object getArray() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getArray(Map<String, Class<?>> map) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getArray(long index, int count) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getArray(long index, int count, Map<String, Class<?>> map) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getBaseType() throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getBaseTypeName() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultSet getResultSet() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultSet getResultSet(Map<String, Class<?>> map) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultSet getResultSet(long index, int count) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultSet getResultSet(long index, int count, Map<String, Class<?>> map) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
