package model.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
//@Table(name = "user", uniqueConstraints = { @UniqueConstraint(columnNames = { "id" }) })
@Entity
public class User {
	@Id
	@Column(length=15)
	private String id; //아이디(고유키)

	private String pwd; // 패스워드
	
	private String name; // 이름
	
	private String email; // 이메일
	
	private String addr1;
	private String addr2;
	private String addr3; // 주소
	
	
//	private String addr = addr1 + " " + addr2 + " " + addr3; //주소
	
//	@OneToMany(mappedBy = "user", cascade = { CascadeType.ALL })
//	private List<Board>	board = new ArrayList<>();
//	
	// 리스트에 게시판글 담기
	// 리스트에 담는거보단.. 테이블에 바로바로 추가해주는게 더 나을듯
	
	
}
