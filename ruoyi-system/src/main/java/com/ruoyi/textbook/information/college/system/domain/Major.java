package com.ruoyi.textbook.information.college.system.domain;

import java.io.Serializable;

/**
 * @author LT
 * @version 1.0
 * @project textbook-information-management-system
 * @description
 * @date 11/20/2023 14:07:30
 */
public class Major implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer majorId;
    private String majorName;

    public Integer getMajorId() {
        return majorId;
    }

    public void setMajorId(Integer majorId) {
        this.majorId = majorId;
    }

    public String getMajorName() {
        return majorName;
    }

    public void setMajorName(String majorName) {
        this.majorName = majorName;
    }
}
