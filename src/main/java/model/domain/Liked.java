package model.domain;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Liked {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long no;
	
	@ManyToOne(cascade={CascadeType.ALL})
	private Board board; // 보드(FK)
	
	@ManyToOne(cascade= {CascadeType.ALL})
	private User user; // 유저(FK)
	
	public Liked(Board board, User user) {
		this.board = board;
		this.user = user;
	}
	
}
