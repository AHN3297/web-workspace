package com.kh.java.board.model.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.kh.java.board.model.dao.BoardDao;
import com.kh.java.board.model.vo.Attachment;
import com.kh.java.board.model.vo.Board;
import com.kh.java.board.model.vo.Category;
import com.kh.java.common.Template;
import com.kh.java.common.vo.PageInfo;

public class BoardService {
	
	private BoardDao bd = new BoardDao();
	
	public int selectListCount() {
		SqlSession sqlSession = Template.getSqlSession();
		int ListCount = bd.selectListCount(sqlSession);
		sqlSession.close();
		return ListCount;
	}
	
	public List<Board> selectBoardList(PageInfo pi){
		SqlSession sqlSession = Template.getSqlSession();
		List<Board> boards = bd.selectBoardList(sqlSession, pi);
		sqlSession.close();
		return boards;
	}
	
	public List<Category> selectCategory(){
		SqlSession sqlSession = Template.getSqlSession();
		List<Category> categories = bd.selectCategory(sqlSession);
		sqlSession.close();
		
		return categories;
	}
	
	public void insert(Board board, Attachment at) {
		SqlSession sqlSession = Template.getSqlSession();
		// INSERT를 두 번 수행
		
		// BOARD테이블에 한 번 => 무조건
		int boardResult = bd.insertBoard(sqlSession, board);
		// ATTACHMENT테이블에 한 번 => 파일이 존재할 때만 가야함
		
		// 두 개의 DML구문을 하나의 트랜잭션으로 묶어서 처리
		// 트랜잭션 처리까지 끝내고 난후 성공실패여부를 반환
		
		
	}

}
