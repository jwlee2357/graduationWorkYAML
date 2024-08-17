package graduationWork.server.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QTransactions is a Querydsl query type for Transactions
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QTransactions extends EntityPathBase<Transactions> {

    private static final long serialVersionUID = 1875351267L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QTransactions transactions = new QTransactions("transactions");

    public final StringPath fromAddress = createString("fromAddress");

    public final StringPath hash = createString("hash");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath name = createString("name");

    public final NumberPath<Long> timestamp = createNumber("timestamp", Long.class);

    public final StringPath toAddress = createString("toAddress");

    public final QUser user;

    public final QUserInsurance userInsurance;

    public final StringPath value = createString("value");

    public QTransactions(String variable) {
        this(Transactions.class, forVariable(variable), INITS);
    }

    public QTransactions(Path<? extends Transactions> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QTransactions(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QTransactions(PathMetadata metadata, PathInits inits) {
        this(Transactions.class, metadata, inits);
    }

    public QTransactions(Class<? extends Transactions> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.user = inits.isInitialized("user") ? new QUser(forProperty("user"), inits.get("user")) : null;
        this.userInsurance = inits.isInitialized("userInsurance") ? new QUserInsurance(forProperty("userInsurance"), inits.get("userInsurance")) : null;
    }

}

