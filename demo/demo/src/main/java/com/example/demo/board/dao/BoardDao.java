package com.example.demo.board.dao;

import com.example.demo.board.BoardDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardDao {

    List<BoardDTO> selectList();
}
