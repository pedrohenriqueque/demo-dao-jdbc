package model.dao;
import db.Department;
import java.util.List;

public interface DepartamentDao {

    void insert(Department department);
    void update(Department department);
    void deletByID(Integer id);
    Department findByID(Integer id);
    List<Department> findAll();

}

