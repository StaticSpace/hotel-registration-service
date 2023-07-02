package com.warphotel.registration.controller;

import com.warphotel.registration.dto.RequestUserDTO;
import com.warphotel.registration.dto.RequstLoginPasswordDTO;
import com.warphotel.registration.dto.ResponseUserDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1")
public class RegistrationControllerV1 {

    @GetMapping(value = "/user", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.TEXT_PLAIN_VALUE)
    public ResponseEntity<ResponseUserDTO> getUser(@RequestParam(name = "id", required = true) final Long id) {
        return ResponseEntity.status(HttpStatus.OK)
                .contentType(MediaType.APPLICATION_JSON)
                .header("HEADER-NAME", "HEADER-VALUE")
                .body(ResponseUserDTO.builder()
                        .build());
    }

    @GetMapping(value = "/users", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.TEXT_PLAIN_VALUE)
    public ResponseEntity<List<ResponseUserDTO>> getUsers(@RequestParam(name = "size", required = true) final Long size) {
        return ResponseEntity.status(HttpStatus.OK)
                .contentType(MediaType.APPLICATION_JSON)
                .header("HEADER-NAME", "HEADER-VALUE")
                .body(List.of(ResponseUserDTO.builder()
                        .build()));
    }

    @PostMapping(value = "/user", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Long> createNewUser(@RequestBody(required = true) final RequestUserDTO requestUserDTO) {
        return ResponseEntity.status(HttpStatus.OK)
                .contentType(MediaType.APPLICATION_JSON)
                .header("HEADER-NAME", "HEADER-VALUE")
                .body(0L);
    }

    @PostMapping(value = "/user-pass", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<HttpStatus> getUserByLoginAndPassword(@RequestBody(required = true) final RequstLoginPasswordDTO requstLoginPasswordDTO) {
        return ResponseEntity.status(HttpStatus.OK).build();
    }

    @PostMapping(value = "/user/change-pass")
    public String changeUserPassword() {
        return "Change your passwotd bitch";
    }

    @PostMapping(value = "/user/reset-pass")
    public String resetUserPassword() {
        return "reset your password bitch";
    }

    @PutMapping(value = "/user/{id}")
    public String updateUser() {
        return "You updated bitch";
    }

    @PatchMapping(value = "/user/{id}/role/assing")
    public String assingUserRole() {
        return "add role to you bitch";
    }

    @PatchMapping(value = "/user/{id}/role/drop")
    public String dropUserRole() {
        return "role dropped from you bitch";
    }

    @PatchMapping(value = "/user/change-pass-by-link")
    public String changePassByLink() {
        return "your pass changed bitch";
    }

    @DeleteMapping(value = "/user/{id}", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.TEXT_PLAIN_VALUE)
    public ResponseEntity<HttpStatus> deleteUser(@PathVariable(name = "id", required = true) final Long id) {
        return ResponseEntity.status(HttpStatus.OK).build();
    }
}
