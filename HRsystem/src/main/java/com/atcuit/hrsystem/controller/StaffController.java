package com.atcuit.hrsystem.controller;

import com.atcuit.hrsystem.pojo.Staff;
import com.atcuit.hrsystem.service.StaffService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author shkstart
 * @date 2022/10/6 - 12:33
 */
@Controller
public class StaffController {
    @Autowired
    private StaffService staffService;

    @RequestMapping("staff/page/{pageNum}")
    public String getStaffs(@PathVariable("pageNum")Integer pageNum, Model model){
        PageInfo<Staff> page = staffService.getStaffPage(pageNum);
        model.addAttribute("page", page);
        return "staff/staffHome";
    }

    @RequestMapping(value = "staff/update/{empId}", method = RequestMethod.DELETE)
    public String deleteStaff(@PathVariable("empId") Integer empId){
        staffService.deleteStaffByEmpId(empId);
//        System.out.println("要删除的员工为" + empId);
        return "redirect:/staff/page/1";
    }


}
