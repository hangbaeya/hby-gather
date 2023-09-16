package hangbaeya.gather.domain.board.entity;

import com.vividsolutions.jts.geom.Point;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Getter
@Entity
@Table(name = "GATHER")
@EntityListeners(AuditingEntityListener.class)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Gather {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "title")
    private String title;

    @Column(name = "content")
    private String content;

    @Column(name = "store")
    private String store;

//    @Column(name = "location")
//    @Type(type = "org.hibernate.spatial.GeometryType")
//    private Point location;

    @Column(name = "target_money")
    private int targetMoney;

    @Column(name = "status")
    private int status;


    @Builder
    public Gather(Long id, Long userId, String title, String content, String store, int targetMoney, int status) {
        this.id = id;
        this.userId = userId;
        this.title = title;
        this.content = content;
        this.store = store;
//        this.location = location;
        this.targetMoney = targetMoney;
        this.status = status;
    }
}
