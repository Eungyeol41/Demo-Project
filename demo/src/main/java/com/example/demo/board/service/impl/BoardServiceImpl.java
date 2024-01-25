package com.example.demo.board.service.impl;

import com.example.demo.board.service.BoardDTO;
import com.example.demo.board.dao.BoardDao;
import com.example.demo.board.service.BoardService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("boardService")
public class BoardServiceImpl implements BoardService {

	private final BoardDao boardDao;
	public BoardServiceImpl(BoardDao boardDao) {
		this.boardDao = boardDao;
	}

	public List<BoardDTO> selectList() {

		return boardDao.selectList();
	}

	public BoardDTO selectContent(String seqNo) {

		return boardDao.selectContent(seqNo);
	}

	@Override
	public void insertContents(BoardDTO boardDTO) {

		boardDao.insertContents(boardDTO);
	}

	@Override
	public void updateContents(BoardDTO boardDTO) {

		boardDao.updateContents(boardDTO);
	}

	@Override
	public void updateHts(String seqNo) {

		boardDao.updateHts(seqNo);
	}
}
