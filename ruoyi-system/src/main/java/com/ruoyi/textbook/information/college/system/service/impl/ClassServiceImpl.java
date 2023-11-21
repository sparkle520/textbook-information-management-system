package com.ruoyi.textbook.information.college.system.service.impl;

import com.ruoyi.textbook.information.college.system.domain.Classes;
import com.ruoyi.textbook.information.college.system.domain.vo.ClassVo;
import com.ruoyi.textbook.information.college.system.mapper.ClassMapper;
import com.ruoyi.textbook.information.college.system.service.IClassService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author LT
 * @version 1.0
 * @project textbook-information-management-system
 * @description
 * @date 11/20/2023 20:49:25
 */
@Service
public class ClassServiceImpl implements IClassService {
    @Resource
    ClassMapper classMapper;
    @Override
    public List<ClassVo> selectClassList(ClassVo classVo) {
        return classMapper.selectClassList(classVo);
    }

    @Override
    public ClassVo selectClassByClassId(Integer classId) {
        return classMapper.selectClassByClassId(classId);
    }

    @Override
    public int deleteClassByIds(Integer[] classIds) {
        return classMapper.deleteClassByIds(classIds);
    }

    @Override
    public int addClass(Classes classes) {
        return classMapper.insertClass(classes);
    }

    @Override
    public int updateClass(Classes classes) {
        return classMapper.updateClass(classes);
    }
}
