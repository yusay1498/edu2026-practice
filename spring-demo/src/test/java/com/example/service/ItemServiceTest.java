/**
 * All Rights Reserved, Copyright(c) 2026 Fujitsu Learning Media Limited
 *
 */
package com.example.service;

import com.example.common.ResourceNotFoundException;
import com.example.entity.item.Item;
import com.example.repository.ItemRepository;
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
class ItemServiceTest {

    @Autowired
    ItemService service;

    @MockitoBean(name = "itemRepositoryImpl") // ItemRepositoryをモック化
    // 本番用 Repositoryの @Repository("itemRepositoryImpl"),
    // Service の @Qualifier("itemRepositoryImpl"),
    // テストコードの @Qualifier("itemRepositoryImpl"),
    // テストコードの @MockitoBean(name = "itemRepositoryImpl") を揃える必要がある
    ItemRepository repository;

    @Test
    void findByIdTest() {

        // Given: Repository の Mock が返す値を設定
        int id = 1;
//        Item exItem = new Item(id, "Potion", 100, 50);
//        when(repository.findById(id)).thenReturn(exItem);
        // ↑ 「service が repository.findById(id) を呼び出したら exItem を返す」
        //    という Mockito の振る舞いを設定

        // When: service.findById を呼び出し(内部でrepository.findByIdのモックが呼ばれる)
//        Item item = service.findById(id);

        // Then: 各種検証を実施
//        assertThat(item).isNotNull();  // Mockが返したexItemがそのまま返ってくる(nullでない)ことの検証

        //Mockito が作るモックは、実際のメソッドを実行するのではなく、
        // 呼び出されたメソッド名・引数・回数を全部記録するオブジェクト
        // → verify()はその履歴と「これから書くメソッド呼び出し」を照合するメソッド
//        verify(repository, // Mock対象クラスを第1引数に指定
//                times(1))   // Mock に対して行われた呼び出し履歴を検証する
//                                                  // → この場合は1回呼び出されたことを検証
//                .findById(id); // 「findById() がint型のidという引数で1回呼ばれた」ことを検証
    }

    @Test
    void findByIdNotFoundTest() {

        // Given: Repository の Mock が返す値を設定
        int id = 9999;
        //when(...).thenReturn(null); // TO DO

        // When / Then: service.findByIdを呼び出し(内部でrepository.findByIdのモックが呼ばれる)、
        // ResourceNotFoundException が発生することを検証
//        assertThatThrownBy(
//                () -> service.findById(id)) // ラムダ式でfindByIdを指定
//                .isInstanceOf(ResourceNotFoundException.class);
//        verify(...).FUNCTION_NAME(...); // TO DO
    }

    @Test
    void findAllTest() {

        // Given: Repository の Mock が返す値を設定
        List<Item> itemList = List.of(); // TO DO
        //when(...).FUNCTION_NAME(...); // TO DO

        // When: service.findAllを呼び出し(内部でrepository.findAllのモックが呼ばれる)
        // TO DO

        // Then: 各種検証を実施
//        assertThat(...).isNotEmpty(); // TO DO
//        assertThat(items.size()).isEqualTo(...); // TO DO
//        verify(...).FUNCTION_NAME(); // TO DO
    }

    @Test
    void insertTest() {

        // Given: Repository の Mock が返す値を設定
//        Item newItem = new Item(...);
//        when(...).FUNCTION_NAME(...);

        // When: service.insertを呼び出し(内部でrepository.insertのモックが呼ばれる)
        // TO DO

        // Then: 各種検証を実施
//        FUNCTION_NAME(...).isEqualTo(...);
//        verify(...).FUNCTION_NAME(...);
    }

    @Test
    void insertAlreadyExistsTest() {

        // Given: Repository の Mock が返す値を設定
        // TO DO


        // When / Then: service.insert()メソッドを呼び出して
        // DuplicateKeyException が発生することを検証
//        assertThatThrownBy(
//                () -> FUNCTION_NAME(...)) // TO DO
//                .isInstanceOf(...); // TO DO
//        verify ... // TO DO
    }

    @Test
    void updateTest() {

        // Given: Repository の Mock が返す値を設定
        // TO DO


        // When: service.updateを呼び出し(内部でrepository.updateのモックが呼ばれる)
        // TO DO


        // Then: 各種検証を実施
        // TO DO

    }

    @Test
    void updateNoExistingTest() {

        // Given: Repository の Mock が返す値を設定
        // TO DO


        // When / Then: service.updateを呼び出し(内部でrepository.updateのモックが呼ばれる)、
        // ResourceNotFoundException が発生することを検証
        // TO DO


    }

    @ParameterizedTest
    @CsvSource({
            "1, 1",    // ID=1 → 更新成功（戻り値1）
            "9999, 0"  // ID=9999 → 更新失敗（戻り値0）
    })
        // @CsvSourceの記述が、引数(int id, int expected)に順に渡される
        // → updateParameterizedTest(1, 1)     を実行
        //   updateParameterizedTest(9999, 0)  を実行
        // のように複数回実行される
    void updateParameterizedTest(int id, int expected) {

        // Given: Repository の Mock が返す値を設定

        // TO DO : あとでコメント外す
//        Item item = new Item(id, "Test", 100, 50);
//        when(repository.update(item)).thenReturn(expected);

        // When: service.update を呼び出し
//        if (expected == 1) {
//            int result = service.update(item);
//            assertThat(result).isEqualTo(1);
//        } else {
//            assertThatThrownBy(() -> service.update(item))
//                    .isInstanceOf(ResourceNotFoundException.class);
//        }
//        verify(repository, times(1)).update(item);
    }

    @Test
    void deleteTest() {

        // Given: Repository の Mock が返す値を設定
        // TO DO


        // When: service.deleteを呼び出し(内部でrepository.deleteのモックが呼ばれる)
        // TO DO


        // Then: 各種検証を実施
        // TO DO


    }

    @Test
    void deleteNoExistingTest() {

        // Given: Repository の Mock が返す値を設定
        // TO DO



        // When / Then: service.deleteを呼び出し(内部でrepository.deleteのモックが呼ばれる)、
        // ResourceNotFoundException が発生することを検証
        // TO DO




    }
}
