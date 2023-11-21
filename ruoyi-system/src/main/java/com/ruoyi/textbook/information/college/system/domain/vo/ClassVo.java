package com.ruoyi.textbook.information.college.system.domain.vo;

import java.io.Serializable;
import java.util.Date;

/**
 * @author LT
 * @version 1.0
 * @project textbook-information-management-system
 * @description
 * @date 11/20/2023 20:46:25
 */
public class ClassVo implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer classId;
    private String className;
    private String majorName;
    private String classInstructorName;
    private String classInstructorPhone;
    private String classMonitorName;
    private String classMonitorPhone;
    private Integer classTotal;

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getMajorName() {
        return majorName;
    }

    public void setMajorName(String majorName) {
        this.majorName = majorName;
    }

    public String getClassInstructorName() {
        return classInstructorName;
    }

    public void setClassInstructorName(String classInstructorName) {
        this.classInstructorName = classInstructorName;
    }

    public String getClassInstructorPhone() {
        return classInstructorPhone;
    }

    public void setClassInstructorPhone(String classInstructorPhone) {
        this.classInstructorPhone = classInstructorPhone;
    }

    public String getClassMonitorName() {
        return classMonitorName;
    }

    public void setClassMonitorName(String classMonitorName) {
        this.classMonitorName = classMonitorName;
    }

    public String getClassMonitorPhone() {
        return classMonitorPhone;
    }

    public void setClassMonitorPhone(String classMonitorPhone) {
        this.classMonitorPhone = classMonitorPhone;
    }

    public Integer getClassTotal() {
        return classTotal;
    }

    public void setClassTotal(Integer classTotal) {
        this.classTotal = classTotal;
    }
}
