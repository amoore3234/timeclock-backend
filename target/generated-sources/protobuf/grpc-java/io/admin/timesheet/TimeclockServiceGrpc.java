package io.admin.timesheet;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.52.1)",
    comments = "Source: timeclock.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class TimeclockServiceGrpc {

  private TimeclockServiceGrpc() {}

  public static final String SERVICE_NAME = "TimeclockService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.admin.timesheet.UserInput,
      io.admin.timesheet.User> getCreateUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createUser",
      requestType = io.admin.timesheet.UserInput.class,
      responseType = io.admin.timesheet.User.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.admin.timesheet.UserInput,
      io.admin.timesheet.User> getCreateUserMethod() {
    io.grpc.MethodDescriptor<io.admin.timesheet.UserInput, io.admin.timesheet.User> getCreateUserMethod;
    if ((getCreateUserMethod = TimeclockServiceGrpc.getCreateUserMethod) == null) {
      synchronized (TimeclockServiceGrpc.class) {
        if ((getCreateUserMethod = TimeclockServiceGrpc.getCreateUserMethod) == null) {
          TimeclockServiceGrpc.getCreateUserMethod = getCreateUserMethod =
              io.grpc.MethodDescriptor.<io.admin.timesheet.UserInput, io.admin.timesheet.User>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "createUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.admin.timesheet.UserInput.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.admin.timesheet.User.getDefaultInstance()))
              .setSchemaDescriptor(new TimeclockServiceMethodDescriptorSupplier("createUser"))
              .build();
        }
      }
    }
    return getCreateUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.admin.timesheet.GetUserById,
      io.admin.timesheet.User> getGetUserByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getUserById",
      requestType = io.admin.timesheet.GetUserById.class,
      responseType = io.admin.timesheet.User.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.admin.timesheet.GetUserById,
      io.admin.timesheet.User> getGetUserByIdMethod() {
    io.grpc.MethodDescriptor<io.admin.timesheet.GetUserById, io.admin.timesheet.User> getGetUserByIdMethod;
    if ((getGetUserByIdMethod = TimeclockServiceGrpc.getGetUserByIdMethod) == null) {
      synchronized (TimeclockServiceGrpc.class) {
        if ((getGetUserByIdMethod = TimeclockServiceGrpc.getGetUserByIdMethod) == null) {
          TimeclockServiceGrpc.getGetUserByIdMethod = getGetUserByIdMethod =
              io.grpc.MethodDescriptor.<io.admin.timesheet.GetUserById, io.admin.timesheet.User>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getUserById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.admin.timesheet.GetUserById.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.admin.timesheet.User.getDefaultInstance()))
              .setSchemaDescriptor(new TimeclockServiceMethodDescriptorSupplier("getUserById"))
              .build();
        }
      }
    }
    return getGetUserByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.admin.timesheet.UpdateUser,
      io.admin.timesheet.User> getUpdateUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateUser",
      requestType = io.admin.timesheet.UpdateUser.class,
      responseType = io.admin.timesheet.User.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.admin.timesheet.UpdateUser,
      io.admin.timesheet.User> getUpdateUserMethod() {
    io.grpc.MethodDescriptor<io.admin.timesheet.UpdateUser, io.admin.timesheet.User> getUpdateUserMethod;
    if ((getUpdateUserMethod = TimeclockServiceGrpc.getUpdateUserMethod) == null) {
      synchronized (TimeclockServiceGrpc.class) {
        if ((getUpdateUserMethod = TimeclockServiceGrpc.getUpdateUserMethod) == null) {
          TimeclockServiceGrpc.getUpdateUserMethod = getUpdateUserMethod =
              io.grpc.MethodDescriptor.<io.admin.timesheet.UpdateUser, io.admin.timesheet.User>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "updateUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.admin.timesheet.UpdateUser.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.admin.timesheet.User.getDefaultInstance()))
              .setSchemaDescriptor(new TimeclockServiceMethodDescriptorSupplier("updateUser"))
              .build();
        }
      }
    }
    return getUpdateUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.admin.timesheet.GetUserById,
      io.admin.timesheet.User> getDeleteUserByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteUserById",
      requestType = io.admin.timesheet.GetUserById.class,
      responseType = io.admin.timesheet.User.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.admin.timesheet.GetUserById,
      io.admin.timesheet.User> getDeleteUserByIdMethod() {
    io.grpc.MethodDescriptor<io.admin.timesheet.GetUserById, io.admin.timesheet.User> getDeleteUserByIdMethod;
    if ((getDeleteUserByIdMethod = TimeclockServiceGrpc.getDeleteUserByIdMethod) == null) {
      synchronized (TimeclockServiceGrpc.class) {
        if ((getDeleteUserByIdMethod = TimeclockServiceGrpc.getDeleteUserByIdMethod) == null) {
          TimeclockServiceGrpc.getDeleteUserByIdMethod = getDeleteUserByIdMethod =
              io.grpc.MethodDescriptor.<io.admin.timesheet.GetUserById, io.admin.timesheet.User>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deleteUserById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.admin.timesheet.GetUserById.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.admin.timesheet.User.getDefaultInstance()))
              .setSchemaDescriptor(new TimeclockServiceMethodDescriptorSupplier("deleteUserById"))
              .build();
        }
      }
    }
    return getDeleteUserByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.admin.timesheet.EmployeeDetailInput,
      io.admin.timesheet.EmployeeDetail> getCreateEmployeeDetailMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createEmployeeDetail",
      requestType = io.admin.timesheet.EmployeeDetailInput.class,
      responseType = io.admin.timesheet.EmployeeDetail.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.admin.timesheet.EmployeeDetailInput,
      io.admin.timesheet.EmployeeDetail> getCreateEmployeeDetailMethod() {
    io.grpc.MethodDescriptor<io.admin.timesheet.EmployeeDetailInput, io.admin.timesheet.EmployeeDetail> getCreateEmployeeDetailMethod;
    if ((getCreateEmployeeDetailMethod = TimeclockServiceGrpc.getCreateEmployeeDetailMethod) == null) {
      synchronized (TimeclockServiceGrpc.class) {
        if ((getCreateEmployeeDetailMethod = TimeclockServiceGrpc.getCreateEmployeeDetailMethod) == null) {
          TimeclockServiceGrpc.getCreateEmployeeDetailMethod = getCreateEmployeeDetailMethod =
              io.grpc.MethodDescriptor.<io.admin.timesheet.EmployeeDetailInput, io.admin.timesheet.EmployeeDetail>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "createEmployeeDetail"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.admin.timesheet.EmployeeDetailInput.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.admin.timesheet.EmployeeDetail.getDefaultInstance()))
              .setSchemaDescriptor(new TimeclockServiceMethodDescriptorSupplier("createEmployeeDetail"))
              .build();
        }
      }
    }
    return getCreateEmployeeDetailMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.admin.timesheet.GetEmployeetDetailById,
      io.admin.timesheet.EmployeeDetail> getGetEmployeeDetailByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getEmployeeDetailById",
      requestType = io.admin.timesheet.GetEmployeetDetailById.class,
      responseType = io.admin.timesheet.EmployeeDetail.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.admin.timesheet.GetEmployeetDetailById,
      io.admin.timesheet.EmployeeDetail> getGetEmployeeDetailByIdMethod() {
    io.grpc.MethodDescriptor<io.admin.timesheet.GetEmployeetDetailById, io.admin.timesheet.EmployeeDetail> getGetEmployeeDetailByIdMethod;
    if ((getGetEmployeeDetailByIdMethod = TimeclockServiceGrpc.getGetEmployeeDetailByIdMethod) == null) {
      synchronized (TimeclockServiceGrpc.class) {
        if ((getGetEmployeeDetailByIdMethod = TimeclockServiceGrpc.getGetEmployeeDetailByIdMethod) == null) {
          TimeclockServiceGrpc.getGetEmployeeDetailByIdMethod = getGetEmployeeDetailByIdMethod =
              io.grpc.MethodDescriptor.<io.admin.timesheet.GetEmployeetDetailById, io.admin.timesheet.EmployeeDetail>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getEmployeeDetailById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.admin.timesheet.GetEmployeetDetailById.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.admin.timesheet.EmployeeDetail.getDefaultInstance()))
              .setSchemaDescriptor(new TimeclockServiceMethodDescriptorSupplier("getEmployeeDetailById"))
              .build();
        }
      }
    }
    return getGetEmployeeDetailByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.admin.timesheet.UpdateEmployeeDetail,
      io.admin.timesheet.EmployeeDetail> getUpdateEmployeeDetailMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateEmployeeDetail",
      requestType = io.admin.timesheet.UpdateEmployeeDetail.class,
      responseType = io.admin.timesheet.EmployeeDetail.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.admin.timesheet.UpdateEmployeeDetail,
      io.admin.timesheet.EmployeeDetail> getUpdateEmployeeDetailMethod() {
    io.grpc.MethodDescriptor<io.admin.timesheet.UpdateEmployeeDetail, io.admin.timesheet.EmployeeDetail> getUpdateEmployeeDetailMethod;
    if ((getUpdateEmployeeDetailMethod = TimeclockServiceGrpc.getUpdateEmployeeDetailMethod) == null) {
      synchronized (TimeclockServiceGrpc.class) {
        if ((getUpdateEmployeeDetailMethod = TimeclockServiceGrpc.getUpdateEmployeeDetailMethod) == null) {
          TimeclockServiceGrpc.getUpdateEmployeeDetailMethod = getUpdateEmployeeDetailMethod =
              io.grpc.MethodDescriptor.<io.admin.timesheet.UpdateEmployeeDetail, io.admin.timesheet.EmployeeDetail>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "updateEmployeeDetail"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.admin.timesheet.UpdateEmployeeDetail.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.admin.timesheet.EmployeeDetail.getDefaultInstance()))
              .setSchemaDescriptor(new TimeclockServiceMethodDescriptorSupplier("updateEmployeeDetail"))
              .build();
        }
      }
    }
    return getUpdateEmployeeDetailMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.admin.timesheet.GetEmployeetDetailById,
      io.admin.timesheet.EmployeeDetail> getDeleteEmployeeDetailMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteEmployeeDetail",
      requestType = io.admin.timesheet.GetEmployeetDetailById.class,
      responseType = io.admin.timesheet.EmployeeDetail.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.admin.timesheet.GetEmployeetDetailById,
      io.admin.timesheet.EmployeeDetail> getDeleteEmployeeDetailMethod() {
    io.grpc.MethodDescriptor<io.admin.timesheet.GetEmployeetDetailById, io.admin.timesheet.EmployeeDetail> getDeleteEmployeeDetailMethod;
    if ((getDeleteEmployeeDetailMethod = TimeclockServiceGrpc.getDeleteEmployeeDetailMethod) == null) {
      synchronized (TimeclockServiceGrpc.class) {
        if ((getDeleteEmployeeDetailMethod = TimeclockServiceGrpc.getDeleteEmployeeDetailMethod) == null) {
          TimeclockServiceGrpc.getDeleteEmployeeDetailMethod = getDeleteEmployeeDetailMethod =
              io.grpc.MethodDescriptor.<io.admin.timesheet.GetEmployeetDetailById, io.admin.timesheet.EmployeeDetail>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deleteEmployeeDetail"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.admin.timesheet.GetEmployeetDetailById.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.admin.timesheet.EmployeeDetail.getDefaultInstance()))
              .setSchemaDescriptor(new TimeclockServiceMethodDescriptorSupplier("deleteEmployeeDetail"))
              .build();
        }
      }
    }
    return getDeleteEmployeeDetailMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.admin.timesheet.ProjectInput,
      io.admin.timesheet.Project> getCreateProjectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createProject",
      requestType = io.admin.timesheet.ProjectInput.class,
      responseType = io.admin.timesheet.Project.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.admin.timesheet.ProjectInput,
      io.admin.timesheet.Project> getCreateProjectMethod() {
    io.grpc.MethodDescriptor<io.admin.timesheet.ProjectInput, io.admin.timesheet.Project> getCreateProjectMethod;
    if ((getCreateProjectMethod = TimeclockServiceGrpc.getCreateProjectMethod) == null) {
      synchronized (TimeclockServiceGrpc.class) {
        if ((getCreateProjectMethod = TimeclockServiceGrpc.getCreateProjectMethod) == null) {
          TimeclockServiceGrpc.getCreateProjectMethod = getCreateProjectMethod =
              io.grpc.MethodDescriptor.<io.admin.timesheet.ProjectInput, io.admin.timesheet.Project>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "createProject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.admin.timesheet.ProjectInput.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.admin.timesheet.Project.getDefaultInstance()))
              .setSchemaDescriptor(new TimeclockServiceMethodDescriptorSupplier("createProject"))
              .build();
        }
      }
    }
    return getCreateProjectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.admin.timesheet.GetProjectById,
      io.admin.timesheet.Project> getGetProjectByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getProjectById",
      requestType = io.admin.timesheet.GetProjectById.class,
      responseType = io.admin.timesheet.Project.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.admin.timesheet.GetProjectById,
      io.admin.timesheet.Project> getGetProjectByIdMethod() {
    io.grpc.MethodDescriptor<io.admin.timesheet.GetProjectById, io.admin.timesheet.Project> getGetProjectByIdMethod;
    if ((getGetProjectByIdMethod = TimeclockServiceGrpc.getGetProjectByIdMethod) == null) {
      synchronized (TimeclockServiceGrpc.class) {
        if ((getGetProjectByIdMethod = TimeclockServiceGrpc.getGetProjectByIdMethod) == null) {
          TimeclockServiceGrpc.getGetProjectByIdMethod = getGetProjectByIdMethod =
              io.grpc.MethodDescriptor.<io.admin.timesheet.GetProjectById, io.admin.timesheet.Project>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getProjectById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.admin.timesheet.GetProjectById.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.admin.timesheet.Project.getDefaultInstance()))
              .setSchemaDescriptor(new TimeclockServiceMethodDescriptorSupplier("getProjectById"))
              .build();
        }
      }
    }
    return getGetProjectByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.admin.timesheet.UpdateProject,
      io.admin.timesheet.Project> getUpdateProjectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateProject",
      requestType = io.admin.timesheet.UpdateProject.class,
      responseType = io.admin.timesheet.Project.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.admin.timesheet.UpdateProject,
      io.admin.timesheet.Project> getUpdateProjectMethod() {
    io.grpc.MethodDescriptor<io.admin.timesheet.UpdateProject, io.admin.timesheet.Project> getUpdateProjectMethod;
    if ((getUpdateProjectMethod = TimeclockServiceGrpc.getUpdateProjectMethod) == null) {
      synchronized (TimeclockServiceGrpc.class) {
        if ((getUpdateProjectMethod = TimeclockServiceGrpc.getUpdateProjectMethod) == null) {
          TimeclockServiceGrpc.getUpdateProjectMethod = getUpdateProjectMethod =
              io.grpc.MethodDescriptor.<io.admin.timesheet.UpdateProject, io.admin.timesheet.Project>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "updateProject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.admin.timesheet.UpdateProject.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.admin.timesheet.Project.getDefaultInstance()))
              .setSchemaDescriptor(new TimeclockServiceMethodDescriptorSupplier("updateProject"))
              .build();
        }
      }
    }
    return getUpdateProjectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.admin.timesheet.GetProjectById,
      io.admin.timesheet.Project> getDeleteProjectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteProject",
      requestType = io.admin.timesheet.GetProjectById.class,
      responseType = io.admin.timesheet.Project.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.admin.timesheet.GetProjectById,
      io.admin.timesheet.Project> getDeleteProjectMethod() {
    io.grpc.MethodDescriptor<io.admin.timesheet.GetProjectById, io.admin.timesheet.Project> getDeleteProjectMethod;
    if ((getDeleteProjectMethod = TimeclockServiceGrpc.getDeleteProjectMethod) == null) {
      synchronized (TimeclockServiceGrpc.class) {
        if ((getDeleteProjectMethod = TimeclockServiceGrpc.getDeleteProjectMethod) == null) {
          TimeclockServiceGrpc.getDeleteProjectMethod = getDeleteProjectMethod =
              io.grpc.MethodDescriptor.<io.admin.timesheet.GetProjectById, io.admin.timesheet.Project>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deleteProject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.admin.timesheet.GetProjectById.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.admin.timesheet.Project.getDefaultInstance()))
              .setSchemaDescriptor(new TimeclockServiceMethodDescriptorSupplier("deleteProject"))
              .build();
        }
      }
    }
    return getDeleteProjectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.admin.timesheet.GetEmployeetDetailById,
      io.admin.timesheet.GetProjects> getGetProjectsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getProjects",
      requestType = io.admin.timesheet.GetEmployeetDetailById.class,
      responseType = io.admin.timesheet.GetProjects.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.admin.timesheet.GetEmployeetDetailById,
      io.admin.timesheet.GetProjects> getGetProjectsMethod() {
    io.grpc.MethodDescriptor<io.admin.timesheet.GetEmployeetDetailById, io.admin.timesheet.GetProjects> getGetProjectsMethod;
    if ((getGetProjectsMethod = TimeclockServiceGrpc.getGetProjectsMethod) == null) {
      synchronized (TimeclockServiceGrpc.class) {
        if ((getGetProjectsMethod = TimeclockServiceGrpc.getGetProjectsMethod) == null) {
          TimeclockServiceGrpc.getGetProjectsMethod = getGetProjectsMethod =
              io.grpc.MethodDescriptor.<io.admin.timesheet.GetEmployeetDetailById, io.admin.timesheet.GetProjects>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getProjects"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.admin.timesheet.GetEmployeetDetailById.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.admin.timesheet.GetProjects.getDefaultInstance()))
              .setSchemaDescriptor(new TimeclockServiceMethodDescriptorSupplier("getProjects"))
              .build();
        }
      }
    }
    return getGetProjectsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.admin.timesheet.HolidayInput,
      io.admin.timesheet.Holiday> getCreateHolidayMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createHoliday",
      requestType = io.admin.timesheet.HolidayInput.class,
      responseType = io.admin.timesheet.Holiday.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.admin.timesheet.HolidayInput,
      io.admin.timesheet.Holiday> getCreateHolidayMethod() {
    io.grpc.MethodDescriptor<io.admin.timesheet.HolidayInput, io.admin.timesheet.Holiday> getCreateHolidayMethod;
    if ((getCreateHolidayMethod = TimeclockServiceGrpc.getCreateHolidayMethod) == null) {
      synchronized (TimeclockServiceGrpc.class) {
        if ((getCreateHolidayMethod = TimeclockServiceGrpc.getCreateHolidayMethod) == null) {
          TimeclockServiceGrpc.getCreateHolidayMethod = getCreateHolidayMethod =
              io.grpc.MethodDescriptor.<io.admin.timesheet.HolidayInput, io.admin.timesheet.Holiday>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "createHoliday"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.admin.timesheet.HolidayInput.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.admin.timesheet.Holiday.getDefaultInstance()))
              .setSchemaDescriptor(new TimeclockServiceMethodDescriptorSupplier("createHoliday"))
              .build();
        }
      }
    }
    return getCreateHolidayMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.admin.timesheet.GetHolidayById,
      io.admin.timesheet.Holiday> getGetHolidayByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getHolidayById",
      requestType = io.admin.timesheet.GetHolidayById.class,
      responseType = io.admin.timesheet.Holiday.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.admin.timesheet.GetHolidayById,
      io.admin.timesheet.Holiday> getGetHolidayByIdMethod() {
    io.grpc.MethodDescriptor<io.admin.timesheet.GetHolidayById, io.admin.timesheet.Holiday> getGetHolidayByIdMethod;
    if ((getGetHolidayByIdMethod = TimeclockServiceGrpc.getGetHolidayByIdMethod) == null) {
      synchronized (TimeclockServiceGrpc.class) {
        if ((getGetHolidayByIdMethod = TimeclockServiceGrpc.getGetHolidayByIdMethod) == null) {
          TimeclockServiceGrpc.getGetHolidayByIdMethod = getGetHolidayByIdMethod =
              io.grpc.MethodDescriptor.<io.admin.timesheet.GetHolidayById, io.admin.timesheet.Holiday>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getHolidayById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.admin.timesheet.GetHolidayById.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.admin.timesheet.Holiday.getDefaultInstance()))
              .setSchemaDescriptor(new TimeclockServiceMethodDescriptorSupplier("getHolidayById"))
              .build();
        }
      }
    }
    return getGetHolidayByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.admin.timesheet.UpdateHoliday,
      io.admin.timesheet.Holiday> getUpdateHolidayMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateHoliday",
      requestType = io.admin.timesheet.UpdateHoliday.class,
      responseType = io.admin.timesheet.Holiday.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.admin.timesheet.UpdateHoliday,
      io.admin.timesheet.Holiday> getUpdateHolidayMethod() {
    io.grpc.MethodDescriptor<io.admin.timesheet.UpdateHoliday, io.admin.timesheet.Holiday> getUpdateHolidayMethod;
    if ((getUpdateHolidayMethod = TimeclockServiceGrpc.getUpdateHolidayMethod) == null) {
      synchronized (TimeclockServiceGrpc.class) {
        if ((getUpdateHolidayMethod = TimeclockServiceGrpc.getUpdateHolidayMethod) == null) {
          TimeclockServiceGrpc.getUpdateHolidayMethod = getUpdateHolidayMethod =
              io.grpc.MethodDescriptor.<io.admin.timesheet.UpdateHoliday, io.admin.timesheet.Holiday>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "updateHoliday"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.admin.timesheet.UpdateHoliday.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.admin.timesheet.Holiday.getDefaultInstance()))
              .setSchemaDescriptor(new TimeclockServiceMethodDescriptorSupplier("updateHoliday"))
              .build();
        }
      }
    }
    return getUpdateHolidayMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.admin.timesheet.GetHolidayById,
      io.admin.timesheet.Holiday> getDeleteHolidayMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteHoliday",
      requestType = io.admin.timesheet.GetHolidayById.class,
      responseType = io.admin.timesheet.Holiday.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.admin.timesheet.GetHolidayById,
      io.admin.timesheet.Holiday> getDeleteHolidayMethod() {
    io.grpc.MethodDescriptor<io.admin.timesheet.GetHolidayById, io.admin.timesheet.Holiday> getDeleteHolidayMethod;
    if ((getDeleteHolidayMethod = TimeclockServiceGrpc.getDeleteHolidayMethod) == null) {
      synchronized (TimeclockServiceGrpc.class) {
        if ((getDeleteHolidayMethod = TimeclockServiceGrpc.getDeleteHolidayMethod) == null) {
          TimeclockServiceGrpc.getDeleteHolidayMethod = getDeleteHolidayMethod =
              io.grpc.MethodDescriptor.<io.admin.timesheet.GetHolidayById, io.admin.timesheet.Holiday>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deleteHoliday"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.admin.timesheet.GetHolidayById.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.admin.timesheet.Holiday.getDefaultInstance()))
              .setSchemaDescriptor(new TimeclockServiceMethodDescriptorSupplier("deleteHoliday"))
              .build();
        }
      }
    }
    return getDeleteHolidayMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.admin.timesheet.TimesheetInput,
      io.admin.timesheet.Timesheet> getCreateTimesheetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createTimesheet",
      requestType = io.admin.timesheet.TimesheetInput.class,
      responseType = io.admin.timesheet.Timesheet.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.admin.timesheet.TimesheetInput,
      io.admin.timesheet.Timesheet> getCreateTimesheetMethod() {
    io.grpc.MethodDescriptor<io.admin.timesheet.TimesheetInput, io.admin.timesheet.Timesheet> getCreateTimesheetMethod;
    if ((getCreateTimesheetMethod = TimeclockServiceGrpc.getCreateTimesheetMethod) == null) {
      synchronized (TimeclockServiceGrpc.class) {
        if ((getCreateTimesheetMethod = TimeclockServiceGrpc.getCreateTimesheetMethod) == null) {
          TimeclockServiceGrpc.getCreateTimesheetMethod = getCreateTimesheetMethod =
              io.grpc.MethodDescriptor.<io.admin.timesheet.TimesheetInput, io.admin.timesheet.Timesheet>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "createTimesheet"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.admin.timesheet.TimesheetInput.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.admin.timesheet.Timesheet.getDefaultInstance()))
              .setSchemaDescriptor(new TimeclockServiceMethodDescriptorSupplier("createTimesheet"))
              .build();
        }
      }
    }
    return getCreateTimesheetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.admin.timesheet.GetTimesheetById,
      io.admin.timesheet.Timesheet> getGetTimesheetByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getTimesheetById",
      requestType = io.admin.timesheet.GetTimesheetById.class,
      responseType = io.admin.timesheet.Timesheet.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.admin.timesheet.GetTimesheetById,
      io.admin.timesheet.Timesheet> getGetTimesheetByIdMethod() {
    io.grpc.MethodDescriptor<io.admin.timesheet.GetTimesheetById, io.admin.timesheet.Timesheet> getGetTimesheetByIdMethod;
    if ((getGetTimesheetByIdMethod = TimeclockServiceGrpc.getGetTimesheetByIdMethod) == null) {
      synchronized (TimeclockServiceGrpc.class) {
        if ((getGetTimesheetByIdMethod = TimeclockServiceGrpc.getGetTimesheetByIdMethod) == null) {
          TimeclockServiceGrpc.getGetTimesheetByIdMethod = getGetTimesheetByIdMethod =
              io.grpc.MethodDescriptor.<io.admin.timesheet.GetTimesheetById, io.admin.timesheet.Timesheet>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getTimesheetById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.admin.timesheet.GetTimesheetById.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.admin.timesheet.Timesheet.getDefaultInstance()))
              .setSchemaDescriptor(new TimeclockServiceMethodDescriptorSupplier("getTimesheetById"))
              .build();
        }
      }
    }
    return getGetTimesheetByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.admin.timesheet.UpdateTimesheet,
      io.admin.timesheet.Timesheet> getUpdateTimesheetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateTimesheet",
      requestType = io.admin.timesheet.UpdateTimesheet.class,
      responseType = io.admin.timesheet.Timesheet.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.admin.timesheet.UpdateTimesheet,
      io.admin.timesheet.Timesheet> getUpdateTimesheetMethod() {
    io.grpc.MethodDescriptor<io.admin.timesheet.UpdateTimesheet, io.admin.timesheet.Timesheet> getUpdateTimesheetMethod;
    if ((getUpdateTimesheetMethod = TimeclockServiceGrpc.getUpdateTimesheetMethod) == null) {
      synchronized (TimeclockServiceGrpc.class) {
        if ((getUpdateTimesheetMethod = TimeclockServiceGrpc.getUpdateTimesheetMethod) == null) {
          TimeclockServiceGrpc.getUpdateTimesheetMethod = getUpdateTimesheetMethod =
              io.grpc.MethodDescriptor.<io.admin.timesheet.UpdateTimesheet, io.admin.timesheet.Timesheet>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "updateTimesheet"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.admin.timesheet.UpdateTimesheet.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.admin.timesheet.Timesheet.getDefaultInstance()))
              .setSchemaDescriptor(new TimeclockServiceMethodDescriptorSupplier("updateTimesheet"))
              .build();
        }
      }
    }
    return getUpdateTimesheetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.admin.timesheet.GetTimesheetById,
      io.admin.timesheet.Timesheet> getDeleteTimesheetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteTimesheet",
      requestType = io.admin.timesheet.GetTimesheetById.class,
      responseType = io.admin.timesheet.Timesheet.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.admin.timesheet.GetTimesheetById,
      io.admin.timesheet.Timesheet> getDeleteTimesheetMethod() {
    io.grpc.MethodDescriptor<io.admin.timesheet.GetTimesheetById, io.admin.timesheet.Timesheet> getDeleteTimesheetMethod;
    if ((getDeleteTimesheetMethod = TimeclockServiceGrpc.getDeleteTimesheetMethod) == null) {
      synchronized (TimeclockServiceGrpc.class) {
        if ((getDeleteTimesheetMethod = TimeclockServiceGrpc.getDeleteTimesheetMethod) == null) {
          TimeclockServiceGrpc.getDeleteTimesheetMethod = getDeleteTimesheetMethod =
              io.grpc.MethodDescriptor.<io.admin.timesheet.GetTimesheetById, io.admin.timesheet.Timesheet>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deleteTimesheet"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.admin.timesheet.GetTimesheetById.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.admin.timesheet.Timesheet.getDefaultInstance()))
              .setSchemaDescriptor(new TimeclockServiceMethodDescriptorSupplier("deleteTimesheet"))
              .build();
        }
      }
    }
    return getDeleteTimesheetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.admin.timesheet.EmployeeTimesheetInput,
      io.admin.timesheet.EmployeeTimesheet> getCreateEmployeeTimesheetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createEmployeeTimesheet",
      requestType = io.admin.timesheet.EmployeeTimesheetInput.class,
      responseType = io.admin.timesheet.EmployeeTimesheet.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.admin.timesheet.EmployeeTimesheetInput,
      io.admin.timesheet.EmployeeTimesheet> getCreateEmployeeTimesheetMethod() {
    io.grpc.MethodDescriptor<io.admin.timesheet.EmployeeTimesheetInput, io.admin.timesheet.EmployeeTimesheet> getCreateEmployeeTimesheetMethod;
    if ((getCreateEmployeeTimesheetMethod = TimeclockServiceGrpc.getCreateEmployeeTimesheetMethod) == null) {
      synchronized (TimeclockServiceGrpc.class) {
        if ((getCreateEmployeeTimesheetMethod = TimeclockServiceGrpc.getCreateEmployeeTimesheetMethod) == null) {
          TimeclockServiceGrpc.getCreateEmployeeTimesheetMethod = getCreateEmployeeTimesheetMethod =
              io.grpc.MethodDescriptor.<io.admin.timesheet.EmployeeTimesheetInput, io.admin.timesheet.EmployeeTimesheet>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "createEmployeeTimesheet"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.admin.timesheet.EmployeeTimesheetInput.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.admin.timesheet.EmployeeTimesheet.getDefaultInstance()))
              .setSchemaDescriptor(new TimeclockServiceMethodDescriptorSupplier("createEmployeeTimesheet"))
              .build();
        }
      }
    }
    return getCreateEmployeeTimesheetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.admin.timesheet.GetEmployeeTimesheetById,
      io.admin.timesheet.EmployeeTimesheet> getGetEmployeeTimesheetByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getEmployeeTimesheetById",
      requestType = io.admin.timesheet.GetEmployeeTimesheetById.class,
      responseType = io.admin.timesheet.EmployeeTimesheet.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.admin.timesheet.GetEmployeeTimesheetById,
      io.admin.timesheet.EmployeeTimesheet> getGetEmployeeTimesheetByIdMethod() {
    io.grpc.MethodDescriptor<io.admin.timesheet.GetEmployeeTimesheetById, io.admin.timesheet.EmployeeTimesheet> getGetEmployeeTimesheetByIdMethod;
    if ((getGetEmployeeTimesheetByIdMethod = TimeclockServiceGrpc.getGetEmployeeTimesheetByIdMethod) == null) {
      synchronized (TimeclockServiceGrpc.class) {
        if ((getGetEmployeeTimesheetByIdMethod = TimeclockServiceGrpc.getGetEmployeeTimesheetByIdMethod) == null) {
          TimeclockServiceGrpc.getGetEmployeeTimesheetByIdMethod = getGetEmployeeTimesheetByIdMethod =
              io.grpc.MethodDescriptor.<io.admin.timesheet.GetEmployeeTimesheetById, io.admin.timesheet.EmployeeTimesheet>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getEmployeeTimesheetById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.admin.timesheet.GetEmployeeTimesheetById.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.admin.timesheet.EmployeeTimesheet.getDefaultInstance()))
              .setSchemaDescriptor(new TimeclockServiceMethodDescriptorSupplier("getEmployeeTimesheetById"))
              .build();
        }
      }
    }
    return getGetEmployeeTimesheetByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.admin.timesheet.EmployeeTimesheetInput,
      io.admin.timesheet.EmployeeTimesheet> getUpdateEmployeeTimesheetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateEmployeeTimesheet",
      requestType = io.admin.timesheet.EmployeeTimesheetInput.class,
      responseType = io.admin.timesheet.EmployeeTimesheet.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.admin.timesheet.EmployeeTimesheetInput,
      io.admin.timesheet.EmployeeTimesheet> getUpdateEmployeeTimesheetMethod() {
    io.grpc.MethodDescriptor<io.admin.timesheet.EmployeeTimesheetInput, io.admin.timesheet.EmployeeTimesheet> getUpdateEmployeeTimesheetMethod;
    if ((getUpdateEmployeeTimesheetMethod = TimeclockServiceGrpc.getUpdateEmployeeTimesheetMethod) == null) {
      synchronized (TimeclockServiceGrpc.class) {
        if ((getUpdateEmployeeTimesheetMethod = TimeclockServiceGrpc.getUpdateEmployeeTimesheetMethod) == null) {
          TimeclockServiceGrpc.getUpdateEmployeeTimesheetMethod = getUpdateEmployeeTimesheetMethod =
              io.grpc.MethodDescriptor.<io.admin.timesheet.EmployeeTimesheetInput, io.admin.timesheet.EmployeeTimesheet>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "updateEmployeeTimesheet"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.admin.timesheet.EmployeeTimesheetInput.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.admin.timesheet.EmployeeTimesheet.getDefaultInstance()))
              .setSchemaDescriptor(new TimeclockServiceMethodDescriptorSupplier("updateEmployeeTimesheet"))
              .build();
        }
      }
    }
    return getUpdateEmployeeTimesheetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.admin.timesheet.GetEmployeeTimesheetById,
      io.admin.timesheet.EmployeeTimesheet> getDeleteEmployeeTimesheetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteEmployeeTimesheet",
      requestType = io.admin.timesheet.GetEmployeeTimesheetById.class,
      responseType = io.admin.timesheet.EmployeeTimesheet.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.admin.timesheet.GetEmployeeTimesheetById,
      io.admin.timesheet.EmployeeTimesheet> getDeleteEmployeeTimesheetMethod() {
    io.grpc.MethodDescriptor<io.admin.timesheet.GetEmployeeTimesheetById, io.admin.timesheet.EmployeeTimesheet> getDeleteEmployeeTimesheetMethod;
    if ((getDeleteEmployeeTimesheetMethod = TimeclockServiceGrpc.getDeleteEmployeeTimesheetMethod) == null) {
      synchronized (TimeclockServiceGrpc.class) {
        if ((getDeleteEmployeeTimesheetMethod = TimeclockServiceGrpc.getDeleteEmployeeTimesheetMethod) == null) {
          TimeclockServiceGrpc.getDeleteEmployeeTimesheetMethod = getDeleteEmployeeTimesheetMethod =
              io.grpc.MethodDescriptor.<io.admin.timesheet.GetEmployeeTimesheetById, io.admin.timesheet.EmployeeTimesheet>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deleteEmployeeTimesheet"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.admin.timesheet.GetEmployeeTimesheetById.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.admin.timesheet.EmployeeTimesheet.getDefaultInstance()))
              .setSchemaDescriptor(new TimeclockServiceMethodDescriptorSupplier("deleteEmployeeTimesheet"))
              .build();
        }
      }
    }
    return getDeleteEmployeeTimesheetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.admin.timesheet.GetEmployeetDetailById,
      io.admin.timesheet.GetEmployeeTimesheets> getGetEmployeeTimesheetsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getEmployeeTimesheets",
      requestType = io.admin.timesheet.GetEmployeetDetailById.class,
      responseType = io.admin.timesheet.GetEmployeeTimesheets.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.admin.timesheet.GetEmployeetDetailById,
      io.admin.timesheet.GetEmployeeTimesheets> getGetEmployeeTimesheetsMethod() {
    io.grpc.MethodDescriptor<io.admin.timesheet.GetEmployeetDetailById, io.admin.timesheet.GetEmployeeTimesheets> getGetEmployeeTimesheetsMethod;
    if ((getGetEmployeeTimesheetsMethod = TimeclockServiceGrpc.getGetEmployeeTimesheetsMethod) == null) {
      synchronized (TimeclockServiceGrpc.class) {
        if ((getGetEmployeeTimesheetsMethod = TimeclockServiceGrpc.getGetEmployeeTimesheetsMethod) == null) {
          TimeclockServiceGrpc.getGetEmployeeTimesheetsMethod = getGetEmployeeTimesheetsMethod =
              io.grpc.MethodDescriptor.<io.admin.timesheet.GetEmployeetDetailById, io.admin.timesheet.GetEmployeeTimesheets>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getEmployeeTimesheets"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.admin.timesheet.GetEmployeetDetailById.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.admin.timesheet.GetEmployeeTimesheets.getDefaultInstance()))
              .setSchemaDescriptor(new TimeclockServiceMethodDescriptorSupplier("getEmployeeTimesheets"))
              .build();
        }
      }
    }
    return getGetEmployeeTimesheetsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TimeclockServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TimeclockServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TimeclockServiceStub>() {
        @java.lang.Override
        public TimeclockServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TimeclockServiceStub(channel, callOptions);
        }
      };
    return TimeclockServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TimeclockServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TimeclockServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TimeclockServiceBlockingStub>() {
        @java.lang.Override
        public TimeclockServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TimeclockServiceBlockingStub(channel, callOptions);
        }
      };
    return TimeclockServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TimeclockServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TimeclockServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TimeclockServiceFutureStub>() {
        @java.lang.Override
        public TimeclockServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TimeclockServiceFutureStub(channel, callOptions);
        }
      };
    return TimeclockServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class TimeclockServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *CRUD methods for User
     * </pre>
     */
    public void createUser(io.admin.timesheet.UserInput request,
        io.grpc.stub.StreamObserver<io.admin.timesheet.User> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateUserMethod(), responseObserver);
    }

    /**
     */
    public void getUserById(io.admin.timesheet.GetUserById request,
        io.grpc.stub.StreamObserver<io.admin.timesheet.User> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUserByIdMethod(), responseObserver);
    }

    /**
     */
    public void updateUser(io.admin.timesheet.UpdateUser request,
        io.grpc.stub.StreamObserver<io.admin.timesheet.User> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateUserMethod(), responseObserver);
    }

    /**
     */
    public void deleteUserById(io.admin.timesheet.GetUserById request,
        io.grpc.stub.StreamObserver<io.admin.timesheet.User> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteUserByIdMethod(), responseObserver);
    }

    /**
     * <pre>
     *CRUD methods for EmployeeDetail
     * </pre>
     */
    public void createEmployeeDetail(io.admin.timesheet.EmployeeDetailInput request,
        io.grpc.stub.StreamObserver<io.admin.timesheet.EmployeeDetail> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateEmployeeDetailMethod(), responseObserver);
    }

    /**
     */
    public void getEmployeeDetailById(io.admin.timesheet.GetEmployeetDetailById request,
        io.grpc.stub.StreamObserver<io.admin.timesheet.EmployeeDetail> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetEmployeeDetailByIdMethod(), responseObserver);
    }

    /**
     */
    public void updateEmployeeDetail(io.admin.timesheet.UpdateEmployeeDetail request,
        io.grpc.stub.StreamObserver<io.admin.timesheet.EmployeeDetail> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateEmployeeDetailMethod(), responseObserver);
    }

    /**
     */
    public void deleteEmployeeDetail(io.admin.timesheet.GetEmployeetDetailById request,
        io.grpc.stub.StreamObserver<io.admin.timesheet.EmployeeDetail> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteEmployeeDetailMethod(), responseObserver);
    }

    /**
     * <pre>
     *CRUD methods for Projects
     * </pre>
     */
    public void createProject(io.admin.timesheet.ProjectInput request,
        io.grpc.stub.StreamObserver<io.admin.timesheet.Project> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateProjectMethod(), responseObserver);
    }

    /**
     */
    public void getProjectById(io.admin.timesheet.GetProjectById request,
        io.grpc.stub.StreamObserver<io.admin.timesheet.Project> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetProjectByIdMethod(), responseObserver);
    }

    /**
     */
    public void updateProject(io.admin.timesheet.UpdateProject request,
        io.grpc.stub.StreamObserver<io.admin.timesheet.Project> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateProjectMethod(), responseObserver);
    }

    /**
     */
    public void deleteProject(io.admin.timesheet.GetProjectById request,
        io.grpc.stub.StreamObserver<io.admin.timesheet.Project> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteProjectMethod(), responseObserver);
    }

    /**
     */
    public void getProjects(io.admin.timesheet.GetEmployeetDetailById request,
        io.grpc.stub.StreamObserver<io.admin.timesheet.GetProjects> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetProjectsMethod(), responseObserver);
    }

    /**
     * <pre>
     *CRUD methods for Holiday
     * </pre>
     */
    public void createHoliday(io.admin.timesheet.HolidayInput request,
        io.grpc.stub.StreamObserver<io.admin.timesheet.Holiday> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateHolidayMethod(), responseObserver);
    }

    /**
     */
    public void getHolidayById(io.admin.timesheet.GetHolidayById request,
        io.grpc.stub.StreamObserver<io.admin.timesheet.Holiday> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetHolidayByIdMethod(), responseObserver);
    }

    /**
     */
    public void updateHoliday(io.admin.timesheet.UpdateHoliday request,
        io.grpc.stub.StreamObserver<io.admin.timesheet.Holiday> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateHolidayMethod(), responseObserver);
    }

    /**
     */
    public void deleteHoliday(io.admin.timesheet.GetHolidayById request,
        io.grpc.stub.StreamObserver<io.admin.timesheet.Holiday> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteHolidayMethod(), responseObserver);
    }

    /**
     * <pre>
     *CRUD methods for Timesheet
     * </pre>
     */
    public void createTimesheet(io.admin.timesheet.TimesheetInput request,
        io.grpc.stub.StreamObserver<io.admin.timesheet.Timesheet> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateTimesheetMethod(), responseObserver);
    }

    /**
     */
    public void getTimesheetById(io.admin.timesheet.GetTimesheetById request,
        io.grpc.stub.StreamObserver<io.admin.timesheet.Timesheet> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTimesheetByIdMethod(), responseObserver);
    }

    /**
     */
    public void updateTimesheet(io.admin.timesheet.UpdateTimesheet request,
        io.grpc.stub.StreamObserver<io.admin.timesheet.Timesheet> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateTimesheetMethod(), responseObserver);
    }

    /**
     */
    public void deleteTimesheet(io.admin.timesheet.GetTimesheetById request,
        io.grpc.stub.StreamObserver<io.admin.timesheet.Timesheet> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteTimesheetMethod(), responseObserver);
    }

    /**
     * <pre>
     *CRUD methods for EmployeeTimesheet
     * </pre>
     */
    public void createEmployeeTimesheet(io.admin.timesheet.EmployeeTimesheetInput request,
        io.grpc.stub.StreamObserver<io.admin.timesheet.EmployeeTimesheet> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateEmployeeTimesheetMethod(), responseObserver);
    }

    /**
     */
    public void getEmployeeTimesheetById(io.admin.timesheet.GetEmployeeTimesheetById request,
        io.grpc.stub.StreamObserver<io.admin.timesheet.EmployeeTimesheet> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetEmployeeTimesheetByIdMethod(), responseObserver);
    }

    /**
     */
    public void updateEmployeeTimesheet(io.admin.timesheet.EmployeeTimesheetInput request,
        io.grpc.stub.StreamObserver<io.admin.timesheet.EmployeeTimesheet> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateEmployeeTimesheetMethod(), responseObserver);
    }

    /**
     */
    public void deleteEmployeeTimesheet(io.admin.timesheet.GetEmployeeTimesheetById request,
        io.grpc.stub.StreamObserver<io.admin.timesheet.EmployeeTimesheet> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteEmployeeTimesheetMethod(), responseObserver);
    }

    /**
     */
    public void getEmployeeTimesheets(io.admin.timesheet.GetEmployeetDetailById request,
        io.grpc.stub.StreamObserver<io.admin.timesheet.GetEmployeeTimesheets> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetEmployeeTimesheetsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateUserMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                io.admin.timesheet.UserInput,
                io.admin.timesheet.User>(
                  this, METHODID_CREATE_USER)))
          .addMethod(
            getGetUserByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                io.admin.timesheet.GetUserById,
                io.admin.timesheet.User>(
                  this, METHODID_GET_USER_BY_ID)))
          .addMethod(
            getUpdateUserMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                io.admin.timesheet.UpdateUser,
                io.admin.timesheet.User>(
                  this, METHODID_UPDATE_USER)))
          .addMethod(
            getDeleteUserByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                io.admin.timesheet.GetUserById,
                io.admin.timesheet.User>(
                  this, METHODID_DELETE_USER_BY_ID)))
          .addMethod(
            getCreateEmployeeDetailMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                io.admin.timesheet.EmployeeDetailInput,
                io.admin.timesheet.EmployeeDetail>(
                  this, METHODID_CREATE_EMPLOYEE_DETAIL)))
          .addMethod(
            getGetEmployeeDetailByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                io.admin.timesheet.GetEmployeetDetailById,
                io.admin.timesheet.EmployeeDetail>(
                  this, METHODID_GET_EMPLOYEE_DETAIL_BY_ID)))
          .addMethod(
            getUpdateEmployeeDetailMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                io.admin.timesheet.UpdateEmployeeDetail,
                io.admin.timesheet.EmployeeDetail>(
                  this, METHODID_UPDATE_EMPLOYEE_DETAIL)))
          .addMethod(
            getDeleteEmployeeDetailMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                io.admin.timesheet.GetEmployeetDetailById,
                io.admin.timesheet.EmployeeDetail>(
                  this, METHODID_DELETE_EMPLOYEE_DETAIL)))
          .addMethod(
            getCreateProjectMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                io.admin.timesheet.ProjectInput,
                io.admin.timesheet.Project>(
                  this, METHODID_CREATE_PROJECT)))
          .addMethod(
            getGetProjectByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                io.admin.timesheet.GetProjectById,
                io.admin.timesheet.Project>(
                  this, METHODID_GET_PROJECT_BY_ID)))
          .addMethod(
            getUpdateProjectMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                io.admin.timesheet.UpdateProject,
                io.admin.timesheet.Project>(
                  this, METHODID_UPDATE_PROJECT)))
          .addMethod(
            getDeleteProjectMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                io.admin.timesheet.GetProjectById,
                io.admin.timesheet.Project>(
                  this, METHODID_DELETE_PROJECT)))
          .addMethod(
            getGetProjectsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                io.admin.timesheet.GetEmployeetDetailById,
                io.admin.timesheet.GetProjects>(
                  this, METHODID_GET_PROJECTS)))
          .addMethod(
            getCreateHolidayMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                io.admin.timesheet.HolidayInput,
                io.admin.timesheet.Holiday>(
                  this, METHODID_CREATE_HOLIDAY)))
          .addMethod(
            getGetHolidayByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                io.admin.timesheet.GetHolidayById,
                io.admin.timesheet.Holiday>(
                  this, METHODID_GET_HOLIDAY_BY_ID)))
          .addMethod(
            getUpdateHolidayMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                io.admin.timesheet.UpdateHoliday,
                io.admin.timesheet.Holiday>(
                  this, METHODID_UPDATE_HOLIDAY)))
          .addMethod(
            getDeleteHolidayMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                io.admin.timesheet.GetHolidayById,
                io.admin.timesheet.Holiday>(
                  this, METHODID_DELETE_HOLIDAY)))
          .addMethod(
            getCreateTimesheetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                io.admin.timesheet.TimesheetInput,
                io.admin.timesheet.Timesheet>(
                  this, METHODID_CREATE_TIMESHEET)))
          .addMethod(
            getGetTimesheetByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                io.admin.timesheet.GetTimesheetById,
                io.admin.timesheet.Timesheet>(
                  this, METHODID_GET_TIMESHEET_BY_ID)))
          .addMethod(
            getUpdateTimesheetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                io.admin.timesheet.UpdateTimesheet,
                io.admin.timesheet.Timesheet>(
                  this, METHODID_UPDATE_TIMESHEET)))
          .addMethod(
            getDeleteTimesheetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                io.admin.timesheet.GetTimesheetById,
                io.admin.timesheet.Timesheet>(
                  this, METHODID_DELETE_TIMESHEET)))
          .addMethod(
            getCreateEmployeeTimesheetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                io.admin.timesheet.EmployeeTimesheetInput,
                io.admin.timesheet.EmployeeTimesheet>(
                  this, METHODID_CREATE_EMPLOYEE_TIMESHEET)))
          .addMethod(
            getGetEmployeeTimesheetByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                io.admin.timesheet.GetEmployeeTimesheetById,
                io.admin.timesheet.EmployeeTimesheet>(
                  this, METHODID_GET_EMPLOYEE_TIMESHEET_BY_ID)))
          .addMethod(
            getUpdateEmployeeTimesheetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                io.admin.timesheet.EmployeeTimesheetInput,
                io.admin.timesheet.EmployeeTimesheet>(
                  this, METHODID_UPDATE_EMPLOYEE_TIMESHEET)))
          .addMethod(
            getDeleteEmployeeTimesheetMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                io.admin.timesheet.GetEmployeeTimesheetById,
                io.admin.timesheet.EmployeeTimesheet>(
                  this, METHODID_DELETE_EMPLOYEE_TIMESHEET)))
          .addMethod(
            getGetEmployeeTimesheetsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                io.admin.timesheet.GetEmployeetDetailById,
                io.admin.timesheet.GetEmployeeTimesheets>(
                  this, METHODID_GET_EMPLOYEE_TIMESHEETS)))
          .build();
    }
  }

  /**
   */
  public static final class TimeclockServiceStub extends io.grpc.stub.AbstractAsyncStub<TimeclockServiceStub> {
    private TimeclockServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TimeclockServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TimeclockServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     *CRUD methods for User
     * </pre>
     */
    public void createUser(io.admin.timesheet.UserInput request,
        io.grpc.stub.StreamObserver<io.admin.timesheet.User> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getUserById(io.admin.timesheet.GetUserById request,
        io.grpc.stub.StreamObserver<io.admin.timesheet.User> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetUserByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateUser(io.admin.timesheet.UpdateUser request,
        io.grpc.stub.StreamObserver<io.admin.timesheet.User> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteUserById(io.admin.timesheet.GetUserById request,
        io.grpc.stub.StreamObserver<io.admin.timesheet.User> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteUserByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *CRUD methods for EmployeeDetail
     * </pre>
     */
    public void createEmployeeDetail(io.admin.timesheet.EmployeeDetailInput request,
        io.grpc.stub.StreamObserver<io.admin.timesheet.EmployeeDetail> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateEmployeeDetailMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getEmployeeDetailById(io.admin.timesheet.GetEmployeetDetailById request,
        io.grpc.stub.StreamObserver<io.admin.timesheet.EmployeeDetail> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetEmployeeDetailByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateEmployeeDetail(io.admin.timesheet.UpdateEmployeeDetail request,
        io.grpc.stub.StreamObserver<io.admin.timesheet.EmployeeDetail> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateEmployeeDetailMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteEmployeeDetail(io.admin.timesheet.GetEmployeetDetailById request,
        io.grpc.stub.StreamObserver<io.admin.timesheet.EmployeeDetail> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteEmployeeDetailMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *CRUD methods for Projects
     * </pre>
     */
    public void createProject(io.admin.timesheet.ProjectInput request,
        io.grpc.stub.StreamObserver<io.admin.timesheet.Project> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateProjectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getProjectById(io.admin.timesheet.GetProjectById request,
        io.grpc.stub.StreamObserver<io.admin.timesheet.Project> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetProjectByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateProject(io.admin.timesheet.UpdateProject request,
        io.grpc.stub.StreamObserver<io.admin.timesheet.Project> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateProjectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteProject(io.admin.timesheet.GetProjectById request,
        io.grpc.stub.StreamObserver<io.admin.timesheet.Project> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteProjectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getProjects(io.admin.timesheet.GetEmployeetDetailById request,
        io.grpc.stub.StreamObserver<io.admin.timesheet.GetProjects> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetProjectsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *CRUD methods for Holiday
     * </pre>
     */
    public void createHoliday(io.admin.timesheet.HolidayInput request,
        io.grpc.stub.StreamObserver<io.admin.timesheet.Holiday> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateHolidayMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getHolidayById(io.admin.timesheet.GetHolidayById request,
        io.grpc.stub.StreamObserver<io.admin.timesheet.Holiday> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetHolidayByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateHoliday(io.admin.timesheet.UpdateHoliday request,
        io.grpc.stub.StreamObserver<io.admin.timesheet.Holiday> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateHolidayMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteHoliday(io.admin.timesheet.GetHolidayById request,
        io.grpc.stub.StreamObserver<io.admin.timesheet.Holiday> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteHolidayMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *CRUD methods for Timesheet
     * </pre>
     */
    public void createTimesheet(io.admin.timesheet.TimesheetInput request,
        io.grpc.stub.StreamObserver<io.admin.timesheet.Timesheet> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateTimesheetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTimesheetById(io.admin.timesheet.GetTimesheetById request,
        io.grpc.stub.StreamObserver<io.admin.timesheet.Timesheet> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTimesheetByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateTimesheet(io.admin.timesheet.UpdateTimesheet request,
        io.grpc.stub.StreamObserver<io.admin.timesheet.Timesheet> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateTimesheetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteTimesheet(io.admin.timesheet.GetTimesheetById request,
        io.grpc.stub.StreamObserver<io.admin.timesheet.Timesheet> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteTimesheetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *CRUD methods for EmployeeTimesheet
     * </pre>
     */
    public void createEmployeeTimesheet(io.admin.timesheet.EmployeeTimesheetInput request,
        io.grpc.stub.StreamObserver<io.admin.timesheet.EmployeeTimesheet> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateEmployeeTimesheetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getEmployeeTimesheetById(io.admin.timesheet.GetEmployeeTimesheetById request,
        io.grpc.stub.StreamObserver<io.admin.timesheet.EmployeeTimesheet> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetEmployeeTimesheetByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateEmployeeTimesheet(io.admin.timesheet.EmployeeTimesheetInput request,
        io.grpc.stub.StreamObserver<io.admin.timesheet.EmployeeTimesheet> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateEmployeeTimesheetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteEmployeeTimesheet(io.admin.timesheet.GetEmployeeTimesheetById request,
        io.grpc.stub.StreamObserver<io.admin.timesheet.EmployeeTimesheet> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteEmployeeTimesheetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getEmployeeTimesheets(io.admin.timesheet.GetEmployeetDetailById request,
        io.grpc.stub.StreamObserver<io.admin.timesheet.GetEmployeeTimesheets> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetEmployeeTimesheetsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class TimeclockServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<TimeclockServiceBlockingStub> {
    private TimeclockServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TimeclockServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TimeclockServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *CRUD methods for User
     * </pre>
     */
    public io.admin.timesheet.User createUser(io.admin.timesheet.UserInput request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.admin.timesheet.User getUserById(io.admin.timesheet.GetUserById request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetUserByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.admin.timesheet.User updateUser(io.admin.timesheet.UpdateUser request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.admin.timesheet.User deleteUserById(io.admin.timesheet.GetUserById request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteUserByIdMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *CRUD methods for EmployeeDetail
     * </pre>
     */
    public io.admin.timesheet.EmployeeDetail createEmployeeDetail(io.admin.timesheet.EmployeeDetailInput request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateEmployeeDetailMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.admin.timesheet.EmployeeDetail getEmployeeDetailById(io.admin.timesheet.GetEmployeetDetailById request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetEmployeeDetailByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.admin.timesheet.EmployeeDetail updateEmployeeDetail(io.admin.timesheet.UpdateEmployeeDetail request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateEmployeeDetailMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.admin.timesheet.EmployeeDetail deleteEmployeeDetail(io.admin.timesheet.GetEmployeetDetailById request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteEmployeeDetailMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *CRUD methods for Projects
     * </pre>
     */
    public io.admin.timesheet.Project createProject(io.admin.timesheet.ProjectInput request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateProjectMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.admin.timesheet.Project getProjectById(io.admin.timesheet.GetProjectById request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetProjectByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.admin.timesheet.Project updateProject(io.admin.timesheet.UpdateProject request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateProjectMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.admin.timesheet.Project deleteProject(io.admin.timesheet.GetProjectById request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteProjectMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.admin.timesheet.GetProjects getProjects(io.admin.timesheet.GetEmployeetDetailById request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetProjectsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *CRUD methods for Holiday
     * </pre>
     */
    public io.admin.timesheet.Holiday createHoliday(io.admin.timesheet.HolidayInput request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateHolidayMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.admin.timesheet.Holiday getHolidayById(io.admin.timesheet.GetHolidayById request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetHolidayByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.admin.timesheet.Holiday updateHoliday(io.admin.timesheet.UpdateHoliday request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateHolidayMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.admin.timesheet.Holiday deleteHoliday(io.admin.timesheet.GetHolidayById request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteHolidayMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *CRUD methods for Timesheet
     * </pre>
     */
    public io.admin.timesheet.Timesheet createTimesheet(io.admin.timesheet.TimesheetInput request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateTimesheetMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.admin.timesheet.Timesheet getTimesheetById(io.admin.timesheet.GetTimesheetById request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTimesheetByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.admin.timesheet.Timesheet updateTimesheet(io.admin.timesheet.UpdateTimesheet request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateTimesheetMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.admin.timesheet.Timesheet deleteTimesheet(io.admin.timesheet.GetTimesheetById request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteTimesheetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *CRUD methods for EmployeeTimesheet
     * </pre>
     */
    public io.admin.timesheet.EmployeeTimesheet createEmployeeTimesheet(io.admin.timesheet.EmployeeTimesheetInput request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateEmployeeTimesheetMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.admin.timesheet.EmployeeTimesheet getEmployeeTimesheetById(io.admin.timesheet.GetEmployeeTimesheetById request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetEmployeeTimesheetByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.admin.timesheet.EmployeeTimesheet updateEmployeeTimesheet(io.admin.timesheet.EmployeeTimesheetInput request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateEmployeeTimesheetMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.admin.timesheet.EmployeeTimesheet deleteEmployeeTimesheet(io.admin.timesheet.GetEmployeeTimesheetById request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteEmployeeTimesheetMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.admin.timesheet.GetEmployeeTimesheets getEmployeeTimesheets(io.admin.timesheet.GetEmployeetDetailById request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetEmployeeTimesheetsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class TimeclockServiceFutureStub extends io.grpc.stub.AbstractFutureStub<TimeclockServiceFutureStub> {
    private TimeclockServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TimeclockServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TimeclockServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *CRUD methods for User
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.admin.timesheet.User> createUser(
        io.admin.timesheet.UserInput request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.admin.timesheet.User> getUserById(
        io.admin.timesheet.GetUserById request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetUserByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.admin.timesheet.User> updateUser(
        io.admin.timesheet.UpdateUser request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.admin.timesheet.User> deleteUserById(
        io.admin.timesheet.GetUserById request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteUserByIdMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *CRUD methods for EmployeeDetail
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.admin.timesheet.EmployeeDetail> createEmployeeDetail(
        io.admin.timesheet.EmployeeDetailInput request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateEmployeeDetailMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.admin.timesheet.EmployeeDetail> getEmployeeDetailById(
        io.admin.timesheet.GetEmployeetDetailById request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetEmployeeDetailByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.admin.timesheet.EmployeeDetail> updateEmployeeDetail(
        io.admin.timesheet.UpdateEmployeeDetail request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateEmployeeDetailMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.admin.timesheet.EmployeeDetail> deleteEmployeeDetail(
        io.admin.timesheet.GetEmployeetDetailById request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteEmployeeDetailMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *CRUD methods for Projects
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.admin.timesheet.Project> createProject(
        io.admin.timesheet.ProjectInput request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateProjectMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.admin.timesheet.Project> getProjectById(
        io.admin.timesheet.GetProjectById request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetProjectByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.admin.timesheet.Project> updateProject(
        io.admin.timesheet.UpdateProject request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateProjectMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.admin.timesheet.Project> deleteProject(
        io.admin.timesheet.GetProjectById request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteProjectMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.admin.timesheet.GetProjects> getProjects(
        io.admin.timesheet.GetEmployeetDetailById request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetProjectsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *CRUD methods for Holiday
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.admin.timesheet.Holiday> createHoliday(
        io.admin.timesheet.HolidayInput request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateHolidayMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.admin.timesheet.Holiday> getHolidayById(
        io.admin.timesheet.GetHolidayById request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetHolidayByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.admin.timesheet.Holiday> updateHoliday(
        io.admin.timesheet.UpdateHoliday request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateHolidayMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.admin.timesheet.Holiday> deleteHoliday(
        io.admin.timesheet.GetHolidayById request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteHolidayMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *CRUD methods for Timesheet
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.admin.timesheet.Timesheet> createTimesheet(
        io.admin.timesheet.TimesheetInput request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateTimesheetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.admin.timesheet.Timesheet> getTimesheetById(
        io.admin.timesheet.GetTimesheetById request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTimesheetByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.admin.timesheet.Timesheet> updateTimesheet(
        io.admin.timesheet.UpdateTimesheet request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateTimesheetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.admin.timesheet.Timesheet> deleteTimesheet(
        io.admin.timesheet.GetTimesheetById request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteTimesheetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *CRUD methods for EmployeeTimesheet
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.admin.timesheet.EmployeeTimesheet> createEmployeeTimesheet(
        io.admin.timesheet.EmployeeTimesheetInput request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateEmployeeTimesheetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.admin.timesheet.EmployeeTimesheet> getEmployeeTimesheetById(
        io.admin.timesheet.GetEmployeeTimesheetById request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetEmployeeTimesheetByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.admin.timesheet.EmployeeTimesheet> updateEmployeeTimesheet(
        io.admin.timesheet.EmployeeTimesheetInput request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateEmployeeTimesheetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.admin.timesheet.EmployeeTimesheet> deleteEmployeeTimesheet(
        io.admin.timesheet.GetEmployeeTimesheetById request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteEmployeeTimesheetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.admin.timesheet.GetEmployeeTimesheets> getEmployeeTimesheets(
        io.admin.timesheet.GetEmployeetDetailById request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetEmployeeTimesheetsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_USER = 0;
  private static final int METHODID_GET_USER_BY_ID = 1;
  private static final int METHODID_UPDATE_USER = 2;
  private static final int METHODID_DELETE_USER_BY_ID = 3;
  private static final int METHODID_CREATE_EMPLOYEE_DETAIL = 4;
  private static final int METHODID_GET_EMPLOYEE_DETAIL_BY_ID = 5;
  private static final int METHODID_UPDATE_EMPLOYEE_DETAIL = 6;
  private static final int METHODID_DELETE_EMPLOYEE_DETAIL = 7;
  private static final int METHODID_CREATE_PROJECT = 8;
  private static final int METHODID_GET_PROJECT_BY_ID = 9;
  private static final int METHODID_UPDATE_PROJECT = 10;
  private static final int METHODID_DELETE_PROJECT = 11;
  private static final int METHODID_GET_PROJECTS = 12;
  private static final int METHODID_CREATE_HOLIDAY = 13;
  private static final int METHODID_GET_HOLIDAY_BY_ID = 14;
  private static final int METHODID_UPDATE_HOLIDAY = 15;
  private static final int METHODID_DELETE_HOLIDAY = 16;
  private static final int METHODID_CREATE_TIMESHEET = 17;
  private static final int METHODID_GET_TIMESHEET_BY_ID = 18;
  private static final int METHODID_UPDATE_TIMESHEET = 19;
  private static final int METHODID_DELETE_TIMESHEET = 20;
  private static final int METHODID_CREATE_EMPLOYEE_TIMESHEET = 21;
  private static final int METHODID_GET_EMPLOYEE_TIMESHEET_BY_ID = 22;
  private static final int METHODID_UPDATE_EMPLOYEE_TIMESHEET = 23;
  private static final int METHODID_DELETE_EMPLOYEE_TIMESHEET = 24;
  private static final int METHODID_GET_EMPLOYEE_TIMESHEETS = 25;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TimeclockServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TimeclockServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_USER:
          serviceImpl.createUser((io.admin.timesheet.UserInput) request,
              (io.grpc.stub.StreamObserver<io.admin.timesheet.User>) responseObserver);
          break;
        case METHODID_GET_USER_BY_ID:
          serviceImpl.getUserById((io.admin.timesheet.GetUserById) request,
              (io.grpc.stub.StreamObserver<io.admin.timesheet.User>) responseObserver);
          break;
        case METHODID_UPDATE_USER:
          serviceImpl.updateUser((io.admin.timesheet.UpdateUser) request,
              (io.grpc.stub.StreamObserver<io.admin.timesheet.User>) responseObserver);
          break;
        case METHODID_DELETE_USER_BY_ID:
          serviceImpl.deleteUserById((io.admin.timesheet.GetUserById) request,
              (io.grpc.stub.StreamObserver<io.admin.timesheet.User>) responseObserver);
          break;
        case METHODID_CREATE_EMPLOYEE_DETAIL:
          serviceImpl.createEmployeeDetail((io.admin.timesheet.EmployeeDetailInput) request,
              (io.grpc.stub.StreamObserver<io.admin.timesheet.EmployeeDetail>) responseObserver);
          break;
        case METHODID_GET_EMPLOYEE_DETAIL_BY_ID:
          serviceImpl.getEmployeeDetailById((io.admin.timesheet.GetEmployeetDetailById) request,
              (io.grpc.stub.StreamObserver<io.admin.timesheet.EmployeeDetail>) responseObserver);
          break;
        case METHODID_UPDATE_EMPLOYEE_DETAIL:
          serviceImpl.updateEmployeeDetail((io.admin.timesheet.UpdateEmployeeDetail) request,
              (io.grpc.stub.StreamObserver<io.admin.timesheet.EmployeeDetail>) responseObserver);
          break;
        case METHODID_DELETE_EMPLOYEE_DETAIL:
          serviceImpl.deleteEmployeeDetail((io.admin.timesheet.GetEmployeetDetailById) request,
              (io.grpc.stub.StreamObserver<io.admin.timesheet.EmployeeDetail>) responseObserver);
          break;
        case METHODID_CREATE_PROJECT:
          serviceImpl.createProject((io.admin.timesheet.ProjectInput) request,
              (io.grpc.stub.StreamObserver<io.admin.timesheet.Project>) responseObserver);
          break;
        case METHODID_GET_PROJECT_BY_ID:
          serviceImpl.getProjectById((io.admin.timesheet.GetProjectById) request,
              (io.grpc.stub.StreamObserver<io.admin.timesheet.Project>) responseObserver);
          break;
        case METHODID_UPDATE_PROJECT:
          serviceImpl.updateProject((io.admin.timesheet.UpdateProject) request,
              (io.grpc.stub.StreamObserver<io.admin.timesheet.Project>) responseObserver);
          break;
        case METHODID_DELETE_PROJECT:
          serviceImpl.deleteProject((io.admin.timesheet.GetProjectById) request,
              (io.grpc.stub.StreamObserver<io.admin.timesheet.Project>) responseObserver);
          break;
        case METHODID_GET_PROJECTS:
          serviceImpl.getProjects((io.admin.timesheet.GetEmployeetDetailById) request,
              (io.grpc.stub.StreamObserver<io.admin.timesheet.GetProjects>) responseObserver);
          break;
        case METHODID_CREATE_HOLIDAY:
          serviceImpl.createHoliday((io.admin.timesheet.HolidayInput) request,
              (io.grpc.stub.StreamObserver<io.admin.timesheet.Holiday>) responseObserver);
          break;
        case METHODID_GET_HOLIDAY_BY_ID:
          serviceImpl.getHolidayById((io.admin.timesheet.GetHolidayById) request,
              (io.grpc.stub.StreamObserver<io.admin.timesheet.Holiday>) responseObserver);
          break;
        case METHODID_UPDATE_HOLIDAY:
          serviceImpl.updateHoliday((io.admin.timesheet.UpdateHoliday) request,
              (io.grpc.stub.StreamObserver<io.admin.timesheet.Holiday>) responseObserver);
          break;
        case METHODID_DELETE_HOLIDAY:
          serviceImpl.deleteHoliday((io.admin.timesheet.GetHolidayById) request,
              (io.grpc.stub.StreamObserver<io.admin.timesheet.Holiday>) responseObserver);
          break;
        case METHODID_CREATE_TIMESHEET:
          serviceImpl.createTimesheet((io.admin.timesheet.TimesheetInput) request,
              (io.grpc.stub.StreamObserver<io.admin.timesheet.Timesheet>) responseObserver);
          break;
        case METHODID_GET_TIMESHEET_BY_ID:
          serviceImpl.getTimesheetById((io.admin.timesheet.GetTimesheetById) request,
              (io.grpc.stub.StreamObserver<io.admin.timesheet.Timesheet>) responseObserver);
          break;
        case METHODID_UPDATE_TIMESHEET:
          serviceImpl.updateTimesheet((io.admin.timesheet.UpdateTimesheet) request,
              (io.grpc.stub.StreamObserver<io.admin.timesheet.Timesheet>) responseObserver);
          break;
        case METHODID_DELETE_TIMESHEET:
          serviceImpl.deleteTimesheet((io.admin.timesheet.GetTimesheetById) request,
              (io.grpc.stub.StreamObserver<io.admin.timesheet.Timesheet>) responseObserver);
          break;
        case METHODID_CREATE_EMPLOYEE_TIMESHEET:
          serviceImpl.createEmployeeTimesheet((io.admin.timesheet.EmployeeTimesheetInput) request,
              (io.grpc.stub.StreamObserver<io.admin.timesheet.EmployeeTimesheet>) responseObserver);
          break;
        case METHODID_GET_EMPLOYEE_TIMESHEET_BY_ID:
          serviceImpl.getEmployeeTimesheetById((io.admin.timesheet.GetEmployeeTimesheetById) request,
              (io.grpc.stub.StreamObserver<io.admin.timesheet.EmployeeTimesheet>) responseObserver);
          break;
        case METHODID_UPDATE_EMPLOYEE_TIMESHEET:
          serviceImpl.updateEmployeeTimesheet((io.admin.timesheet.EmployeeTimesheetInput) request,
              (io.grpc.stub.StreamObserver<io.admin.timesheet.EmployeeTimesheet>) responseObserver);
          break;
        case METHODID_DELETE_EMPLOYEE_TIMESHEET:
          serviceImpl.deleteEmployeeTimesheet((io.admin.timesheet.GetEmployeeTimesheetById) request,
              (io.grpc.stub.StreamObserver<io.admin.timesheet.EmployeeTimesheet>) responseObserver);
          break;
        case METHODID_GET_EMPLOYEE_TIMESHEETS:
          serviceImpl.getEmployeeTimesheets((io.admin.timesheet.GetEmployeetDetailById) request,
              (io.grpc.stub.StreamObserver<io.admin.timesheet.GetEmployeeTimesheets>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class TimeclockServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TimeclockServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.admin.timesheet.Timeclock.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TimeclockService");
    }
  }

  private static final class TimeclockServiceFileDescriptorSupplier
      extends TimeclockServiceBaseDescriptorSupplier {
    TimeclockServiceFileDescriptorSupplier() {}
  }

  private static final class TimeclockServiceMethodDescriptorSupplier
      extends TimeclockServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TimeclockServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (TimeclockServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TimeclockServiceFileDescriptorSupplier())
              .addMethod(getCreateUserMethod())
              .addMethod(getGetUserByIdMethod())
              .addMethod(getUpdateUserMethod())
              .addMethod(getDeleteUserByIdMethod())
              .addMethod(getCreateEmployeeDetailMethod())
              .addMethod(getGetEmployeeDetailByIdMethod())
              .addMethod(getUpdateEmployeeDetailMethod())
              .addMethod(getDeleteEmployeeDetailMethod())
              .addMethod(getCreateProjectMethod())
              .addMethod(getGetProjectByIdMethod())
              .addMethod(getUpdateProjectMethod())
              .addMethod(getDeleteProjectMethod())
              .addMethod(getGetProjectsMethod())
              .addMethod(getCreateHolidayMethod())
              .addMethod(getGetHolidayByIdMethod())
              .addMethod(getUpdateHolidayMethod())
              .addMethod(getDeleteHolidayMethod())
              .addMethod(getCreateTimesheetMethod())
              .addMethod(getGetTimesheetByIdMethod())
              .addMethod(getUpdateTimesheetMethod())
              .addMethod(getDeleteTimesheetMethod())
              .addMethod(getCreateEmployeeTimesheetMethod())
              .addMethod(getGetEmployeeTimesheetByIdMethod())
              .addMethod(getUpdateEmployeeTimesheetMethod())
              .addMethod(getDeleteEmployeeTimesheetMethod())
              .addMethod(getGetEmployeeTimesheetsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
