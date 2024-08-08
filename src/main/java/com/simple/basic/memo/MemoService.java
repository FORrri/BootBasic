package com.simple.basic.memo;

import com.simple.basic.command.MemoVO;

import java.util.ArrayList;

public interface MemoService {

    public void regist(MemoVO vo); //등록
    public ArrayList<MemoVO> getMemo(); //목록

}
