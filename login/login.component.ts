import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { Register } from '../models/register';
import { RegisterServiceService } from '../service/register-service.service';


import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  standalone: true,
  imports: [FormsModule,CommonModule],
  templateUrl: './login.component.html',
  styleUrl: './login.component.css'
})
export class LoginComponent {
register:Register=new Register();
constructor(private registerServ:RegisterServiceService,private router:Router)
{

}
submitdata()
{
  this.registerServ.login(this.register).subscribe((data:Register)=>{
    if(data!=null)
      {
        localStorage.setItem("emailid",data.emailid)
        alert('login successful')
        this.router.navigate(['/'])
      }
      else
      alert('Invalid emailid or password')
  })
}
}
