package Doan.Service.user;

import java.util.List;

import org.springframework.stereotype.Service;

import Doan.Dto.user.ProductDto;

@Service
public interface IProductService {
	public List<ProductDto> hienthibyidcategory(int id);
	public ProductDto hienthiproductbyid(int id);

}
