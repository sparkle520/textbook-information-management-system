package com.ruoyi.textbook.information.college.system.mapper;

import com.ruoyi.textbook.information.college.system.domain.Major;
import com.ruoyi.textbook.information.entry.system.domain.Publisher;
import org.apache.ibatis.annotations.MapKey;

import java.util.HashMap;
import java.util.List;

/**
 * @author LT
 * @version 1.0
 * @project textbook-information-management-system
 * @description
 * @date 11/20/2023 14:10:05
 */
public interface MajorMapper {
    List<Major> selectMajorList(Major major);
    Major selectMajorByMajorId(Integer majorId);
    int countByMajorName(String majorName);
        int updateMajor(Major major);

    int insertMajor(Major major);
    @MapKey("major_id")
    HashMap<Integer,String> getMajorListHashMap();
    public int deleteMajorByMajorIds(Integer[] majorIds);

    int countByMajorId(Integer majorId);
}
