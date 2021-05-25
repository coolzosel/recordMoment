package model.domain;

import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;

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
	
	@ManyToOne(cascade={CascadeType.ALL},fetch = FetchType.EAGER)
	@JoinColumn(name = "user_id", nullable = false) 
	private User id; // 작성자 
			
	private LocalDateTime date; //작성날짜
			
	private int liked; // 좋아요
	
	@PrePersist
    public void date() {
        this.date = LocalDateTime.now();
    }
	
	
	
}
