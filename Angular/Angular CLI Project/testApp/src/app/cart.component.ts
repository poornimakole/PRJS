import { Component } from '@angular/core';
import {CartService} from './cart.service';
import {Cart2Service} from './cart2.service';
import {Product} from './product';
@Component({
    selector: 'cart',
    template: `
    <h3 align="left">My Cart</h3>
      <table border="1">
      <th>id</th>
      <th>name</th>
      <th>image</th>
      <th></th><th></th>
      <tr *ngFor='let prod of products;let i=index;'>
        <td>{{prod.id}}</td>
        <td>{{prod.name}}</td>
        <td><img [src]="prod.imgPath"/>
        <td><button (click)="removeFromCart(i)">Remove From Cart</button></td>
      </tr>
      </table>
    `
})

export class CartComponent {
    products:Product[]=[];
    constructor(private cartservice:CartService,private cart2service:Cart2Service) {        
                this.cartservice.getProduct().subscribe(user=>{
                    //whenever newname is received
                    this.products.push(user);
                })
             }

         removeFromCart(index:number):void{
                this.cart2service.setProduct(this.products[index]);
                this.products.splice(index,1);
           }
}