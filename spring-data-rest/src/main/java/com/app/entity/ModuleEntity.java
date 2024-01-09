package com.app.entity;

import java.util.Arrays;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;

@Entity
public class ModuleEntity {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column (name="MODULE_ID")
private int moduleId;

@Column(name="COURSE_ID")
private int courseId;

@Column(name="MODULE_NAME")
private String moduleName;

@Column(name="MODULE_NOTES")
private String moduleNotes;

public int getModuleId() {
	return moduleId;
}

public void setModuleId(int moduleId) {
	this.moduleId = moduleId;
}

public int getCourseId() {
	return courseId;
}

public void setCourseId(int courseId) {
	this.courseId = courseId;
}

public String getModuleName() {
	return moduleName;
}

public void setModuleName(String moduleName) {
	this.moduleName = moduleName;
}

public String getModuleNotes() {
	return moduleNotes;
}

public void setModuleNotes(String moduleNotes) {
	this.moduleNotes = moduleNotes;
}

@Override
public String toString() {
	return "ModuleEntity [moduleId=" + moduleId + ", courseId=" + courseId + ", moduleName=" + moduleName
			+ ", moduleNotes=" + moduleNotes + "]";
}



	
}