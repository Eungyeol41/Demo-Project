package com.example.demo.board.service;

import com.example.demo.board.BoardDTO;
import com.example.demo.board.dao.BoardDao;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardService {

    private final BoardDao boardDao;
    public BoardService(BoardDao boardDao) {
        this.boardDao = boardDao;
    }

    public List<BoardDTO> selectList() {

        return boardDao.selectList();
    }
}
