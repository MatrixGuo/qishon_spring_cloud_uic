package org.mvnsearch.uic.domain.application;

import org.mvnsearch.ddd.application.annotations.ApplicationService;
import org.mvnsearch.uic.domain.model.Account;

/**
 * account manager
 *
 * @author linux_china
 */
@ApplicationService
public interface AccountManager {

    public String findByEmail(String email);
}
