package com.ruoyi.textbook.information.college.system.service;

import com.ruoyi.textbook.information.college.system.domain.Major;

import java.util.List;

/**
 * @author LT
 * @version 1.0
 * @project textbook-information-management-system
 * @description
 * @date 11/20/2023 14:10:37
 */
public interface IMajorService {
    List<Major> selectMajorList(Major major);
    Major selectMajorByMajorId(Integer majorId);
    boolean checkMajorNameUnique(Major major);
    int addMajor(Major major);
    public int deleteMajorByIds(Integer[] majorIds);
    int updateMajor(Major major);
}
