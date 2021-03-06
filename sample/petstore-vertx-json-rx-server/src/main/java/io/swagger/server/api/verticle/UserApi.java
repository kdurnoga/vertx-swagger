package io.swagger.server.api.verticle;

import io.swagger.server.api.model.InlineResponseDefault;
import java.time.Instant;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import java.util.List;
import io.swagger.server.api.model.ModelUser;

import rx.Completable;
import rx.Single;
import io.vertx.rxjava.ext.auth.User;

public interface UserApi  {
    //createUser
    default Single<ResourceResponse<Void>> createUserWithHeader(ModelUser body) { 
    	return createUser(body).compose(emptyHeaderWrapper()); 
    }
    
    default Single<Void> createUser(ModelUser body) { 
    	return Single.error(new UnsupportedOperationException("Not implemented"));
    }

    
    //createUsersWithArrayInput
    default Single<ResourceResponse<Void>> createUsersWithArrayInputWithHeader(JsonArray body) { 
    	return createUsersWithArrayInput(body).compose(emptyHeaderWrapper()); 
    }
    
    default Single<Void> createUsersWithArrayInput(JsonArray body) { 
    	return Single.error(new UnsupportedOperationException("Not implemented"));
    }

    
    //createUsersWithListInput
    default Single<ResourceResponse<Void>> createUsersWithListInputWithHeader(JsonArray body) { 
    	return createUsersWithListInput(body).compose(emptyHeaderWrapper()); 
    }
    
    default Single<Void> createUsersWithListInput(JsonArray body) { 
    	return Single.error(new UnsupportedOperationException("Not implemented"));
    }

    
    //deleteUser
    default Single<ResourceResponse<Void>> deleteUserWithHeader(String username) { 
    	return deleteUser(username).compose(emptyHeaderWrapper()); 
    }
    
    default Single<Void> deleteUser(String username) { 
    	return Single.error(new UnsupportedOperationException("Not implemented"));
    }

    
    //getUserByName
    default Single<ResourceResponse<ModelUser>> getUserByNameWithHeader(String username) { 
    	return getUserByName(username).compose(emptyHeaderWrapper()); 
    }
    
    default Single<ModelUser> getUserByName(String username) { 
    	return Single.error(new UnsupportedOperationException("Not implemented"));
    }

    
    //loginUser
    default Single<ResourceResponse<String>> loginUserWithHeader(String username, String password) { 
    	return loginUser(username, password).compose(emptyHeaderWrapper()); 
    }
    
    default Single<String> loginUser(String username, String password) { 
    	return Single.error(new UnsupportedOperationException("Not implemented"));
    }

    
    //logoutUser
    default Single<ResourceResponse<Void>> logoutUserWithHeader() { 
    	return logoutUser().compose(emptyHeaderWrapper()); 
    }
    
    default Single<Void> logoutUser() { 
    	return Single.error(new UnsupportedOperationException("Not implemented"));
    }

    
    //updateUser
    default Single<ResourceResponse<Void>> updateUserWithHeader(String username, ModelUser body) { 
    	return updateUser(username, body).compose(emptyHeaderWrapper()); 
    }
    
    default Single<Void> updateUser(String username, ModelUser body) { 
    	return Single.error(new UnsupportedOperationException("Not implemented"));
    }

    
    //uuid
    default Single<ResourceResponse<InlineResponseDefault>> uuidWithHeader(String uuidParam) { 
    	return uuid(uuidParam).compose(emptyHeaderWrapper()); 
    }
    
    default Single<InlineResponseDefault> uuid(String uuidParam) { 
    	return Single.error(new UnsupportedOperationException("Not implemented"));
    }

    
}
