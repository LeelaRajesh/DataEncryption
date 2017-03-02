package com.dataencryption.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.dataencryption.BO.EncryptDecrypt;
import com.dataencryption.TO.Registration_details;



public class DatabaseConnection {
	public static void insert(Registration_details rg)
	{
		try
		{
		Connection conn = null; 
		System.out.println("came into insert method");
		Class.forName("com.mysql.jdbc.Driver");
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dataencryption","root","raj2127");
		if(conn==null)
		{
			System.out.println("no connection established");
		}
		System.out.println("Connection established");
		EncryptDecrypt ed = new EncryptDecrypt();
		Statement myStmt = conn.createStatement();
		Statement udStmt = conn.createStatement();
		String f_name=rg.getFname();
		String l_name=rg.getLname();
		String mail_id=rg.getMail_id();
		String ssn=rg.getSsn();
		String income=rg.getIncome();
		String address_l1=rg.getAddress_l1();
		String address_l2=rg.getAddress_l2();
		String city=rg.getCity();
		String state=rg.getState();
		String zipcode=rg.getZipcode();
		String pnum=rg.getPnum();
		String q_in = "insert into customer_details(fname,lname,mail_id,ssn,income,address_l1," +
				"address_l2,city,state,zipcode,pnum) values(?,?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement ps=conn.prepareStatement(q_in);
		System.out.println("First name before encryption: "+f_name);
		System.out.println("First name after encryptio: "+ed.encrypt(f_name));
		ps.setString(1, ed.encrypt(f_name));
		ps.setString(2, ed.encrypt(l_name));
		ps.setString(3, ed.encrypt(mail_id));
		ps.setString(4, ed.encrypt(ssn));
		ps.setString(5, ed.encrypt(income));
		ps.setString(6, ed.encrypt(address_l1));
		ps.setString(7, ed.encrypt(address_l2));
		ps.setString(8, ed.encrypt(city));
		ps.setString(9, ed.encrypt(state));
		ps.setString(10, ed.encrypt(zipcode));
		ps.setString(11, ed.encrypt(pnum));
		ps.execute();
		String upq = "update user_details set lname='Madasu' where fname='1st name'";
		udStmt.executeUpdate(upq);
		ResultSet rs = myStmt.executeQuery("select * from customer_details");			
		while(rs.next())
		{
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
			l_name1=ed.decrypt(l_name1);
			mail_id1=ed.decrypt(mail_id1);
			ssn1=ed.decrypt(ssn1);
			income1=ed.decrypt(income1);
			address_l11=ed.decrypt(address_l11);
			address_l21=ed.decrypt(address_l21);
			city1=ed.decrypt(city1);
			state1=ed.decrypt(state1);
			zipcode1=ed.decrypt(zipcode1);
			pnum1=ed.decrypt(pnum1);
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
	}
}
