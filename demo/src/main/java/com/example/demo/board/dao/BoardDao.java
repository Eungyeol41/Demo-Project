package com.example.demo.board.dao;

import com.example.demo.board.BoardDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardDao {

    List<BoardDTO> selectList(); // 전체 List
    BoardDTO selectContent(); // 1건에 대한 데이터 조회
    void insertContents(); // 데이터 등록
    void updateContents(); // 데이터 수정
}
