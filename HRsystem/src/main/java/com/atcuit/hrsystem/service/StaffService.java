package com.atcuit.hrsystem.service;

import com.atcuit.hrsystem.pojo.Staff;
import com.github.pagehelper.PageInfo;

/**
 * @author shkstart
 * @date 2022/10/6 - 12:38
 */
public interface StaffService {

    /**
     * 查询所有员工分页信息
     */
    public PageInfo<Staff> getStaffPage(Integer pageNum);

    /**
     * 删除员工
     */
    public void deleteStaffByEmpId(Integer empId);
}
