import { Component } from '@angular/core';
import { AdminLogin } from '../models/admin-login';

import { Router } from '@angular/router';
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';
import { AdminLoginService } from '../service/admin-login.service';

@Component({
  selector: 'app-adminlogin',
  standalone: true,
  imports: [FormsModule,CommonModule],
  templateUrl: './adminlogin.component.html',
  styleUrl: './adminlogin.component.css'
})
export class AdminloginComponent {
ad:AdminLogin=new AdminLogin();
constructor(private adServ:AdminLoginService,private router:Router)
{

}
submitdata()
{
  alert(JSON.stringify(this.ad))
  this.adServ.login(this.ad).subscribe((data:AdminLogin)=>{
    console.log(data)
    if(data!=null)
      {
        localStorage.setItem('aemailid',data.emailid)
        alert("login successful")
        this.router.navigate(['/'])
      }
      else
      alert("Invalid emailid and password")
  })
}
}
