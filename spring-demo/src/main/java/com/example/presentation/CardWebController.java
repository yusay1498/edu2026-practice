///**
// * All Rights Reserved, Copyright(c) 2026 Fujitsu Learning Media Limited
// *
// */
//package com.example.presentation;
//
//import com.example.dto.CardSearchForm;
//import com.example.domain.entity.Card;
//import org.springframework.validation.BindingResult;
//import org.springframework.validation.annotation.Validated;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.List;
//
//@RestController // 直接文字列を返却したいので、わざと@RestControllerにしている
//@RequestMapping("/card")
//public class CardWebController {
//
//    private final CardService service;
//
//    public CardWebController(CardService service) {
//        this.service = service;
//    }
//
//    @GetMapping
//    public String showList() {
//        List<Card> cards = service.list();
//        return CardHtmlBuilder.buildListHtml(cards);
//    }
//
//    @PostMapping
//    public String showOneData(
//            @Validated CardSearchForm form,
//            BindingResult bindingResult) {
//
//        if (bindingResult.hasErrors()) {
//            List<String> errors = bindingResult.getAllErrors()
//                    .stream()
//                    .map(e -> e.getDefaultMessage())
//                    .toList();
//            return CardHtmlBuilder.buildErrorHtml(errors);
//        }
//
//        int id = Integer.parseInt(form.getId());
//        Card card = service.lookup(id);
//        return CardHtmlBuilder.buildDetailHtml(card);
//    }
//}
