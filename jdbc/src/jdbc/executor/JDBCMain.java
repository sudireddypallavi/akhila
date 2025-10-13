package jdbc.executor;

import jdbc.services.Crudoperations;

public class JDBCMain {

	public static void main(String[] args) {
		Crudoperations.addStudent(101, "pallavi");
		Crudoperations.addStudent(102, "pravallika");
		Crudoperations.addStudent(103, "akhila");
		Crudoperations.addStudent(104, "pandu");
		Crudoperations.updateStudent(101, "S.Pallavi");
		Crudoperations.deleteStudent(104);
		Crudoperations.selectStudent(101);

	}
}