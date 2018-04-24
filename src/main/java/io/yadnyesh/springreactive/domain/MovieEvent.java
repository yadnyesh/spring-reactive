package io.yadnyesh.springreactive.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;

@Data
@NoArgsConstructor
public class MovieEvent {
	private String movieId;
	private Date date;
}
