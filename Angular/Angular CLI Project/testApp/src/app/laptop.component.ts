import {Component} from '@angular/core';
import {Product} from './product';
import {ProductsService} from './products.service';

@Component({
    selector:'laptop-product',
    template:`
    <h3 align="left">Laptop Components</h3>
    <table border="1">
    <th>id</th>
    <th>name</th>
    <th>image</th>
    <th></th><th></th>
    <tr *ngFor='let prod of laptops;let i=index;'>
      <td>{{prod.id}}</td>
      <td>{{prod.name}}</td>
      <td><img [src]="prod.imgPath"/>
    </tr>
    </table>
           `
})
export class laptopComponent{
laptops:Product[];
    isAdmin:boolean=true;
    constructor(productservice:ProductsService){
        console.log("laptop constructor");
        this.laptops=productservice.getProducts().filter(function(value:Product){
            return value.desc==='laptop';
        })
    }

}
