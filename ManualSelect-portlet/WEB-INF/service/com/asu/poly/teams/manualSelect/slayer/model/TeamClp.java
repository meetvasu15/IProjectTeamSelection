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

import com.asu.poly.teams.manualSelect.slayer.service.TeamLocalServiceUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author asingh64
 */
public class TeamClp extends BaseModelImpl<Team> implements Team {
	public TeamClp() {
	}

	public Class<?> getModelClass() {
		return Team.class;
	}

	public String getModelClassName() {
		return Team.class.getName();
	}

	public long getPrimaryKey() {
		return _teamID;
	}

	public void setPrimaryKey(long primaryKey) {
		setTeamID(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_teamID);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("teamID", getTeamID());
		attributes.put("projectTitle", getProjectTitle());
		attributes.put("student0", getStudent0());
		attributes.put("student1", getStudent1());
		attributes.put("student2", getStudent2());
		attributes.put("student3", getStudent3());
		attributes.put("student4", getStudent4());
		attributes.put("student5", getStudent5());
		attributes.put("student6", getStudent6());
		attributes.put("student7", getStudent7());
		attributes.put("student8", getStudent8());
		attributes.put("student9", getStudent9());
		attributes.put("faculty0", getFaculty0());
		attributes.put("faculty1", getFaculty1());
		attributes.put("faculty2", getFaculty2());
		attributes.put("faculty3", getFaculty3());
		attributes.put("faculty4", getFaculty4());
		attributes.put("dateAdded", getDateAdded());
		attributes.put("dateModified", getDateModified());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long teamID = (Long)attributes.get("teamID");

		if (teamID != null) {
			setTeamID(teamID);
		}

		String projectTitle = (String)attributes.get("projectTitle");

		if (projectTitle != null) {
			setProjectTitle(projectTitle);
		}

		String student0 = (String)attributes.get("student0");

		if (student0 != null) {
			setStudent0(student0);
		}

		String student1 = (String)attributes.get("student1");

		if (student1 != null) {
			setStudent1(student1);
		}

		String student2 = (String)attributes.get("student2");

		if (student2 != null) {
			setStudent2(student2);
		}

		String student3 = (String)attributes.get("student3");

		if (student3 != null) {
			setStudent3(student3);
		}

		String student4 = (String)attributes.get("student4");

		if (student4 != null) {
			setStudent4(student4);
		}

		String student5 = (String)attributes.get("student5");

		if (student5 != null) {
			setStudent5(student5);
		}

		String student6 = (String)attributes.get("student6");

		if (student6 != null) {
			setStudent6(student6);
		}

		String student7 = (String)attributes.get("student7");

		if (student7 != null) {
			setStudent7(student7);
		}

		String student8 = (String)attributes.get("student8");

		if (student8 != null) {
			setStudent8(student8);
		}

		String student9 = (String)attributes.get("student9");

		if (student9 != null) {
			setStudent9(student9);
		}

		String faculty0 = (String)attributes.get("faculty0");

		if (faculty0 != null) {
			setFaculty0(faculty0);
		}

		String faculty1 = (String)attributes.get("faculty1");

		if (faculty1 != null) {
			setFaculty1(faculty1);
		}

		String faculty2 = (String)attributes.get("faculty2");

		if (faculty2 != null) {
			setFaculty2(faculty2);
		}

		String faculty3 = (String)attributes.get("faculty3");

		if (faculty3 != null) {
			setFaculty3(faculty3);
		}

		String faculty4 = (String)attributes.get("faculty4");

		if (faculty4 != null) {
			setFaculty4(faculty4);
		}

		Date dateAdded = (Date)attributes.get("dateAdded");

		if (dateAdded != null) {
			setDateAdded(dateAdded);
		}

		Date dateModified = (Date)attributes.get("dateModified");

		if (dateModified != null) {
			setDateModified(dateModified);
		}
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

	public String getFaculty0() {
		return _faculty0;
	}

	public void setFaculty0(String faculty0) {
		_faculty0 = faculty0;
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

	public BaseModel<?> getTeamRemoteModel() {
		return _teamRemoteModel;
	}

	public void setTeamRemoteModel(BaseModel<?> teamRemoteModel) {
		_teamRemoteModel = teamRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			TeamLocalServiceUtil.addTeam(this);
		}
		else {
			TeamLocalServiceUtil.updateTeam(this);
		}
	}

	@Override
	public Team toEscapedModel() {
		return (Team)Proxy.newProxyInstance(Team.class.getClassLoader(),
			new Class[] { Team.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		TeamClp clone = new TeamClp();

		clone.setTeamID(getTeamID());
		clone.setProjectTitle(getProjectTitle());
		clone.setStudent0(getStudent0());
		clone.setStudent1(getStudent1());
		clone.setStudent2(getStudent2());
		clone.setStudent3(getStudent3());
		clone.setStudent4(getStudent4());
		clone.setStudent5(getStudent5());
		clone.setStudent6(getStudent6());
		clone.setStudent7(getStudent7());
		clone.setStudent8(getStudent8());
		clone.setStudent9(getStudent9());
		clone.setFaculty0(getFaculty0());
		clone.setFaculty1(getFaculty1());
		clone.setFaculty2(getFaculty2());
		clone.setFaculty3(getFaculty3());
		clone.setFaculty4(getFaculty4());
		clone.setDateAdded(getDateAdded());
		clone.setDateModified(getDateModified());

		return clone;
	}

	public int compareTo(Team team) {
		long primaryKey = team.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		TeamClp team = null;

		try {
			team = (TeamClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = team.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(39);

		sb.append("{teamID=");
		sb.append(getTeamID());
		sb.append(", projectTitle=");
		sb.append(getProjectTitle());
		sb.append(", student0=");
		sb.append(getStudent0());
		sb.append(", student1=");
		sb.append(getStudent1());
		sb.append(", student2=");
		sb.append(getStudent2());
		sb.append(", student3=");
		sb.append(getStudent3());
		sb.append(", student4=");
		sb.append(getStudent4());
		sb.append(", student5=");
		sb.append(getStudent5());
		sb.append(", student6=");
		sb.append(getStudent6());
		sb.append(", student7=");
		sb.append(getStudent7());
		sb.append(", student8=");
		sb.append(getStudent8());
		sb.append(", student9=");
		sb.append(getStudent9());
		sb.append(", faculty0=");
		sb.append(getFaculty0());
		sb.append(", faculty1=");
		sb.append(getFaculty1());
		sb.append(", faculty2=");
		sb.append(getFaculty2());
		sb.append(", faculty3=");
		sb.append(getFaculty3());
		sb.append(", faculty4=");
		sb.append(getFaculty4());
		sb.append(", dateAdded=");
		sb.append(getDateAdded());
		sb.append(", dateModified=");
		sb.append(getDateModified());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(61);

		sb.append("<model><model-name>");
		sb.append("com.asu.poly.teams.manualSelect.slayer.model.Team");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>teamID</column-name><column-value><![CDATA[");
		sb.append(getTeamID());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>projectTitle</column-name><column-value><![CDATA[");
		sb.append(getProjectTitle());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>student0</column-name><column-value><![CDATA[");
		sb.append(getStudent0());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>student1</column-name><column-value><![CDATA[");
		sb.append(getStudent1());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>student2</column-name><column-value><![CDATA[");
		sb.append(getStudent2());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>student3</column-name><column-value><![CDATA[");
		sb.append(getStudent3());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>student4</column-name><column-value><![CDATA[");
		sb.append(getStudent4());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>student5</column-name><column-value><![CDATA[");
		sb.append(getStudent5());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>student6</column-name><column-value><![CDATA[");
		sb.append(getStudent6());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>student7</column-name><column-value><![CDATA[");
		sb.append(getStudent7());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>student8</column-name><column-value><![CDATA[");
		sb.append(getStudent8());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>student9</column-name><column-value><![CDATA[");
		sb.append(getStudent9());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>faculty0</column-name><column-value><![CDATA[");
		sb.append(getFaculty0());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>faculty1</column-name><column-value><![CDATA[");
		sb.append(getFaculty1());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>faculty2</column-name><column-value><![CDATA[");
		sb.append(getFaculty2());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>faculty3</column-name><column-value><![CDATA[");
		sb.append(getFaculty3());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>faculty4</column-name><column-value><![CDATA[");
		sb.append(getFaculty4());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dateAdded</column-name><column-value><![CDATA[");
		sb.append(getDateAdded());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dateModified</column-name><column-value><![CDATA[");
		sb.append(getDateModified());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _teamID;
	private String _projectTitle;
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
	private String _faculty0;
	private String _faculty1;
	private String _faculty2;
	private String _faculty3;
	private String _faculty4;
	private Date _dateAdded;
	private Date _dateModified;
	private BaseModel<?> _teamRemoteModel;
}