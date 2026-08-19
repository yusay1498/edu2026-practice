/**
 * All Rights Reserved, Copyright(c) 2026 Fujitsu Learning Media Limited
 *
 */
package com.example.service;

import com.example.common.ResourceNotFoundException;
import com.example.entity.card.Card;
import com.example.repository.CardRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.test.context.bean.override.mockito.MockitoBean;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.Mockito.*;

@SpringBootTest
class CardServiceTest {

    @Autowired
    CardService service;

    @MockitoBean(name = "cardRepositoryImpl") // CardRepository をモック化
    // 本番用 Repositoryの @Repository("cardRepositoryImpl"),
    // Service の @Qualifier("cardRepositoryImpl"),
    // テストコードの @Qualifier("cardRepositoryImpl"),
    // テストコードの @MockitoBean(name = "cardRepositoryImpl") を揃える必要がある
    CardRepository repository;

    @Test
    void findByIdTest() {

        // Given: Repository の Mock が返す値を設定
        // TO DO


        // When: service.findById を呼び出し
        // TO DO


        // Then: 各種検証
        // TO DO

    }

    @Test
    void findByIdNotFoundTest() {

        // Given: Repository の Mock が返す値を設定
        // TO DO


        // When / Then: service.findById()メソッドを呼び出して
        // ResourceNotFoundException が発生することを検証
        // TO DO


    }

    @Test
    void findAllTest() {

        // Given: Repository の Mock が返す値を設定
        // TO DO


        // When: service.findAll を呼び出し
        // TO DO


        // Then: 各種検証
        // TO DO


    }

    @Test
    void insertTest() {

        // Given: Repository の Mock が返す値を設定
        // TO DO


        // When: service.insert を呼び出し
        // TO DO


        // Then: 各種検証
        // TO DO


    }

    @Test
    void insertAlreadyExistsTest() {

        // Given: Repository の Mock が返す値を設定
        // TO DO


        // When / Then: service.insert()メソッドを呼び出して
        // DuplicateKeyException が発生することを検証
        // TO DO



    }

    @Test
    void updateTest() {

        // Given: Repository の Mock が返す値を設定
        // TO DO


        // When: service.update を呼び出し
        // TO DO


        // Then: 各種検証
        // TO DO



    }

    @Test
    void updateNoExistingTest() {

        // Given: Repository の Mock が返す値を設定
        // TO DO


        // When / Then: service.update()メソッドを呼び出して
        // ResourceNotFoundException が発生することを検証
        // TO DO


    }

    @ParameterizedTest
    @CsvSource({
            "1, 1",    // ID=1 → 更新成功
            "9999, 0"  // ID=9999 → 更新失敗
    })
    void updateParameterizedTest(int id, int expected) {

        // Given: Repository の Mock が返す値を設定
        // TO DO


        // When: service.update を呼び出し
        // TO DO



        // Then: 各種検証
        // TO DO


    }

    @Test
    void deleteTest() {

        // Given: Repository の Mock が返す値を設定
        // TO DO


        // When: service.delete を呼び出し
        // TO DO


        // Then: 各種検証
        // TO DO


    }

    @Test
    void deleteNoExistingTest() {

        // Given: Repository の Mock が返す値を設定
        // TO DO


        // When / Then: service.delete()メソッドを呼び出して
        // ResourceNotFoundException が発生することを検証
        // TO DO


    }
}
