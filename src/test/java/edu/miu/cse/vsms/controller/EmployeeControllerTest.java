package edu.miu.cse.vsms.controller;

import edu.miu.cse.vsms.dto.request.EmployeeRequestDto;
import edu.miu.cse.vsms.dto.response.EmployeeResponseDto;
import edu.miu.cse.vsms.service.EmployeeService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.time.LocalDate;
import java.util.ArrayList;

@WebMvcTest(controllers = EmployeeController.class)
class EmployeeControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private EmployeeService employeeService;

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void addEmployee_created() throws Exception {
        // input
        EmployeeRequestDto request = new EmployeeRequestDto(
                "John Doe",
                "john.doe@example.com",
                "1234567890",
                LocalDate.of(2024, 1, 10)
        );
        // expected
        EmployeeResponseDto response =  new EmployeeResponseDto(
                1L,
                "John Doe",
                "john.doe@example.com",
                "1234567890",
                LocalDate.of(2024,1,10),
                new ArrayList<>()
        );

        // mock
        Mockito.when(employeeService.addEmployee(request)).thenReturn(response);

        // test
        mockMvc.perform(
                MockMvcRequestBuilders.post("/api/v1/employees")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{\n" +
                                "\t\"name\":\"John Doe\",\n" +
                                "\t\"email\":\"john.doe@example.com\",\n" +
                                "\t\"phone\":\"123456789\",\n" +
                                "\t\"hireDate\":\"2024-01-10\"\n" +
                                "}"))
                .andExpect(MockMvcResultMatchers.status().isCreated());
//                .andExpect(MockMvcResultMatchers.content().json("{\n" +
//                        "\t\"name\":\"John Doe\",\n" +
//                        "\t\"email\":\"john.doe@example.com\",\n" +
//                        "\t\"phone\":\"123456789\",\n" +
//                        "\t\"hireDate\":\"2024-01-10\",\n" +
//                        "\t\"services\":[]\n" +
//                        "}"))
//                .andDo(MockMvcResultHandlers.print());
    }
}