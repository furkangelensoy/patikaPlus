package dev.patika.libraryManagementSystem.core.utils;

import dev.patika.libraryManagementSystem.core.result.Result;
import dev.patika.libraryManagementSystem.core.result.ResultData;
import dev.patika.libraryManagementSystem.dto.response.CursorResponse;
import org.springframework.data.domain.Page;

public class ResultHelper {

    public static <T> ResultData<T> CREATED(T data){
        return new ResultData<>(true,Message.CREATED,"201",data);
    }

    public static <T> ResultData<T> ERROR(T data){
        return new ResultData<>(false,Message.VALIDATE_ERROR,"400",data);
    }

    public static <T> ResultData<T> OK(T data){
        return new ResultData<>(true, Message.OK, "200", data);
    }

    public static <T> Result NOT_FOUND(){
        return new Result(false,Message.NOT_FOUND,"404");
    }

    public static <T> ResultData<CursorResponse<T>> cursor(Page<T> pageData){
        CursorResponse<T> cursor = new CursorResponse<>();

        cursor.setPageNumber(pageData.getNumber());
        cursor.setPageSize(pageData.getSize());
        cursor.setTotalElements(pageData.getTotalElements());
        cursor.setItems(pageData.getContent());

        return ResultHelper.OK(cursor);
    }
}
