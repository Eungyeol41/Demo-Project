package com.example.demo.board.service;

import com.example.demo.board.BoardDTO;
import com.example.demo.board.dao.BoardDao;
import org.springframework.stereotype.Service;

import java.util.List;

public interface BoardService {

    public List<BoardDTO> selectList();
    public BoardDTO selectContent(BoardDTO boardDTO);
    public void insertContents();
    public void updateContents(BoardDTO boardDTO);
}
