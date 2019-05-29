package com.levelp.spring.controller;


//import com.levelp.spring.DAO.;
import com.levelp.spring.Entity.*;
import com.levelp.spring.poket.SerchInput;
import com.levelp.spring.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Controller
public class MyController {

    private int userId = -1;
    private Set<GoodsEntity> bag = new HashSet<GoodsEntity>();

//    private daoCharacteristics _dao = new daoCharacteristics();

    @Autowired
    Service service;

    @RequestMapping(value = "/product_selection")
    public String hello(ModelMap map){
        List<GoodsEntity> list = service.findAllGoods();
        map.addAttribute("list", list);
        return "index";
    }

    @RequestMapping(value = "/manual_search")
    public ModelAndView manual_search(){
        ModelAndView serch = new ModelAndView("mainPage");
        serch.getModelMap().addAttribute("serch", new SerchInput());
        return serch;
    }

    @RequestMapping(value = "/product_selection_filtered")
    public ModelAndView product_selection_filtered(@ModelAttribute SerchInput serch){
        ModelAndView modelAndView = new ModelAndView("serchPage");
        List<GoodsEntity> list = service.findGoodsByProducer(serch.getStr());
        if (list.size() == 0){
            list = service.findGoodsByType(serch.getStr());
        }
        modelAndView.getModelMap().addAttribute("list", list);
        return modelAndView;
    }




    @RequestMapping(value = "/find_by_type_name")
    public ModelAndView find_by_type_name(){
        ModelAndView serch = new ModelAndView("mainPage");
        serch.getModelMap().addAttribute("serch", new SerchInput());
        return serch;
    }


    @RequestMapping(value = "/find_by_type_name_Washer")
    public ModelAndView find_by_type_name_Washer(){
//        System.out.println("ujjjjjjjjjjh");
        ModelAndView modelAndView = new ModelAndView("serchPage");
        List<GoodsEntity> list = service.findGoodsByType("стиральная машина");
        modelAndView.getModelMap().addAttribute("list", list);
        return modelAndView;
    }
    @RequestMapping(value = "/find_by_type_name_Refrigerators")
    public ModelAndView find_by_type_name_Refrigerators(){
        ModelAndView modelAndView = new ModelAndView("serchPage");
        List<GoodsEntity> list = service.findGoodsByType("холодильник");
        modelAndView.getModelMap().addAttribute("list", list);
        return modelAndView;
    }
    @RequestMapping(value = "/find_by_type_name_Ovens")
    public ModelAndView find_by_type_name_Ovens(){
        ModelAndView modelAndView = new ModelAndView("serchPage");
        List<GoodsEntity> list = service.findGoodsByType("духовка");
        modelAndView.getModelMap().addAttribute("list", list);
        return modelAndView;
    }
    @RequestMapping(value = "/find_by_type_name_Cleaners")
    public ModelAndView find_by_type_name_Cleaners(){
        ModelAndView modelAndView = new ModelAndView("serchPage");
        List<GoodsEntity> list = service.findGoodsByType("пылесос");
        modelAndView.getModelMap().addAttribute("list", list);
        return modelAndView;
    }
    @RequestMapping(value = "/find_by_type_name_TVs")
    public ModelAndView find_by_type_name_TVs(){
        ModelAndView modelAndView = new ModelAndView("serchPage");
        List<GoodsEntity> list = service.findGoodsByType("телевизор");
        modelAndView.getModelMap().addAttribute("list", list);
        return modelAndView;
    }



    @RequestMapping(value = "/go_to_main_page")
    public ModelAndView go_to_main_page(){
        ModelAndView serch = new ModelAndView("mainPage");
        serch.getModelMap().addAttribute("serch", new SerchInput());
        return serch;
    }

//------------------------------//
    @RequestMapping(value = "/information_about_good")
    public ModelAndView information_about_good(@RequestParam int id){
        ModelAndView modelAndView = new ModelAndView("infoAboutGoods");
        GoodsEntity goodsEntity = service.findGoodById(id);
        CharacteristicsEntity characteristicsEntity = goodsEntity.getCharacteristicsByTypeId();

        modelAndView.getModelMap().addAttribute("goodsEntity", goodsEntity);
        modelAndView.getModelMap().addAttribute("characteristicsEntity", characteristicsEntity);

        return modelAndView;
    }



//    --------------------- функции личного кабинета
    @RequestMapping(value = "/go_to_private_office")
    public ModelAndView go_to_private_office(){
        ModelAndView NewCustomer = new ModelAndView("private_office");
        if (userId != -1) {
            NewCustomer.getModelMap().addAttribute("CustomersFio", service
                    .findCustomersById(userId).getFio());
            List<TotalOrdersEntity> list = service.findTotalOrderByCustomer(userId);
            NewCustomer.getModelMap().addAttribute("list", list);
        } else {
            NewCustomer.getModelMap().addAttribute("CustomersFio", "-1");
        }
        NewCustomer.getModelMap().addAttribute("NewCustomer", new CustomersEntity());
//        List<GoodsEntity> list = service.findGoodsByProducer(serch.getStr());
        return NewCustomer;
    }


