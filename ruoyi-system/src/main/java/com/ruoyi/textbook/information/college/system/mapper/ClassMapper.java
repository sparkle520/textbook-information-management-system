package com.ruoyi.textbook.information.college.system.mapper;

import com.ruoyi.textbook.information.college.system.domain.Classes;
import com.ruoyi.textbook.information.college.system.domain.vo.ClassVo;

import java.util.List;

/**
 * @author LT
 * @version 1.0
 * @project textbook-information-management-system
 * @description
 * @date 11/20/2023 20:33:19
 */
public interface ClassMapper {
List<ClassVo> selectClassList(ClassVo classVo);
ClassVo selectClassByClassId(Integer classId);
    public int deleteClassByIds(Integer[] classIds);
int insertClass(Classes classes);

    int updateClass(Classes classes);
}
