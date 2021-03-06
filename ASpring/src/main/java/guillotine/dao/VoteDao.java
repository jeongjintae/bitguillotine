package guillotine.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class VoteDao {
	SqlSessionFactory sqlSessionFactory;
	@Autowired(required=false)
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		this.sqlSessionFactory = sqlSessionFactory;
	}
	
	public List<VoteDao> selectList() throws Exception{
		SqlSession sqlSession = sqlSessionFactory.openSession();
		try {
			return sqlSession.selectList("guillotine.dao.VoteDao.selectList");
		} finally {
			sqlSession.close();
		}
	}
	
	public int insert(VoteDao voteDao) throws Exception {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		try {
			int count = sqlSession.insert("guillotine.dao.VoteDao.insert", voteDao);
			sqlSession.commit();
			
			return count;
		} finally {
			sqlSession.close();
		}
	}
	
	public int update(VoteDao voteDao) throws Exception {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		try {
			int count = sqlSession.update("guillotine.dao.VoteDao.update", voteDao);
			sqlSession.commit();
			
			return count;
		} finally {
			sqlSession.close();
		}
	}
	
}
