package graduationWork.server.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QUser is a Querydsl query type for User
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QUser extends EntityPathBase<User> {

    private static final long serialVersionUID = -1891997863L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QUser user = new QUser("user");

    public final QAddress address;

    public final StringPath email = createString("email");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final DatePath<java.time.LocalDate> joinDate = createDate("joinDate", java.time.LocalDate.class);

    public final StringPath loginId = createString("loginId");

    public final StringPath password = createString("password");

    public final StringPath role = createString("role");

    public final ListPath<Transactions, QTransactions> transactions = this.<Transactions, QTransactions>createList("transactions", Transactions.class, QTransactions.class, PathInits.DIRECT2);

    public final ListPath<UserInsurance, QUserInsurance> userInsurances = this.<UserInsurance, QUserInsurance>createList("userInsurances", UserInsurance.class, QUserInsurance.class, PathInits.DIRECT2);

    public final StringPath username = createString("username");

    public final StringPath walletAddress = createString("walletAddress");

    public QUser(String variable) {
        this(User.class, forVariable(variable), INITS);
    }

    public QUser(Path<? extends User> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QUser(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QUser(PathMetadata metadata, PathInits inits) {
        this(User.class, metadata, inits);
    }

    public QUser(Class<? extends User> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.address = inits.isInitialized("address") ? new QAddress(forProperty("address")) : null;
    }

}