    @RequestMapping(value = "/registration")
    public ModelAndView registration(){
        ModelAndView NewCustomer = new ModelAndView("private_office");
        NewCustomer.getModelMap().addAttribute("NewCustomer", new CustomersEntity());
        return NewCustomer;
    }

    @RequestMapping(value = "/new_customer_registration")
    public ModelAndView new_customer_registration(@ModelAttribute CustomersEntity NewCustomer){
        ModelAndView modelAndView = new ModelAndView("private_office");
        service.save(NewCustomer);
//        return modelAndView;
        return new ModelAndView("redirect:go_to_private_office");
    }

    @RequestMapping(value = "/customer_login")
    public ModelAndView customer_login(@ModelAttribute CustomersEntity NewCustomer){
        ModelAndView modelAndView = new ModelAndView("private_office");
        modelAndView.getModelMap().addAttribute("NewCustomer", new CustomersEntity());
        CustomersEntity customer = service.findCustomersByLogin(NewCustomer.getLogin());
        if (customer.getPasword().equals(NewCustomer.getPasword())){
            modelAndView.getModelMap().addAttribute("CustomersFio", service
                    .findCustomersByLogin(NewCustomer.getLogin()).getFio());
            userId = customer.getCustomerId();
            List<TotalOrdersEntity> list = service.findTotalOrderByCustomer(userId);
            modelAndView.getModelMap().addAttribute("list", list);
        }
        else {
            modelAndView.getModelMap().addAttribute("CustomersFio", "-1");
        }
        return modelAndView;
    }

    @RequestMapping(value = "/logout")
    public ModelAndView logout(){
        userId = -1;
        bag = new HashSet<GoodsEntity>();
        return new ModelAndView("redirect:go_to_private_office");
    }

    @RequestMapping(value = "/information_about_order")
    public ModelAndView information_about_order(@RequestParam int id) {
        ModelAndView modelAndView = new ModelAndView("infoAboutOrder");
        TotalOrdersEntity totalOrdersEntity = service.findTotalOrderById(id);
        List<OrdersEntity> list = service.findOrdersByTotalOrder(id);
        ReceiveTEntity receiveTEntity = totalOrdersEntity.getReceiveTByReceivingId();
        modelAndView.getModelMap().addAttribute("list", list);
        modelAndView.getModelMap().addAttribute("receiveTEntity", receiveTEntity);
        return modelAndView;
    }

//    @RequestMapping(value = "/back_to_private_office")
//    public ModelAndView back_to_private_office() {
//        return new ModelAndView("redirect:information_about_order");
//    }


// -----------------------------функции для корзины
    @RequestMapping(value = "/go_to_basket")
    public ModelAndView go_to_basket() {
        ModelAndView bagModel = new ModelAndView("basket");
        bagModel.getModelMap().addAttribute("list", bag);
        bagModel.getModelMap().addAttribute("CustomersFio", userId);
        bagModel.getModelMap().addAttribute("newT", new CustomersEntity());
//        NewCustomer.getModelMap().addAttribute("NewCustomer", new CustomersEntity());
        return bagModel;
    }

    @RequestMapping(value = "/add_to_bin")
    public ModelAndView add_to_bin(@RequestParam int id) {
        GoodsEntity tovar = service.findGoodById(id);
        bag.add(tovar);
        return new ModelAndView("redirect:go_to_main_page");
    }

    @RequestMapping(value = "/make_new_order")
    public ModelAndView make_new_order() {

//        GoodsEntity tovar = service.findGoodById(id);
//        bag.add(tovar);
        return new ModelAndView("redirect:go_to_main_page");
    }
}