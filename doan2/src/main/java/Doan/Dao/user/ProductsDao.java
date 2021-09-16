package Doan.Dao.user;

import java.util.List;

import org.springframework.stereotype.Repository;

import Doan.Dto.user.MapperProductDto;
import Doan.Dto.user.ProductDto;

@Repository
public class ProductsDao extends BaseDao {
	private StringBuffer stringbase() {
		StringBuffer sql = new StringBuffer();
		sql.append("SELECT * FROM `product` p INNER JOIN category c ON p.category_id = c.id  ");
		return sql;
	}
	public List<ProductDto> getDataproductByidcategory(int id){
		StringBuffer sql = stringbase();
		sql.append(" WHERE c.id = "+id);
		List<ProductDto> list = _jdbctemplate.query(sql.toString(), new MapperProductDto());
		return list;
	}
	public ProductDto getDataproductByid(int id) {
		StringBuffer sql = stringbase();
		sql.append("WHERE p.id =" + id);
		ProductDto item =  _jdbctemplate.queryForObject(sql.toString(), new MapperProductDto());
		return item;
	}
	
	

}
