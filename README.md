# Quarkus REST vs gRPC Comparison Project

This project demonstrates both REST and gRPC APIs using Quarkus with an H2 database for easy comparison when migrating from REST to gRPC.

## Features

- **User Entity**: Simple user with ID, name, and age
- **H2 Database**: In-memory database for local development
- **REST API**: Traditional HTTP/JSON endpoints
- **gRPC API**: High-performance RPC endpoints
- **Panache ORM**: Simplified database operations

## Running the Application

```bash
./mvnw quarkus:dev
```

The application will start with:
- REST API: http://localhost:8080
- Swagger UI: http://localhost:8080/q/swagger-ui
- OpenAPI Spec: http://localhost:8080/q/openapi
- gRPC API: localhost:9000

## API Endpoints

### REST API (Port 8080)

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | `/api/users` | Get all users |
| GET | `/api/users/{id}` | Get user by ID |
| POST | `/api/users` | Create new user |
| PUT | `/api/users/{id}` | Update user |
| DELETE | `/api/users/{id}` | Delete user |

### gRPC API (Port 9000)

| Method | Description |
|--------|-------------|
| CreateUser | Create new user |
| GetUser | Get user by ID |
| GetAllUsers | Get all users |
| UpdateUser | Update user |
| DeleteUser | Delete user |

## Testing with cURL (REST API)

### Create a user
```bash
curl -X POST http://localhost:8080/api/users \
  -H "Content-Type: application/json" \
  -d '{"name": "John Doe", "age": 30}'
```

### Get all users
```bash
curl http://localhost:8080/api/users
```

### Get user by ID
```bash
curl http://localhost:8080/api/users/1
```

### Update user
```bash
curl -X PUT http://localhost:8080/api/users/1 \
  -H "Content-Type: application/json" \
  -d '{"name": "Jane Doe", "age": 25}'
```

### Delete user
```bash
curl -X DELETE http://localhost:8080/api/users/1
```

## Testing with grpcurl (gRPC API)

First, install grpcurl:
```bash
# On macOS
brew install grpcurl

# On Linux
go install github.com/fullstorydev/grpcurl/cmd/grpcurl@latest
```

### List available services
```bash
grpcurl -plaintext localhost:9000 list
```

### Create a user
```bash
grpcurl -plaintext -d '{"name": "John Doe", "age": 30}' \
  localhost:9000 user.UserService/CreateUser
```

### Get all users
```bash
grpcurl -plaintext -d '{}' \
  localhost:9000 user.UserService/GetAllUsers
```

### Get user by ID
```bash
grpcurl -plaintext -d '{"id": 1}' \
  localhost:9000 user.UserService/GetUser
```

### Update user
```bash
grpcurl -plaintext -d '{"id": 1, "name": "Jane Doe", "age": 25}' \
  localhost:9000 user.UserService/UpdateUser
```

### Delete user
```bash
grpcurl -plaintext -d '{"id": 1}' \
  localhost:9000 user.UserService/DeleteUser
```

## Testing with Swagger UI (REST API)

The easiest way to test the REST API is through the built-in Swagger UI:

1. Start the application: `./mvnw quarkus:dev`
2. Open your browser and go to: http://localhost:8080/q/swagger-ui
3. You'll see all the REST endpoints with interactive forms
4. Click "Try it out" on any endpoint to test it directly
5. For POST/PUT operations, use JSON like:
   ```json
   {
     "name": "John Doe",
     "age": 30
   }
   ```

The Swagger UI provides:
- Interactive API documentation
- Request/response examples
- Easy testing without writing cURL commands
- Schema validation
- Response previews

## Testing with Postman

### REST API
1. Import the REST endpoints using the base URL: `http://localhost:8080`
2. Use standard HTTP methods with JSON payloads
3. Or import the OpenAPI spec from: http://localhost:8080/q/openapi

### gRPC API
1. Create a new gRPC request in Postman
2. Set server URL to `localhost:9000`
3. Import the proto file from `src/main/proto/user.proto`
4. Use the service methods with appropriate JSON payloads

## Key Differences: REST vs gRPC

| Aspect | REST | gRPC |
|--------|------|------|
| Protocol | HTTP/1.1 or HTTP/2 | HTTP/2 |
| Data Format | JSON | Protocol Buffers |
| Schema | OpenAPI/Swagger | Proto files |
| Performance | Good | Better (binary, multiplexing) |
| Browser Support | Native | Requires proxy |
| Tooling | Widespread | Growing |
| Learning Curve | Low | Medium |

## Performance Comparison

You can use tools like Apache Bench or wrk to compare performance:

```bash
# REST API benchmark
ab -n 1000 -c 10 http://localhost:8080/api/users

# For gRPC, use ghz (gRPC benchmarking tool)
ghz --insecure --proto src/main/proto/user.proto \
  --call user.UserService.GetAllUsers \
  --data '{}' \
  localhost:9000
```

This setup gives you a direct comparison between REST and gRPC implementations with identical functionality, making it easy to evaluate the benefits of migrating to gRPC in your company's codebase.