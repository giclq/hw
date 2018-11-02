package com.lovo.action.stu;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lovo.action.Action;
import com.lovo.action.ActionResult;
import com.lovo.action.ResultContent;
import com.lovo.action.ResultType;
import com.lovo.beans.PageBean;
import com.lovo.biz.ServiceFactory;
import com.lovo.biz.StudentService;
import com.lovo.entity.Student;
import com.lovo.test.InjectService;

/**
 * �鿴�༶ѧ����Action
 * @author ���
 *
 */
public class ShowStudentAction implements Action {
	private int page;
	private int classId;
	
	@InjectService
	private StudentService studentService;
	
	@Override
	public ActionResult execute(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		PageBean<Student> pageBean = studentService.getStudentsByPage(classId, page, 5);
		System.out.println(getClass()+":"+pageBean.getData().size());
		return new ActionResult(new ResultContent(pageBean), ResultType.Ajax);
	}
	
//	private StudentService getStudentService() {
//		return (StudentService) ServiceFactory.factory(StudentService.class);
//	}

}