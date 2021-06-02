package hotel;

import javax.persistence.*;

@Entity
@Table(name="rooms")
public class Room {
    @Id
    @Column(name="id_rooms", columnDefinition="BIGINT", nullable = false)
    private long id;

    @Column(name="room_number", columnDefinition="BIGINT", nullable = false)
    private long roomNumber;

    @Column(name="geusts_number", columnDefinition="BIGINT", nullable = false)
    private long guestsNumber;

    @Enumerated(EnumType.STRING)
    @Column(name="category", columnDefinition="VARCHAR", nullable = false)
    private RoomCategory category;

    @Enumerated (EnumType.STRING)
    @Column(name="status", columnDefinition="VARCHAR", nullable = false)
    private RoomStatus status;

    @Column(name="price", columnDefinition="DECIMAL", nullable = false)
    private double price;

    public Room(long roomNumber, long guestsNumber, RoomCategory category, RoomStatus status, double price) {
        this.roomNumber = roomNumber;
        this.guestsNumber = guestsNumber;
        this.category = category;
        this.status = status;
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(long roomNumber) {
        this.roomNumber = roomNumber;
    }

    public long getGuestsNumber() {
        return guestsNumber;
    }

    public void setGuestsNumber(long guestsNumber) {
        this.guestsNumber = guestsNumber;
    }

    public RoomCategory getCategory() {
        return category;
    }

    public void setCategory(RoomCategory category) {
        this.category = category;
    }

    public RoomStatus getStatus() {
        return status;
    }

    public void setStatus(RoomStatus status) {
        this.status = status;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
