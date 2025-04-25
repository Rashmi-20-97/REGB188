package edu.cjc.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import edu.cjc.app.model.Student;
import edu.cjc.app.servicei.StudentServicei;

@Controller
public class AdminController {
	
@Autowired
StudentServicei ss;	

@RequestMapping("/")	
public String preLogin() {
	return "login";
}
@RequestMapping("/login")
public String onlogin(@RequestParam String username,@RequestParam String password,Model m)
{
	if(username.equals("admin")&& password.equals("admin123"))
	{
		List<Student> list=ss.getAllStudents();
 	   m.addAttribute("data",list);
 	   return "adminscreen";
		
		
	}	
	else {
		m.addAttribute("login_fail","Enter valid login details.");
		return "login";
	}
}
@RequestMapping("/enroll_student")
public String saveStudent(@ModelAttribute Student student,Model m)
{
ss.saveStudentDetails(student);
List<Student> list=ss.getAllStudents();
m.addAttribute("data",list);
return "adminscreen";
}


@RequestMapping("/search")
public String getBatchStudent(@RequestParam("batchNumber") String batchNumber,Model m) {
	List<Student> results=ss.searchStudentsByBatch(batchNumber);
	      if(results.size()>0) {
	    		m.addAttribute("data", results);
	      }else {
	    	  List<Student> list=ss.getAllStudents();
	    	   m.addAttribute("data",list);
	    	   m.addAttribute("message","No Reacord Available for this Batch Number "+batchNumber);
	      }


	return "adminscreen";
}
@RequestMapping("/Fees")
public String onFees(@RequestParam("rollNo") int rollNo,Model m)
{
	     Student s      =ss.getSingleObject(rollNo);
	     m.addAttribute("st", s);
	     return "fees";
}
@RequestMapping("/payfees")
public String  payFees(@RequestParam("rollNo") int rollNo,@RequestParam("ammount") double ammount,Model m) {
	
	  ss.updateStudentFees(rollNo,ammount);
	  List<Student> list=ss.getAllStudents();
	  m.addAttribute("data", list);
	  return "adminscreen";
}
@RequestMapping("/remove")
public String removeStudent(@RequestParam("rollNo") int rollNo,Model m)
{
	        ss.deleteStudent(rollNo);
	        List<Student> list=ss.getAllStudents();
			  m.addAttribute("data", list);
	     return "adminscreen";
}

@RequestMapping("/shiftbatch")
public String selectBatch(@RequestParam int rollNo, Model m)
{
Student s=ss.getSingleStudent(rollNo);
m.addAttribute("data",s);
return "shiftbatch";
}
@RequestMapping("/updateData")
public String updateData(@ModelAttribute Student s, Model m)
{
System.out.println("ddd");

    
ss.updateData(s);
List<Student>list=ss.getAllStudents();
m.addAttribute("data",list);
return "adminscreen";
}
}

