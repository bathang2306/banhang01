package Doan.Service.user;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Doan.Dao.user.BillsDao;
import Doan.Dto.user.CartDTO;
import Doan.entity.user.Bill;
import Doan.entity.user.DetailBills;
@Service
public class IPLMBillsService implements IBillService {
    @Autowired
    BillsDao billdao;
	public int themhoadon(Bill bill) {
		
		return billdao.themhoadon(bill);
	}
	public void themdetailbill(HashMap<Integer, CartDTO> cart) {
		int idbill = billdao.layidcart();
		DetailBills detailbill = new DetailBills();
		detailbill.setCart_id(idbill);
		for(Map.Entry<Integer, CartDTO> item : cart.entrySet()) {
			detailbill.setProduct_id(item.getValue().getProduct().getId());
			detailbill.setPrice(item.getValue().getTotal());
			detailbill.setProduct_quantity(item.getValue().getSoluong());
			billdao.themdetailhoadon(detailbill);
		}
		
	}
	public List<Bill> hienthibill(int user) {
		// TODO Auto-generated method stub
		return billdao.hienthihoadon(user);
	}

}
