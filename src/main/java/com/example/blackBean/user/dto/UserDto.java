package com.example.blackBean.user.dto;

import lombok.*;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Setter
public class UserDto {

    //    @NotNull  //null값만 허용 안함("" 와 같은 건 허용)
    private String nickname;
}
