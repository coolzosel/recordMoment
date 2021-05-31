package model.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class User { 
	@Id
	@Column(length=15)
	private String id; //아이디(고유키)

	private String pw; // 패스워드
	
	private String name; // 이름
	
	private String email; // 이메일
	
	private String addr1;
	private String addr2;
	private String addr3; // 주소
		
	
	@OneToMany(mappedBy = "id", cascade = {CascadeType.ALL})
	private List<Board>	posts = new ArrayList<>();
	
	
}
