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

import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Team}.
 * </p>
 *
 * @author    asingh64
 * @see       Team
 * @generated
 */
public class TeamWrapper implements Team, ModelWrapper<Team> {
	public TeamWrapper(Team team) {
		_team = team;
	}

	public Class<?> getModelClass() {
		return Team.class;
	}

	public String getModelClassName() {
		return Team.class.getName();
	}

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

	/**
	* Returns the primary key of this team.
	*
	* @return the primary key of this team
	*/
	public long getPrimaryKey() {
		return _team.getPrimaryKey();
	}

	/**
	* Sets the primary key of this team.
	*
	* @param primaryKey the primary key of this team
	*/
	public void setPrimaryKey(long primaryKey) {
		_team.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the team i d of this team.
	*
	* @return the team i d of this team
	*/
	public long getTeamID() {
		return _team.getTeamID();
	}

	/**
	* Sets the team i d of this team.
	*
	* @param teamID the team i d of this team
	*/
	public void setTeamID(long teamID) {
		_team.setTeamID(teamID);
	}

	/**
	* Returns the project title of this team.
	*
	* @return the project title of this team
	*/
	public java.lang.String getProjectTitle() {
		return _team.getProjectTitle();
	}

	/**
	* Sets the project title of this team.
	*
	* @param projectTitle the project title of this team
	*/
	public void setProjectTitle(java.lang.String projectTitle) {
		_team.setProjectTitle(projectTitle);
	}

	/**
	* Returns the student0 of this team.
	*
	* @return the student0 of this team
	*/
	public java.lang.String getStudent0() {
		return _team.getStudent0();
	}

	/**
	* Sets the student0 of this team.
	*
	* @param student0 the student0 of this team
	*/
	public void setStudent0(java.lang.String student0) {
		_team.setStudent0(student0);
	}

	/**
	* Returns the student1 of this team.
	*
	* @return the student1 of this team
	*/
	public java.lang.String getStudent1() {
		return _team.getStudent1();
	}

	/**
	* Sets the student1 of this team.
	*
	* @param student1 the student1 of this team
	*/
	public void setStudent1(java.lang.String student1) {
		_team.setStudent1(student1);
	}

	/**
	* Returns the student2 of this team.
	*
	* @return the student2 of this team
	*/
	public java.lang.String getStudent2() {
		return _team.getStudent2();
	}

	/**
	* Sets the student2 of this team.
	*
	* @param student2 the student2 of this team
	*/
	public void setStudent2(java.lang.String student2) {
		_team.setStudent2(student2);
	}

	/**
	* Returns the student3 of this team.
	*
	* @return the student3 of this team
	*/
	public java.lang.String getStudent3() {
		return _team.getStudent3();
	}

	/**
	* Sets the student3 of this team.
	*
	* @param student3 the student3 of this team
	*/
	public void setStudent3(java.lang.String student3) {
		_team.setStudent3(student3);
	}

	/**
	* Returns the student4 of this team.
	*
	* @return the student4 of this team
	*/
	public java.lang.String getStudent4() {
		return _team.getStudent4();
	}

	/**
	* Sets the student4 of this team.
	*
	* @param student4 the student4 of this team
	*/
	public void setStudent4(java.lang.String student4) {
		_team.setStudent4(student4);
	}

	/**
	* Returns the student5 of this team.
	*
	* @return the student5 of this team
	*/
	public java.lang.String getStudent5() {
		return _team.getStudent5();
	}

	/**
	* Sets the student5 of this team.
	*
	* @param student5 the student5 of this team
	*/
	public void setStudent5(java.lang.String student5) {
		_team.setStudent5(student5);
	}

	/**
	* Returns the student6 of this team.
	*
	* @return the student6 of this team
	*/
	public java.lang.String getStudent6() {
		return _team.getStudent6();
	}

	/**
	* Sets the student6 of this team.
	*
	* @param student6 the student6 of this team
	*/
	public void setStudent6(java.lang.String student6) {
		_team.setStudent6(student6);
	}

	/**
	* Returns the student7 of this team.
	*
	* @return the student7 of this team
	*/
	public java.lang.String getStudent7() {
		return _team.getStudent7();
	}

	/**
	* Sets the student7 of this team.
	*
	* @param student7 the student7 of this team
	*/
	public void setStudent7(java.lang.String student7) {
		_team.setStudent7(student7);
	}

	/**
	* Returns the student8 of this team.
	*
	* @return the student8 of this team
	*/
	public java.lang.String getStudent8() {
		return _team.getStudent8();
	}

	/**
	* Sets the student8 of this team.
	*
	* @param student8 the student8 of this team
	*/
	public void setStudent8(java.lang.String student8) {
		_team.setStudent8(student8);
	}

	/**
	* Returns the student9 of this team.
	*
	* @return the student9 of this team
	*/
	public java.lang.String getStudent9() {
		return _team.getStudent9();
	}

	/**
	* Sets the student9 of this team.
	*
	* @param student9 the student9 of this team
	*/
	public void setStudent9(java.lang.String student9) {
		_team.setStudent9(student9);
	}

	/**
	* Returns the faculty0 of this team.
	*
	* @return the faculty0 of this team
	*/
	public java.lang.String getFaculty0() {
		return _team.getFaculty0();
	}

	/**
	* Sets the faculty0 of this team.
	*
	* @param faculty0 the faculty0 of this team
	*/
	public void setFaculty0(java.lang.String faculty0) {
		_team.setFaculty0(faculty0);
	}

	/**
	* Returns the faculty1 of this team.
	*
	* @return the faculty1 of this team
	*/
	public java.lang.String getFaculty1() {
		return _team.getFaculty1();
	}

	/**
	* Sets the faculty1 of this team.
	*
	* @param faculty1 the faculty1 of this team
	*/
	public void setFaculty1(java.lang.String faculty1) {
		_team.setFaculty1(faculty1);
	}

	/**
	* Returns the faculty2 of this team.
	*
	* @return the faculty2 of this team
	*/
	public java.lang.String getFaculty2() {
		return _team.getFaculty2();
	}

	/**
	* Sets the faculty2 of this team.
	*
	* @param faculty2 the faculty2 of this team
	*/
	public void setFaculty2(java.lang.String faculty2) {
		_team.setFaculty2(faculty2);
	}

	/**
	* Returns the faculty3 of this team.
	*
	* @return the faculty3 of this team
	*/
	public java.lang.String getFaculty3() {
		return _team.getFaculty3();
	}

	/**
	* Sets the faculty3 of this team.
	*
	* @param faculty3 the faculty3 of this team
	*/
	public void setFaculty3(java.lang.String faculty3) {
		_team.setFaculty3(faculty3);
	}

	/**
	* Returns the faculty4 of this team.
	*
	* @return the faculty4 of this team
	*/
	public java.lang.String getFaculty4() {
		return _team.getFaculty4();
	}

	/**
	* Sets the faculty4 of this team.
	*
	* @param faculty4 the faculty4 of this team
	*/
	public void setFaculty4(java.lang.String faculty4) {
		_team.setFaculty4(faculty4);
	}

	/**
	* Returns the date added of this team.
	*
	* @return the date added of this team
	*/
	public java.util.Date getDateAdded() {
		return _team.getDateAdded();
	}

	/**
	* Sets the date added of this team.
	*
	* @param dateAdded the date added of this team
	*/
	public void setDateAdded(java.util.Date dateAdded) {
		_team.setDateAdded(dateAdded);
	}

	/**
	* Returns the date modified of this team.
	*
	* @return the date modified of this team
	*/
	public java.util.Date getDateModified() {
		return _team.getDateModified();
	}

	/**
	* Sets the date modified of this team.
	*
	* @param dateModified the date modified of this team
	*/
	public void setDateModified(java.util.Date dateModified) {
		_team.setDateModified(dateModified);
	}

	public boolean isNew() {
		return _team.isNew();
	}

	public void setNew(boolean n) {
		_team.setNew(n);
	}

	public boolean isCachedModel() {
		return _team.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_team.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _team.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _team.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_team.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _team.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_team.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new TeamWrapper((Team)_team.clone());
	}

	public int compareTo(com.asu.poly.teams.manualSelect.slayer.model.Team team) {
		return _team.compareTo(team);
	}

	@Override
	public int hashCode() {
		return _team.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.asu.poly.teams.manualSelect.slayer.model.Team> toCacheModel() {
		return _team.toCacheModel();
	}

	public com.asu.poly.teams.manualSelect.slayer.model.Team toEscapedModel() {
		return new TeamWrapper(_team.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _team.toString();
	}

	public java.lang.String toXmlString() {
		return _team.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_team.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public Team getWrappedTeam() {
		return _team;
	}

	public Team getWrappedModel() {
		return _team;
	}

	public void resetOriginalValues() {
		_team.resetOriginalValues();
	}

	private Team _team;
}