package graduationWork.server.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QFlight is a Querydsl query type for Flight
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QFlight extends EntityPathBase<Flight> {

    private static final long serialVersionUID = -1874570114L;

    public static final QFlight flight = new QFlight("flight");

    public final StringPath departure = createString("departure");

    public final DateTimePath<java.time.LocalDateTime> departureDate = createDateTime("departureDate", java.time.LocalDateTime.class);

    public final StringPath destination = createString("destination");

    public final StringPath flightNum = createString("flightNum");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final EnumPath<graduationWork.server.enumurate.FlightStatus> status = createEnum("status", graduationWork.server.enumurate.FlightStatus.class);

    public QFlight(String variable) {
        super(Flight.class, forVariable(variable));
    }

    public QFlight(Path<? extends Flight> path) {
        super(path.getType(), path.getMetadata());
    }

    public QFlight(PathMetadata metadata) {
        super(Flight.class, metadata);
    }

}

