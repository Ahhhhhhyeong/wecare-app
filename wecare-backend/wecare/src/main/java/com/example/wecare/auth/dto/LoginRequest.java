package com.example.wecare.auth.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginRequest {

    @NotBlank(message = "아이디는 필수 입력 값입니다.")
    @Size(min = 6, max = 20, message = "아이디는 6~20자 사이여야 합니다.")
    private String memberId;

    @NotBlank(message = "비밀번호는 필수 입력 값입니다.")
    @Size(min = 8, message = "비밀번호는 8자 이상이어야 합니다.")
    private String password;
}
