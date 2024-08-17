package graduationWork.server.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QInsurance is a Querydsl query type for Insurance
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QInsurance extends EntityPathBase<Insurance> {

    private static final long serialVersionUID = 899429388L;

    public static final QInsurance insurance = new QInsurance("insurance");

    public final ListPath<String, StringPath> coverageDetails = this.<String, StringPath>createList("coverageDetails", String.class, StringPath.class, PathInits.DIRECT2);

    public final StringPath formattedPremium = createString("formattedPremium");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final EnumPath<graduationWork.server.enumurate.InsuranceType> insuranceType = createEnum("insuranceType", graduationWork.server.enumurate.InsuranceType.class);

    public final StringPath name = createString("name");

    public final NumberPath<Integer> premium = createNumber("premium", Integer.class);

    public QInsurance(String variable) {
        super(Insurance.class, forVariable(variable));
    }

    public QInsurance(Path<? extends Insurance> path) {
        super(path.getType(), path.getMetadata());
    }

    public QInsurance(PathMetadata metadata) {
        super(Insurance.class, metadata);
    }

}

