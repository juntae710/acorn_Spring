package com.acorn.test2;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class test2Repository {
	 @Autowired
	    private SqlSession session;
	    private static String namespace = "com.acorn.test2Mapper.";

	  
	    
	    public List<test2DTO> selectAll() throws Exception {
	        return session.selectList(namespace+"selectAll");
	    } // List<E> selectList(String statement)
	
	    
	    public List<test2DTO> selectOne() throws Exception {
	        return session.selectList(namespace+"selectOne");
	    } //
	    
	    public List<test2DTO> insert() throws Exception {
	        return session.selectList(namespace+"insert");
	    } //
	    
	    
}