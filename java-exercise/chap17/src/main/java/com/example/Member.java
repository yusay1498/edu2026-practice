/**
 * All Rights Reserved, Copyright(c) 2026 Fujitsu Learning Media Limited
 *
 */
package com.example;

// hashCode() と equals() をオーバーライドしない Member クラス

public class Member {

    private int id;
    private String name;

    // コンストラクタを作成する


    // toString() をオーバーライドする（表示用）
    @Override
    public String toString() {
        return "Member[id=" + id + ", name=" + name + "]";
    }

}

