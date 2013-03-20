/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.asu.poly.teams.manualSelect.slayer.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.asu.poly.teams.manualSelect.slayer.service.http.TeamServiceSoap}.
 *
 * @author    Eshwari
 * @see       com.asu.poly.teams.manualSelect.slayer.service.http.TeamServiceSoap
 * @generated
 */
public class TeamSoap implements Serializable {
	public static TeamSoap toSoapModel(Team model) {
		TeamSoap soapModel = new TeamSoap();

		soapModel.setTeamID(model.getTeamID());
		soapModel.setProjectTitle(model.getProjectTitle());
		soapModel.setFaculty1(model.getFaculty1());
		soapModel.setFaculty2(model.getFaculty2());
		soapModel.setFaculty3(model.getFaculty3());
		soapModel.setFaculty4(model.getFaculty4());
		soapModel.setStudent0(model.getStudent0());
		soapModel.setStudent1(model.getStudent1());
		soapModel.setStudent2(model.getStudent2());
		soapModel.setStudent3(model.getStudent3());
		soapModel.setStudent4(model.getStudent4());
		soapModel.setStudent5(model.getStudent5());
		soapModel.setStudent6(model.getStudent6());
		soapModel.setStudent7(model.getStudent7());
		soapModel.setStudent8(model.getStudent8());
		soapModel.setStudent9(model.getStudent9());
		soapModel.setDateAdded(model.getDateAdded());
		soapModel.setDateModified(model.getDateModified());

		return soapModel;
	}

	public static TeamSoap[] toSoapModels(Team[] models) {
		TeamSoap[] soapModels = new TeamSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static TeamSoap[][] toSoapModels(Team[][] models) {
		TeamSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new TeamSoap[models.length][models[0].length];
		}
		else {
			soapModels = new TeamSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static TeamSoap[] toSoapModels(List<Team> models) {
		List<TeamSoap> soapModels = new ArrayList<TeamSoap>(models.size());

		for (Team model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new TeamSoap[soapModels.size()]);
	}

	public TeamSoap() {
	}

	public long getPrimaryKey() {
		return _teamID;
	}

	public void setPrimaryKey(long pk) {
		setTeamID(pk);
	}

	public long getTeamID() {
		return _teamID;
	}

	public void setTeamID(long teamID) {
		_teamID = teamID;
	}

	public String getProjectTitle() {
		return _projectTitle;
	}

	public void setProjectTitle(String projectTitle) {
		_projectTitle = projectTitle;
	}

	public String getFaculty1() {
		return _faculty1;
	}

	public void setFaculty1(String faculty1) {
		_faculty1 = faculty1;
	}

	public String getFaculty2() {
		return _faculty2;
	}

	public void setFaculty2(String faculty2) {
		_faculty2 = faculty2;
	}

	public String getFaculty3() {
		return _faculty3;
	}

	public void setFaculty3(String faculty3) {
		_faculty3 = faculty3;
	}

	public String getFaculty4() {
		return _faculty4;
	}

	public void setFaculty4(String faculty4) {
		_faculty4 = faculty4;
	}

	public String getStudent0() {
		return _student0;
	}

	public void setStudent0(String student0) {
		_student0 = student0;
	}

	public String getStudent1() {
		return _student1;
	}

	public void setStudent1(String student1) {
		_student1 = student1;
	}

	public String getStudent2() {
		return _student2;
	}

	public void setStudent2(String student2) {
		_student2 = student2;
	}

	public String getStudent3() {
		return _student3;
	}

	public void setStudent3(String student3) {
		_student3 = student3;
	}

	public String getStudent4() {
		return _student4;
	}

	public void setStudent4(String student4) {
		_student4 = student4;
	}

	public String getStudent5() {
		return _student5;
	}

	public void setStudent5(String student5) {
		_student5 = student5;
	}

	public String getStudent6() {
		return _student6;
	}

	public void setStudent6(String student6) {
		_student6 = student6;
	}

	public String getStudent7() {
		return _student7;
	}

	public void setStudent7(String student7) {
		_student7 = student7;
	}

	public String getStudent8() {
		return _student8;
	}

	public void setStudent8(String student8) {
		_student8 = student8;
	}

	public String getStudent9() {
		return _student9;
	}

	public void setStudent9(String student9) {
		_student9 = student9;
	}

	public Date getDateAdded() {
		return _dateAdded;
	}

	public void setDateAdded(Date dateAdded) {
		_dateAdded = dateAdded;
	}

	public Date getDateModified() {
		return _dateModified;
	}

	public void setDateModified(Date dateModified) {
		_dateModified = dateModified;
	}

	private long _teamID;
	private String _projectTitle;
	private String _faculty1;
	private String _faculty2;
	private String _faculty3;
	private String _faculty4;
	private String _student0;
	private String _student1;
	private String _student2;
	private String _student3;
	private String _student4;
	private String _student5;
	private String _student6;
	private String _student7;
	private String _student8;
	private String _student9;
	private Date _dateAdded;
	private Date _dateModified;
}