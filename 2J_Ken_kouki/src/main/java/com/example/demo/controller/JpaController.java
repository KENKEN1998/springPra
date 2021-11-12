package com.example.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.repository.CompRepository;
import com.example.demo.repository.ItemRepository;
import com.example.demo.repository.ShopRepository;
@Controller
public class JpaController {
    @Autowired
    private ItemRepository repository;
    @Autowired
    private ShopRepository ShopRepository;
    @Autowired
    private CompRepository CompRepository;
    
    @RequestMapping(path = "/jpa", method = RequestMethod.GET)
    public String viewPage(Model model) {
        
        model.addAttribute("items",repository.findAll());
        
        // 表示するHTMLはreturnの後ろに書く。
        // 今回の場合はtemplatesフォルダの中にあるsessionフォルダにあるlogin.htmlを表示する。
        return "jpasample";
    }
    @RequestMapping(path = "/jpa1", method = RequestMethod.GET)
    public String viewPageShop(Model model) {
        
        model.addAttribute("shops",ShopRepository.findAll());
        
        // 表示するHTMLはreturnの後ろに書く。
        // 今回の場合はtemplatesフォルダの中にあるsessionフォルダにあるlogin.htmlを表示する。
        return "jpasampleShop";
    }
    
    @RequestMapping(path = "/jpa2", method = RequestMethod.GET)
    public String viewPageComp(Model model) {
        
        model.addAttribute("compsSearch",CompRepository.findByName("学校法人　国際理工学園"));
        
        // 表示するHTMLはreturnの後ろに書く。
        // 今回の場合はtemplatesフォルダの中にあるsessionフォルダにあるlogin.htmlを表示する。
        return "jpasampleComp";
    }
}