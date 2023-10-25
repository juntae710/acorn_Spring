package acorn.com.mysqlbatis;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UsersRepository {
	 	@Autowired
	    private SqlSession session;
	 	
	    private static String namespace = "com.acorn.usersMapper.";

	  
	    
	    public List<UsersDTO> selectAll() throws Exception {
	    	System.out.println("good");
	        return session.selectList(namespace+"selectAll");
	    } // List<E> selectList(String statement)
	
	    
	    public UsersDTO select(String id) {
	    	return session.selectOne(namespace+"selectOne",id);
	    }
	    
	    public int delete( String id) throws Exception {          
	        return   session.delete(namespace+"delete", id);
	    } 
	    
}
