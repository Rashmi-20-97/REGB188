package edu.cjc.app.servicei;

import java.util.List;

import edu.cjc.app.model.Student;

public interface StudentServicei {
public void saveStudentDetails(Student st);
public List<Student> getAllStudents();
public List<Student> searchStudentsByBatch(String batchNumber);
public Student getSingleObject(int rollNo);
public void updateStudentFees(int rollNo, double ammount);
public void deleteStudent(int rollNo);
}
