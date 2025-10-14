package com.kh.java.board.controller;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.java.board.model.service.BoardService;

@WebServlet("/detail.Image")
public class ImageDetailController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ImageDetailController() {
        super();
 
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//String boardNo = request.getParameter("boardNo");
		Long num = Long.parseLong(request.getParameter("boardNo"));
		Map<String, Object> map = new BoardService().selectImageDetail(num);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
