package shahbaz.java.utils;

import shahbaz.java.annotations.FieldAnnotation;
import shahbaz.java.annotations.TableAnnotation;
import shahbaz.java.model.BaseDaoModel;
import shahbaz.java.model.PropertyModel;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class CrudUtils {

    /**
     *
     * @param model
     * @return
     */
    public static String getModelTableName(BaseDaoModel model){
        String tableName = null;
        Annotation annotation = model.getClass().getAnnotation(TableAnnotation.class);
        if(null != annotation){
            TableAnnotation tableAnnotation = (TableAnnotation) annotation;
            System.out.println("##### ----- #####");
            System.out.println("DB Table Name: " + tableAnnotation.tableName());
            System.out.println("##### ----- #####");
            tableName = tableAnnotation.tableName();
        }
        return tableName;
    }

    /**
     *
     * @param model
     * @return
     */
    public static Map<String, PropertyModel> getModelFieldsMap(BaseDaoModel model){

        Map<String, PropertyModel> fieldsMap = new LinkedHashMap<String, PropertyModel>();
        Field[] baseFields = model.getClass().getSuperclass().getDeclaredFields();
        Field[] objectFields = model.getClass().getDeclaredFields();
        if(null != objectFields){
            try{
                System.out.println("##### Model Object #####");
                for(Field field : objectFields){
                    Annotation annotation = field.getAnnotation(FieldAnnotation.class);
                    if(null != annotation){
                        FieldAnnotation fieldAnnotation = (FieldAnnotation) annotation;
                        System.out.println("Model DB Column: " + fieldAnnotation.fieldName());
                        if(fieldAnnotation.persistence()){
                            field.setAccessible(true);
                            PropertyModel propertyModel = new PropertyModel();
                            propertyModel.setPropertyName(field.getName());
                            propertyModel.setPropertyDbColumn(fieldAnnotation.fieldName());
                            propertyModel.setPropertyValue(field.get(model));
                            propertyModel.setPropertyType(field.getType());
                            fieldsMap.put(fieldAnnotation.fieldName(), propertyModel);
                        }
                    }
                }
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
        return fieldsMap;
    }
}
