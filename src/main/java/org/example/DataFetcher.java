package org.example;

import java.util.NoSuchElementException;

// Bad Practice
public class DataFetcher {
    public String fetchDataBad() {
        // 데이터 가져오기 실패 시 null 반환
        return null;
    }

    // Good Practice
    public String fetchDataGood() {
        // 데이터 가져오기 실패 시 예외 발생
        throw new NoSuchElementException("No data available.");
    }
}
