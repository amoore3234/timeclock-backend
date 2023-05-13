package io.admin.db;

import io.admin.core.EmployeeDetailEntity;
import org.hibernate.SessionFactory;

/**
 * Initializes a session factory for the EmployeeDetail repository class.
 */
public class EmployeeDetailEntityRepository extends AbstractRepository<EmployeeDetailEntity> {

  protected EmployeeDetailEntityRepository(SessionFactory sessionFactory) {
    super(sessionFactory);
  }

}
