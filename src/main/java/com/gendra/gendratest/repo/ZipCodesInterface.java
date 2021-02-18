package com.gendra.gendratest.repo;

import com.gendra.gendratest.dbModels.ZipCodes;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * This class define the interface to communication between the database table and the model java
 * @author Mario Santana
 * @version 18/02/2021
 */
public interface ZipCodesInterface extends JpaRepository<ZipCodes, String> {
}
