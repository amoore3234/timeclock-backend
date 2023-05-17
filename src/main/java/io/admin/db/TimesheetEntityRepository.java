package io.admin.db;

import io.admin.core.TimesheetEntity;
import org.hibernate.SessionFactory;

/**
 * Initializes a session factory for the TimesheetEntity repository class.
 */
public class TimesheetEntityRepository extends AbstractRepository<TimesheetEntity>
    implements TimesheetRepository {

  protected TimesheetEntityRepository(SessionFactory sessionFactory) {
    super(sessionFactory);
  }

}
