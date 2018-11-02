package com.lovo.action.stu;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lovo.action.Action;
import com.lovo.action.ActionResult;
import com.lovo.action.ResultContent;
import com.lovo.action.ResultType;
import com.lovo.biz.ServiceFactory;
import com.lovo.biz.StudentService;
import com.lovo.entity.Student;
import com.lovo.test.InjectService;

public class GetStudentAction implements Action {
	private int id;
	
	@InjectService
	private StudentService studentService;
	
	@Override
	public ActionResult execute(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		return new ActionResult(new ResultContent(studentService.getStudentById(id)), ResultType.Ajax);
	}
	
//	private StudentService getStudentService() {
//		return (StudentService) ServiceFactory.factory(StudentService.class);
//	}

}
