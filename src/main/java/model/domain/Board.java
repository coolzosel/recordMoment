package model.domain;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Board {
	@Id
	private Long no;
		
	private String title; // 제목
	
	private String content; // 본문
	
//	@ManyToOne(cascade = {CascadeType.ALL})
//	@JoinColumn(name = "writer") 
	private String writer; // 작성자 
			
	@Temporal(TemporalType.TIMESTAMP)
	private Date writedate; // 작성날짜
			
	private int liked; // 좋아요
	
	
	
}
