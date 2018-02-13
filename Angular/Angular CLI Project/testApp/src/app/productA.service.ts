import {Product} from './product'
import{Injectable} from '@angular/core'
import {ProductsService} from './products.service'

@Injectable()
export class ProductsServiceA extends ProductsService{
    products:Array<Product>;
    constructor(){
        super();
        console.log("serviceA  constructor");
        this.products=new Array<Product>();
        let prod1=new Product(1,"moto","mobile",10044,4,"assets\\images\\1.jpg");
        let prod2=new Product(2,"samsung","mobile",25445,10,"assets\\images\\2.jpg");
        let prod3=new Product(3,"laptop","laptop",31444,15,"assets\\images\\3.jpg");
        let prod4=new Product(4,"camera","camera",21334,4,"assets\\images\\4.jpg");
        let prod5=new Product(5,"xiaomi","mobile",14344,4,"assets\\images\\5.jpg");
        this.products.push(prod1); 
        this.products.push(prod2);
        this.products.push(prod3); 
        this.products.push(prod4);
        this.products.push(prod5);        
    }

    getProducts():Array<Product>{
        return this.products;
    }

}