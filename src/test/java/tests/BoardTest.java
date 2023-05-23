package tests;

import board.member.Board;
import validators.BoardValidator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class BoardTest {
    private Board board;

    @Test
    @DisplayName("게시글 생성 성공하면 예외 발생 X")
    void 게시글성공테스트(){
        assertDoesNotThrow(() -> {
            Board board = new Board();
            return board;
        });
    }

    @Test
    @DisplayName("필수 항목 체크(게시글제목, 게시글내용) - 체크 실패시 BoardRuntimeException 발생")
    void 필수항목체크테스트(){
        assertAll(
                () -> {
                    // 게시글제목이 null이면 예외 발생
                    assertThrows(BoardValidator.class() -> {

                    }),
                    // 게시글제목이 빈 값이면 예외 발생
                    assertThrows(BoardValidator.class() -> {

                    }),
                    // 게시글내용이 null이면 예외 발생
                    assertThrows(BoardValidator.class() -> {

                    }),
                    // 게시글내용이 빈 값이면 예외 발생
                    assertThrows(BoardValidator.class() -> {

                    }),
                }
        );
    }
}
