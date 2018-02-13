export class ToDo {
    userId:number;
    id:number;
    title:string;
    completed:boolean;
    constructor(userId:number,id:number,title:string,done:boolean) { 
        this.userId=userId;
        this.id=id;
         this.title=title;
         this.completed=done;     
    }
}