/**
 * All Rights Reserved, Copyright(c) 2026 Fujitsu Learning Media Limited
 *
 */
package com.example.repository;

import com.example.entity.item.Item;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
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
class ItemRepositoryTest {

    @Autowired
    @Qualifier("itemRepositoryImpl") // ItemRepositoryMockImplではなくItemRepositoryImplを使うことを明示的に指定
                                     // → この指定がないとItemRepositoryを特定できないためエラーとなる
    // 本番用 Repositoryの @Repository("itemRepositoryImpl"),
    // Service の @Qualifier("itemRepositoryImpl"),
    // テストコードの @Qualifier("itemRepositoryImpl"),
    // テストコードの @MockitoBean(name = "itemRepositoryImpl") を揃える必要がある
    ItemRepository repository;

    @Test
    void findByIdTest() { // JUnit5からは、テストメソッドは public である必要はない

        // Given: 期待値を設定
        int exId = 1;
        String exName = "Potion";
        int exPrice = 100;
        int exSellPrice = 50;

        // When: repository.findById を呼び出し
        Item item = repository.findById(exId);

        // Then: 各種検証を実施
        assertThat(item).isNotNull();
        assertThat(item.id()).isEqualTo(exId);
        assertThat(item.name()).isEqualTo(exName);
        //assertThat(item.price()).isEqualTo(exPrice); // TO DO : あとでコメントを外す
        //assertThat(item.sellPrice()).isEqualTo(exSellPrice);
    }

    @Test
    void findByIdNotFoundTest() {

        // Given: 期待値(存在しないID)を設定
        // TO DO

        // When: repository.findById を呼び出し
        // TO DO

        // Then: 各種検証を実施(nullが返される)
        // assertThat(item).isNull(); // TO DO : あとでコメントを外す
    }

    @Test
    void findAllTest() {

        // Given: 期待値を設定
        // TO DO


        // When: repository.findAll を呼び出し
        // TO DO

        // Then: 各種検証を実施
        // → リストが空ではない
        // → 少なくとも1件は中身が正しい
        // assertThat(items).isNotEmpty(); // TO DO : あとでコメントを外す
        // assertThat(items.size()).isGreaterThan(0); // TO DO : あとでコメントを外す

        //Item first = items.get(0); // 1件だけ中身が正しいことを確認（全件チェックは不要） // TO DO : あとでコメントを外す
        // TO DO




    }

    @Test
    void insertTest() {

        // Given: 登録するitemの中身、および期待値(result)を設定
        // TO DO




        //Item newItem = new Item(exId, exName, exPrice, exSellPrice); // TO DO : あとでコメントを外す

        // When: repository.insert を呼び出し
        // TO DO

        // Then: 各種検証を実施(insert成功、かつそのitemが存在)　

        // TO DO







    }

    @Test
    void insertAlreadyExistsTest() {

        // Given: 存在するIDで登録するitemの中身を作成
        int exId = 1; // すでにDBに存在するID
        // TO DO


        // Item item = new Item(exId, exName, exPrice, exSellPrice); // TO DO : あとでコメントを外す

        // When / Then: repository.insert を呼び出し → DuplicateKeyExceptionがスローされるかを検証
        //assertThatThrownBy(
        //        () -> repository.insert(item) // insertメソッドをラムダ式で指定
        //) // TO DO : あとでコメントを外す
        //        .isInstanceOf(DuplicateKeyException.class); // TO DO : あとでコメントを外す

                // 例外クラス「DuplicateKeyException」が生じればテスト成功
    }

    @Test
    void updateTest() {

        // Given: 期待値(IDはすでに存在するもの)を設定
        // TO DO



        // When: repository.update を呼び出し
        // TO DO

        // Then: 各種検証を実施
        // TO DO


        // update後のitemを取得




    }

    @Test
    void updateNoExistingTest() {

        // Given: 期待値(IDは存在しないもの)を設定
        // TO DO




        // When: repository.update を呼び出し
        // TO DO

        // Then: 各種検証を実施(resultは0)
        // TO DO

    }

    @Test
    void deleteTest() {

        // Given: 期待値(IDはすでに存在するもの)を設定
        // TO DO


        // When: repository.delete を呼び出し
        // TO DO


        // Then: 各種検証(delete成功、当該itemが存在しない)を実施
        // TO DO

        //Item item = repository.findById(exId); // 削除したidで検索 // TO DO : あとでコメントを外す
        //assertThat(item).isNull(); // TO DO : あとでコメントを外す
    }

    @Test
    void deleteNoExistingTest() {

        // Given: 期待値(IDは存在しないもの)を設定
        // TO DO


        // When: repository.delete を呼び出し
        // TO DO


        // Then: 各種検証を実施(resultは0)
        // TO DO

    }
}
