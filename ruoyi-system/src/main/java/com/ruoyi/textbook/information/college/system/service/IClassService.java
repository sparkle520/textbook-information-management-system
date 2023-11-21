package com.ruoyi.textbook.information.college.system.service;

import com.ruoyi.textbook.information.college.system.domain.Classes;
import com.ruoyi.textbook.information.college.system.domain.vo.ClassVo;
import com.ruoyi.textbook.information.entry.system.domain.Publisher;

import java.util.List;

/**
 * @author LT
 * @version 1.0
 * @project textbook-information-management-system
 * @description
 * @date 11/20/2023 20:49:02
 */
public interface IClassService {
    public List<ClassVo> selectClassList(ClassVo classVo);

    ClassVo selectClassByClassId(Integer classId);

    int deleteClassByIds(Integer[] classIds);

    int addClass(Classes classes);

    int updateClass(Classes classes);
}
