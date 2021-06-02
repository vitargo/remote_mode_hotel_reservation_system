package hotel;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

public enum ReservationStatus {
    CREATED, CONFIRMED, PAID, CANCELLED
}
