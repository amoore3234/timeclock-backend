package io.admin.db;

import io.admin.core.EmployeeTimesheetEntity;
import org.hibernate.SessionFactory;

/**
 * Initializes a session factory for the EmployeeTimesheet repository class.
 */
public class EmployeeTimesheetEntityRepository extends AbstractRepository<EmployeeTimesheetEntity>
    implements EmployeeTimesheetRepository {

  protected EmployeeTimesheetEntityRepository(SessionFactory sessionFactory) {
    super(sessionFactory);
  }

}
