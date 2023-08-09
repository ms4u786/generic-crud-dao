package shahbaz.java.model;

public class PropertyModel {

    String propertyName;
    String propertyDbColumn;
    Object propertyValue;
    Class<?> propertyType;

    public String getPropertyName() {
        return propertyName;
    }

    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    public Object getPropertyValue() {
        return propertyValue;
    }

    public void setPropertyValue(Object propertyValue) {
        this.propertyValue = propertyValue;
    }

    public Class<?> getPropertyType() {
        return propertyType;
    }

    public void setPropertyType(Class<?> propertyType) {
        this.propertyType = propertyType;
    }

    public String getPropertyDbColumn() {
        return propertyDbColumn;
    }

    public void setPropertyDbColumn(String propertyDbColumn) {
        this.propertyDbColumn = propertyDbColumn;
    }
}
