import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { RouterModule,Routes } from '@angular/router';//router

import { AppComponent } from './app.component';
import {ToDoListComponent} from './toDoList.component';
import {ToDoItemComponent} from './todoitem.component';
import {PageNotFoundComponent} from './pageNotFound.component';
import {MenuComponent} from './menu.component';
import {CompletedComponent} from './completed.component';
import {PendingComponent} from './pending.component';
import {LoginComponent} from './login.component';
import {CompleteListComponent} from './completeList.component';
import {ToDoSummaryComponent} from './todoSummary.component';
import {ProfileComponent} from './profile.component';
let routes:Routes=[
  {
    path:'',
    component:LoginComponent
  },
  {
    path:'login',
    component:LoginComponent
  },
  {
    path:'todolist/:userName',
    component:ToDoListComponent,
    children:[
      {
        path:'',
        component:CompleteListComponent
      },
      {
      path:'completelist',
      component:CompleteListComponent
    },
    {
      path:'completed',
      component:CompletedComponent
    },
    {
      path:'pending',
      component:PendingComponent
    },
    {
     path:'todosummary',
     component:ToDoSummaryComponent
   },
   {
    path:'profile',
    component:ProfileComponent
  }
  ]
 },
{
 path:'**',
 component:PageNotFoundComponent
}
]

@NgModule({
  declarations: [
    AppComponent,MenuComponent,ToDoListComponent,ToDoItemComponent,PageNotFoundComponent,CompletedComponent,PendingComponent,LoginComponent,CompleteListComponent,ToDoSummaryComponent,ProfileComponent
  ],
  imports: [
    BrowserModule,FormsModule,HttpClientModule,RouterModule.forRoot(routes)
  ],//by default loads CoreModule
  providers: [],
  bootstrap: [AppComponent]//to denote root of tree i.e Root component
})
export class AppModule { }
