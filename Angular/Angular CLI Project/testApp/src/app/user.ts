export class User{
    id:number;
    name:string;
    addr:string;
   gender:string;
   age:number;
   constructor(id:number,name:string,addr:string,gender:string,age:number){
          this.id=id;
          this.name=name;
          this.addr=addr;
          this.gender=gender;
          this.age=age;
   }
}