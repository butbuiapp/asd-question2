**POST: http://localhost:8080/api/v1/employees**
```
{
  "name": "John Doe",
  "email": "john.doe@example.com",
  "phone": "1234567890",
  "hireDate": "2024-01-10"
}
```
**Response**
```
{
  "id": 1,
  "name": "John Doe",
  "email": "john.doe@example.com",
  "phone": "1234567890",
  "hireDate": "2024-01-10",
  "services": [ ]
}
```
**POST: http://localhost:8080/api/v1/services**
```
{
  "employeeId": 1,
  "serviceName": "Oil Change",
  "cost": 120.00,
  "vehicleType": "Motorcycle"
}
```
**Response**
```
{
    "id": 1,
    "serviceName": "Oil Change",
    "cost": 120.0,
    "vehicleType": "Motorcycle"
}
```
**GET: http://localhost:8080/api/v1/employees**
**Response**
```
[
    {
        "id": 1,
        "name": "John Doe",
        "email": "john.newemail@example.com",
        "phone": "0987654321",
        "hireDate": "2024-01-10",
        "services": [
            {
                "id": 1,
                "serviceName": "Oil Change",
                "cost": 120.0,
                "vehicleType": "Motorcycle"
            }
        ]
    }
]
```

**POST: http://localhost:8080/api/v1/services**
```
{
  "employeeId": 1,
  "serviceName": "Tire Replacement",
  "cost": 180.50,
  "vehicleType": "Truck"
}
```

**Response**
{
    "id": 2,
    "serviceName": "Tire Replacement",
    "cost": 180.5,
    "vehicleType": "Truck"
}

**GET: http://localhost:8080/api/v1/employees/1**
**Response**
```
{
    "id": 1,
    "name": "John Doe",
    "email": "john.doe@example.com",
    "phone": "1234567890",
    "hireDate": "2024-01-10",
    "services": [
        {
            "id": 1,
            "serviceName": "Oil Change",
            "cost": 120.0,
            "vehicleType": "Motorcycle"
        },
        {
            "id": 2,
            "serviceName": "Tire Replacement",
            "cost": 180.5,
            "vehicleType": "Truck"
        }
    ]
}
```

**GET: http://localhost:8080/api/v1/employees**
**Response**
```
[
    {
        "id": 1,
        "name": "John Doe",
        "email": "john.doe@example.com",
        "phone": "1234567890",
        "hireDate": "2024-01-10",
        "services": [
            {
                "id": 1,
                "serviceName": "Oil Change",
                "cost": 120.0,
                "vehicleType": "Motorcycle"
            },
            {
                "id": 2,
                "serviceName": "Tire Replacement",
                "cost": 180.5,
                "vehicleType": "Truck"
            }
        ]
    }
]
```

**PATCH: http://localhost:8080/api/v1/employees/1**
```
{
  "email": "john.newemail@example.com",
  "phone": "0987654321"
}
```
**Response:**
```
{
    "id": 1,
    "name": "John Doe",
    "email": "john.newemail@example.com",
    "phone": "0987654321",
    "hireDate": "2024-01-10",
    "services": [
        {
            "id": 1,
            "serviceName": "Oil Change",
            "cost": 120.0,
            "vehicleType": "Motorcycle"
        },
        {
            "id": 2,
            "serviceName": "Tire Replacement",
            "cost": 180.5,
            "vehicleType": "Truck"
        }
    ]
}
```

![Create employee](https://github.com/user-attachments/assets/541d88df-41cf-4967-9941-39a4aa0eb761)

![Assign 1st service](https://github.com/user-attachments/assets/707a95bd-7d2e-4020-95e2-61089101642c)

![Get all employees 1](https://github.com/user-attachments/assets/bb8cd3a7-1b2a-4603-8cca-68bc2140a9df)

![Assign 2nd service](https://github.com/user-attachments/assets/97045163-fe05-4bef-abc0-5846d1a563cf)

![Get employee by id](https://github.com/user-attachments/assets/44d2e47b-c0a2-4516-bfa7-44f846507a9d)

![Get all employees 2](https://github.com/user-attachments/assets/735e130c-f397-42ba-8c7f-180c2ecaf53a)

![Update employee](https://github.com/user-attachments/assets/4627d2d9-382a-46bb-8246-bc40329adc6d)






