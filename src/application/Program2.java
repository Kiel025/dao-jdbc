package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== TEST 1: department findById ===");
		Department dep = departmentDao.findById(2);
		System.out.println(dep);
		
		System.out.println("\n=== TEST 2: department findAll ===");
		List<Department> deps = departmentDao.findAll();
		deps.forEach(System.out::println);
		
		System.out.println("\n=== TEST 3: department insert ===");
		Department dep1 = new Department(null, "Seila");
		departmentDao.insert(dep1);
		System.out.println("Inserted! new id = " + dep1.getId());
		
		System.out.println("\n=== TEST 4: department update ===");
		dep.setName("Electronics2");
		departmentDao.update(dep);
		System.out.println("Update complete!");
		
		System.out.println("\n=== TEST 5: department delete ===");
		departmentDao.deleteById(5);
		System.out.println("Delete complete!");
		
	}
}
