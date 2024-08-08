package com.simple.basic.command;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class MemoVO {

    private Integer mno; // 메모 번호

    @Size(min = 5, message = "메모 내용을 입력해주세요.")
    private String memo; // 메모 내용

    @Pattern(regexp = "^[0-9]{3}-[0-9]{4}-[0-9]{4}$", message = "전화번호 형식은 XXX-XXXX-XXXX이어야 합니다.")
    private String phone; // 연락처

    @Pattern(regexp = "^[0-9]{4}$", message = "숫자 4자리 입니다.")
    private String pw; // 비밀번호

    private String secret = "n"; // 공개여부

}
