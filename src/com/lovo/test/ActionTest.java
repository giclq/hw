package com.lovo.test;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.lovo.action.Action;
import com.lovo.action.ActionResult;
import com.lovo.action.Uploadable;

/** 
* @author clq 
* @version 2017年11月3日 上午11:40:33 
* 类说明 
*/
public class ActionTest implements Action,Uploadable  {

	@Override
	public ActionResult execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("execute");
		return null;
	}

	@Override
	public void setFilenames(String[] filenames) {
		// TODO Auto-generated method stub
		System.out.println("setFilenames");
	}

	@Override
	public void setParts(Part[] parts) {
		// TODO Auto-generated method stub
		System.out.println("setParts");
	}
	
	public static void main(String[] args) throws ServletException, IOException {
		ActionTest actionTest = new ActionTest();
		Action actionTest1 = new ActionTest();
		System.out.println(actionTest instanceof Action);
		System.out.println(actionTest instanceof Uploadable);
		actionTest1.execute(null, null);
		System.out.println(actionTest1 instanceof Action);
		System.out.println(actionTest1 instanceof Uploadable);
		Uploadable uploadable = (Uploadable)actionTest1;
		uploadable.setFilenames(null);
	}

}
 