import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { RouterModule,Routes } from '@angular/router';//router

import { AppComponent } from './app.component';
import { welcomeComponent } from './welcome.component';
import { ProductsComponent } from './products.component';
import { loginComponent } from './login.component';
import { mobileComponent } from './mobile.component';
import {ProfileComponent } from './profile.component';
import {menuComponent} from './menu.component';
import {ToDoListComponent} from './toDoList.component';
import {ToDoItemComponent} from './todoitem.component';
import {AppHeaderComponent} from './appHeader.component';
import {PhotosComponent} from './photos.component';
import {CartComponent} from './cart.component';
import {PageNotFoundComponent} from './pageNotFound.component';
import { laptopComponent } from './laptop.component';
import {ProductDetailsComponent} from './productDetails.component';
import {SignUpFormComponent} from './signupform.component';
import {CamelCasePipe} from './camelcase.pipe';
import {PhoneNumberPipe} from './phonenumber.pipe'

let routes:Routes=[
  {
    path:'',
    component:SignUpFormComponent
 },
  {
     path:'login',
     component:loginComponent
  },
  {
    path:'products',
    component:ProductsComponent,
    children:[
      {
        path:'',
        component:mobileComponent,
      },
      {
        path:'mobiles',
        component:mobileComponent,
        children:[
          {
            path:'productdetails/:productId',
            component:ProductDetailsComponent
          }
        ]
      },
      {
        path:'laptops',
        component:laptopComponent,
      }
    ]
 },
 {
  path:'photos',
  component:PhotosComponent
},
{
 path:'**',
 component:PageNotFoundComponent
}
]

@NgModule({
  declarations: [
    AppComponent,welcomeComponent,ProductsComponent,loginComponent,mobileComponent,ProfileComponent,menuComponent,ToDoListComponent,ToDoItemComponent,AppHeaderComponent,PhotosComponent,CartComponent,PageNotFoundComponent,laptopComponent,ProductDetailsComponent,SignUpFormComponent
  ,CamelCasePipe,PhoneNumberPipe
  ],
  imports: [
    BrowserModule,FormsModule,HttpClientModule,RouterModule.forRoot(routes)
  ],//by default loads CoreModule
  providers: [],
  bootstrap: [AppComponent]//to denote root of tree i.e Root component
})
export class AppModule { }
