package shahbaz.java.dao;

import shahbaz.java.model.BaseDaoModel;
import shahbaz.java.model.PropertyModel;
import shahbaz.java.utils.CrudUtils;

import java.util.List;
import java.util.Map;

public class GenericCrudDaoImpl<T extends BaseDaoModel> implements GenericCrudDao<T> {

    @Override
    public T save(T model) {
        if(null != model){
            String dbTableName = CrudUtils.getModelTableName(model);
            if(null != dbTableName && !"".equals(dbTableName.trim())){
                Map<String, PropertyModel> fieldsMap = CrudUtils.getModelFieldsMap(model);
                if(null != fieldsMap && fieldsMap.size() > 0){

                    StringBuilder queryBuilder = new StringBuilder("INSERT INTO ");
                    queryBuilder.append(dbTableName).append(" (");
                    StringBuilder valueBuilder = new StringBuilder();
                    Map<String, String> employeeCities = null;
                    for (Map.Entry<String, PropertyModel> entry : fieldsMap.entrySet()) {
                        queryBuilder.append(entry.getKey()).append(",");
                        valueBuilder.append(entry.getValue().getPropertyValue()).append(",");
                        if("employee_city".equals(entry.getKey())){
                            employeeCities = (Map<String, String>) entry.getValue().getPropertyValue();
                        }
                    }
                    queryBuilder.setLength(queryBuilder.length() - 1);
                    valueBuilder.setLength(valueBuilder.length() - 1);
                    queryBuilder.append(") VALUES (").append(valueBuilder.toString()).append(");");

                    System.out.println("KEYS:" + fieldsMap.keySet());
                    System.out.println("TYPE:" + fieldsMap.values());
                    System.out.println("Query:" + queryBuilder.toString());

                }
            }
        }
        return null;
    }

    @Override
    public T update(T model) {
        return null;
    }

    @Override
    public T findById(Integer id) {
        return null;
    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public List<T> findAll() {
        return null;
    }
}
