package com.example.demo.board.dao;

import com.example.demo.board.service.BoardDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardDao {

    List<BoardDTO> selectList(); // 전체 List
    BoardDTO selectContent(String seqNo); // 1건에 대한 데이터 조회
    void insertContents(BoardDTO boardDTO); // 데이터 등록
    void updateContents(BoardDTO boardDTO); // 데이터 수정
    void updateHts(String seqNo); // 조회수 update
}
