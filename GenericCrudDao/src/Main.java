import shahbaz.java.dao.GenericCrudDaoImpl;
import shahbaz.java.model.EmployeeModel;
import shahbaz.java.model.UserModel;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        GenericCrudDaoImpl genericCrudDao = new GenericCrudDaoImpl();

        System.out.println("Model > Employee");
        EmployeeModel employeeModel = new EmployeeModel();
        employeeModel.setEmployeeId(1);
        employeeModel.setEmployeeName("Muhammad Shahbaz Mushtaq");
        employeeModel.setEmployeeMobile("03457172848");
        Map<String, String> employeeCities = new HashMap<String, String>();
        employeeCities.put("LHR","Lahore");
        employeeCities.put("FSD","Faisalabad");
        employeeModel.setCitiesMap(employeeCities);
        genericCrudDao.save(employeeModel);

        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        System.out.println("Model > User");
        UserModel userModel = new UserModel();
        userModel.setUserId("mmushtaq02");
        userModel.setUserPassword("123123");
        //genericCrudDao.save(userModel);

        System.out.println("End of World!");
    }
}
