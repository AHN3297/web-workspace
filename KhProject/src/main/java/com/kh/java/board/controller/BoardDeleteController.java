package com.kh.java.board.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.kh.java.board.model.service.BoardService;
import com.kh.java.board.model.vo.Board;
import com.kh.java.member.model.vo.Member;


@WebServlet("/delete.board")
public class BoardDeleteController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public BoardDeleteController() {
        super();
 
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//long boardNo = Integer.parseInt(request.getParameter("boardNo"));
		long boardNo = Long.parseLong(request.getParameter("boardNo"));
		HttpSession session = request.getSession();
		Long userNo
		= ((Member)session.getAttribute("userInfo")).getUserNo();
		
		Board board = new Board();
		board.setBoardNo(boardNo);
		board.setBoardWriter(String.valueOf(userNo));
		
		int result = new BoardService().deleteBoard(board);
		
		if(result > 0) {
			response.sendRedirect(request.getContextPath() + "/boards?page=1");
		} else {
			// 35번 게시글 삭제 실패
			response.sendRedirect(request.getContextPath()+"/detail.voard?boardNo=" +boardNo);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
