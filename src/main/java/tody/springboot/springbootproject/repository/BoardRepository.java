package tody.springboot.springbootproject.repository;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import tody.springboot.springbootproject.domain.BoardVO;
import tody.springboot.springbootproject.mapper.BoardMapper;

/**
 * BoardDAO
 */
@Repository("boardRepository")
public class BoardRepository {

    @Autowired
    private BoardMapper mapper;

    public List<Map<String, Object>> getBoardList() {
        return mapper.selectBoardList();
    }

	public void postBoard(BoardVO board) {
        mapper.insertBoard(board);
	}

}