package com.daehyeon.basic.model;

import lombok.Data;
// @Data가 롬복? 안쓰면  해쉬코드가 나온다?
@Data
public class Member {
	private String Name;
	private String userId;
	private String userPassword;
	
	
}