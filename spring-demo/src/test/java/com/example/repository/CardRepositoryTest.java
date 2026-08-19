/**
 * All Rights Reserved, Copyright(c) 2026 Fujitsu Learning Media Limited
 *
 */
package com.example.repository;

import com.example.dto.CardDetail;
import com.example.entity.card.Card;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

@SpringBootTest
@Transactional
@Rollback
// @Transactional + @Rollback が付いていると、各@Testの終了時にDB変更はすべてロールバックされる
class CardRepositoryTest {

    @Autowired
    @Qualifier("cardRepositoryImpl") // CardRepositoryMockImplではなくCardRepositoryImplを使うことを明示的に指定
                                     // → この指定がないとCardRepositoryを特定できないためエラーとなる
    // 本番用 Repositoryの @Repository("cardRepositoryImpl"),
    // Service の @Qualifier("cardRepositoryImpl"),
    // テストコードの @Qualifier("cardRepositoryImpl"),
    // テストコードの @MockitoBean(name = "cardRepositoryImpl") を揃える必要がある
    CardRepository repository;

    @Test
    void findByIdTest() {

        // Given: 期待値を設定


        // When: repository.findById を呼び出し


        // Then: 各種検証を実施


    }

    @Test
    void findByIdNotFoundTest() {

        // Given: 期待値(存在しないID)を設定



        // When: repository.findById を呼び出し



        // Then: 各種検証を実施(cardはnull)


    }

    @Test
    void findAllTest() {

        // Given: 期待値を設定





        // When: repository.findAll を呼び出し



        // Then: 各種検証を実施
        // → リストが空ではない
        // → 少なくとも1件は中身が正しい





    }

    @Test
    void insertTest() {

        // Given: 登録するcardの中身、および期待値(result)を設定




        // When: repository.insert を呼び出し



        // Then: 各種検証を実施(insert成功、かつそのitemが存在)　



    }

    @Test
    void insertAlreadyExistsTest() {

        // Given: 存在するIDで登録するcardの中身を作成




        // When / Then: repository.insert を呼び出し → DuplicateKeyExceptionがスローされるかを検証
        // assertThatThrownBy(...);



        // 例外クラス「DuplicateKeyException」が生じればテスト成功
    }

    @Test
    void updateTest() {

        // Given: 期待値(IDはすでに存在するもの)を設定




        // When: repository.update を呼び出し




        // Then: 各種検証を実施



    }

    @Test
    void updateNoExistingTest() {

        // Given: 期待値(IDは存在しないもの)を設定



        // When: repository.update を呼び出し



        // Then: 各種検証を実施(resultは0)



    }

    @Test
    void deleteTest() {

        // Given: 期待値(IDはすでに存在するもの)を設定



        // When: repository.delete を呼び出し




        // Then: 各種検証(delete成功、当該itemが存在しない)を実施



    }

    @Test
    void deleteNoExistingTest() {

        // Given: 期待値(IDは存在しないもの)を設定




        // When: repository.delete を呼び出し




        // Then: 各種検証を実施(resultは0)



    }
}
