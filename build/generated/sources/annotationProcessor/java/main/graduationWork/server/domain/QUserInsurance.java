package graduationWork.server.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QUserInsurance is a Querydsl query type for UserInsurance
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QUserInsurance extends EntityPathBase<UserInsurance> {

    private static final long serialVersionUID = -404843647L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QUserInsurance userInsurance = new QUserInsurance("userInsurance");

    public final DatePath<java.time.LocalDate> applyDate = createDate("applyDate", java.time.LocalDate.class);

    public final StringPath compensationAmount = createString("compensationAmount");

    public final StringPath compensationAmountEther = createString("compensationAmountEther");

    public final EnumPath<graduationWork.server.enumurate.CompensationOption> compensationOption = createEnum("compensationOption", graduationWork.server.enumurate.CompensationOption.class);

    public final EnumPath<graduationWork.server.enumurate.CompensationStatus> compensationStatus = createEnum("compensationStatus", graduationWork.server.enumurate.CompensationStatus.class);

    public final DatePath<java.time.LocalDate> endDate = createDate("endDate", java.time.LocalDate.class);

    public final StringPath etherRegisterPrice = createString("etherRegisterPrice");

    public final ListPath<UploadFile, QUploadFile> files = this.<UploadFile, QUploadFile>createList("files", UploadFile.class, QUploadFile.class, PathInits.DIRECT2);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final QInsurance insurance;

    public final DatePath<java.time.LocalDate> occurrenceDate = createDate("occurrenceDate", java.time.LocalDate.class);

    public final StringPath reason = createString("reason");

    public final DatePath<java.time.LocalDate> registerDate = createDate("registerDate", java.time.LocalDate.class);

    public final StringPath registerPrice = createString("registerPrice");

    public final DatePath<java.time.LocalDate> startDate = createDate("startDate", java.time.LocalDate.class);

    public final EnumPath<graduationWork.server.enumurate.InsuranceStatus> status = createEnum("status", graduationWork.server.enumurate.InsuranceStatus.class);

    public final QUser user;

    public QUserInsurance(String variable) {
        this(UserInsurance.class, forVariable(variable), INITS);
    }

    public QUserInsurance(Path<? extends UserInsurance> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QUserInsurance(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QUserInsurance(PathMetadata metadata, PathInits inits) {
        this(UserInsurance.class, metadata, inits);
    }

    public QUserInsurance(Class<? extends UserInsurance> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.insurance = inits.isInitialized("insurance") ? new QInsurance(forProperty("insurance")) : null;
        this.user = inits.isInitialized("user") ? new QUser(forProperty("user"), inits.get("user")) : null;
    }

}

