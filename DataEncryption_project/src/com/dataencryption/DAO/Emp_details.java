package com.dataencryption.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.dataencryption.BO.EncryptDecrypt;
import com.dataencryption.TO.Registration_details;

public class Emp_details {
	public List<Registration_details> view()
	{
		List<Registration_details> li = new ArrayList<Registration_details>();
	try
	{
	Connection conn = null; 
	System.out.println("came into view method");
	Class.forName("com.mysql.jdbc.Driver");
	conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dataencryption","root","raj2127");
	if(conn==null)
	{
		System.out.println("no connection established");
	}
	System.out.println("Connection established");
	EncryptDecrypt ed = new EncryptDecrypt();
	Statement myStmt = conn.createStatement();
	ResultSet rs = myStmt.executeQuery("select * from customer_details");
	while(rs.next())
	{
		Registration_details rg = new Registration_details();
		String f_name1=rs.getString("fname");
		String l_name1=rs.getString("lname");
		String mail_id1=rs.getString("mail_id");
		String ssn1=rs.getString("ssn");
		String income1=rs.getString("income");
		String address_l11=rs.getString("address_l1");
		String address_l21=rs.getString("address_l2");
		String city1=rs.getString("city");
		String state1=rs.getString("state");
		String zipcode1=rs.getString("zipcode");
		String pnum1=rs.getString("pnum");
		System.out.println("Encrypted message");
		System.out.println(f_name1 +", " + l_name1+ ", " + mail_id1
				+ ", " +ssn1+ ", " +income1+ ", " + address_l11
				+ ", " + address_l21+ ", " + city1+ ", " + state1
				+ ", " + zipcode1+ ", " + pnum1);
		System.out.println("Decrypted message");
		f_name1=ed.decrypt(f_name1);
		rg.setFname(f_name1);
		System.out.print("Fname after decryption: "+f_name1+" "+rg.getFname());
		l_name1=ed.decrypt(l_name1);
		rg.setLname(l_name1);
		mail_id1=ed.decrypt(mail_id1);
		rg.setMail_id(mail_id1);
		ssn1=ed.decrypt(ssn1);
		rg.setSsn(ssn1);
		income1=ed.decrypt(income1);
		rg.setIncome(income1);
		address_l11=ed.decrypt(address_l11);
		rg.setAddress_l1(address_l11);
		address_l21=ed.decrypt(address_l21);
		rg.setAddress_l2(address_l21);
		city1=ed.decrypt(city1);
		rg.setCity(city1);
		state1=ed.decrypt(state1);
		rg.setState(state1);
		zipcode1=ed.decrypt(zipcode1);
		rg.setZipcode(zipcode1);
		pnum1=ed.decrypt(pnum1);
		rg.setPnum(pnum1);
		li.add(rg);
		System.out.println(f_name1 +", " + l_name1+ ", " + mail_id1
				+ ", " +ssn1+ ", " +income1+ ", " + address_l11
				+ ", " + address_l21+ ", " + city1+ ", " + state1
				+ ", " + zipcode1+ ", " + pnum1);
	}
	//myStmt.executeUpdate(q_in);
	conn.close();
	}
	catch (Exception e) {
		// TODO: handle exception
		//e.printStackTrace();
	}		
	return li;
	}
}
