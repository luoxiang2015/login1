package com.luox2014.spring;

public class Factory {
public final static String CHINESE = "Chinese";
public final static String AMERICAN = "American";
public Human getHuman(String ethnic ){
	if("CHINESE".equals(ethnic)){
		return new Chinese();
	}else if("AMERICAN".equals(ethnic)){
		return new American();
	}else{
		throw new IllegalArgumentException("参数(人种)错误");
	}
}
}
