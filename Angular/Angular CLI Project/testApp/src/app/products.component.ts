import {Component} from '@angular/core';
import {Product} from './product';
import {ProductsService} from './products.service';
import {ProductsServiceA} from './productA.service';
import {ProductsServiceB} from './productB.service';
import {CartService} from './cart.service';
import {Cart2Service} from './cart2.service';

@Component({
    selector:'products',
    template:`
            
        <!--   <h3 align="left">List of products</h3>
            search key:<input type="text" #search (keyup)="validate(search.value)"/>{{search.value}}
              <table border="1">
              <th>id</th>
              <th>name</th>
              <th>image</th>
              <th></th><th></th>
              <tr *ngFor='let prod of products;let i=index;'>
                <td>{{prod.id}}</td>
                <td>{{prod.name}}</td>
                <td><img [src]="prod.imgPath"/>
               <td *ngIf="isAdmin"><button (click)="remove(i)">delete</button></td>
                <td><button [disabled]="!isAdmin">Edit</button></td>
                <td><button (click)="addToCart(i)">Add to Cart</button></td>
              </tr>
              </table-->


              <a routerLink="mobiles">Mobile</a>
              <a routerLink="laptops">Laptop</a>
              <router-outlet></router-outlet>
               `
})

export class ProductsComponent{
    products:Product[]=[];
    isAdmin:boolean=true;
    constructor(private productservice:ProductsService,private cartservice:CartService,private cart2service:Cart2Service){
        console.log("product constructor");
           this.products=productservice.getProducts();

           this.cart2service.getProduct().subscribe(user=>{
            //whenever newname is received
            this.products.push(user);
        })      
    }

    remove(index:number):void{
        //remove the element from the array
        this.products.splice(index,1);
    }
    validate(searchChar:string):void{
        //you need input value of text box
        console.log(searchChar);
    }

    display(name:string,pwd:string):void{
        console.log(name+"  "+pwd);
    }

    addToCart(index:number):void{
         this.cartservice.setProduct(this.products[index]);
         this.products.splice(index,1);
    }
    
}

