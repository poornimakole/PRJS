import {Component} from '@angular/core';
import {Product} from './product';
import {ProductsService} from './products.service';

@Component({
    selector:'mobile-product',
    template:`
    <h3 align="left">Mobile Components</h3>
    <table border="1">
    <th>id</th>
    <th>name</th>
    <th>image</th>
    <th></th><th></th>
    <tr *ngFor='let prod of mobiles;let i=index;'>
      <td>{{prod.id}}</td>
      <td><a [routerLink]="['productdetails',prod.id]">{{prod.name}}</a></td>
      <td><img [src]="prod.imgPath"/>
    </tr>
    </table>
    <router-outlet></router-outlet>
           `
})
export class mobileComponent{
    mobiles:Product[];
    isAdmin:boolean=true;
    constructor(productservice:ProductsService){
        console.log("mobile constructor");
        this.mobiles=productservice.getProducts().filter(function(value:Product){
            return value.desc==='mobile';
        })
    }

}