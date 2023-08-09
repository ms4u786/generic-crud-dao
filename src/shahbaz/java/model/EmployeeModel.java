package shahbaz.java.model;

import shahbaz.java.annotations.FieldAnnotation;
import shahbaz.java.annotations.TableAnnotation;

import java.util.Map;

@TableAnnotation(tableName="employees")
public class EmployeeModel extends BaseDaoModel {

    @FieldAnnotation(primaryKey = true, fieldName = "employee_id")
    private Integer employeeId;

    @FieldAnnotation(fieldName = "employee_name")
    private String employeeName;

    @FieldAnnotation(fieldName = "employee_mobile", persistence = false)
    private String employeeMobile;

    @FieldAnnotation(fieldName = "employee_city")
    private Map<String, String> citiesMap;

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeMobile() {
        return employeeMobile;
    }

    public void setEmployeeMobile(String employeeMobile) {
        this.employeeMobile = employeeMobile;
    }

    public Map<String, String> getCitiesMap() {
        return citiesMap;
    }

    public void setCitiesMap(Map<String, String> citiesMap) {
        this.citiesMap = citiesMap;
    }
}
