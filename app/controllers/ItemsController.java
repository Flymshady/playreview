package controllers;

import model.Item;
import play.mvc.Controller;
import play.mvc.Result;

import java.util.Set;


import views.html.items.*;

public class ItemsController extends Controller {

    //for all items
    public Result index(){
        Set<Item> items=Item.allItems();
        return ok(index.render(items));
    }

    //creating item
    public Result create(){
        return  TODO();
    }

    public Result save(){
        return  TODO();
    }
    public Result edit(Long id){
        return   TODO();
    }

    public Result update(){
        return  TODO() ;
    }

    public Result remove(Long id){
        return  TODO();
    }

    public Result detail(Long id){
        return  TODO();
    }


}
