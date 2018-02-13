export class Product{
     id:number;
     name:string;
     desc:string;
     price:number;
     qty:number;
     imgPath:string;
    constructor(id:number,name:string,desc:string,price:number,qty:number,imgPath:string){
           this.id=id;
           this.name=name;
           this.desc=desc;
           this.price=price;
           this.qty=qty;
           this.imgPath=imgPath;
    }
}