/**
 * All Rights Reserved, Copyright(c) 2026 Fujitsu Learning Media Limited
 *
 */
package com.example.controller;

import com.example.entity.card.Card;

import java.util.List;

public class CardHtmlBuilder {

    public static String buildListHtml(List<Card> cards) {
        StringBuilder sb = new StringBuilder();
        sb.append("<html><body>");
        sb.append("<h1>Card List</h1>");

        sb.append("<form method='post'>");
        sb.append("ID検索：<input type='text' name='id'>");
        sb.append("<button type='submit'>検索</button>");
        sb.append("</form>");

        sb.append("<hr>");
        sb.append("<table border='1'>");
        sb.append("<tr><th>ID</th><th>Name</th><th>Level</th><th>Element</th></tr>");

        // TO DO : あとでコメント外す
//        for (Card c : cards) {
//            sb.append("<tr>");
//            sb.append("<td>").append(c.id()).append("</td>");
//            sb.append("<td>").append(c.name()).append("</td>");
//            sb.append("<td>").append(c.level()).append("</td>");
//            sb.append("<td>").append(c.elementId()).append("</td>");
//            sb.append("</tr>");
//        }

        sb.append("</table>");
        sb.append("</body></html>");
        return sb.toString();
    }

    public static String buildDetailHtml(Card card) {
        StringBuilder sb = new StringBuilder();
        sb.append("<html><body>");
        sb.append("<h1>Card Detail</h1>");

        // TO DO : あとでコメント外す
//        if (card == null) {
//            sb.append("<p>カードが見つかりません。</p>");
//        } else {
//            sb.append("<table border='1'>");
//            sb.append("<tr><th>ID</th><td>").append(card.id()).append("</td></tr>");
//            sb.append("<tr><th>Name</th><td>").append(card.name()).append("</td></tr>");
//            sb.append("<tr><th>Level</th><td>").append(card.level()).append("</td></tr>");
//            sb.append("<tr><th>Element</th><td>").append(card.elementId()).append("</td></tr>");
//            sb.append("<tr><th>Top</th><td>").append(card.top()).append("</td></tr>");
//            sb.append("<tr><th>Right</th><td>").append(card.right()).append("</td></tr>");
//            sb.append("<tr><th>Bottom</th><td>").append(card.bottom()).append("</td></tr>");
//            sb.append("<tr><th>Left</th><td>").append(card.left()).append("</td></tr>");
//            sb.append("</table>");
//        }

        sb.append("<br><a href='/cards'>一覧に戻る</a>");
        sb.append("</body></html>");
        return sb.toString();
    }

    public static String buildErrorHtml(List<String> errors) {
        StringBuilder sb = new StringBuilder();
        sb.append("<html><body>");
        sb.append("<h1>入力エラー</h1>");
        sb.append("<ul>");
        errors.forEach(err -> sb.append("<li>").append(err).append("</li>"));
        sb.append("</ul>");
        sb.append("<a href='/cards'>一覧に戻る</a>");
        sb.append("</body></html>");
        return sb.toString();
    }
}
