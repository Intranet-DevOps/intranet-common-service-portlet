/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
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

package sg.com.para.intranet.common.services.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the Employee service. Represents a row in the &quot;intranet_employee&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link sg.com.para.intranet.common.services.model.impl.EmployeeModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link sg.com.para.intranet.common.services.model.impl.EmployeeImpl}.
 * </p>
 *
 * @author Fernando Karnagi
 * @see Employee
 * @see sg.com.para.intranet.common.services.model.impl.EmployeeImpl
 * @see sg.com.para.intranet.common.services.model.impl.EmployeeModelImpl
 * @generated
 */
public interface EmployeeModel extends BaseModel<Employee> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a employee model instance should use the {@link Employee} interface instead.
	 */

	/**
	 * Returns the primary key of this employee.
	 *
	 * @return the primary key of this employee
	 */
	public int getPrimaryKey();

	/**
	 * Sets the primary key of this employee.
	 *
	 * @param primaryKey the primary key of this employee
	 */
	public void setPrimaryKey(int primaryKey);

	/**
	 * Returns the employee ID of this employee.
	 *
	 * @return the employee ID of this employee
	 */
	public int getEmployeeId();

	/**
	 * Sets the employee ID of this employee.
	 *
	 * @param employeeId the employee ID of this employee
	 */
	public void setEmployeeId(int employeeId);

	/**
	 * Returns the screen name of this employee.
	 *
	 * @return the screen name of this employee
	 */
	@AutoEscape
	public String getScreenName();

	/**
	 * Sets the screen name of this employee.
	 *
	 * @param screenName the screen name of this employee
	 */
	public void setScreenName(String screenName);

	/**
	 * Returns the join date of this employee.
	 *
	 * @return the join date of this employee
	 */
	public Date getJoinDate();

	/**
	 * Sets the join date of this employee.
	 *
	 * @param joinDate the join date of this employee
	 */
	public void setJoinDate(Date joinDate);

	/**
	 * Returns the leave date of this employee.
	 *
	 * @return the leave date of this employee
	 */
	public Date getLeaveDate();

	/**
	 * Sets the leave date of this employee.
	 *
	 * @param leaveDate the leave date of this employee
	 */
	public void setLeaveDate(Date leaveDate);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(
		sg.com.para.intranet.common.services.model.Employee employee);

	@Override
	public int hashCode();

	@Override
	public CacheModel<sg.com.para.intranet.common.services.model.Employee> toCacheModel();

	@Override
	public sg.com.para.intranet.common.services.model.Employee toEscapedModel();

	@Override
	public sg.com.para.intranet.common.services.model.Employee toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}