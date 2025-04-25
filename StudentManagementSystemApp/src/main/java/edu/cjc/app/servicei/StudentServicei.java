package edu.cjc.app.servicei;

import java.util.List;

import edu.cjc.app.model.Student;

public interface StudentServicei {

public	List<Student> getAllStudents();

public void saveStudentDetails(Student student);

public List<Student> searchStudentsByBatch(String batchNumber);

public Student getSingleObject(int rollNo);

public void updateStudentFees(int rollNo, double ammount);

public void deleteStudent(int rollNo);

public Student getSingleStudent(int rollNo);

public void updateData(Student ss );







}
