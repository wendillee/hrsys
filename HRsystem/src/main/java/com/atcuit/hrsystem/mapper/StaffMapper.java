package com.atcuit.hrsystem.mapper;

import com.atcuit.hrsystem.pojo.Staff;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author shkstart
 * @date 2022/10/6 - 17:57
 */
public interface StaffMapper {

    /**
     * 查询所有员工
     * @return
     */
    List<Staff> getAllStaff();

    /**
     * 删除指定员工
     * @return
     */
    void deleteStaffByEmpId(@Param("empId") Integer empId);
}
