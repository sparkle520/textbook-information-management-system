package com.ruoyi.textbook.information.college.system.service.impl;

import com.ruoyi.textbook.information.college.system.domain.Major;
import com.ruoyi.textbook.information.college.system.mapper.MajorMapper;
import com.ruoyi.textbook.information.college.system.service.IMajorService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;

/**
 * @author LT
 * @version 1.0
 * @project textbook-information-management-system
 * @description
 * @date 11/20/2023 14:11:02
 */
@Service
public class MajorServiceImpl implements IMajorService {
    @Resource
    MajorMapper majorMapper;
    @Override
    public List<Major> selectMajorList(Major major) {
        return majorMapper.selectMajorList(major);
    }

    @Override
    public HashMap<Integer, String> selectMajorListHashMap() {
        return majorMapper.getMajorListHashMap();
    }

    @Override
    public Major selectMajorByMajorId(Integer majorId) {
        return majorMapper.selectMajorByMajorId(majorId);
    }

    @Override
    public boolean checkMajorNameUnique(Major major) {
        if(major.getMajorId() != null)
        {
            Major m = majorMapper.selectMajorByMajorId(major.getMajorId());
            if(m.getMajorName().equals(major.getMajorName()))
            {
                return true;
            }
        }

        return majorMapper.countByMajorName(major.getMajorName()) <= 0;
    }

    @Override
    public int addMajor(Major major) {
        return majorMapper.insertMajor(major);
    }

    @Override
    public int deleteMajorByIds(Integer[] majorIds) {
        for (Integer majorId: majorIds
        ) {
            int count = majorMapper.countByMajorId(majorId);
            if(count > 0)
            {
                return -1;
            }
        }
        return majorMapper.deleteMajorByMajorIds(majorIds);
    }

    @Override
    public int updateMajor(Major major) {
        return majorMapper.updateMajor(major);
    }
}
