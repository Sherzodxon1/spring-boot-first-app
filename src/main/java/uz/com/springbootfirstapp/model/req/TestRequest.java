package uz.com.springbootfirstapp.model.req;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class TestRequest {

    private String name;

    private Integer age;

    private String phone;

    private String email;

}
