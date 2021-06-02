package hotel;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name="reservations")
public class Reservation {
    @Id
    @Column(name="id_reservations", columnDefinition="BIGINT", nullable = false)
    private long id;

    @Column(name="room_id", columnDefinition="BIGINT", nullable = false)
    private long roomId;

    @Column(name="user_id", columnDefinition="BIGINT", nullable = false)
    private long userId;

    @Column(name="price", columnDefinition="DECIMAL", nullable = false)
    private double price;

    @Enumerated(EnumType.STRING)
    @Column(name="status", columnDefinition="VARCHAR", nullable = false)
    private ReservationStatus status;

    @Column(name="start_date", columnDefinition="VARCHAR", nullable = false)
    private Timestamp startDate;


    public Reservation(long roomId, long userId, double price, ReservationStatus status, Timestamp startDate) {
        this.roomId = roomId;
        this.userId = userId;
        this.price = price;
        this.status = status;
        this.startDate = startDate;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getRoomId() {
        return roomId;
    }

    public void setRoomId(long roomId) {
        this.roomId = roomId;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public ReservationStatus getStatus() {
        return status;
    }

    public void setStatus(ReservationStatus status) {
        this.status = status;
    }

    public Timestamp getStartDate() {
        return startDate;
    }

    public void setStartDate(Timestamp startDate) {
        this.startDate = startDate;
    }
}
