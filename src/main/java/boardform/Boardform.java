package boardform;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Boardform {
    private Long 게시글번호;
    private String 게시글제목;
    private String 게시글내용;
}
