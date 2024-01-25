package com.example.demo.board.service;

import java.util.List;

public interface BoardService {

    public List<BoardDTO> selectList();
    public BoardDTO selectContent(String seqNo);
    public void insertContents(BoardDTO boardDTO);
    public void updateContents(BoardDTO boardDTO);
    public void updateHts(String seqNo); // 조회수 update
}
