import { CommonModule } from '@angular/common';
import { Component, OnInit } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { RegisterServiceService } from '../service/register-service.service';

import { Register } from '../models/register';

@Component({
  selector: 'app-register',
  standalone: true,
  imports: [CommonModule,FormsModule],
  templateUrl: './register.component.html',
  styleUrl: './register.component.css'
})
export class RegisterComponent implements OnInit { 
  register:Register=new Register();
  ngOnInit(): void {
    
  }
constructor(private registerServ:RegisterServiceService)
{

}
submitdata()
{
  this.registerServ.newUser(this.register).subscribe((data:Register)=>{
    if(data!=null)
      {
        alert('Registration Successful')
      }
  })
}
}
