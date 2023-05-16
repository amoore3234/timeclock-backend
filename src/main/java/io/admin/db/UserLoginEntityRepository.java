package io.admin.db;

import io.admin.core.UserLoginEntity;
import org.hibernate.SessionFactory;

/**
 * Initializes a session factory for the UserEntity repository class.
 */
public class UserLoginEntityRepository extends AbstractRepository<UserLoginEntity> {

  public UserLoginEntityRepository(SessionFactory sessionFactory) {
    super(sessionFactory);
  }

}
