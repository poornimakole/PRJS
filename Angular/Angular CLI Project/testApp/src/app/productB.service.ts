import {Product} from './product'
import{Injectable} from '@angular/core'
import {ProductsService} from './products.service'

@Injectable()
export class ProductsServiceB extends ProductsService{
    products:Array<Product>;
    constructor(){
        super();
        console.log("serviceB  constructor");
        this.products=new Array<Product>();
        let prod1=new Product(1,"pen","stationary",34,4,"assets\\images\\1.jpg");
        let prod2=new Product(2,"book","acsd",66,10,"assets\\images\\2.jpg");
        let prod3=new Product(3,"pencil","stationary",24,15,"assets\\images\\3.jpg");
        this.products.push(prod1); 
        this.products.push(prod2);
        this.products.push(prod3);     
    }

    getProducts():Array<Product>{
        return this.products;
    }

}