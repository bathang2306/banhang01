package Doan.Service.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Doan.Dao.user.CategoryDao;
import Doan.entity.user.Category;
@Service
public class IMPLCategoryService implements ICategoryService {
    @Autowired
    CategoryDao categorydao;
	public List<Category> hienthi() {
		
		return categorydao.hienthi();
	}
	

}
