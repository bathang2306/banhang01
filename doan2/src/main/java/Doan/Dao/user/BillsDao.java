package Doan.Dao.user;

import java.util.List;

import org.springframework.stereotype.Controller;

import Doan.entity.user.Bill;
import Doan.entity.user.DetailBills;
import Doan.entity.user.MapperBills;

@Controller
public class BillsDao extends BaseDao {
	public int themhoadon(Bill bill) {
		String sql = "INSERT INTO `cart`( "
				+ "`create__date`, `status`, `user_id`, `price`, `address`, `email`, `phone`,`fullname`) "
				+ "VALUES (CURRENT_TIMESTAMP,'dang xu ly','"+bill.getUser_id()+"','"+bill.getPrice()+"','"+bill.getAddress()+"','"+bill.getEmail()+"','"+bill.getPhone()+"','"+bill.getFullname()+"')";
		
		return _jdbctemplate.update(sql);
	}
	public int themdetailhoadon( DetailBills bill) {
		String sql = "INSERT INTO `cart_detail`( `product_id`, `cart_id`, `product_quantity`, `price`) VALUES ('"+bill.getProduct_id()+"','"+bill.getCart_id()+"','"+bill.getProduct_quantity()+"','"+bill.getPrice()+"')";
		return _jdbctemplate.update(sql);
		
	}
	public int layidcart() {
		String sql = "SELECT MAX(id) FROM `cart`";
		int id = _jdbctemplate.queryForObject(sql, new Object[] {},int.class);
		return id;
	}
	public List<Bill> hienthihoadon(int id){
		String sql = "select * from cart inner join user on cart.user_id = user.id where user.id = " + id;
		List<Bill> list;
		try {
			 list =  _jdbctemplate.query(sql, new MapperBills());
		} catch (Exception e) {
			list=null;
		}
		return list;
		
	}

}
