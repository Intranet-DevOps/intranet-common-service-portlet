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

package sg.com.para.intranet.common.services.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import sg.com.para.intranet.common.services.model.Project;
import sg.com.para.intranet.common.services.model.ProjectModel;
import sg.com.para.intranet.common.services.model.ProjectSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the Project service. Represents a row in the &quot;intranet_project&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link sg.com.para.intranet.common.services.model.ProjectModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link ProjectImpl}.
 * </p>
 *
 * @author Fernando Karnagi
 * @see ProjectImpl
 * @see sg.com.para.intranet.common.services.model.Project
 * @see sg.com.para.intranet.common.services.model.ProjectModel
 * @generated
 */
@JSON(strict = true)
public class ProjectModelImpl extends BaseModelImpl<Project>
	implements ProjectModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a project model instance should use the {@link sg.com.para.intranet.common.services.model.Project} interface instead.
	 */
	public static final String TABLE_NAME = "intranet_project";
	public static final Object[][] TABLE_COLUMNS = {
			{ "projectId", Types.INTEGER },
			{ "code_", Types.VARCHAR },
			{ "description", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table intranet_project (projectId INTEGER not null primary key,code_ VARCHAR(75) null,description VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table intranet_project";
	public static final String ORDER_BY_JPQL = " ORDER BY project.projectId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY intranet_project.projectId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.sg.com.para.intranet.common.services.model.Project"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.sg.com.para.intranet.common.services.model.Project"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static Project toModel(ProjectSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		Project model = new ProjectImpl();

		model.setProjectId(soapModel.getProjectId());
		model.setCode(soapModel.getCode());
		model.setDescription(soapModel.getDescription());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<Project> toModels(ProjectSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<Project> models = new ArrayList<Project>(soapModels.length);

		for (ProjectSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.sg.com.para.intranet.common.services.model.Project"));

	public ProjectModelImpl() {
	}

	@Override
	public int getPrimaryKey() {
		return _projectId;
	}

	@Override
	public void setPrimaryKey(int primaryKey) {
		setProjectId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _projectId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Integer)primaryKeyObj).intValue());
	}

	@Override
	public Class<?> getModelClass() {
		return Project.class;
	}

	@Override
	public String getModelClassName() {
		return Project.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("projectId", getProjectId());
		attributes.put("code", getCode());
		attributes.put("description", getDescription());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Integer projectId = (Integer)attributes.get("projectId");

		if (projectId != null) {
			setProjectId(projectId);
		}

		String code = (String)attributes.get("code");

		if (code != null) {
			setCode(code);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}
	}

	@JSON
	@Override
	public int getProjectId() {
		return _projectId;
	}

	@Override
	public void setProjectId(int projectId) {
		_projectId = projectId;
	}

	@JSON
	@Override
	public String getCode() {
		if (_code == null) {
			return StringPool.BLANK;
		}
		else {
			return _code;
		}
	}

	@Override
	public void setCode(String code) {
		_code = code;
	}

	@JSON
	@Override
	public String getDescription() {
		if (_description == null) {
			return StringPool.BLANK;
		}
		else {
			return _description;
		}
	}

	@Override
	public void setDescription(String description) {
		_description = description;
	}

	@Override
	public Project toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (Project)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		ProjectImpl projectImpl = new ProjectImpl();

		projectImpl.setProjectId(getProjectId());
		projectImpl.setCode(getCode());
		projectImpl.setDescription(getDescription());

		projectImpl.resetOriginalValues();

		return projectImpl;
	}

	@Override
	public int compareTo(Project project) {
		int primaryKey = project.getPrimaryKey();

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
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof Project)) {
			return false;
		}

		Project project = (Project)obj;

		int primaryKey = project.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return getPrimaryKey();
	}

	@Override
	public void resetOriginalValues() {
	}

	@Override
	public CacheModel<Project> toCacheModel() {
		ProjectCacheModel projectCacheModel = new ProjectCacheModel();

		projectCacheModel.projectId = getProjectId();

		projectCacheModel.code = getCode();

		String code = projectCacheModel.code;

		if ((code != null) && (code.length() == 0)) {
			projectCacheModel.code = null;
		}

		projectCacheModel.description = getDescription();

		String description = projectCacheModel.description;

		if ((description != null) && (description.length() == 0)) {
			projectCacheModel.description = null;
		}

		return projectCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{projectId=");
		sb.append(getProjectId());
		sb.append(", code=");
		sb.append(getCode());
		sb.append(", description=");
		sb.append(getDescription());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(13);

		sb.append("<model><model-name>");
		sb.append("sg.com.para.intranet.common.services.model.Project");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>projectId</column-name><column-value><![CDATA[");
		sb.append(getProjectId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>code</column-name><column-value><![CDATA[");
		sb.append(getCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>description</column-name><column-value><![CDATA[");
		sb.append(getDescription());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = Project.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			Project.class
		};
	private int _projectId;
	private String _code;
	private String _description;
	private Project _escapedModel;
}