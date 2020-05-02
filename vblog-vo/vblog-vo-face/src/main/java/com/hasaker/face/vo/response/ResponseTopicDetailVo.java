package com.hasaker.face.vo.response;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @package com.hasaker.face.vo.response
 * @author 余天堂
 * @create 2020/5/3 02:43
 * @description ResponseTopicVo
 */
@Data
@NoArgsConstructor
public class ResponseTopicDetailVo {

    private Long id;

    private String name;

    private String description;

    private ResponseUserInfoVo createUser;

    private Long createTime;
}
