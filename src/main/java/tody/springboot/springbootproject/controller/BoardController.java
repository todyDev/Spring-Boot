package tody.springboot.springbootproject.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tody.springboot.springbootproject.domain.BoardVO;
import tody.springboot.springbootproject.service.BoardService;

/**
 * BoardController
 */
@RestController
@RequestMapping("/api")
public class BoardController {

    @Autowired
    private BoardService boardService;

    @RequestMapping("/getBoardList")
    public List<Map<String,Object>> openBoardList() throws Exception {
        List<Map<String,Object>> boardList = boardService.getBoardList();
        return boardList;
    }

    @PostMapping(value="/postBoard")
    public void addBoard(@RequestBody BoardVO board) throws Exception {
        boardService.postBoard(board);
    }

    @GetMapping(value="/getBoardDetail")
    public BoardVO openBoardDetail(String index) throws Exception {
        BoardVO board = boardService.getBoardDetail(index);
        return board;
    }

    @PostMapping(value="/updateBoard")
    public void modifyBoard(@RequestBody BoardVO board) throws Exception {
        boardService.updateBoard(board);
    }

    @PostMapping(value="/postBoardDelete")
    public void deleteBoard(@RequestBody BoardVO board) throws Exception {
        boardService.updateDeleteBoard(board);
    }

}