package Doan.Dao.user;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import Doan.entity.user.Category;
import Doan.entity.user.MapperCategory;
@Repository
public class CategoryDao extends BaseDao {
	public List<Category> hienthi(){
		List<Category> list = new ArrayList<Category>();
		String sql = "select * from category";
		list = _jdbctemplate.query(sql, new MapperCategory());
		return list;
	}
	

}
