package com.atcuit.hrsystem.pojo;

import java.sql.Timestamp;

/**
 * @author shkstart
 * @date 2022/10/6 - 17:57
 */
public class Staff {
    private Integer empId;
    private Integer empDeptId;
    private Integer empTitleId;
    private Integer empPostId;
    private String empName;
    private Integer sex;
    private String idcard;
    private Timestamp birthday;
    private String place;
    private Integer nation;
    private Integer politics;
    private Integer eduLevel;
    private Integer health;
    private Integer regType;
    private Integer status;
    private Integer salary;
    private String imgurl;


    public Staff() {
    }

    public Staff(Integer empId, Integer empDeptId, Integer empTitleId, Integer empPostId, String empName, Integer sex, String idcard, Timestamp birthday, String place, Integer nation, Integer politics, Integer eduLevel, Integer health, Integer regType, Integer status, Integer salary, String imgurl) {
        this.empId = empId;
        this.empDeptId = empDeptId;
        this.empTitleId = empTitleId;
        this.empPostId = empPostId;
        this.empName = empName;
        this.sex = sex;
        this.idcard = idcard;
        this.birthday = birthday;
        this.place = place;
        this.nation = nation;
        this.politics = politics;
        this.eduLevel = eduLevel;
        this.health = health;
        this.regType = regType;
        this.status = status;
        this.salary = salary;
        this.imgurl = imgurl;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "empId=" + empId +
                ", empDeptId=" + empDeptId +
                ", empTitleId=" + empTitleId +
                ", empPostId=" + empPostId +
                ", empName='" + empName + '\'' +
                ", sex=" + sex +
                ", idcard='" + idcard + '\'' +
                ", birthday=" + birthday +
                ", place='" + place + '\'' +
                ", nation=" + nation +
                ", politics=" + politics +
                ", eduLevel=" + eduLevel +
                ", health=" + health +
                ", regType=" + regType +
                ", status=" + status +
                ", salary=" + salary +
                ", imgurl='" + imgurl + '\'' +
                '}';
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public Integer getEmpDeptId() {
        return empDeptId;
    }

    public void setEmpDeptId(Integer empDeptId) {
        this.empDeptId = empDeptId;
    }

    public Integer getEmpTitleId() {
        return empTitleId;
    }

    public void setEmpTitleId(Integer empTitleId) {
        this.empTitleId = empTitleId;
    }

    public Integer getEmpPostId() {
        return empPostId;
    }

    public void setEmpPostId(Integer empPostId) {
        this.empPostId = empPostId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    public Timestamp getBirthday() {
        return birthday;
    }

    public void setBirthday(Timestamp birthday) {
        this.birthday = birthday;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public Integer getNation() {
        return nation;
    }

    public void setNation(Integer nation) {
        this.nation = nation;
    }

    public Integer getPolitics() {
        return politics;
    }

    public void setPolitics(Integer politics) {
        this.politics = politics;
    }

    public Integer getEduLevel() {
        return eduLevel;
    }

    public void setEduLevel(Integer eduLevel) {
        this.eduLevel = eduLevel;
    }

    public Integer getHealth() {
        return health;
    }

    public void setHealth(Integer health) {
        this.health = health;
    }

    public Integer getRegType() {
        return regType;
    }

    public void setRegType(Integer regType) {
        this.regType = regType;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl;
    }
}
