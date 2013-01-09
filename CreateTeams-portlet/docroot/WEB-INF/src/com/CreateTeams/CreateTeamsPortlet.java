package com.CreateTeams;

import java.io.IOException;
import java.util.Date;
import java.sql.*;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;

import com.CreateTeams.slayer.model.CTS;
import com.CreateTeams.slayer.model.impl.CTSImpl;
import com.CreateTeams.slayer.service.CTSLocalServiceUtil;
import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class CreateTeamsPortlet
 */
public class CreateTeamsPortlet extends MVCPortlet {
	public void manual_selection(ActionRequest actionRequest,
			ActionResponse actionResponse)
					throws IOException, PortletException {
		String TeamName = ParamUtil.getString(actionRequest, "TeamName");
		String TeamMembers = ParamUtil.getString(actionRequest, "TeamMembers");
		System.out.println("Your inputs ==> " + TeamName + ", " + TeamMembers);

		CTS Team = new CTSImpl();
		// set primary key
		long TeamId = 0L;
		try {
			TeamId =
					CounterLocalServiceUtil.increment(
							this.getClass().getName());
		} catch (SystemException e) {
			e.printStackTrace();
		}
		Team.setTeamId(TeamId);
		// set UI fields
		Team.setTeamName(TeamName);
		Team.setTeamMembers(TeamMembers);
		// set audit field(s)
		Team.setDateAdded(new Date());
		try {
			CTSLocalServiceUtil.addCTS(Team);
		} catch (SystemException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		System.out.println("MySQL Connect Example.");
		Connection conn = null;
		String url = "jdbc:mysql://localhost:3306/";
		String dbName = "jdbctutorial";
		String driver = "com.mysql.jdbc.Driver";
		String userName = "root"; 
		String password = "root";
		try {
			Class.forName(driver).newInstance();
			conn = DriverManager.getConnection(url+dbName,userName,password);
			System.out.println("Connected to the database");
			conn.close();
			System.out.println("Disconnected from database");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
