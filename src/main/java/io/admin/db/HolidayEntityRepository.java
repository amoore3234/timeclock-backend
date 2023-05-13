package io.admin.db;

import io.admin.core.HolidayEntity;
import org.hibernate.SessionFactory;

/**
 * Initializes a session factory for the Holiday repository class.
 */
public class HolidayEntityRepository extends AbstractRepository<HolidayEntity> {

  protected HolidayEntityRepository(SessionFactory sessionFactory) {
    super(sessionFactory);
  }

}
