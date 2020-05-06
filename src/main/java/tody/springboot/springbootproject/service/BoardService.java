package tody.springboot.springbootproject.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tody.springboot.springbootproject.domain.BoardVO;
import tody.springboot.springbootproject.repository.BoardRepository;

/**
 * BoardService
 */
@Service("boardService")
public class BoardService{

	@Autowired
    private BoardRepository boardRepository;

    public List<Map<String, Object>> getBoardList() {
        return boardRepository.getBoardList();
    }

	public void postBoard(BoardVO board) {
        boardRepository.postBoard(board);
	}

	public BoardVO getBoardDetail(String index) {
		return boardRepository.getBoardDetail(index);
	}

	public void updateBoard(BoardVO board) {
		boardRepository.updateBoard(board);
	}
    
}