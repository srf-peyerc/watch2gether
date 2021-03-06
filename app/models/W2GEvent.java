package models;


import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by peyerco on 07.05.15.
 */
@Entity
public class W2GEvent {

    @Id
    @GeneratedValue
    public Long id;

    public String show;
    public String channel;
    public Date time;
    public String chatUrl;

    @Enumerated(EnumType.STRING)
    public DeliveryStatus deliveryStatus;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    public Set<W2GEventMsisdn> msisdns = new HashSet<>();

    public W2GEvent() {
        this.deliveryStatus = DeliveryStatus.PENDING;
    }

}
