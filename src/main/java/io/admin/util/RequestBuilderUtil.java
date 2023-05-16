package io.admin.util;

import io.admin.core.UserLoginEntity;
import io.admin.timesheet.UpdateUser;
import io.admin.timesheet.UserRequest;
import io.admin.timesheet.UserResponse;
import io.grpc.stub.StreamObserver;

/**
 * A class that includes request and response methods.
 */
public class RequestBuilderUtil {

  public RequestBuilderUtil() {}

  /**
   * Creates a UserLogin entity from a request.
   *
   * @param request {@link UserRequest} defines a request stub.
   * @return returns a UserLogin object.
   */
  public static UserLoginEntity createUserLoginRequest(UserRequest request) {
    final UserLoginEntity user = UserLoginEntity.newInstance();
    user.setEmail(request.getEmail());
    user.setPassword(request.getPassword());
    return user;
  }

  /**
   * Updates an existing entity class from a request.
   *
   * @param request {@link UpdateUser} defines a request stub.
   * @param updatedUser {@link UserLoginEntity} defines an entity class.
   * @return returns a UserLoginEntity object.
   */
  public static UserLoginEntity updateUserLoginRequest(
        UpdateUser request, UserLoginEntity updatedUser) {
    updatedUser.setId(request.getId());
    updatedUser.setEmail(request.getRequest().getEmail());
    updatedUser.setPassword(request.getRequest().getPassword());
    return updatedUser;
  }

  /**
   * A request that gets a user by id.
   *
   * @param id defines an id.
   * @return returns a long.
   */
  public static Long getUserByIdRequest(Long id) {
    return id;
  }

  /**
   * Creates a UserLogin response.
   *
   * @param user {@link UserLoginEntity} defines a UserLogin entity.
   * @param responseObserver {@link UserResponse} defines a StreamObserver response stub.
   * @return returns a StreamObserver response for UserLogin.
   */
  public static StreamObserver<UserResponse> userLoginResponse(
      UserLoginEntity user, StreamObserver<UserResponse> responseObserver) {
    io.admin.timesheet.UserResponse.Builder userLoginResponseBuilder = UserResponse.newBuilder()
        .setId(user.getId())
        .setEmail(user.getEmail())
        .setPassword(user.getPassword());
    UserResponse userLoginResponse = userLoginResponseBuilder.build();
    responseObserver.onNext(userLoginResponse);
    responseObserver.onCompleted();
    return responseObserver;
  }

}
