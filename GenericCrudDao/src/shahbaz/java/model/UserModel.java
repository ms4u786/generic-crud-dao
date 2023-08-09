package shahbaz.java.model;

import shahbaz.java.annotations.FieldAnnotation;
import shahbaz.java.annotations.TableAnnotation;

@TableAnnotation(tableName = "users")
public class UserModel extends BaseDaoModel {

    @FieldAnnotation(primaryKey = true, fieldName = "user_id")
    String userId;

    @FieldAnnotation(fieldName = "user_name")
    String userPassword;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
}
