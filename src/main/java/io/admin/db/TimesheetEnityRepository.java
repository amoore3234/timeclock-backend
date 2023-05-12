package io.admin.db;

import io.admin.core.TimesheetEntity;
import org.hibernate.SessionFactory;

/**
 * Initializes a session factory for the TimesheetEntity repository class.
 */
public class TimesheetEnityRepository extends AbstractRepository<TimesheetEntity> {

  protected TimesheetEnityRepository(SessionFactory sessionFactory) {
    super(sessionFactory);
  }

}
