package tody.springboot.springbootproject.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * BoardMapper
 */
@Mapper
public interface BoardMapper {

	List<Map<String, Object>> selectBoardList();

}