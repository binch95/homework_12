package com.koreait.homework_10.repository;

import com.koreait.homework_10.vo.Question;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface QuestionRepository {

    @Select("select * from questions")
    List<Question> findAll();

    @Select("""
            SELECT * FROM questions
            WHERE `text` LIKE CONCAT('%', #{query}, '%')
            """)
    List<Question> findByTextContaining(String query);
}
