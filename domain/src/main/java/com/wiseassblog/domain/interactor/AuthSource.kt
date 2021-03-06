package com.wiseassblog.domain.interactor

import com.wiseassblog.domain.ServiceLocator
import com.wiseassblog.domain.domainmodel.User
import java.lang.Exception
import com.wiseassblog.domain.domainmodel.Result

class AuthSource {

    suspend fun getCurrentUser(locator: ServiceLocator): Result<Exception, User?>{
        return locator.authSource.getCurrentUser()
    }

}