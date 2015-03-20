package com.luox2014.springAOP;

public class BuyBookImpl implements BuyBook1 {

	@Override
	public void BuyBook(String customer, String book)  {
		// TODO Auto-generated method stub
		System.out.println("用户"+customer+"成功购买一本书籍，《"+book+"》！");
	}

}
