package edu.cjc.app.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.cjc.app.model.Student;
import edu.cjc.app.repository.StudentRepository;
import edu.cjc.app.servicei.StudentServicei;

@Service
public class StudentServiceImpl implements StudentServicei {
@Autowired 
StudentRepository sr;

public void saveStudentDetails(Student st) {
	sr.save(st);
}

@Override
public List<Student> getAllStudents() {
	return (List<Student>) sr.findAll();

}

@Override
public List<Student> searchStudentsByBatch(String batchNumber) {
	return sr.findAllByBatchNumber(batchNumber);
}

@Override
public Student getSingleObject(int rollNo) {
	return sr.findById(rollNo).get();
}

@Override
public void updateStudentFees(int rollNo, double ammount) {
	Student   s  = sr.findById(rollNo).get();
	 s.setFeesPaid(s.getFeesPaid()+ammount);
        sr.save(s);
	
}

@Override
public void deleteStudent(int rollNo) {
    sr.deleteById(rollNo);
	
}

@Override
public Student getSingleStudent(int rollNo) {
	Optional<Student>stu=sr.findById(rollNo);
	return stu.get();
}

@Override
public void updateData(Student ss) {
	Student stu  =  sr.findById(ss.getRollNo()).get();
	if(ss.getBatchNumber()!=null) {
		stu.setBatchNumber(ss.getBatchNumber());
	}
	
	if(ss.getBatchMode()!=null) {
		stu.setBatchMode(ss.getBatchMode());
	}
	
	if(ss.getStudentFullName()!=null) {
		stu.setStudentFullName(ss.getStudentFullName());
	}
	
	if(ss.getStudentCourse()!=null) {
		stu.setStudentCourse(ss.getStudentCourse());
	}
     sr.save(stu);
	
}






}