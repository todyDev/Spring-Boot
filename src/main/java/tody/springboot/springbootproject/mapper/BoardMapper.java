package tody.springboot.springbootproject.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import tody.springboot.springbootproject.domain.BoardVO;

/**
 * BoardMapper
 */
@Mapper
public interface BoardMapper {

	List<Map<String, Object>> selectBoardList();

	void insertBoard(BoardVO board);

	BoardVO selectBoardDetail(String index);

}