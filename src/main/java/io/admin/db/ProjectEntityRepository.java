package io.admin.db;

import io.admin.core.ProjectEntity;
import org.hibernate.SessionFactory;

/**
 * Initializes a session factory for the Cart repository class.
 */
public class ProjectEntityRepository extends AbstractRepository<ProjectEntity> {

  public ProjectEntityRepository(SessionFactory sessionFactory) {
    super(sessionFactory);
  }

}
