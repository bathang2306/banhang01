package Doan.Service.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Doan.Dao.user.ProductsDao;
import Doan.Dto.user.ProductDto;

@Service
public class IPLMProductService implements IProductService {
	@Autowired
	ProductsDao productsdao;

	public List<ProductDto> hienthibyidcategory(int id) {
		// TODO Auto-generated method stub
		return productsdao.getDataproductByidcategory(id);
	}

	public ProductDto hienthiproductbyid(int id) {
		// TODO Auto-generated method stub
		return productsdao.getDataproductByid(id);
	}

}
