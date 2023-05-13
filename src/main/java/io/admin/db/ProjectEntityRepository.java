package io.admin.db;

import io.admin.core.ProjectEntity;
import org.hibernate.SessionFactory;

/**
 * Initializes a session factory for the Cart repository class.
 */
public class ProjectEntityRepository extends AbstractRepository<ProjectEntity> {

  protected ProjectEntityRepository(SessionFactory sessionFactory) {
    super(sessionFactory);
  }

}
