package com.lanou.contorller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lanou.entity.Teacher;
import com.lanou.service.TeacherService;

@Controller
@RequestMapping(value="/teacher")
public class TeacherContorller {

	@Autowired
	private TeacherService teacherService;
	
	@RequestMapping(value="/find.do")
	public String find(Model model) {
		List<Teacher> teachers = teacherService.findTeachers();
		model.addAttribute("teachers",teachers);
		return "index";
	}
	
}
