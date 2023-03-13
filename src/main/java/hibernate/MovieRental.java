package hibernate;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@Table(name = "movierental")
public class MovieRental {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id;
	
	@Column(name="movie_id", insertable=false, updatable=false)
	private Integer movieId;
	
	@Column(name="user_id", insertable=false, updatable=false)
	private Integer userId;
	
	@Column(name="checkout_date")
	@Temporal(TemporalType.TIMESTAMP)
	private Date checkoutDate;
	
	@Column(name="checkin_date")
	@Temporal(TemporalType.TIMESTAMP)
	private Date checkinDate;
	
	@ToString.Exclude
	@ManyToOne(fetch = FetchType.EAGER, optional = false, cascade=CascadeType.ALL)
	@JoinColumn(name = "movie_id", nullable = false)
	    private Movie movie;
	
	@ToString.Exclude
	@ManyToOne(fetch = FetchType.EAGER, optional = false, cascade=CascadeType.ALL)
	@JoinColumn(name = "user_id", nullable = false)
	    private User user;

}
