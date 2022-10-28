package com.atcuit.hrsystem.service.impl;

import com.atcuit.hrsystem.mapper.StaffMapper;
import com.atcuit.hrsystem.pojo.Staff;
import com.atcuit.hrsystem.service.StaffService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author shkstart
 * @date 2022/10/6 - 12:39
 */
@Service
public class StaffServiceImpl implements StaffService {
    @Autowired
    public StaffMapper staffMapper;

    public PageInfo<Staff> getStaffPage(Integer pageNum){
        //开启分页功能
        PageHelper.startPage(pageNum, 10);
        //查询所有的员工信息
        List<Staff> list = staffMapper.getAllStaff();
        System.out.println(list);
        //获取分页相关数据
        PageInfo<Staff> page = new PageInfo<>(list, 5);

        return page;
    }

    @Override
    public void deleteStaffByEmpId(Integer empId) {
        staffMapper.deleteStaffByEmpId(empId);
    }
}
