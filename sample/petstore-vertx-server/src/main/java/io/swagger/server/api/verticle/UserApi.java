package io.swagger.server.api.verticle;

import io.swagger.server.api.model.InlineResponseDefault;
import java.util.List;
import io.swagger.server.api.model.ModelUser;
import java.time.OffsetDateTime;
import java.util.UUID;

import io.swagger.server.api.util.ResourceResponse;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

public interface UserApi  {
    //createUser
    void createUser(ModelUser body, Handler<AsyncResult<ResourceResponse<Void>>> handler);
    
    //createUsersWithArrayInput
    void createUsersWithArrayInput(List<ModelUser> body, Handler<AsyncResult<ResourceResponse<Void>>> handler);
    
    //createUsersWithListInput
    void createUsersWithListInput(List<ModelUser> body, Handler<AsyncResult<ResourceResponse<Void>>> handler);
    
    //deleteUser
    void deleteUser(String username, Handler<AsyncResult<ResourceResponse<Void>>> handler);
    
    //getUserByName
    void getUserByName(String username, Handler<AsyncResult<ResourceResponse<ModelUser>>> handler);
    
    //loginUser
    void loginUser(String username, String password, Handler<AsyncResult<ResourceResponse<String>>> handler);
    
    //logoutUser
    void logoutUser(Handler<AsyncResult<ResourceResponse<Void>>> handler);
    
    //updateUser
    void updateUser(String username, ModelUser body, Handler<AsyncResult<ResourceResponse<Void>>> handler);
    
    //uuid
    void uuid(UUID uuidParam, Handler<AsyncResult<ResourceResponse<InlineResponseDefault>>> handler);
    
}
