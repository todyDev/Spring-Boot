package tody.springboot.springbootproject.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}