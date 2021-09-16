package Doan.Service.user;

import org.springframework.stereotype.Service;

import Doan.entity.user.user;

@Service
public interface IuserService {
	public int dangky(user User);
	public user dangnhap(user User);

}
