/*
 * Copyright (c) 2016 - M-net Telekommunikations GmbH
 * All rights reserved.
 * -------------------------------------------------------
 * File created: 21.11.2016
 */
package idea.repository;

import idea.entity.Idea;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by molterfe on 21.11.2016.
 */
public interface SpringRestRepository extends JpaRepository<Idea, Long> {
}
