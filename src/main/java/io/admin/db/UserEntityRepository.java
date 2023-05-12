package io.admin.db;

import io.admin.core.UserEntity;
import org.hibernate.SessionFactory;

/**
 * Initializes a session factory for the UserEntity repository class.
 */
public class UserEntityRepository extends AbstractRepository<UserEntity> {

  protected UserEntityRepository(SessionFactory sessionFactory) {
    super(sessionFactory);
  }

}
