package edu.kh.todoList.member.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor //기본생성자
@AllArgsConstructor //모든필드에 대한 매개변수 생성자
@Getter
@Setter
@ToString  
//@ToString -> ctrl+shift ->lombok으로 해서 작성해주면된다

public class Member {
	
	// lombok  라이브러리 : getter/setter , 생성자, toString() 등을 자동완성해주는 라이브러리	
	private int memberNo;
	private String memberId;
	private String memberPw;
	private String memberNickname;
	private String enrollDate;
	private String memberDeleteFlag;

}
