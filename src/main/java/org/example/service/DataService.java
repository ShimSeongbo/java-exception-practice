package org.example.service;

import java.util.NoSuchElementException;
import java.util.Optional;

public class DataService {

    /**
     * API 로부터 데이터를 가져옵니다.
     *
     * @return Optional 데이터
     * @throws java.util.NoSuchElementException 데이터가 없을 경우 발생
     */
    public Optional<String> fetchDataFromApi() throws NoSuchElementException {
        //가상의 API 호출
        boolean dataExists = true; // 데이터 존재 여부

        if (!dataExists) {
            throw new NoSuchElementException("No data available");
        }

        String data = "???"; // 데이터 로드
        return Optional.of(data);
    }

    /**
     * 데이터를 화면에 표시합니다.
     */
    public void display() {
        try {
            Optional<String> data = fetchDataFromApi();

            if (!data.isPresent()) {
                displayEmptyState();
                return;
            }

            process(data.get());
        } catch (NoSuchElementException e) {
            displayEmptyState();
        }
    }

    private void displayEmptyState() {
        // 로직
    }

    private void process(String data) {
        // 로직
    }
}
