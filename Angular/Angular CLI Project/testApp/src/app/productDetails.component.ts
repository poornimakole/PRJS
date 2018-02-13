import { Component, OnInit } from '@angular/core';
import {ActivatedRoute} from '@angular/router';
import {Product} from './product';
import {ProductsService} from './products.service'
import {ProductsServiceA} from './productA.service'
@Component({
    selector: 'product-details',
    template: `
      <h2>Product Details for {{product.id}}</h2><br>
      name:{{product.name}}<br>
      description:{{product.desc}}<br>
      price:{{product.price}}<br>
      quantity:{{product.qty}}
    `,
    providers:[{provide:ProductsService,useClass:ProductsServiceA}]
})

export class ProductDetailsComponent implements OnInit {
    prod:number;//route 
    products:Product[]=[];
    product:Product;
    constructor(private activeRoute:ActivatedRoute,private productservice:ProductsService
    ) { 

        this.products=productservice.getProducts();
        
    }

    ngOnInit() {
        //fetch the route parameter productId
         this.activeRoute.params.subscribe(routeParams=>{
             //handler will execute when param changes
             //routeParams is an array of all route parameters
             this.prod=parseInt(routeParams['productId']);
             this.products.forEach(element => {
                if(element.id===this.prod)
                {
                    this.product=element;
                }
            });
         })
     }
}