package com.kh.first.controller;

import java.io.IOException;
import java.util.Arrays;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/post.do")
public class RequestPostServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public RequestPostServlet() {
        super();

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//System.out.println("여기서 작업");
		// 1. 데이터 값 뽑기
		// 2. 요청처리 --> 오늘은 패스(아마내일까지?)
		// 3. 응답화면 지정
		
		// 0 단계)
		// POST방식일 경우 인코딩 설정이 ISO-8859-1방식으로 바뀌기 때문에
		// 값을 뽑기전에 미리UTF-8방식으로 변경해줘야한다
		request.setCharacterEncoding("UTF-8");
		
		// 1단계 ) 값뽑아서 변수에 대입하고 출력해보기
		// request.getParameter("키값")또는 request.getParameterValues("키값")
		String name = request.getParameter("name");
		System.out.println(name);
		
		// 실습 나머지 input요소 값들도 getParameter를 이용해서 반환 받아
		// 콘솔창에서 출력하기 시~~~~~~~~작
		
		String gender = request.getParameter("gender");
		System.out.println(gender);
		
		int age = Integer.parseInt(request.getParameter("age"));
		System.out.println(age);
		
		String city = request.getParameter("city");
		System.out.println(city);
		
		double height = Double.parseDouble(request.getParameter("height"));
		System.out.println(height);
		
		String[] foods = request.getParameterValues("food");
		if(foods != null) {
			System.out.println(Arrays.toString(foods));
		} else {
			System.out.println("없음");
		}
		
		// 2단계
		// 요청 처리
		// Service -> DAO -> DB
		// List / VO / Int
		
		// 3단계
		// 응답데이터
		// 3_1.JSP를 이용해서 응답 페이지 만들기
		// JSP(Java Server PAge -> 2017년도 까지,
		//	   Jakarta Server Page -> 2017년도 부터)
		// JAVA기반의 서버 사이드 웹 페이지 생성 기술
		// 특징 : 서버에서 실행되어 동적으로 웹페이지를 생성할 수 있음
		// PHP, ASP
		
		//-----------------------------------------
		// 응답화면(JSP)에서 필요한 게이터를 넘겨줄 것(request에 담아서)
		// parameter는 getParameter("키값") / setter는 존재하지않음
		// attribute => 키 - 벨류 세트로 묶어서 값을 만들어 낼 수 았음
		// request.setAttribute("키", "밸류");
		
		request.setAttribute("msg", "요청처리에 성공했습니다");
		request.setAttribute("name", name);
		request.setAttribute("gender", gender);
		request.setAttribute("age", age);
		request.setAttribute("city", city);
		request.setAttribute("height", height);
		request.setAttribute("food", foods);
		
		
		
		
		// 응답 데이터 생성과정을 JSP에게 위임(배정)
		
		//배정 시 필요한 객체 : RequestDispatcher
		// request.getRequestDispatcher("JSP파일의 경로")
		
		// /로 시작시 webapp/을 의미함
		RequestDispatcher view =
		request.getRequestDispatcher("/views/response_page.jsp");
		
		view.forward(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//System.out.println("잘 나오나?");
		doGet(request, response);
	}

}
