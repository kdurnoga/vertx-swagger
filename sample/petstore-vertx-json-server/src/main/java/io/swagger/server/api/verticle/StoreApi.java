package io.swagger.server.api.verticle;

import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.swagger.server.api.model.Order;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.ext.auth.User;

public interface StoreApi  {
    //deleteOrder
    void deleteOrder(Long orderId, Handler<AsyncResult<ResourceResponse<Void>>> handler);
    
    //getInventory
    void getInventory(User user, Handler<AsyncResult<ResourceResponse<JsonObject>>> handler);
    
    //getOrderById
    void getOrderById(Long orderId, Handler<AsyncResult<ResourceResponse<Order>>> handler);
    
    //placeOrder
    void placeOrder(Order body, Handler<AsyncResult<ResourceResponse<Order>>> handler);
    
}
