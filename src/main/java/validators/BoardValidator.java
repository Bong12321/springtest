package validators;

import boardform.Boardform;
import org.springframework.stereotype.Component;

@Component
public class BoardValidator {

    public void check(Boardform boardform){

        String 게시글제목 = boardform.get게시글제목();
        String 게시글내용 = boardform.get게시글내용();

        if(게시글제목==null || 게시글제목.isBlank()){
            throw new ValidatorException("제목을 입력해주세요");
        }

        if(게시글내용==null || 게시글내용.isBlank()){
            throw new ValidatorException("내용을 입력해주세요");
        }

    }

    }

