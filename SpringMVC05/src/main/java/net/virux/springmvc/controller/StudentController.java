package net.virux.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import net.virux.springmvc.model.Student;
import net.virux.springmvc.service.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	private StudentService studentService;

	@RequestMapping(value = "/student", method = RequestMethod.GET)
	public ModelAndView student(){
		return new ModelAndView("student", "command", new Student());
	}
	
	@RequestMapping(value = "/addStudent", method = RequestMethod.POST)
	public ModelAndView saveStudent(@ModelAttribute("command") Student st, 
			BindingResult result, ModelMap model){
		//Student student = prepareModel(st);
		studentService.addStudent(st);
		model.addAttribute("name", st.getName());
		model.addAttribute("id", st.getId());
		model.addAttribute("age", st.getAge());
		return new ModelAndView("result");
		
	}
	
//	private Student prepareModel(Student student){
//		Student st = new Student();
//		st.setId(student.getId());
//		st.setName(student.getName());
//		st.setAge(student.getAge());
//		return st;
//	}
	
//	@RequestMapping(value = "/student", method = RequestMethod.GET)
//	public ModelAndView student(){
//		return new ModelAndView("student", "command", new Student());
//	}
//	
//	@RequestMapping(value = "/addStudent", method = RequestMethod.POST)
//	public String addStudent(@ModelAttribute("SpringWeb") Student student, 
//			ModelMap model){
//		
//		ApplicationContext context = 
//				new ClassPathXmlApplicationContext("spring-config.xml");
//		
//		StudentDao s = (StudentDao) context.getBean("studentDaoImpl");
//		
//		int x = s.insertRow(student);
//		
//		model.addAttribute("name", student.getName());
//		model.addAttribute("age", student.getAge());
//		model.addAttribute("id", student.getId());
//		return "result";
//	}
//	
//	@RequestMapping(value = "/allStudents", method = RequestMethod.GET)
//	public String allStudents(){
//		return "";
//	}

}
