package com.topcoder.trainmanager.repository;

import com.topcoder.trainmanager.model.Train;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

/**
 * The interface Train repository.
 */
@Repository
public interface TrainRepository extends JpaRepository<Train, Long>, JpaSpecificationExecutor<Train> {
	
}
